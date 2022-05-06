
package com.id.hackaton.notification;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Parent",
    "Child",
    "Type",
    "AdditionalInformation"
})
@Generated("jsonschema2pojo")
public class Notification {

    @JsonProperty("Parent")
    private String parent;
    @JsonProperty("Child")
    private String child;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("AdditionalInformation")
    private AdditionalInformation additionalInformation;

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

    @JsonProperty("AdditionalInformation")
    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    @JsonProperty("AdditionalInformation")
    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

}
