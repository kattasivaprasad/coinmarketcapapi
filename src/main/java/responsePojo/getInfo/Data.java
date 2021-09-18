
package responsePojo.getInfo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Data {

    @SerializedName("CoinInfo")
    @Expose
    private CoinInfo coinInfo;

    public CoinInfo getCoinInfo() {
        return coinInfo;
    }

    public void setCoinInfo(CoinInfo coinInfo) {
        this.coinInfo = coinInfo;
    }

    public Data withCoinInfo(CoinInfo coinInfo) {
        this.coinInfo = coinInfo;
        return this;
    }

}
