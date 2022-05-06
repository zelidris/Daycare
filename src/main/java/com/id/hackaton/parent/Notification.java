
package com.id.hackaton.parent;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Naptime",
        "Food",
        "Health",
        "Playtime"
})
public class Notification {

    @JsonProperty("Naptime")
    private Boolean naptime;
    @JsonProperty("Food")
    private Boolean food;
    @JsonProperty("Health")
    private Boolean health;
    @JsonProperty("Playtime")
    private Boolean playtime;

    @JsonProperty("Naptime")
    public Boolean getNaptime() {
        return naptime;
    }

    @JsonProperty("Naptime")
    public void setNaptime(Boolean naptime) {
        this.naptime = naptime;
    }

    @JsonProperty("Food")
    public Boolean getFood() {
        return food;
    }

    @JsonProperty("Food")
    public void setFood(Boolean food) {
        this.food = food;
    }

    @JsonProperty("Health")
    public Boolean getHealth() {
        return health;
    }

    @JsonProperty("Health")
    public void setHealth(Boolean health) {
        this.health = health;
    }

    @JsonProperty("Playtime")
    public Boolean getPlaytime() {
        return playtime;
    }

    @JsonProperty("Playtime")
    public void setPlaytime(Boolean playtime) {
        this.playtime = playtime;
    }

}
