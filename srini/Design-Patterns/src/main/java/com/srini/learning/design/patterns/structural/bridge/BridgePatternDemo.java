package com.srini.learning.design.patterns.structural.bridge;

import com.srini.learning.design.patterns.structural.bridge.example.color.Blue;
import com.srini.learning.design.patterns.structural.bridge.example.color.Color;
import com.srini.learning.design.patterns.structural.bridge.example.color.Red;
import com.srini.learning.design.patterns.structural.bridge.example.shape.Circle;
import com.srini.learning.design.patterns.structural.bridge.example.shape.Shape;
import com.srini.learning.design.patterns.structural.bridge.example.shape.Square;
import com.srini.learning.design.patterns.structural.bridge.example2.formatter.Formatter;
import com.srini.learning.design.patterns.structural.bridge.example2.formatter.HtmlFormatter;
import com.srini.learning.design.patterns.structural.bridge.example2.formatter.PrintFormatter;
import com.srini.learning.design.patterns.structural.bridge.example2.model.Movie;
import com.srini.learning.design.patterns.structural.bridge.example2.printer.MoviePrinter;
import com.srini.learning.design.patterns.structural.bridge.example2.printer.Printer;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();
        Shape square = new Square(red);
        Shape circle = new Circle(blue);
        square.applyColor();
        circle.applyColor();
        System.out.println("// Print and formatter bridge//");
// Print and formatter bridge
        Movie movie = new Movie("Sci-Fi", "2hrs", "InterSteller", "2017");
        Formatter printFormat = new PrintFormatter();
        Formatter htmlFormat = new HtmlFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        System.out.println(moviePrinter.print(printFormat));
        System.out.println(moviePrinter.print(htmlFormat));


    }
}
