
package responsePojo.getInfo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class GetCoinInfo {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private Data data;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public GetCoinInfo withStatus(Status status) {
        this.status = status;
        return this;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public GetCoinInfo withData(Data data) {
        this.data = data;
        return this;
    }

}
