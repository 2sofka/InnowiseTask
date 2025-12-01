package factory;

import entity.impl.CustomEntity;

public interface Factory {
    boolean create();

    boolean create(CustomEntity entity);
}
