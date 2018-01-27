package jflexcup;

import jflexcup.generated.ExampleLexer;
import jflexcup.generated.ExampleParser;

import java.io.File;
import java.io.FileReader;

public class Main {
    private static void validateArgs(String[] args) {
        if (args.length == 0) {
            printUsage(0);
        }
        if (args.length != 1) {
            printUsage(1);
        }
    }

    private static void printUsage(int exitCode) {
        System.out.println("Usage: java -jar jflex-cup-examples-all.jar <test file>");
        System.exit(exitCode);
    }

    public static void main(String[] args) throws Exception {
        validateArgs(args);
        ExampleParser parser = new ExampleParser(new ExampleLexer(new FileReader(new File(args[0]))));
        Object result = parser.parse().value;
    }
}
