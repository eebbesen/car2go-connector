package com.humegatech.mule.modules.car2go;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import com.humegatech.mule.modules.car2go.config.ConnectorConfig;

@Connector(name = "car2go", friendlyName = "Car2Go")
public class Car2GoConnector {

    @Config
    ConnectorConfig config;

    @Processor
    public String getLocations() throws JSONException {
        return new JSONArray(config.getClient().getLocations()).toString();
    }

    @Processor
    public String getVehicles(final String location) throws JSONException {
        return new JSONArray(config.getClient().getVehicles(location)).toString();
    }

    @Processor
    public String getGasStations(final String location) throws JSONException {
        return new JSONArray(config.getClient().getGasStations(location)).toString();
    }

    @Processor
    public String getParkingSpots(final String location) throws JSONException {
        return new JSONArray(config.getClient().getParkingSpots(location)).toString();
    }

    @Processor
    public String getOperationAreas(final String location) throws JSONException {
        return new JSONArray(config.getClient().getOperationAreas(location)).toString();
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(final ConnectorConfig config) {
        this.config = config;
    }

    static List convertJSONArray(final JSONArray jsonArray) {
        final List list = new ArrayList();
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                list.add(jsonArray.get(i));
            } catch (final JSONException e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}