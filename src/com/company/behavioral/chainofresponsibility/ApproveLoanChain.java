package com.company.behavioral.chainofresponsibility;

/**
 * Created by felipemurcia on 30/7/19.
 */
public interface ApproveLoanChain {
    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void crediCardRequest(int totalLoan);
}
