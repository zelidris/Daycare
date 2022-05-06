
package com.id.hackaton.parent;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Email",
        "Phone"
})
public class Preferences {

    @JsonProperty("Email")
    private Boolean email;
    @JsonProperty("Phone")
    private Boolean phone;

    @JsonProperty("Email")
    public Boolean getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(Boolean email) {
        this.email = email;
    }

    @JsonProperty("Phone")
    public Boolean getPhone() {
        return phone;
    }

    @JsonProperty("Phone")
    public void setPhone(Boolean phone) {
        this.phone = phone;
    }

}
