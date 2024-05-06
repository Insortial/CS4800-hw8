import org.state.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class VendingTest {
    @Test
    public void switchWaitingStateTest() {
        VendingMachine vending = new VendingMachine();
        vending.addSnacks(new Snack("KitKat", 0.90, 5));
        vending.addSnacks(new Snack("Coke", 1.00, 3));
        vending.addSnacks(new Snack("Cheetos", 1.99, 2));
        vending.addSnacks(new Snack("Doritos", 1.80, 6));
        vending.addSnacks(new Snack("Pepsi", 1.50, 5));
        vending.addSnacks(new Snack("Snickers", 1.25, 2));

        vending.selectSnack("Doritos");
        Assertions.assertTrue(vending.getState() instanceof VendingWaiting);
        vending.insertMoney(1.99);
        Assertions.assertTrue(vending.getState() instanceof VendingDispensing);
        vending.dispenseSnack();
        Assertions.assertTrue(vending.getState() instanceof VendingIdle);
    }

    @Test
    public void dispenseSnackTest() {
        VendingMachine vending = new VendingMachine();
        vending.addSnacks(new Snack("KitKat", 0.90, 5));
        vending.addSnacks(new Snack("Coke", 1.00, 3));
        vending.addSnacks(new Snack("Cheetos", 1.99, 2));
        vending.addSnacks(new Snack("Doritos", 1.80, 6));
        vending.addSnacks(new Snack("Pepsi", 1.50, 5));
        vending.addSnacks(new Snack("Snickers", 1.25, 2));

        vending.selectSnack("Snickers");
        vending.insertMoney(3.50);
        Assertions.assertEquals(vending.dispenseSnack().getName(), "Snickers");

        vending.selectSnack("KitKat");
        vending.insertMoney(3.50);
        Assertions.assertEquals(vending.dispenseSnack().getName(), "KitKat");

        vending.selectSnack("Pepsi");
        vending.insertMoney(3.50);
        Assertions.assertEquals(vending.dispenseSnack().getName(), "Pepsi");
    }
}
