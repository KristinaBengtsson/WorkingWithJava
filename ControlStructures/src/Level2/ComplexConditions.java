package Level2;

public class ComplexConditions {
    public static void main(String[] args){
        System.out.println("=== Complex Conditions ===");
        //Opgave 2.21 - Remperature comfort zone
        int temp = 22;
        int humidity = 45;
        if((temp >= 18 && temp <= 25) && (humidity >= 30 && humidity <= 60)){
            System.out.println("Comfortable");
        }else{
            System.out.println("Uncomfortable");
        }

        //Opgave 2.24 - Grade boundaries
        int score = 75;
        String grade;
        if(score >= 90){
            grade = "A";
        }else if(score >= 80 && score < 90){
            grade = "B";
        }else if(score >= 70 && score < 80){
            grade = "C";
        }else if(score >= 60 && score <70){
            grade = "D";
        }else{
            grade = "F";
        }
        System.out.println("Grade: " + grade);

        //Opgave 2.25 - Complex validation
        int length = 10;
        boolean hasUpper = true;
        boolean hasLower = true;
        boolean hasSpaces = false;
        if(length >= 8 && hasUpper && hasLower && !hasSpaces){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }

    }
}
