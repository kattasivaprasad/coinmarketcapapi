
package responsePojo.coinId;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinIdDTO {

    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
