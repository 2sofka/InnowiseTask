package entityArray;

import entity.Entity;
import entity.impl.CustomEntity;

import java.util.ArrayList;
import java.util.UUID;

public interface Storage {

    boolean add(CustomEntity entity);

    void setId(UUID id);

    UUID getId();

    ArrayList<CustomEntity> getAll();

    Entity get(UUID entityId);

    boolean update(CustomEntity entity);

    boolean delete(CustomEntity entity);

    boolean delete(UUID entityId);
}
