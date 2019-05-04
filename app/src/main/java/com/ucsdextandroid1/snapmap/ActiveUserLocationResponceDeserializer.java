package com.ucsdextandroid1.snapmap;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ActiveUserLocationResponceDeserializer implements JsonDeserializer<ActiveUserLocationResponce> {

    @Override
    public ActiveUserLocationResponce deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
       ActiveUserLocationResponce response = new ActiveUserLocationResponce();

       List<UserLocationData> locations = new ArrayList<>();

        for (Map.Entry<String, JsonElement> entry : json.getAsJsonObject().entrySet()) {

            UserLocationData userLocationData =context.deserialize(entry.getValue(), UserLocationData.class);

            userLocationData.setUserId(entry.getKey());

            locations.add(userLocationData);

            response.setUserLocations(locations);
        }

        response.setUserLocations(locations);

        return response;
    }
}
