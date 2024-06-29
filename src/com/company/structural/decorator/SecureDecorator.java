package com.company.structural.decorator;

/**
 * Created by felipemurcia on 3/8/19.
 */
public class SecureDecorator extends CreditDecorator {


    public SecureDecorator(Credit decoratedCredit) {
        super(decoratedCredit);
    }

    @Override
    public void showCredit() {
        decoratedCredit.showCredit();
        configSecure();
    }

    private void configSecure(){
        System.out.println("La tarjeta ha sido configurada con Seguridad Máxima");
    }
}
