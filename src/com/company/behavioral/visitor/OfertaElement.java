package com.company.behavioral.visitor;

/**
 * Created by felipemurcia on 2/8/19.
 */
public interface OfertaElement {
    void accept(CreditCardVisitor visitor);
}
