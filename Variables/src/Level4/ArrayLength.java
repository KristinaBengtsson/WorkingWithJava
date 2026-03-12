package Level4;

public class ArrayLength {
    public static void main(String[] args){
        System.out.println("====  Array Length ===");
        //Opgave 4.11 - Get array length
        // Find antallet af elementer i arrayet.
        String[] names = {"Anna", "Bob", "Carl", "Diana"};
        int count = names.length; //4
        System.out.println(names.length);

        //Opgave 4.12Length property
        //Erklær arrays og find deres længde:
        int[] scores = {85, 92, 78};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        double[] temps = {18.5, 22.0};
        int countScores = scores.length; //3
        System.out.println(scores.length);
        int countDays = days.length; //5
        System.out.println(days.length);
        int countTemps = temps.length; //2
        System.out.println(temps.length);

        //4.13 Last element using length
        //Få det sidste element ved at bruge .length
        int[] numbers = {10, 20, 30, 40, 50};
        int lastNumber = numbers[numbers.length-1]; //50

        //4.14 - Length in calculation
        //Beregn total sum af ALLE priser uden at hardcode antal elementer.
        double[] prices = {15.50, 22.00, 8.75, 12.50};
        double total = 0.0;
        total = prices[0] + prices[1] + prices[2] + prices[3]; //Manual addition af alle elementer
        System.out.println("Total items: " + prices.length); //4
        System.out.println("Total price: " + total); //58.75



    }
}
