package entityArray.impl;

import entity.impl.CustomArrayImpl;
import entityArray.CustomStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomArrayStorage implements CustomStorage {

    private List<CustomArrayImpl> customArrayList = new ArrayList<>();
    private static CustomArrayStorage instance;

    public static CustomArrayStorage getInstance() {
        if (instance == null) {
            instance = new CustomArrayStorage.Builder().build();
        }
        return instance;
    }

    private CustomArrayStorage(Builder builder) {
        this.customArrayList = builder.customArrayList;
    }

    @Override
    public boolean add(CustomArrayImpl entity) {
        return customArrayList.add(entity);
    }


    @Override
    public List<CustomArrayImpl> getAll() {
        return customArrayList;
    }

    @Override
    public CustomArrayImpl get(UUID entityId) {
        for (CustomArrayImpl entity : customArrayList) {
            if (entity.getId() == entityId) return entity;
        }
        return null;
    }

    @Override
    public boolean update(CustomArrayImpl entity) {
        if ((entity != null) && customArrayList.contains(get(entity.getId()))) {
            delete(entity.getId());
            customArrayList.add(entity);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(CustomArrayImpl entity) {
        return customArrayList.removeIf(x -> x.equals(entity));
    }

    @Override
    public boolean delete(UUID entityId) {
        return customArrayList.removeIf(x -> x.getId().equals(entityId));
    }

    public static class Builder {

        private List<CustomArrayImpl> customArrayList = new ArrayList<>();

        public CustomArrayStorage.Builder setCustomArrayList(List<CustomArrayImpl> customArrayList) {
            this.customArrayList = customArrayList;
            return this;
        }

        public CustomArrayStorage build() {
            return new CustomArrayStorage(this);
        }

    }

}
