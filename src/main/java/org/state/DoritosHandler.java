package org.state;

import java.util.HashMap;

public class DoritosHandler extends SnackDispenseHandler{
    public DoritosHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleRequest(VendingMachine vending, double money, String snackName) {
        String chosenSnackName = "Doritos";
        HashMap<String, Snack> stockOfSnacks = vending.getStockOfSnacks();
        if(snackName == chosenSnackName && stockOfSnacks.get(chosenSnackName).getQuantity() > 0 && money >= stockOfSnacks.get(chosenSnackName).getPrice())
        {
            Snack snackSelected = stockOfSnacks.get(chosenSnackName);
            double snackPrice = snackSelected.getPrice();
            money -= snackPrice;
            System.out.println("Remaining Money: $" + money);
            snackSelected.setQuantity(snackSelected.getQuantity() - 1);
            System.out.println(chosenSnackName + " Quantity: " + snackSelected.getQuantity());
            vending.setDispensedSnack(new Snack(snackName, snackPrice, 1));
        } else {
            if(snackName == chosenSnackName && stockOfSnacks.get(snackName).getQuantity() == 0)
                System.out.println(chosenSnackName + " is out of Stock");
            else if (snackName == chosenSnackName && stockOfSnacks.get(chosenSnackName).getPrice() < money)
                System.out.println("You have insufficient funds");
            super.handleRequest(vending, money, snackName);
        }
    }
}
