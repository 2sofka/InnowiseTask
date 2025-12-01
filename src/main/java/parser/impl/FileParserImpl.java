package parser.impl;

import entity.impl.CustomEntity;
import factory.impl.EntityFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import parser.FileParser;
import validation.Validator;
import validation.impl.CustomValidator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileParserImpl implements FileParser {
    private static final Logger LOGGER = LogManager.getLogger();
    private final String fileUrl = "data/output.txt";
    private static Validator validator = new CustomValidator();
    private EntityFactory entityFactory = new EntityFactory();

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

    @Override
    public void parseData(final List<String> stringList) {
        LOGGER.info("Starting data parsing from rows.");
        UUID id;
        int num;
        for (int i = 0; i < stringList.size(); i += 2) {
            LOGGER.debug("Parsing rows: '{}'." +
                            "\n'{}'.",
                    stringList.get(i), stringList.get(i + 1));
            if (validator.idValid(stringList.get(i)) ||
                    validator.numberValid(stringList.get(i + 1))) {
                id = UUID.fromString(stringList.get(i));
                num = Integer.getInteger(stringList.get(i + 1));
                entityFactory.create(
                        new CustomEntity().
                                setNumber(num).
                                setId(id));
                LOGGER.info("Data parsing completed.");
            } else {
                LOGGER.error("Data parsing error.");
            }
        }
    }

}
