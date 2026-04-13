package Level2;

public class OrOperator {
    public static void main(String[] args) {
        System.out.println("=== OR Operator (||) ===");
        //Opgave 2.6 - Simple OR
        int age = 10;
        if(age < 12 || age >= 65){
            System.out.println("Discount");
        }else{
            System.out.println("Full price");
        }
        //Opgave 2.7 - Weekend check
        String day = "Saturday";
        if(day == "Saturday" || day == "Sunday" ){
            System.out.println("Weekend");
        }else {
            System.out.println("Weekday");
        }
        //Opgave 2.8 - Emergency contact
        int temperature = 40;
        if(temperature > 39 || temperature < 35){
            System.out.println("Call emergency");
        }else {
            System.out.println("Normal temperature");
        }

        //Opgave 2.9 - Multiple valid inputs
        String command = "start";
        if(command == "start" || command == "run" || command == "begin"){
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }

        //Opgave 2.10 - Pass with retake
        int score = 50;
        boolean hasRetake = true;
        if(score >= 60 || score >= 50 && hasRetake == true){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
