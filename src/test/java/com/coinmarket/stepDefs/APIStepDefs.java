package com.coinmarket.stepDefs;

import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import responsePojo.coinId.CoinIdDTO;
import responsePojo.convertToBoliviano.ConvertCoin;
import responsePojo.getInfo.CoinInfo;
import responsePojo.getInfo.GetCoinInfo;

//@JsonIgnoreProperties
public class APIStepDefs {
    public Properties config;
    RequestSpecification request;
    String apiKey="fae36194-7abc-4ff2-8f7e-15d260771bbf";
    String baseUrl="https://pro-api.coinmarketcap.com";
    String map="/v1/cryptocurrency/map?sort=id";
    String convert="/v1/tools/price-conversion?amount=%a&id=%id&convert=BOB";
    String crypto_info="/v1/cryptocurrency/info?id=%id";
    String responseBody;
    JSONParser jsonParser;
    Map<String,String> coins;
    GetCoinInfo getCoinInfo;


    public APIStepDefs(){
        config= new Properties();
        request = RestAssured.given();
        jsonParser = new JSONParser();
        coins = new HashMap<String,String>();
    }

    @When("user retrieves ID of {string} coin")
    public void userRetrievesIDOfCoin(String type)  {
        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.header("X-CMC_PRO_API_KEY", apiKey);
        request.header(HttpHeaders.ACCEPT, "application/json");
        Response response = request.get(map);
        Assert.assertEquals(response.getStatusCode(), 200);
        responseBody = response.getBody().asString();
        CoinIdDTO coinIdDTO = new Gson().fromJson(responseBody, CoinIdDTO.class);
        for (int i=0;i<coinIdDTO.getData().size();i++){
            if(coinIdDTO.getData().get(i).getName().equals(type)){
            System.out.println("Storing coin details for "+coinIdDTO.getData().get(i).getName()+" with symbol as "
            +coinIdDTO.getData().get(i).getSymbol()+" and ID as "+coinIdDTO.getData().get(i).getId().toString());
            config.setProperty("coin_id",coinIdDTO.getData().get(i).getId().toString());
            config.setProperty("coin_name",coinIdDTO.getData().get(i).getName());
            config.setProperty("coin_symbol",coinIdDTO.getData().get(i).getSymbol());}
        }
    }

    @Then("user converts {string} amount of {string} coin with to Boliviano")
    public void userConvertsItToBoliviano(String amount, String type) {
        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.header("X-CMC_PRO_API_KEY", apiKey);
        request.header(HttpHeaders.ACCEPT, "application/json");
        Response response = request.get(convert.replaceAll("%a",amount).replaceAll("%id",config.getProperty("coin_id")));
        responseBody = response.getBody().asString();
        Assert.assertEquals(response.getStatusCode(), 200);
        ConvertCoin convertCoin = new Gson().fromJson(responseBody, ConvertCoin.class);
        System.out.println("Conversion done successfully from "+convertCoin.getData().getName()+" to Boliviano and the price for "+amount+" of "+convertCoin.getData().getSymbol()+" is "+convertCoin.getData().getQuote().getBob().getPrice());
        Assert.assertTrue(convertCoin.getData().getSymbol().equalsIgnoreCase(config.getProperty("coin_symbol")));
        Assert.assertTrue(convertCoin.getData().getName().equalsIgnoreCase(config.getProperty("coin_name")));
        }

    public String getCurrencyInfo(String id){
        RestAssured.baseURI = baseUrl;
        RequestSpecification request = RestAssured.given();
        request.header("X-CMC_PRO_API_KEY", apiKey);
        request.header(HttpHeaders.ACCEPT, "application/json");
        Response response = request.get(crypto_info.replaceAll("%id",id));
        responseBody = response.getBody().asString();
        Assert.assertEquals(response.getStatusCode(), 200);
        return responseBody;
    }

    @Given("user fetches the technical documentation of {string} cryptocurrency")
    public void userFetchesTheTechnicalDocumentationOfTypeCryptocurrency(String type) throws ParseException {
        userRetrievesIDOfCoin(type);
        responseBody=getCurrencyInfo(config.getProperty("coin_id"));
        JSONObject jsonObject = (JSONObject) jsonParser.parse(responseBody);
        JSONObject dataJSONObj = (JSONObject) jsonObject.get("data");
        getCoinInfo=new Gson().fromJson(responseBody,GetCoinInfo.class);
        getCoinInfo.getData().setCoinInfo(new Gson().fromJson(dataJSONObj.get(config.getProperty("coin_id")).toString(),CoinInfo.class));
    }

    @Then("user verifies the technical information of the currency")
    public void userVerifiesTheTechnicalInformationOfTheCurrency(DataTable table) {
        System.out.println(getCoinInfo.getData().getCoinInfo().getUrls().getTechnicalDoc());
        List<Map<String, String>> data = table.asMaps();
        for (Map<String, String> testData : data) {
            Assert.assertTrue(getCoinInfo.getData().getCoinInfo().getName().equals(testData.get("name")));
            Assert.assertTrue(getCoinInfo.getData().getCoinInfo().getSymbol().equals(testData.get("symbol")));
            Assert.assertTrue(getCoinInfo.getData().getCoinInfo().getDateAdded().equals(testData.get("date")));
            Assert.assertTrue(getCoinInfo.getData().getCoinInfo().getLogo().equals(testData.get("logo")));
            Assert.assertFalse(getCoinInfo.getData().getCoinInfo().getUrls().getTechnicalDoc().isEmpty());
            Assert.assertTrue(checkIfTagPresent(getCoinInfo.getData().getCoinInfo().getTags(),testData.get("tag")));
        }
    }

    public boolean checkIfTagPresent(List<String> tags,String expectedTag) {
        for (String tag : tags) {
            if (tag.equalsIgnoreCase(expectedTag))
                System.out.println(tag);
                return true;
        }
        return false;
    }


    @Given("user retrieves ID of first ten coins and prints the details of coins with mineable")
    public void userRetrievesIDOfCoins() {
        try{
        for (int i = 1; i <= 2000; i++) {
            responseBody=getCurrencyInfo(String.valueOf(i));
            JSONObject jsonObject = (JSONObject) jsonParser.parse(responseBody);
            JSONObject dataJSONObj = (JSONObject) jsonObject.get("data");
            getCoinInfo=new Gson().fromJson(responseBody,GetCoinInfo.class);
            getCoinInfo.getData().setCoinInfo(new Gson().fromJson(dataJSONObj.get(String.valueOf(i)).toString(),CoinInfo.class));
            if(checkIfTagPresent(getCoinInfo.getData().getCoinInfo().getTags(),"mineable")){
                System.out.println("_________________________"+"\n ID:"+getCoinInfo.getData().getCoinInfo().getId()+
                            "\n Name:"+getCoinInfo.getData().getCoinInfo().getName()+
                            "\n Symbol:"+getCoinInfo.getData().getCoinInfo().getSymbol());
            }
        }
        }catch (NullPointerException | ParseException e){}
    }
}
