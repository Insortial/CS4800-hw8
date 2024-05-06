package org.state;

public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;
    public SnackDispenseHandler(SnackDispenseHandler next) {
        this.next = next;
    }
    public void handleRequest(VendingMachine vending, double money, String snackName) {
        if(next != null) {
            next.handleRequest(vending, money, snackName);
        }
    }
}
