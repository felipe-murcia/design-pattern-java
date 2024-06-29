package com.company.structural.adapter;

/**
 * Created by felipemurcia on 2/8/19.
 */
public class BlackCreditCard implements Secure {

    @Override
    public void payWithSecureLevelA() {
        System.out.println("Tarjeta Black: Pagando con Seguridad ALTA nivel A");
    }

    @Override
    public void payWithSecureLevelZ() {
        //no implementar
    }
}
