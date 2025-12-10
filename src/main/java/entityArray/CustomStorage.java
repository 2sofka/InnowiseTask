package entityArray;

import entity.impl.CustomArray;

import java.util.List;
import java.util.UUID;

public interface CustomStorage {

    boolean add(CustomArray entity);

    List<CustomArray> getAll();

    CustomArray get(UUID entityId);

    boolean update(CustomArray entity);

    boolean delete(CustomArray entity);

    boolean delete(UUID entityId);
}
