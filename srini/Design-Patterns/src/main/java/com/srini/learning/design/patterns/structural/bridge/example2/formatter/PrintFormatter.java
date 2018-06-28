package com.srini.learning.design.patterns.structural.bridge.example2.formatter;

import com.srini.learning.design.patterns.structural.bridge.example2.model.Detail;

import java.util.List;

public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");
        for (Detail d : details) {
            builder.append(d.getLabel());
            builder.append(" : ");
            builder.append(d.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
