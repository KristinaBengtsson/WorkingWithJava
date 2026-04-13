package Level2;

public class CombiningOperators {
    public static void main(String[] args){
        System.out.println("=== Combining Operators ===");
        //Opgave 2.16 - AND + OR together
        int score = 85;
        boolean hasAttendance = true;
        if(score >= 90 || score >= 80 && hasAttendance){
            System.out.println("Bonus awarded");
        }else{
            System.out.println("No bonus");
        }
        //Opgave 2.17 - Complex eligibility

        //Opgave 2.20 - Priority access
        boolean isVIP = false;
        boolean isMember = true;
        int points = 1200;
        boolean suspended = false;
        if(isVIP || (isMember && points > 1000) && !suspended){
            System.out.println("Priority access");
        }else{
            System.out.println("Standard access");
        }
    }
}
