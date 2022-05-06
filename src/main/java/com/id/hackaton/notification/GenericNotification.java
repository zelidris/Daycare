
package com.id.hackaton.notification;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SP_KEY",
    "TYPE",
    "NOTIFICATION",
    "PHONE",
    "EMAIL",
    "PREFERENCES",
    "STARTTIME",
    "ENDTIME",
    "TEMPERATUREALERT",
    "PARACETAMOLPROVIDED",
    "FELL",
    "TOY",
    "TIMESTAMP",
    "MEAL",
    "GOOD"
})
@Generated("jsonschema2pojo")
public class GenericNotification {

    @JsonProperty("SP_KEY")
    private String spKey;
    @JsonProperty("TYPE")
    private String type;
    @JsonProperty("NOTIFICATION")
    private String notification;
    @JsonProperty("PHONE")
    private String phone;
    @JsonProperty("EMAIL")
    private String email;
    @JsonProperty("PREFERENCES")
    private String preferences;
    @JsonProperty("STARTTIME")
    private String starttime;
    @JsonProperty("ENDTIME")
    private String endtime;
    @JsonProperty("TEMPERATUREALERT")
    private String temperaturealert;
    @JsonProperty("PARACETAMOLPROVIDED")
    private Boolean paracetamolprovided;
    @JsonProperty("FELL")
    private Boolean fell;
    @JsonProperty("TOY")
    private String toy;
    @JsonProperty("TIMESTAMP")
    private String timestamp;
    @JsonProperty("MEAL")
    private String meal;
    @JsonProperty("GOOD")
    private Boolean good;

    @JsonProperty("SP_KEY")
    public String getSpKey() {
        return spKey;
    }

    @JsonProperty("SP_KEY")
    public void setSpKey(String spKey) {
        this.spKey = spKey;
    }

    @JsonProperty("TYPE")
    public String getType() {
        return type;
    }

    @JsonProperty("TYPE")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("NOTIFICATION")
    public String getNotification() {
        return notification;
    }

    @JsonProperty("NOTIFICATION")
    public void setNotification(String notification) {
        this.notification = notification;
    }

    @JsonProperty("PHONE")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("PHONE")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("EMAIL")
    public String getEmail() {
        return email;
    }

    @JsonProperty("EMAIL")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("PREFERENCES")
    public String getPreferences() {
        return preferences;
    }

    @JsonProperty("PREFERENCES")
    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    @JsonProperty("STARTTIME")
    public String getStarttime() {
        return starttime;
    }

    @JsonProperty("STARTTIME")
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    @JsonProperty("ENDTIME")
    public String getEndtime() {
        return endtime;
    }

    @JsonProperty("ENDTIME")
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @JsonProperty("TEMPERATUREALERT")
    public String getTemperaturealert() {
        return temperaturealert;
    }

    @JsonProperty("TEMPERATUREALERT")
    public void setTemperaturealert(String temperaturealert) {
        this.temperaturealert = temperaturealert;
    }

    @JsonProperty("PARACETAMOLPROVIDED")
    public Boolean getParacetamolprovided() {
        return paracetamolprovided;
    }

    @JsonProperty("PARACETAMOLPROVIDED")
    public void setParacetamolprovided(Boolean paracetamolprovided) {
        this.paracetamolprovided = paracetamolprovided;
    }

    @JsonProperty("FELL")
    public Boolean getFell() {
        return fell;
    }

    @JsonProperty("FELL")
    public void setFell(Boolean fell) {
        this.fell = fell;
    }

    @JsonProperty("TOY")
    public String getToy() {
        return toy;
    }

    @JsonProperty("TOY")
    public void setToy(String toy) {
        this.toy = toy;
    }

    @JsonProperty("TIMESTAMP")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("TIMESTAMP")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("MEAL")
    public String getMeal() {
        return meal;
    }

    @JsonProperty("MEAL")
    public void setMeal(String meal) {
        this.meal = meal;
    }

    @JsonProperty("GOOD")
    public Boolean getGood() {
        return good;
    }

    @JsonProperty("GOOD")
    public void setGood(Boolean good) {
        this.good = good;
    }

}
