package parser;


import java.util.List;

public interface FileParser {
    List<String> parseRow();

    void parseData(final List<String> stringList);
}
