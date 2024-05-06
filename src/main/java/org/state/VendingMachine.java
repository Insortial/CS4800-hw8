package org.state;

import java.util.HashMap;

public class VendingMachine {
    private HashMap<String, Snack> stockOfSnacks;
    private StateOfVendingMachine state;
    private String selectedSnack;
    private Snack dispensedSnack;


    public VendingMachine() {
        this.stockOfSnacks = new HashMap<>();
        this.state = new VendingIdle();
        this.selectedSnack = null;
        this.dispensedSnack = null;
    }

    public void addSnacks(Snack snack) {
        this.stockOfSnacks.put(snack.getName(), snack);
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public StateOfVendingMachine getState() {
        return state;
    }
    public void insertMoney(double money) {
        this.getState().insertMoney(this, money);
    }

    public HashMap<String, Snack> getStockOfSnacks() {
        return stockOfSnacks;
    }

    public String getSelectedSnack() {
        return selectedSnack;
    }

    public void selectSnack(String snackName) {
        this.getState().selectSnack(this, snackName);
    }
    public Snack getDispensedSnack() {
        return dispensedSnack;
    }

    public Snack dispenseSnack() {
        return this.getState().dispenseSnack(this);
    }

    public void setDispensedSnack(Snack dispensedSnack) {
        this.dispensedSnack = dispensedSnack;
    }

    public void setSelectedSnack(String selectedSnack) {
        this.selectedSnack = selectedSnack;
    }
}
