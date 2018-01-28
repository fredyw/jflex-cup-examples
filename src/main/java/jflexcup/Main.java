package jflexcup;

import java_cup.parser;
import jflexcup.generated.ExampleLexer;
import jflexcup.generated.ExampleParser;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

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

    static Object parse(Reader reader) throws Exception {
        ExampleParser parser = new ExampleParser(new ExampleLexer(reader));
        return parser.parse().value;
    }

    public static void main(String[] args) throws Exception {
        validateArgs(args);
        Object result = parse(new FileReader(args[0]));
        System.out.println("Value: " + result);
    }
}
