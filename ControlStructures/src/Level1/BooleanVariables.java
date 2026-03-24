package Level1;

public class BooleanVariables {
    public static void main(String[] args) {
        System.out.println("=== Boolean Variables ===");
        //Opgave 1.22 - Boolean flag
        boolean isActive = true;
        if(isActive){
            System.out.println("System ON");
        }else {
            System.out.println("System OFF");
        }
        //Opgave 1.23 - Combining conditions
        boolean hasLicense = true;
        int age = 20;
        if(hasLicense && age >= 18){
            System.out.println("Can drive");
        }else{
            System.out.println("Cannot drive");
        }
        //Opgave 1.24 - Setting boolean based on condition
        int score = 75;
        boolean passed;
        if(score >= 60){
            passed = true;
        }else{
            passed = false;
        }
        System.out.println("Passed: " + passed);
    }
}
