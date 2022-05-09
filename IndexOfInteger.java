import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
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
        System.out.println("What number are you looking for in the list?");
        int input2 = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
        int value = list.get(i);
        if (value == input2) {
            System.out.println(input2 + " has an index of " + i);
        }
       
    }
    

    }
}
