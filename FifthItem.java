import java.util.Scanner;
import java.util.ArrayList;


public class FifthItem {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    
    System.out.println("Please enter 6-7 new strings into my list and then enter an empty string.");
    ArrayList<String> list = new ArrayList<String>();
    
    
    
    while(true) {
        String input = scanner.nextLine();
        
        if (input.equalsIgnoreCase("")) {
            
            System.out.println("The fifth item in the list is: "+list.get(4));
            break;
        }
        System.out.println(input);
        list.add(input);
    }
    }
}