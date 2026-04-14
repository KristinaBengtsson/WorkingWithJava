package Level3;

public class ComplexSwitchLogic {
    public static void main(String[] args) {
            System.out.println("=== Complex Switch Logic ===");
            //Opgave 3.18 - Multi-value calculation
            int month = 5;
            String quarter;
            switch(month){
                case 1: case 2: case 3:
                    quarter = "Q1";
                    break;
                case 4: case 5: case 6:
                    quarter = "Q2";
                    break;
                case 7: case 8: case 9:
                    quarter = "Q3";
                    break;
                case 10: case 11: case 12:
                    quarter = "Q4";
                    break;
                default:
                    quarter = "Invalid";
            }
        System.out.println(quarter);

            //Opgave 3.19 - Grade points
        char grade = 'B';
        int points;
        switch(grade){
            case 'A':
                points = 12;
                break;
            case 'B':
                points = 10;
                break;
            case 'C':
                points = 7;
                break;
            case 'D':
                points = 4;
                break;
            case 'F':
                points = 0;
                break;
            default:
                points = 0;
                System.out.println("No grade found");
        }
        System.out.println("Du har fået " + points + " point");
    }
}
