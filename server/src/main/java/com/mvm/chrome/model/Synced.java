
package com.mvm.chrome.model;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.gson.Gson;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "children",
    "date_added",
    "date_modified",
    "id",
    "name",
    "sync_transaction_version",
    "type"
})
public class Synced {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("children")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @Size(min = 1)
    @Valid
    @NotNull
    private Set<Child> children = new LinkedHashSet<Child>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date_added")
    @Size(min = 1)
    @NotNull
    private String dateAdded;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date_modified")
    @Size(min = 1)
    @NotNull
    private String dateModified;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @Size(min = 1)
    @NotNull
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    @Size(min = 1)
    @NotNull
    private String name;
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
    @JsonProperty("type")
    @Size(min = 1)
    @NotNull
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The children
     */
    @JsonProperty("children")
    public Set<Child> getChildren() {
        return children;
    }

    /**
     * 
     * (Required)
     * 
     * @param children
     *     The children
     */
    @JsonProperty("children")
    public void setChildren(Set<Child> children) {
        this.children = children;
    }

    public Synced withChildren(Set<Child> children) {
        this.children = children;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The date_added
     */
    @JsonProperty("date_added")
    public String getDateAdded() {
        return dateAdded;
    }

    /**
     * 
     * (Required)
     * 
     * @param dateAdded
     *     The date_added
     */
    @JsonProperty("date_added")
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Synced withDate_added(String date_added) {
        this.dateAdded = date_added;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The date_modified
     */
    @JsonProperty("date_modified")
    public String getDateModified() {
        return dateModified;
    }

    /**
     * 
     * (Required)
     * 
     * @param dateModified
     *     The date_modified
     */
    @JsonProperty("date_modified")
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public Synced withDate_modified(String date_modified) {
        this.dateModified = date_modified;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Synced withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Synced withName(String name) {
        this.name = name;
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

    public Synced withSync_transaction_version(String sync_transaction_version) {
        this.syncTransactionVersion = sync_transaction_version;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Synced withType(String type) {
        this.type = type;
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

    public Synced withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(children).append(dateAdded).append(dateModified).append(id).append(name).append(syncTransactionVersion).append(type).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Synced) == false) {
            return false;
        }
        Synced rhs = ((Synced) other);
        return new EqualsBuilder().append(children, rhs.children).append(dateAdded, rhs.dateAdded).append(dateModified, rhs.dateModified).append(id, rhs.id).append(name, rhs.name).append(syncTransactionVersion, rhs.syncTransactionVersion).append(type, rhs.type).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
