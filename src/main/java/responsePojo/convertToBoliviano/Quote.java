
package responsePojo.convertToBoliviano;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Quote {

    @SerializedName("BOB")
    @Expose
    private Bob bob;

    public Bob getBob() {
        return bob;
    }

    public void setBob(Bob bob) {
        this.bob = bob;
    }

    public Quote withBob(Bob bob) {
        this.bob = bob;
        return this;
    }

}
