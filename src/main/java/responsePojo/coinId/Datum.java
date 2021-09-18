
package responsePojo.coinId;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Datum {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("is_active")
    @Expose
    private Integer isActive;
    @SerializedName("first_historical_data")
    @Expose
    private String firstHistoricalData;
    @SerializedName("last_historical_data")
    @Expose
    private String lastHistoricalData;
    @SerializedName("platform")
    @Expose
    private Platform platform;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getFirstHistoricalData() {
        return firstHistoricalData;
    }

    public void setFirstHistoricalData(String firstHistoricalData) {
        this.firstHistoricalData = firstHistoricalData;
    }

    public String getLastHistoricalData() {
        return lastHistoricalData;
    }

    public void setLastHistoricalData(String lastHistoricalData) {
        this.lastHistoricalData = lastHistoricalData;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

}
