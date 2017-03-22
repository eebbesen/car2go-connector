package com.humegatech.mule.modules.car2go;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

import com.humegatech.mule.modules.car2go.config.ConnectorConfig;

public class Car2GoConnectorTest {

    @Test
    public void testConvertJSONArray() throws JSONException {
        final JSONArray jsonArray = new JSONArray("[{\"key1\":\"val1\"},{\"key2\":\"val2\"}]");

        final List list = Car2GoConnector.convertJSONArray(jsonArray);

        assertEquals("val2", ((JSONObject) list.get(1)).get("key2"));
    }

    @Test
    public void getLocations() throws JSONException {
        final ConnectorConfig config = new ConnectorConfig(System.getProperty("CAR2GO_CONSUMER_KEY"));
        final Car2GoConnector connector = new Car2GoConnector();
        connector.setConfig(config);

        final String payload = connector.getLocations();

        final JSONArray locations = new JSONArray(payload);
        final JSONObject location = new JSONObject(locations.get(0).toString());
        assertNotNull("No locationName for object -- may not have been properly built", location.get("locationName"));
    }
}