/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NavNag
 */
public class StyleBlock {

    private String selector;
    List<StyleProperty> properties = new ArrayList<>();

    public StyleBlock(String selector) {
        this.selector = selector;
    }

    public StyleBlock add(StyleProperty prop) {
        properties.add(prop);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder();
        buff.append(selector).
                append("{");
        for (StyleProperty property : properties) {
            buff.append(property);
        }
        buff.append("}");
        return buff.toString();
    }

    public static void main(String[] args) {
        StyleBlock block = new StyleBlock(".my-class");
        block.add(new StyleProperty("background", "red"));
        block.add(new StyleProperty("opacity", "0.1"));
        block.add(new StyleProperty("box-shadow", "1px 1px 1px #eee"));
        System.out.println(block);
    }
}
