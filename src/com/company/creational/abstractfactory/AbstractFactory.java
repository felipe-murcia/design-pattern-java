package com.company.creational.abstractfactory;

/**
 * Created by felipemurcia on 18/7/19.
 */
public interface AbstractFactory<T> {
    T create(String type);
}
