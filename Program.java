import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product bottleOfWater1 = new BottleOfWater("AquaMineral", "still water", 50, 1.5);
        Product bottleOfWater2 = new BottleOfWater("Архыз", "still water", 50, 1.25);
        Product bottleOfWater3 = new BottleOfWater("Архыз", "sparkling water", 50, 1.25);
        Product bottleOfWater4 = new BottleOfWater("AquaMineral", "sparkling water", 40, 1.5);
        Product bottleOfWater5 = new BottleOfWater("BonAqua", "still water", 30, 0.5);
        Product bottleOfWater6 = new BottleOfWater("BonAqua", "sparkling water", 30, 0.5);
        Product bottleOfMilk1 = new BottleOfMilk("Простоквашино", "Деревенское", 110, 1, 3.2);
        Product bottleOfMilk2 = new BottleOfMilk("Домашкино", "Топленое", 110, 1, 3.2);
        Product chips1 = new Chips("Chitos", "CornSticks", 120, "Chili", 70);
        Product chips2 = new Chips("Lays", "Maxxx", 120, "SourCream", 50);
        Product chips3 = new Chips("Lays", "Stax ", 200, "Crab", 100);
        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);
        products.add(bottleOfWater5);
        products.add(bottleOfWater6);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(chips1);
        products.add(chips2);
        products.add(chips3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater(0.5);
        if (bottleOfWaterRes != null) {
            System.out.println("You bought:");
            System.out.println(bottleOfWaterRes.displayInfo());

        } else {
            System.out.println("No such volume.");
        }

        Chips chipsRes = vendingMachine.getChips("Chili");
        if (chipsRes != null) {
            System.out.println("You bought: ");
            System.out.println(chipsRes.displayInfo());
        }

    }
}
