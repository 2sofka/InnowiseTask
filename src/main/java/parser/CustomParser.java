package parser;

import array.impl.CustomArrayImpl;

import java.util.List;

public interface CustomParser {
    List<CustomArrayImpl> parse(List<String> rows);
}
