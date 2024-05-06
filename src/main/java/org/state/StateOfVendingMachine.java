package org.state;

public interface StateOfVendingMachine {
    void selectSnack(VendingMachine vending, String snackName);
    Snack dispenseSnack(VendingMachine vending);
    void insertMoney(VendingMachine vending, double money);
}
