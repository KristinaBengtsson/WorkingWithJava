package Level1;

public class ifElseChains {
    public static void main(String[] args) {
        System.out.println("=== if-else if-else Chains ===");
        //Opgave 1.11 - Letter grades
        int score = 85;
        if(score >= 90){
            System.out.println("A");
        }else if(score >= 80){
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("C");
        }else if(score >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        //Opgave 1.12 - Flere karakterer
        int score1 = 110;
        if(score1 >= 90){
            System.out.println("A");
        }else if(score1 >= 80){
            System.out.println("B");
        }else if(score1 >= 70){
            System.out.println("C");
        }else if(score1 >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        int score2 = 65;
        if(score2 >= 90){
            System.out.println("A");
        }else if(score2 >= 80){
            System.out.println("B");
        }else if(score2 >= 70){
            System.out.println("C");
        }else if(score2 >= 60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        //Opgave 1.13 - Age categories
        int age = 70;
        if(age < 13){
            System.out.println("Child");
        }else if(age < 18){
            System.out.println("Teen");
        }else if(age < 65){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
        //Opgave 1.14 - Temperature ranges

        //Opgave 1.15 - Ticket Pricing
        int ageTicket = 25;
        double price = 0;
        String category;
        if(ageTicket < 12){
            price += 50;
            category = "Child";
        }else if(ageTicket < 18){
            price += 75;
            category = "Teen";
        }else if(ageTicket < 65){
            price += 100;
            category = "Adult";
        }else{
            price += 60;
            category = "Senior";
        }
        System.out.println("You are an " + category + ". Your price is " + price + "kr.");



    }
}
