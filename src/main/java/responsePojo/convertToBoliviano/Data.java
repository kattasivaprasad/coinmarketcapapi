
package responsePojo.convertToBoliviano;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("amount")
    @Expose
    private int amount;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("quote")
    @Expose
    private Quote quote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data withId(int id) {
        this.id = id;
        return this;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Data withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data withName(String name) {
        this.name = name;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Data withAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Data withLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public Data withQuote(Quote quote) {
        this.quote = quote;
        return this;
    }

}
