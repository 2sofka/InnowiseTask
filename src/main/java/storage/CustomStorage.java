package storage;

import array.impl.CustomArrayImpl;

import java.util.List;
import java.util.UUID;

public interface CustomStorage {

    boolean add(CustomArrayImpl entity);

    List<CustomArrayImpl> getAll();

    CustomArrayImpl get(UUID entityId);

    boolean update(CustomArrayImpl entity);

    boolean delete(CustomArrayImpl entity);

    boolean delete(UUID entityId);
}
