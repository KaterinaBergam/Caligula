import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("caligula"); // test
        System.out.println("hello"); // test 2
        //System.out.println("new caligula"); // new test
        //System.out.println("new caligula 3"); // new test 2

        double firstNum = 0.0;

        System.out.println("Hello World\n");
        Scanner scanNum = new Scanner(System.in);
        if (scanNum.hasNextInt()) {
            double numRome = scanNum.nextDouble();
            System.out.println(numRome);
            System.out.println("double");
        }
        else {
            String numRome = scanNum.nextLine();
            System.out.println(numRome);
            System.out.println("string");
            System.out.println(romeTransform(numRome));
            System.out.println("romeTransformed");
        }
    }

    public static double romeTransform(String romeNumber) {
        double romeNumToArabicResult = 0.0;
        romeNumber = romeNumber.toUpperCase();
        for(int i = 0; i < romeNumber.length(); i++) {
            switch (romeNumber.charAt(i)) {
                case 'I':
                    romeNumToArabicResult += 1;
                    break;
                case 'V':
                    romeNumToArabicResult += 5;
                    break;
                case 'X':
                    romeNumToArabicResult += 10;
                    break;
                case 'L':
                    romeNumToArabicResult += 50;
                    break;
                case 'C':
                    romeNumToArabicResult += 100;
                    break;
                case 'D':
                    romeNumToArabicResult += 500;
                    break;
                case 'M':
                    romeNumToArabicResult += 1000;
                    break;
                default:
                    break;
            }
        }
        return romeNumToArabicResult;
    }
}