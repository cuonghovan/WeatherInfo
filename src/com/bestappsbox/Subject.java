package com.bestappsbox;

import java.util.Objects;

/**
 * Created by cuonghv on 10/18/15.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
