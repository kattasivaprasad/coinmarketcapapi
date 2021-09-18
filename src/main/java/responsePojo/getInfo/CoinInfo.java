
package responsePojo.getInfo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CoinInfo {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("subreddit")
    @Expose
    private String subreddit;
    @SerializedName("notice")
    @Expose
    private String notice;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("tag-names")
    @Expose
    private List<String> tagNames = null;
    @SerializedName("tag-groups")
    @Expose
    private List<String> tagGroups = null;
    @SerializedName("urls")
    @Expose
    private Urls urls;
    @SerializedName("platform")
    @Expose
    private Object platform;
    @SerializedName("date_added")
    @Expose
    private String dateAdded;
    @SerializedName("twitter_username")
    @Expose
    private String twitterUsername;
    @SerializedName("is_hidden")
    @Expose
    private int isHidden;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CoinInfo withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoinInfo withName(String name) {
        this.name = name;
        return this;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public CoinInfo withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CoinInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CoinInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public CoinInfo withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public CoinInfo withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public CoinInfo withSubreddit(String subreddit) {
        this.subreddit = subreddit;
        return this;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public CoinInfo withNotice(String notice) {
        this.notice = notice;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CoinInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public List<String> getTagNames() {
        return tagNames;
    }

    public void setTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
    }

    public CoinInfo withTagNames(List<String> tagNames) {
        this.tagNames = tagNames;
        return this;
    }

    public List<String> getTagGroups() {
        return tagGroups;
    }

    public void setTagGroups(List<String> tagGroups) {
        this.tagGroups = tagGroups;
    }

    public CoinInfo withTagGroups(List<String> tagGroups) {
        this.tagGroups = tagGroups;
        return this;
    }

    public Urls getUrls() {
        return urls;
    }

    public void setUrls(Urls urls) {
        this.urls = urls;
    }

    public CoinInfo withUrls(Urls urls) {
        this.urls = urls;
        return this;
    }

    public Object getPlatform() {
        return platform;
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    public CoinInfo withPlatform(Object platform) {
        this.platform = platform;
        return this;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public CoinInfo withDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
        return this;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public CoinInfo withTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
        return this;
    }

    public int getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(int isHidden) {
        this.isHidden = isHidden;
    }

    public CoinInfo withIsHidden(int isHidden) {
        this.isHidden = isHidden;
        return this;
    }

}
