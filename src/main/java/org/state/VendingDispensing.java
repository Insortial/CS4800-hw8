package org.state;

public class VendingDispensing implements StateOfVendingMachine{
    @Override
    public void selectSnack(VendingMachine vending, String snackName) {

    }

    @Override
    public Snack dispenseSnack(VendingMachine vending) {
        Snack returnedSnack = null;
        if(vending.getDispensedSnack() != null)
        {
            returnedSnack = vending.getDispensedSnack();
            vending.setDispensedSnack(null);
            System.out.println("Dispensing a " + returnedSnack.getName());
        } else {
            System.out.println("Item not dispensed");
        }
        vending.setState(new VendingIdle());
        return returnedSnack;
    }

    @Override
    public void insertMoney(VendingMachine vending, double money) {

    }
}
