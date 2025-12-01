package entity;

import java.util.UUID;

public interface Entity {
    UUID getId();
    Entity setId(UUID id);
    int getNumber();
    Entity setNumber(int number);
}
