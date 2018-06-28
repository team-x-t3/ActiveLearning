package com.srini.learning.design.patterns.structural.bridge.example2.formatter;

import com.srini.learning.design.patterns.structural.bridge.example2.model.Detail;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<h1>" + header + "</h1>");
        builder.append("<hr>");
        builder.append("<ul>");
        for (Detail d : details) {
            builder.append("<li>");
            builder.append(d.getLabel());
            builder.append(" : ");
            builder.append(d.getValue());
            builder.append("</li>");

        }
        builder.append("</ul>");
        return builder.toString();
    }
}
