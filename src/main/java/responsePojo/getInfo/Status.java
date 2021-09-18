
package responsePojo.getInfo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Status {

    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("error_code")
    @Expose
    private int errorCode;
    @SerializedName("error_message")
    @Expose
    private Object errorMessage;
    @SerializedName("elapsed")
    @Expose
    private int elapsed;
    @SerializedName("credit_count")
    @Expose
    private int creditCount;
    @SerializedName("notice")
    @Expose
    private Object notice;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Status withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Status withErrorCode(int errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public Object getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Status withErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    public int getElapsed() {
        return elapsed;
    }

    public void setElapsed(int elapsed) {
        this.elapsed = elapsed;
    }

    public Status withElapsed(int elapsed) {
        this.elapsed = elapsed;
        return this;
    }

    public int getCreditCount() {
        return creditCount;
    }

    public void setCreditCount(int creditCount) {
        this.creditCount = creditCount;
    }

    public Status withCreditCount(int creditCount) {
        this.creditCount = creditCount;
        return this;
    }

    public Object getNotice() {
        return notice;
    }

    public void setNotice(Object notice) {
        this.notice = notice;
    }

    public Status withNotice(Object notice) {
        this.notice = notice;
        return this;
    }

}
