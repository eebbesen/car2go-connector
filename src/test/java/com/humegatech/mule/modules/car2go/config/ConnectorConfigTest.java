package com.humegatech.mule.modules.car2go.config;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import com.humegatech.Car2GoslingClientInterface;

public class ConnectorConfigTest {
	@Test
	public void testGetClient() {
		ConnectorConfig config = new ConnectorConfig(
				System.getProperty("dummy"));
		Car2GoslingClientInterface client = config.getClient();

		assertNotNull("Client couldn't be created!", client);
	}

	// functional test requires actual Car2Go oauth_consumer_key and will hit
	// the Car2Go API
	@Test
	public void testGetLocations() {
		ConnectorConfig config = new ConnectorConfig(
				System.getProperty("CAR2GO_CONSUMER_KEY"));
		Car2GoslingClientInterface client = config.getClient();
		ArrayList locations = client.getLocations();

		assertTrue("No locations!", locations.size() > 0);
	}

	@Test
	public void testGetVehicles() {
		ConnectorConfig config = new ConnectorConfig(
				System.getProperty("CAR2GO_CONSUMER_KEY"));
		Car2GoslingClientInterface client = config.getClient();
		ArrayList locations = client.getVehicles("Hamburg");

		assertTrue("No locations!", locations.size() > 0);
	}
}
