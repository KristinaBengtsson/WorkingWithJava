package Level1;

public class DataTypes {
    public static void main(String[] args){
        //Opgave 1 - Shopping cart
        System.out.println("==== Opgave 1 - Shopping cart ===");
        double eggs = 25.50;
        double milk = 15.00;
        double chokolate = 30.00;
        double total = eggs + milk + chokolate;
        double moms = 1.25; // 25% moms
        double totalWithMoms = total * moms;
        System.out.println(total);
        System.out.println(totalWithMoms);

        //Opgave 2 - Split restaurant bill
        System.out.println("==== Opgave 2 - Split restaurant bill ===");
        double food = 450.0;
        double drinks = 120.0;
        double tips = 50.0;
        int numberOfGuests = 4;
        double total2 = food + drinks + tips;
        double totalPrGuest = total2 / numberOfGuests;
        System.out.println(totalPrGuest);

        //Opgave 3 - Discount calculation
        System.out.println("==== Opgave 3 - Discount calculation ===");
        double startPrice = 300.0;
        double discountProcent = 0.20; //20% rabat
        double priceWithDiscount = startPrice - (startPrice * discountProcent);
        System.out.println(priceWithDiscount);

        // Opgave 4 - Operators & Expressions
        System.out.println("==== Opgave 4 - Operators & Expressions ===");
    }
}
