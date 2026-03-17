package Level4;

public class WorkingWithArrays {
    public static void main(String[] args){
        System.out.println("====  Working with Arrays ===");
        //Opgave 4.26 - Shopping Cart
        //Du har en shopping cart med 3 items.
        //Opgave: Erklær arrays og beregn total pris.
        String[] items = {"Milk", "Bread", "Eggs"};
        double[] prices = {12.50, 15.00, 25.00};

        double total = prices[0] + prices[1] + prices[2];
        System.out.println("Items: " + items.length);
        System.out.println("Total: " + total);

        //Opgave 4.27 - Student grades
        //En student har 4 eksamenskarakterer: 85, 92, 78, 88.
        //Opgave: Erklær array, beregn sum og gennemsnit
        int[] examGrades = {85, 92, 78, 88};
        int examSum = examGrades[0] + examGrades[1] + examGrades[2] + examGrades[3];
        double examAverage = examSum / examGrades.length;

        System.out.println("Average grade: " + examAverage);

        //Opgave 4.28 - Temperature analysis
        //Dagens temperaturer: 18.5, 22.0, 24.5, 21.0, 19.5.
        //Opgave: Find første, sidste og "midterste" (index 2) temperatur.
        double[] temperatures = {18.5, 22.0, 24.5, 21.0, 19.5};
        double firstTemperature = temperatures[0];
        double lastTemperature = temperatures[temperatures.length - 1];
        double middelTemperature = temperatures[2];
        System.out.println(firstTemperature + ", " + lastTemperature + ", " + middelTemperature);

        //Opgave 4.29 - Product comparison
        //Sammenlign to produkter.
        //Opgave: Du har arrays for 3 produkter. Find det billigste og dyreste (bare første 3 elementer).
        String[] products = {"Keyboard", "Guitar", "Base"};
        double[] productprices = {548.95, 1584.95, 1299.95};
        //Manually check first 3
        double cheapest = productprices[0];
        double mostExpensive = productprices[1];

        System.out.println("Cheapest: " + products[0] + " at " + cheapest);
        System.out.println("Most expensive: " + products[1] + " at " + mostExpensive);

        //Opgave 4.30 - Complete data managent
        String[] employerName = {"Anna", "Bob", "Carl", "Diana", "Eva"};
        int[] employerAge = {28, 35, 42, 30, 38};
        int[] employerSalary = {45000, 52000, 58000, 48000, 51000};
        boolean[] isEmployerFulltime = {true, true, false, true, true};
        double first3EmployersAveageAge = (employerAge[0] + employerAge[1] + employerAge[2]) / 3;
        int totalSalery = employerSalary[0] + employerSalary[1] + employerSalary[2] + employerSalary[3] + employerSalary[4];

        System.out.println("Antal medarbejdere: " + employerName.length);
        System.out.println("Første medarbejders navn: " + employerName[0] + ", sidste medarbejder: " + employerName[employerName.length - 1]);
        System.out.println("Gennemsnitsalder af første 3 medarbejdere: " + first3EmployersAveageAge);
        System.out.println("Total løn af alle medarbejdere: " + totalSalery);

    }
}
