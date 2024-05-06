package org.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine vending = new VendingMachine();
        vending.addSnacks(new Snack("KitKat", 0.90, 5));
        vending.addSnacks(new Snack("Coke", 1.00, 3));
        vending.addSnacks(new Snack("Cheetos", 1.99, 2));
        vending.addSnacks(new Snack("Doritos", 1.80, 6));
        vending.addSnacks(new Snack("Pepsi", 1.50, 5));
        vending.addSnacks(new Snack("Snickers", 1.25, 2));

        vending.selectSnack("Snickers");
        vending.insertMoney(3.50);
        vending.dispenseSnack();

        vending.selectSnack("KitKat");
        vending.insertMoney(3.50);
        vending.dispenseSnack();

        vending.selectSnack("KitKat");
        vending.insertMoney(0.50);
        vending.dispenseSnack();

        vending.selectSnack("Snickers");
        vending.insertMoney(3.50);
        vending.dispenseSnack();

        vending.selectSnack("Coke");
        vending.insertMoney(3.50);
        vending.dispenseSnack();

        vending.selectSnack("Coke");
        vending.insertMoney(3.50);
        vending.dispenseSnack();

        vending.selectSnack("Snickers");
        vending.insertMoney(3.50);
        vending.dispenseSnack();

    }
}