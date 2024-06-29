package com.company.structural.adapter;

/**
 * Created by felipemurcia on 2/8/19.
 */
public class GoldCreditCard implements Secure{
    @Override
    public void payWithSecureLevelA() {
        //no implementar
    }

    @Override
    public void payWithSecureLevelZ() {
        System.out.println("Tarjeta Gold: Pagando con Seguridad BAJA nivel Z");
    }
}
