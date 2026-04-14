package Level3;

public class BasisSwitchStatements {
    public static void main(String[] args){
        System.out.println("=== Basic Switch Statements ===");
        //Opgave 3.1 - Din første switch statement
        //Opgave 3.2 - Complete week
        //Opgave 3.3 - Default case
        int day = 10;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thuesday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }
        //Ekstra: Grouping Cases (Intentional fall-through)
        int fallThrough = 6;
        switch(fallThrough){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }




    }
}
