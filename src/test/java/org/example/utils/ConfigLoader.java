package org.example.utils;

import org.example.constants.EnvType;

import java.util.Properties;

public class ConfigLoader {

    private final Properties properties;
    private static ConfigLoader configLoader;

    private ConfigLoader() {
        String env = System.getProperty("env", String.valueOf(EnvType.STAGE));
        switch (EnvType.valueOf(env)){
            case STAGE ->
                    properties = PropertyUtils.propertyLoader("src/test/resources/stg_config.properties");
            case PROD ->
                    properties = PropertyUtils.propertyLoader("src/test/resources/prod_config.properties");
            default -> throw new IllegalStateException("Invalid env name"+env);
        }
    }

    public static ConfigLoader getInstance() {
        if (configLoader == null) {
            configLoader = new ConfigLoader();
        }
        return configLoader;
    }

    public String getBaseURL() {
        String prop = properties.getProperty("baseURL");
        if (prop != null) return prop;
        else throw new RuntimeException("property baseURL is not speciefied in the confin file");
    }
}
