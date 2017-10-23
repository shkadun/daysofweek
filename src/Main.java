import java.util.*;
public class Main {
    public static void main(String[] args) {
    String b;
    int a;
    Scanner scn = new Scanner(System.in);

        do {
            System.out.println("Enter a number of day from 1 to 7");
            b = scn.nextLine();
            if (b.equals("quit") == false) {
                try {
                    a = Integer.parseInt(b);
                } catch (Exception e)
                {
                    System.out.println("Incorrect value");
                    continue;
                }
                switch (a) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednsday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Invalid number.");
                        break;
                }
            }
            break;
        } while(b != "quit");
    }
}
