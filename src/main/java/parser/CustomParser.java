package parser;

import entity.impl.CustomArrayImpl;

import java.util.List;

public interface CustomParser {
    List<CustomArrayImpl> parse(String[] rows);
}
