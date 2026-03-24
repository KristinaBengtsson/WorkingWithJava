package Level1;

public class StringComparison {
    public static void main(String[] args) {
        System.out.println("=== String Comparison ===");
        //Opgave 1.17 - Password check
        String password = "secret123";
        if(password.equals("secret123")){
            System.out.println("Korrekt password");
        }else {
            System.out.println("Forkert password");
        }
        //Opgave 1.18 - Case sensitivity
        String word1 = "Hello";
        String word2 = "hello";
        if(word1.equals(word2)){
            System.out.println("Perfect match!");
        }else{
            System.out.println("Not a match, case matters!");
        }
        // Opgave 1.19 - Multiple password attempts
        String correctPassword = "secret123";
        String attempt1 = "Wrong";
        if(attempt1.equals(correctPassword)){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }
        String attempt2 = "Secret123";
        if(attempt2.equals(correctPassword)){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }
        String attempt3 = "secret123";
        if(attempt3.equals(correctPassword)){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }
        //Opgave 1.20 - Day of week
        String day = "Monday";
        if(day.equals("Saturday") || day.equals("Sunday")){
            System.out.println("Weekend");
        }else {
            System.out.println("Weekday");
        }
        //Opgave 1.21 - Command processor

    }
}
