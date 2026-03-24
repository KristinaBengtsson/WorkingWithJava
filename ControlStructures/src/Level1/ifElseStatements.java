package Level1;

public class ifElseStatements {
    public static void main(String[] args) {
        System.out.println("=== if-else statements ===");
        //Opgave 1.4 - Pass or fail
        //Opgave: Skriv kode der opretter variabel score = 55.
        // Brug et if-else statement til at printe "PASS" hvis score >= 60, ellers "FAIL".
        int score = 55;
        if(score >= 60){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //Opgave 1.5 - Adult or minor
        //Opgave: Skriv kode der opretter variabel age = 16.
        // Brug et if-else statement til at printe "Adult" hvis age >= 18, ellers "Minor"
        int age = 16;
        if(age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Minor");
        }

        //Opgave 1.6 - Positive or negative
        //Opgave: Skriv kode der opretter variabel number = -5.
        // Brug et if-else statement til at printe "Positive" hvis number > 0, ellers "Not positive"
        int number = -5;
        if(number > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Not positive");
        }

        //Opgave 1.7 - Even or odd
        //Opgave: Skriv kode der opretter variabel number = 7.
        // Brug et if-else statement til at printe "Even" hvis number % 2 == 0, ellers "Odd"
        int ifnumber = 7;
        if(ifnumber %2 == 0){ //Tjek om tal er lige: (tal % 2 == 0)
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        //Opgave 1.8 - Price discount
        //Opgave: Skriv kode der opretter variabel price = 600.0.
        // Brug et if-else statement til at printe "Discount available" hvis price > 500, ellers "No discount
        double price = 600.0;
        if(price > 500.0){
            System.out.println("Discount available");
        }else{
            System.out.println("No discount");
        }

        //Opgave 1.9 - Stock availability
        //Opgave: Skriv kode der opretter variabel stock = 0.
        // Brug et if-else statement til at printe "Available" hvis stock > 0, ellers "Out of stock"
        int stock = 2;
        if(stock > 0){
            System.out.println("Available");
        }else{
            System.out.println("Out of stock");
        }

        //Opgave 1.10 - Speed Limit
        //Opgave: Skriv kode der opretter variabel speed = 135.
        // Brug et if-else statement til at printe "Speeding!" hvis speed > 130, ellers "Within limit"
        int speed = 135;
        if(speed > 130){
            System.out.println("Speeding!");
        }else{
            System.out.println("Within limit");
        }
    }
}
