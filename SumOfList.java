import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        
        System.out.println("Please enter as many numbers as you like and when done enter a zero.");
        
        while(true) {
            int input = scanner.nextInt();
            
            if (input == 0) {
                System.out.println("We are done adding numbers to the list");
                break;
            }
            System.out.println(input);
            list.add(input);
            System.out.println(list);
        }
        getSum();
        
    }
    
    public static void getSum() {
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
           result += list.get(i);
        }
        String finalNumbers = "Your list contains (in order): ";
        for (int j = 0; j < list.size(); j++) {
            if (j == list.size() - 1) {
                finalNumbers += "and "+String.valueOf(list.get(j) + ".");
            }
            else {
            finalNumbers += String.valueOf(list.get(j) + ", ");
            }
        }
        System.out.println(finalNumbers+ "\nThe sum is " +result+ ".");
        
    }
}