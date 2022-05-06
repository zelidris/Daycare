
package com.id.hackaton.parent;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FirstName",
        "LastName",
        "Phone",
        "Email",
        "Child",
        "Notification",
        "Preferences",
        "CareGiver",
        "Key"
})
public class Parent {

    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("Child")
    private List<Child> child = null;
    @JsonProperty("Notification")
    private List<Notification> notification = null;
    @JsonProperty("Preferences")
    private Preferences preferences;
    @JsonProperty("CareGiver")
    private CareGiver careGiver;
    @JsonProperty("Key")
    private String key;

    @JsonProperty("FirstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("LastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("Phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("Child")
    public List<Child> getChild() {
        return child;
    }

    @JsonProperty("Child")
    public void setChild(List<Child> child) {
        this.child = child;
    }

    @JsonProperty("Notification")
    public List<Notification> getNotification() {
        return notification;
    }

    @JsonProperty("Notification")
    public void setNotification(List<Notification> notification) {
        this.notification = notification;
    }

    @JsonProperty("Preferences")
    public Preferences getPreferences() {
        return preferences;
    }

    @JsonProperty("Preferences")
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    @JsonProperty("CareGiver")
    public CareGiver getCareGiver() {
        return careGiver;
    }

    @JsonProperty("CareGiver")
    public void setCareGiver(CareGiver careGiver) {
        this.careGiver = careGiver;
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
