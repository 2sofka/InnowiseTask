package entity.impl;

import entity.Entity;

import java.util.UUID;

public class CustomEntity implements Entity {

    private UUID id = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private int number = 0;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public CustomEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public CustomEntity setNumber(int number) {
        this.number = number;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
