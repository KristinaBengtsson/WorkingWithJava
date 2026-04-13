package Level2;

public class NotOperator {
    public static void main(String[] args){
        System.out.println("=== NOT Operator (!) ===");
        //Opgave 2.11 - Simple NOT
        boolean isActive = false;
        if(!isActive){
            System.out.println("Inactive");
        }else{
            System.out.println("Active");
        }
        //Opgave 2.12 - Double negative
        boolean isNotActive = false;
        if(!isNotActive){
            System.out.println("Is Ready");
        }
        //Opgave 2.13 - Access denied
        boolean hasPermission = false;
        if(!hasPermission){
            System.out.println("Access denied");
        }else if(hasPermission){
            System.out.println("Access granted");
        }
        //Opgave 2.14 - NOT with AND
        int age = 20;
        boolean hasID = false;
        if(age>=18 && !hasID){
            System.out.println("Entry denied - need ID");
        }
        //Opgave 2.15 - System status
        boolean isRunning = true;
        boolean hasErrors = false;
        if(isRunning && !hasErrors){
            System.out.println("System OK");
        }else {
            System.out.println("System issue");
        }
    }
}
