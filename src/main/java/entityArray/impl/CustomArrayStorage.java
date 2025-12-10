package entityArray.impl;

import entity.impl.CustomArray;
import entityArray.CustomStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CustomArrayStorage implements CustomStorage {

    private List<CustomArray> customArrayList = new ArrayList<>();
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
    public boolean add(CustomArray entity) {
        return customArrayList.add(entity);
    }


    @Override
    public List<CustomArray> getAll() {
        return customArrayList;
    }

    @Override
    public CustomArray get(UUID entityId) {
        for (CustomArray entity : customArrayList) {
            if (entity.getId() == entityId) return entity;
        }
        return null;
    }

    @Override
    public boolean update(CustomArray entity) {
        if ((entity != null) && customArrayList.contains(get(entity.getId()))) {
            delete(entity.getId());
            customArrayList.add(entity);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(CustomArray entity) {
        return customArrayList.removeIf(x -> x.equals(entity));
    }

    @Override
    public boolean delete(UUID entityId) {
        return customArrayList.removeIf(x -> x.getId().equals(entityId));
    }

    public static class Builder {

        private List<CustomArray> customArrayList = new ArrayList<>();

        public CustomArrayStorage.Builder setCustomArrayList(List<CustomArray> customArrayList) {
            this.customArrayList = customArrayList;
            return this;
        }

        public CustomArrayStorage build() {
            return new CustomArrayStorage(this);
        }

    }

}
