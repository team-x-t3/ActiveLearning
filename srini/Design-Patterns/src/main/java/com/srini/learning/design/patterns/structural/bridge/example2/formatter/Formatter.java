package com.srini.learning.design.patterns.structural.bridge.example2.formatter;

import com.srini.learning.design.patterns.structural.bridge.example2.model.Detail;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);

}
