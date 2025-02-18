/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package assigment2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mac2
 */
public class ConfigurationManager {
    //Private static instance variable
    private static ConfigurationManager instance;
    
    // Configuration settings stored in a map
    private Map<String, String> configSettings;

    //Private constructor
    ConfigurationManager() {
        // Initialize configuration settings
        configSettings = new HashMap<>();
        configSettings.put("appName", "MyApplication");
        configSettings.put("version", "1.0.0");
    }

    //Public static method to get the instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    //Methods to get and set configuration values
    public String getConfigValue(String key) {
        return configSettings.get(key);
    }

    public void setConfigValue(String key, String value) {
        configSettings.put(key, value);
    }
}
