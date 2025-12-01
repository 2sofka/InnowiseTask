package entityArray.impl;

import entity.Entity;
import entity.impl.CustomEntity;
import entityArray.Storage;

import java.util.ArrayList;
import java.util.UUID;

public class EntityStorage implements Storage {

    private UUID id = UUID.fromString("00000000-0000-0000-0000-000000000000");
    private ArrayList<CustomEntity> customEntityArrayList = new ArrayList<>();
    private static EntityStorage instance;

    public static EntityStorage getInstance() {
        if (instance == null) {
            instance = new EntityStorage();
        }
        return instance;
    }

    @Override
    public boolean add(CustomEntity entity) {
        return  customEntityArrayList.add(entity);
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public ArrayList<CustomEntity> getAll() {
        return customEntityArrayList;
    }

    @Override
    public Entity get(UUID entityId) {
        for (Entity entity : customEntityArrayList) {
            if (entity.getId() == entityId)
                return entity;
        }
        return null;
    }

    @Override
    public boolean update(CustomEntity entity) {
        get(entity.getId())
                .setNumber(entity.getNumber());
        return true;
    }

    @Override
    public boolean delete(CustomEntity entity) {
        return customEntityArrayList.
                removeIf(
                        x -> x.equals(entity)
                );
    }

    @Override
    public boolean delete(UUID entityId) {
        return customEntityArrayList.
                removeIf(
                        x -> x.getId()
                                .equals(entityId)
                );
    }

}
