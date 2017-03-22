package com.humegatech.mule.modules.car2go.config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.junit.Test;

import com.humegatech.Car2GoslingClientInterface;

public class ConnectorConfigTest {
    @Test
    public void testGetClient() {
        final ConnectorConfig config = new ConnectorConfig(System.getProperty("dummy"));
        final Car2GoslingClientInterface client = config.getClient();

        assertNotNull("Client couldn't be created!", client);
    }

    // functional test requires actual Car2Go oauth_consumer_key and will hit
    // the Car2Go API
    @Test
    public void testGetLocations() throws JSONException {
        final ConnectorConfig config = new ConnectorConfig(System.getProperty("CAR2GO_CONSUMER_KEY"));
        final Car2GoslingClientInterface client = config.getClient();
        final String payload = client.getLocations();

        final JSONArray locations = new JSONArray(payload);

        assertTrue("No locations!", locations.length() > 0);
    }

    @Test
    public void testGetVehicles() throws JSONException {
        final ConnectorConfig config = new ConnectorConfig(System.getProperty("CAR2GO_CONSUMER_KEY"));
        final Car2GoslingClientInterface client = config.getClient();
        final String payload = client.getVehicles("Hamburg");

        final JSONArray vehicles = new JSONArray(payload);

        assertTrue("No vehicles!", vehicles.length() > 0);
    }
}
