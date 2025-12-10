package validation.impl;

import validation.CustomValidator;

public class CustomValidatorImpl implements CustomValidator {

    private static final String UUID_REGEX = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";
    private static final String NUMBER_REGEX = "-?\\d+";

    @Override
    public boolean numbersValid(String numbers) {
        if (numbers != null) {
            String[] number_set = numbers.split(" ");
            for (String sub : number_set) {
                if (!sub.matches(NUMBER_REGEX)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean idValid(String id) {
        return id.matches(UUID_REGEX);
    }
}
