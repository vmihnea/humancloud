
package com.mvm.chrome.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
    "stars.id",
    "stars.isSynced"
})
public class MetaInfo {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stars.id")
    @Size(min = 1)
    @NotNull
    private String starsId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("stars.isSynced")
    @Size(min = 1)
    @NotNull
    private String starsIsSynced;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The stars_id
     */
    @JsonProperty("stars.id")
    public String getStarsId() {
        return starsId;
    }

    /**
     * 
     * (Required)
     * 
     * @param starsId
     *     The stars.id
     */
    @JsonProperty("stars.id")
    public void setStarsId(String starsId) {
        this.starsId = starsId;
    }

    public MetaInfo withStars_id(String stars_id) {
        this.starsId = stars_id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The stars_isSynced
     */
    @JsonProperty("stars.isSynced")
    public String getStarsIsSynced() {
        return starsIsSynced;
    }

    /**
     * 
     * (Required)
     * 
     * @param starsIsSynced
     *     The stars.isSynced
     */
    @JsonProperty("stars.isSynced")
    public void setStarsIsSynced(String starsIsSynced) {
        this.starsIsSynced = starsIsSynced;
    }

    public MetaInfo withStars_isSynced(String stars_isSynced) {
        this.starsIsSynced = stars_isSynced;
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

    public MetaInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(starsId).append(starsIsSynced).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetaInfo) == false) {
            return false;
        }
        MetaInfo rhs = ((MetaInfo) other);
        return new EqualsBuilder().append(starsId, rhs.starsId).append(starsIsSynced, rhs.starsIsSynced).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
