package com.humegatech.mule.modules.car2go;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.humegatech.mule.modules.car2go.config.ConnectorConfig;

public class Car2GoConnectorTest {
    private static final String LOC = "Hamburg";

    private Car2GoConnector connector;

    @Before
    public void setUp() {
        final ConnectorConfig config = new ConnectorConfig(System.getProperty("CAR2GO_CONSUMER_KEY"));
        connector = new Car2GoConnector();
        connector.setConfig(config);
    }

    @After
    public void tearDown() {
        connector = null;
    }

    @Test
    public void testConvertJSONArray() throws JSONException {
        final JSONArray jsonArray = new JSONArray("[{\"key1\":\"val1\"},{\"key2\":\"val2\"}]");

        final List list = Car2GoConnector.convertJSONArray(jsonArray);

        assertEquals("val2", ((JSONObject) list.get(1)).get("key2"));
    }

    @Test
    public void getGasStations() throws JSONException {
        final String payload = connector.getGasStations(LOC);

        final JSONArray gasStations = new JSONArray(payload);
        final JSONObject gasStation = new JSONObject(gasStations.get(0).toString());
        assertNotNull("No name for gas station -- may not have been properly built", gasStation.get("name"));
    }

    @Test
    public void getLocations() throws JSONException {
        final String payload = connector.getLocations();

        final JSONArray locations = new JSONArray(payload);
        final JSONObject location = new JSONObject(locations.get(0).toString());
        assertNotNull("No locationName for location -- may not have been properly built", location.get("locationName"));
    }

    @Test
    public void getOperationAreas() throws JSONException {
        final String payload = connector.getOperationAreas(LOC);

        final JSONArray operationAreas = new JSONArray(payload);
        final JSONObject operationArea = new JSONObject(operationAreas.get(0).toString());
        assertNotNull("No zoneType for operation area -- may not have been properly built", operationArea.get("zoneType"));
    }

    @Test
    public void getParkingSpots() throws JSONException {
        final String payload = connector.getParkingSpots(LOC);

        final JSONArray parkingSpots = new JSONArray(payload);
        final JSONObject parkingSpot = new JSONObject(parkingSpots.get(0).toString());
        assertNotNull("No chargingPole for parking spot -- may not have been properly built", parkingSpot.get("chargingPole"));
    }

    @Test
    public void getVehicles() throws JSONException {
        final String payload = connector.getVehicles(LOC);

        final JSONArray vehicles = new JSONArray(payload);
        final JSONObject vehicle = new JSONObject(vehicles.get(0).toString());
        assertNotNull("No exterior for object -- may not have been properly built", vehicle.get("exterior"));
    }

}