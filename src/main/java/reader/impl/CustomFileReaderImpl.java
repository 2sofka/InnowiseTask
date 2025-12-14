package reader.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reader.CustomFileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CustomFileReaderImpl implements CustomFileReader {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String fileUrl = "src/main/output.txt";

    @Override
    public List<String> parseRow() {
        LOGGER.info("Starting to read file: {}", fileUrl);

        Path path = Paths.get(fileUrl);
        List<String> rowList = List.of();

        try {
            rowList = Files.readAllLines(path);
            LOGGER.info("File reading completed.");
        } catch (final IOException e) {
            LOGGER.error("Can't read file error.");
        }

        return rowList;
    }

}
