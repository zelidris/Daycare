
package com.id.hackaton.notification.health;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Parent",
    "Child",
    "Type",
    "TemperatureAlert",
    "ParacetamolProvided",
    "Fell",
        "Key"
})
@Generated("jsonschema2pojo")
public class Health {

    @JsonProperty("Parent")
    private String parent;
    @JsonProperty("Child")
    private String child;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("TemperatureAlert")
    private Double temperatureAlert;
    @JsonProperty("ParacetamolProvided")
    private Boolean paracetamolProvided;
    @JsonProperty("Fell")
    private Boolean fell;

    @JsonProperty("Key")
    private String key;

    @JsonProperty("Parent")
    public String getParent() {
        return parent;
    }

    @JsonProperty("Parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    @JsonProperty("Child")
    public String getChild() {
        return child;
    }

    @JsonProperty("Child")
    public void setChild(String child) {
        this.child = child;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("TemperatureAlert")
    public Double getTemperatureAlert() {
        return temperatureAlert;
    }

    @JsonProperty("TemperatureAlert")
    public void setTemperatureAlert(Double temperatureAlert) {
        this.temperatureAlert = temperatureAlert;
    }

    @JsonProperty("ParacetamolProvided")
    public Boolean getParacetamolProvided() {
        return paracetamolProvided;
    }

    @JsonProperty("ParacetamolProvided")
    public void setParacetamolProvided(Boolean paracetamolProvided) {
        this.paracetamolProvided = paracetamolProvided;
    }

    @JsonProperty("Fell")
    public Boolean getFell() {
        return fell;
    }

    @JsonProperty("Fell")
    public void setFell(Boolean fell) {
        this.fell = fell;
    }

    @JsonProperty("Key")
    public String getKey() {
        return key;
    }

    @JsonProperty("Key")
    public void setKey(String key) {
        this.key = key;
    }

}
