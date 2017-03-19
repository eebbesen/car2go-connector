package com.humegatech.mule.modules.car2go;

import java.util.List;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import com.humegatech.mule.modules.car2go.config.ConnectorConfig;

@Connector(name = "car2go", friendlyName = "Car2Go")
public class Car2GoConnector {

	@Config
	ConnectorConfig config;

	@Processor
	public List getLocations() {
		return config.getClient().getLocations();
	}

	public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

}