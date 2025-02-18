/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package assigment2;

/**
 *
 * @author mac2
 */
public class DemoWithoutPattern {
    public static void main(String[] args) {
        // Multiple instances of ConfigurationManager
        ConfigurationManager configManager1 = new ConfigurationManager();
        ConfigurationManager configManager2 = new ConfigurationManager();

        // Inconsistent configuration settings
        configManager1.setConfigValue("someKey", "value1");
        configManager2.setConfigValue("someKey", "value2");

        System.out.println("Config Value from Manager 1: " + configManager1.getConfigValue("someKey"));
        System.out.println("Config Value from Manager 2: " + configManager2.getConfigValue("someKey"));

        // Direct instantiation of shape objects
        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();
    }

}
