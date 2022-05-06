
package com.id.hackaton.notification.food;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Parent",
    "Child",
    "Type",
    "MealType",
    "Timestamp",
    "Meal",
    "Good",
        "Key"
})
@Generated("jsonschema2pojo")
public class Food {

    @JsonProperty("Parent")
    private String parent;
    @JsonProperty("Child")
    private String child;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("MealType")
    private String mealType;
    @JsonProperty("Timestamp")
    private String timestamp;
    @JsonProperty("Meal")
    private String meal;
    @JsonProperty("Good")
    private Boolean good;
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

    @JsonProperty("MealType")
    public String getMealType() {
        return mealType;
    }

    @JsonProperty("MealType")
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @JsonProperty("Timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("Timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Meal")
    public String getMeal() {
        return meal;
    }

    @JsonProperty("Meal")
    public void setMeal(String meal) {
        this.meal = meal;
    }

    @JsonProperty("Good")
    public Boolean getGood() {
        return good;
    }

    @JsonProperty("Good")
    public void setGood(Boolean good) {
        this.good = good;
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
