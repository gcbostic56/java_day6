import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Please enter as many strings as you want and then enter an empty string.");
    ArrayList<String> list = new ArrayList<String>();
    
    while(true) {
        String input = scanner.nextLine();
        
        if (input.equalsIgnoreCase("")) {
            int amount = list.size();
            int lastNumber = amount - 1;
            String lastInput = list.get(lastNumber);
            System.out.println("The list contains this many strings: "+lastInput);
            break;
        }
        System.out.println(input);
        list.add(input);
    }
}
}
