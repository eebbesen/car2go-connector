package com.humegatech.mule.modules.car2go;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.junit.Test;

public class Car2GoConnectorTest {

    @Test
    public void testConvertJSONArray() throws JSONException {
        final JSONArray jsonArray = new JSONArray("[{\"key1\":\"val1\"},{\"key2\":\"val2\"}]");

        final List list = Car2GoConnector.convertJSONArray(jsonArray);

        assertEquals("val2", ((JSONObject) list.get(1)).get("key2"));

    }
}