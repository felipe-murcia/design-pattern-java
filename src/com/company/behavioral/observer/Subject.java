package com.company.behavioral.observer;

/**
 * Created by felipemurcia on 31/7/19.
 */
public interface Subject {
    void attach(Observer o);
    void dettach(Observer o);
    void notifyUpdate(Semaforo semaforo);
}
