package Level2;

public class AndOperator {
    public static void main(String[] args) {
        System.out.println("=== AND Operator (&&) ===");
        //Opgave 2.1 - Simple AND
        int age = 25;
        boolean hasLicense = true;
        if(age >= 18 && hasLicense == true){
            System.out.println("Can drive");
        }else {
            System.out.println("Cannot drive");
        }
        //Opgave 2.2 - AND with false condition
        int age2 = 25;
        boolean hasLicense2 = false;
        if(age2 >= 18 && hasLicense2 == true){
            System.out.println("can drive");
        }else {
            System.out.println("Cannot drive");
        }
        //Opgave 2.3 - Multiple AND conditions
        int number = 15;
        if(number >= 10 && number <=20){
            System.out.println("Number is between 10 and 20");
        }else {
            System.out.println("Number is not between 10 and 20");
        }
        //Opgave 2.4 - Three conditions with AND
        int age3 = 22;
        boolean hasTicket = true;
        boolean isBanned = false;
        if(age3 >= 18 && hasTicket == true && isBanned == false){
            System.out.println("Welcome");
        }else {
            System.out.println("Is banned");
        }
        //Opgave 2.5 - Working hours check
        int hour = 14;
        if(hour >= 9 && hour <= 17){
            System.out.println("Working hours");
        }else{
            System.out.println("Outside working hours");
        }
    }
}
