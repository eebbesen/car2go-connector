package org.mule.modules.car2go;

import java.util.List;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.Start;
import org.mule.modules.car2go.config.ConnectorConfig;

@Connector(name = "car2go", friendlyName = "Car2Go")
public class Car2GoConnector {

	@Config
	ConnectorConfig config;

	@Processor
	public List getLocations(){
		return null;
	}
//	/**
//	 * Custom processor
//	 *
//	 * @param friend
//	 *            Name to be used to generate a greeting message.
//	 * @return A greeting message
//	 */
//	@Processor
//	public String greet(String friend) {
//		/*
//		 * MESSAGE PROCESSOR CODE GOES HERE
//		 */
//		return config.getGreeting() + " " + friend + ". " + config.getReply();
//	}

	public ConnectorConfig getConfig() {
		return config;
	}

	public void setConfig(ConnectorConfig config) {
		this.config = config;
	}

}