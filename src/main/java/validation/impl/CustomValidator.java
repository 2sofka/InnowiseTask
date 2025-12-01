package validation.impl;

import validation.Validator;

public class CustomValidator implements Validator {

    @Override
    public boolean numberValid(String number) {
        return number != null && number.matches("-?\\d+");
    }

    @Override
    public boolean idValid(String id) {
        return id.matches("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
    }
}
