import java.util.Scanner;
public class Number extends Main {
    String type = new String();
    double valueArabic;
    String valueRomanian;
    public Number() {
        System.out.println("Wale");
        Scanner sc = new Scanner(System.in);

        // String type = new String();
        if (sc.hasNextDouble()) {
            valueArabic = sc.nextDouble();
            type = "arb";
            valueRomanian = arabTransform(valueArabic);
        }
        else {
            type = "romanian";
            valueRomanian = sc.nextLine();
            valueArabic = romeTransform(valueRomanian);
        }
        //System.out.println("User input: " + scan);
        //System.out.println(type);

    }

    public static double romeTransform(String romeNumber) {
        double romeNumToArabicResult = 0.0;
        int romeStringLenght = romeNumber.length();
        romeNumber = romeNumber.toUpperCase();
        double[] arabicNumberMass = new double[romeStringLenght];
        for(int i = 0; i < romeStringLenght; i++) {
            switch (romeNumber.charAt(i)) {
                case 'I':
                    //romeNumToArabicResult += 1;
                    arabicNumberMass[i] = 1;
                    break;
                case 'V':
                    //romeNumToArabicResult += 5;
                    arabicNumberMass[i] = 5;
                    break;
                case 'X':
                    //romeNumToArabicResult += 10;
                    arabicNumberMass[i] = 10;
                    break;
                case 'L':
                    //romeNumToArabicResult += 50;
                    arabicNumberMass[i] = 50;
                    break;
                case 'C':
                    //romeNumToArabicResult += 100;
                    arabicNumberMass[i] = 100;
                    break;
                case 'D':
                    //romeNumToArabicResult += 500;
                    arabicNumberMass[i] = 500;
                    break;
                case 'M':
                    //romeNumToArabicResult += 1000;
                    arabicNumberMass[i] = 1000;
                    break;
                default:
                    break;
            }
        }

        romeNumToArabicResult += arabicNumberMass[0];
        for (int i = 1; i < arabicNumberMass.length; i++) {
            if (arabicNumberMass[i-1] < arabicNumberMass[i]) {
                //arabicNumberMass[i] *= -1;
                romeNumToArabicResult += arabicNumberMass[i] - arabicNumberMass[i-1] * 2;
            }
            else {
                romeNumToArabicResult += arabicNumberMass[i];
            }
        }
        return romeNumToArabicResult;
    }

    public static String arabTransform(double valueArabic) {


        return "work in progress";
    }
}
