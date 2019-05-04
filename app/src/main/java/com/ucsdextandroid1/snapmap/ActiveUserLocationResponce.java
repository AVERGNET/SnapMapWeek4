package com.ucsdextandroid1.snapmap;

import java.util.List;

public class ActiveUserLocationResponce {

    private List<UserLocationData> userLocations;

    public List<UserLocationData> getUserLocations() {
        return userLocations;
    }

    public void setUserLocations(List<UserLocationData> userLocation) {
        this.userLocations = userLocation;
    }
}
