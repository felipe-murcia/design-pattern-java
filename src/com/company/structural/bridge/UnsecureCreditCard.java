package com.company.structural.bridge;

/**
 * Created by felipemurcia on 2/8/19.
 */
public class UnsecureCreditCard implements ICreditCard {

    @Override
    public void realizarPago() {
        System.out.println("Pago realizado SIN SEGURIDAD");
    }
}
