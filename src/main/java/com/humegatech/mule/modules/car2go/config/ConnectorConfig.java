package com.humegatech.mule.modules.car2go.config;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.Configuration;

import com.humegatech.Car2GoslingClientImpl;
import com.humegatech.Car2GoslingClientInterface;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {
    @Configurable
    private String car2GoApiToken;

    ConnectorConfig() {
    }

    public ConnectorConfig(final String car2GoApiToken) {
        this.car2GoApiToken = car2GoApiToken;
    }

    public Car2GoslingClientInterface getClient() {
        return new Car2GoslingClientImpl(car2GoApiToken);
    }

    public String getCar2GoApiToken() {
        return car2GoApiToken;
    }

    public void setCar2GoApiToken(final String car2GoApiToken) {
        this.car2GoApiToken = car2GoApiToken;
    }
}

