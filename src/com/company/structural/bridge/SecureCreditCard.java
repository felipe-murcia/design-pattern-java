package com.company.structural.bridge;

/**
 * Created by felipemurcia on 2/8/19.
 */
public class SecureCreditCard  implements ICreditCard{
    @Override
    public void realizarPago() {
        System.out.println("Pago realizado CON SEGURIDAD");
    }
}
