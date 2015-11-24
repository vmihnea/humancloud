
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


/**
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "checksum",
    "roots",
    "version"
})
public class Schema {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("checksum")
    @Size(min = 1)
    @NotNull
    private String checksum;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("roots")
    @Valid
    @NotNull
    private Roots roots;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    @NotNull
    private Double version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The checksum
     */
    @JsonProperty("checksum")
    public String getChecksum() {
        return checksum;
    }

    /**
     * 
     * (Required)
     * 
     * @param checksum
     *     The checksum
     */
    @JsonProperty("checksum")
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Schema withChecksum(String checksum) {
        this.checksum = checksum;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The roots
     */
    @JsonProperty("roots")
    public Roots getRoots() {
        return roots;
    }

    /**
     * 
     * (Required)
     * 
     * @param roots
     *     The roots
     */
    @JsonProperty("roots")
    public void setRoots(Roots roots) {
        this.roots = roots;
    }

    public Schema withRoots(Roots roots) {
        this.roots = roots;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The version
     */
    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     * @param version
     *     The version
     */
    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public Schema withVersion(Double version) {
        this.version = version;
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

    public Schema withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(checksum).append(roots).append(version).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schema) == false) {
            return false;
        }
        Schema rhs = ((Schema) other);
        return new EqualsBuilder().append(checksum, rhs.checksum).append(roots, rhs.roots).append(version, rhs.version).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
