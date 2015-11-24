
package com.mvm.chrome.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.Gson;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "bookmark_bar",
    "other",
    "sync_transaction_version",
    "synced"
})
public class Roots {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("bookmark_bar")
    @Valid
    @NotNull
    private BookmarkBar bookmarkBar;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("other")
    @Valid
    @NotNull
    private Other other;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("sync_transaction_version")
    @Size(min = 1)
    @NotNull
    private String syncTransactionVersion;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("synced")
    @Valid
    @NotNull
    private Synced synced;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The bookmark_bar
     */
    @JsonProperty("bookmark_bar")
    public BookmarkBar getBookmarkBar() {
        return bookmarkBar;
    }

    /**
     * 
     * (Required)
     * 
     * @param bookmarkBar
     *     The bookmark_bar
     */
    @JsonProperty("bookmark_bar")
    public void setBookmarkBar(BookmarkBar bookmarkBar) {
        this.bookmarkBar = bookmarkBar;
    }

    public Roots withBookmark_bar(BookmarkBar bookmark_bar) {
        this.bookmarkBar = bookmark_bar;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The other
     */
    @JsonProperty("other")
    public Other getOther() {
        return other;
    }

    /**
     * 
     * (Required)
     * 
     * @param other
     *     The other
     */
    @JsonProperty("other")
    public void setOther(Other other) {
        this.other = other;
    }

    public Roots withOther(Other other) {
        this.other = other;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The sync_transaction_version
     */
    @JsonProperty("sync_transaction_version")
    public String getSyncTransactionVersion() {
        return syncTransactionVersion;
    }

    /**
     * 
     * (Required)
     * 
     * @param syncTransactionVersion
     *     The sync_transaction_version
     */
    @JsonProperty("sync_transaction_version")
    public void setSyncTransactionVersion(String syncTransactionVersion) {
        this.syncTransactionVersion = syncTransactionVersion;
    }

    public Roots withSync_transaction_version(String sync_transaction_version) {
        this.syncTransactionVersion = sync_transaction_version;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The synced
     */
    @JsonProperty("synced")
    public Synced getSynced() {
        return synced;
    }

    /**
     * 
     * (Required)
     * 
     * @param synced
     *     The synced
     */
    @JsonProperty("synced")
    public void setSynced(Synced synced) {
        this.synced = synced;
    }

    public Roots withSynced(Synced synced) {
        this.synced = synced;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Roots withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bookmarkBar).append(other).append(syncTransactionVersion).append(synced).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Roots) == false) {
            return false;
        }
        Roots rhs = ((Roots) other);
        return new EqualsBuilder().append(bookmarkBar, rhs.bookmarkBar).append(other, rhs.other).append(syncTransactionVersion, rhs.syncTransactionVersion).append(synced, rhs.synced).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
