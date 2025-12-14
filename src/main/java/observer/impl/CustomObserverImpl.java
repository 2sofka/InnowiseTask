package observer.impl;

import array.impl.CustomArrayImpl;
import observer.CustomObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomObserverImpl implements CustomObserver {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void customArrayChanged(CustomArrayImpl customArray) {

    }
}
