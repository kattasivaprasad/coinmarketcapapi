
package responsePojo.getInfo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Urls {

    @SerializedName("website")
    @Expose
    private List<String> website = null;
    @SerializedName("twitter")
    @Expose
    private List<String> twitter = null;
    @SerializedName("message_board")
    @Expose
    private List<String> messageBoard = null;
    @SerializedName("chat")
    @Expose
    private List<String> chat = null;
    @SerializedName("explorer")
    @Expose
    private List<String> explorer = null;
    @SerializedName("reddit")
    @Expose
    private List<String> reddit = null;
    @SerializedName("technical_doc")
    @Expose
    private List<String> technicalDoc = null;
    @SerializedName("source_code")
    @Expose
    private List<String> sourceCode = null;
    @SerializedName("announcement")
    @Expose
    private List<String> announcement = null;

    public List<String> getWebsite() {
        return website;
    }

    public void setWebsite(List<String> website) {
        this.website = website;
    }

    public Urls withWebsite(List<String> website) {
        this.website = website;
        return this;
    }

    public List<String> getTwitter() {
        return twitter;
    }

    public void setTwitter(List<String> twitter) {
        this.twitter = twitter;
    }

    public Urls withTwitter(List<String> twitter) {
        this.twitter = twitter;
        return this;
    }

    public List<String> getMessageBoard() {
        return messageBoard;
    }

    public void setMessageBoard(List<String> messageBoard) {
        this.messageBoard = messageBoard;
    }

    public Urls withMessageBoard(List<String> messageBoard) {
        this.messageBoard = messageBoard;
        return this;
    }

    public List<String> getChat() {
        return chat;
    }

    public void setChat(List<String> chat) {
        this.chat = chat;
    }

    public Urls withChat(List<String> chat) {
        this.chat = chat;
        return this;
    }

    public List<String> getExplorer() {
        return explorer;
    }

    public void setExplorer(List<String> explorer) {
        this.explorer = explorer;
    }

    public Urls withExplorer(List<String> explorer) {
        this.explorer = explorer;
        return this;
    }

    public List<String> getReddit() {
        return reddit;
    }

    public void setReddit(List<String> reddit) {
        this.reddit = reddit;
    }

    public Urls withReddit(List<String> reddit) {
        this.reddit = reddit;
        return this;
    }

    public List<String> getTechnicalDoc() {
        return technicalDoc;
    }

    public void setTechnicalDoc(List<String> technicalDoc) {
        this.technicalDoc = technicalDoc;
    }

    public Urls withTechnicalDoc(List<String> technicalDoc) {
        this.technicalDoc = technicalDoc;
        return this;
    }

    public List<String> getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(List<String> sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Urls withSourceCode(List<String> sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    public List<String> getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(List<String> announcement) {
        this.announcement = announcement;
    }

    public Urls withAnnouncement(List<String> announcement) {
        this.announcement = announcement;
        return this;
    }

}
