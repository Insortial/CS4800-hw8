package org.state;

public class VendingIdle implements StateOfVendingMachine {
    @Override
    public void selectSnack(VendingMachine vending, String snackName) {
        if(vending.getStockOfSnacks().containsKey(snackName)) {
            System.out.println("\nSelected Snack is: " + snackName);
            vending.setSelectedSnack(snackName);
            vending.setState(new VendingWaiting());
        } else {
            System.out.println("Snack does not exist");
        }
    }

    @Override
    public Snack dispenseSnack(VendingMachine vending) {
        return null;
    }

    @Override
    public void insertMoney(VendingMachine vending, double money) {

    }
}
