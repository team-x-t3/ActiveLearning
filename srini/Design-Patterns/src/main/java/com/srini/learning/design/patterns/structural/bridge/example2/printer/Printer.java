package com.srini.learning.design.patterns.structural.bridge.example2.printer;

import com.srini.learning.design.patterns.structural.bridge.example2.formatter.Formatter;
import com.srini.learning.design.patterns.structural.bridge.example2.model.Detail;

import java.util.List;

public abstract class Printer {
    public String print(Formatter formatter) {
        return formatter.format(this.getHeader(), this.getDetails());
    }

    protected abstract String getHeader();

    protected abstract List<Detail> getDetails();
}
