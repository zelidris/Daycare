
package com.id.hackaton.notification;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Timestamp",
    "Information"
})
@Generated("jsonschema2pojo")
public class AdditionalInformation {

    @JsonProperty("Timestamp")
    private String timestamp;
    @JsonProperty("Information")
    private String information;

    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("Timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Information")
    public String getInformation() {
        return information;
    }

    @JsonProperty("Information")
    public void setInformation(String information) {
        this.information = information;
    }

}
