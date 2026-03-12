package Level4;

public class AccessingElements {
public static void main(String[] args){
    System.out.println("====  Accessing Elements ===");
    //Opgave 4.6 - Access first element
    int[] scores = {85, 92, 78, 88};
    int firstScore = scores[0];
    //Opgave 4.7 - Access specific elements
    String[] colors = {"Red", "Green", "Blue", "Yellow"};
    String secondElement = colors[1]; //Green
    String fourthElement = colors[3]; //Yellow
    //Opgave 4.8 - Access and use
    double[] prices = {15.50, 22.00, 8.75};
    double firstPrice = prices[0]; //15.50
    double secondPrice = prices[1]; //22.0
    double sum = firstPrice + secondPrice; //37.50
    System.out.println(sum);
    //Opgave 4.9 - Multiple accesses
    //Print første, tredje og femte element.
    int[] numbers = {10, 20, 30, 40, 50};
    System.out.println(numbers[0]);
    System.out.println(numbers[2]);
    System.out.println(numbers[4]);
    //Opgave 4.10 - Access for calculation
    int[] ages = {25, 30, 22, 35, 28};
    //Beregn gennemsnittet af de første tre aldre.
    int sumAge = ages[0] + ages[1] + ages[2]; //77
    double averageAge = sumAge / 3.0; //25.67
    System.out.println(averageAge);

}
}
