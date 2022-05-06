
package com.id.hackaton.notification.nap;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Parent",
    "Child",
    "Type",
    "StartTime",
    "EndTime",
        "Key"
})
@Generated("jsonschema2pojo")
public class Nap {

    @JsonProperty("Parent")
    private String parent;
    @JsonProperty("Child")
    private String child;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("StartTime")
    private String startTime;
    @JsonProperty("EndTime")
    private String endTime;

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

    @JsonProperty("StartTime")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("StartTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("EndTime")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("EndTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
