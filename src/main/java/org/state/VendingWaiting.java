package org.state;

public class VendingWaiting implements StateOfVendingMachine {
    @Override
    public void selectSnack(VendingMachine vending, String snackName) {

    }

    @Override
    public Snack dispenseSnack(VendingMachine vending) {
        return null;
    }

    @Override
    public void insertMoney(VendingMachine vending, double money) {
        System.out.println("Inserted $" + money + " dollars");
        SnackDispenseHandler chain = new CokeHandler(new PepsiHandler(new CheetosHandler(new DoritosHandler(new KitKatHandler(new SnickersHandler(null))))));
        chain.handleRequest(vending, money, vending.getSelectedSnack());
        vending.setState(new VendingDispensing());
    }
}
