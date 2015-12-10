/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author NavNag
 */
public class StyleProperty {

    private String key;
    private String value;

    public StyleProperty(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ": " + value + ";";
    }

    public static void main(String[] args) {
        StyleProperty prop = new StyleProperty("opacity", "0.1");
        prop.key = "background-color";
        prop.value = "red";
        System.out.println(prop);
    }
}
