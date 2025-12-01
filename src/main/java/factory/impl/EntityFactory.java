package factory.impl;

import entity.impl.CustomEntity;
import entityArray.impl.EntityStorage;
import factory.Factory;

import java.util.UUID;

public class EntityFactory implements Factory {

    private static EntityStorage entityStorage = EntityStorage.getInstance();

    @Override
    public boolean create() {
        CustomEntity entity = new CustomEntity();
        entity.setId(UUID.randomUUID());
        entity.setNumber(0);
        entityStorage.add(entity);
        return true;
    }

    @Override
    public boolean create(CustomEntity entity) {
        entityStorage.add(entity);
        return true;
    }

}
