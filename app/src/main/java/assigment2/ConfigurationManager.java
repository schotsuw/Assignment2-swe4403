/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package assigment2;

/**
 *
 * @author mac2
 */
public class ConfigurationManager {
    //Private static instance variable
    private static ConfigurationManager instance;

    //Private constructor
    private ConfigurationManager() {
    }

    //Public static method to get the instance
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    //get a configuration value
    public String getConfigValue(String key) {
        //a dummy value for demo
        return "DummyValue";
    }
}
