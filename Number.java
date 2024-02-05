import java.util.Scanner;
public class Number extends Main {

    String type = new String();
    public Number() {
        System.out.println("Wale");
        Scanner sc = new Scanner(System.in);

       // String type = new String();
        if (sc.hasNextInt()) {
            type = "arb";
        }
        else {
            type = "romanian";
        }
        String scan = sc.nextLine();
        System.out.println("User input: " + scan);
        System.out.println(type);

    }

    public void inputNum() {

    }
}
