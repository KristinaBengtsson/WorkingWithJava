package Level3;

public class SwitchWithStrings {
    public static void main(String[] args){
        System.out.println("=== Switch with Strings ===");
        //Opgave 3.4 - String switch
        String command = "start";

        switch(command){
            case "start":
                System.out.println("Starting...");
                break;
            case "stop":
                System.out.println("Stopping...");
                break;
            case "pause":
                System.out.println("Pausing...");
                break;
            default:
                System.out.println("Action invalid");
        }
        //Opgave 3.5 - Case sensitivity

        //Opgave 3.7 - Month names
        String month = "Maj";
        switch(month){
            case "December":
            case "Januar":
            case "Februar":
                System.out.println("Vinter");
                break;
            case "Marts":
            case "April":
            case "Maj":
                System.out.println("Forår");
                break;
            case "Juni":
            case "Juli":
            case "August":
                System.out.println("Sommer");
                break;
            case "September":
            case "Oktober":
            case "November":
                System.out.println("Efterår");
                break;
            default:
                System.out.println("Ugyldig intastning");
        }

        //Opgave 3.8 - Calculator operation
        String operation = "add";
        int a = 10;
        int b = 5;
        int result;

        switch(operation){
            case "add":
                result = a + b;
                break;
            case "subtract":
                result = a-b;
                break;
            case "multiply":
                result = a*b;
                break;
            case "devide":
                result = a/b;
                break;
            default:
                result = 0;
                System.out.println("Unknown operation");
        }
        System.out.println("Result: " + result);
    }
}
