
package responsePojo.convertToBoliviano;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Bob {

    @SerializedName("price")
    @Expose
    private double price;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Bob withPrice(double price) {
        this.price = price;
        return this;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Bob withLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

}
