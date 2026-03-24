package Level1;

public class IfStatements {
    public static void main(String[] args){
        System.out.println("=== Simple if statements ===");
        //Opgave 1.1 - Din første if statement
// Skriv kode der opretter variabel age = 20.
// Brug et if-statement til at printe "Du er myndig" hvis age >= 18.
        int age = 20;
        if(age >= 18) {
            System.out.println("Du er myndig");
        }
        //Opgave 1.2 - Temperature check
        //Opgave: Skriv kode der opretter variabel temperature = 30.
        // Brug et if-statement til at printe "Det er varmt" hvis temperature > 25.
        int temperature = 30;
        if(temperature > 25){
            System.out.println("Det er varmt");
        }
        //Opgave 1.3 - Score check
        //Opgave: Skriv kode der opretter variabel score = 85.
        // Brug et if-statement til at printe "Bestået" hvis score >= 60.
        int score = 85;
        if(score >= 60){
            System.out.println("Bestået");
        }



    }
}
