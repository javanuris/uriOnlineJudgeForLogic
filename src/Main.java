import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by User on 25.09.2017.
 */
public class Main {


    public static void circle1002() {
        double r = 0;
        double PI = 3.14159;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();

        result = PI * r * r;

        System.out.printf("A=%.4f\n", result);
    }

    public static void SAMO1003() {
        int a = 0;
        int b = 0;
        int SOMA = 0;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        SOMA = a + b;
        System.out.println("SOMA = " + SOMA);
    }

    public static void PROD1004() {
        int a = 0;
        int b = 0;
        int SOMA = 0;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        SOMA = a * b;
        System.out.println("PROD = " + SOMA);
    }

    public static void MEDIA1005() {
        float a = 0;
        float b = 0;
        float SOMA = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();

        SOMA = (a * 3.5f + b * 7.5f) / (3.5f + 7.5f);
        System.out.printf("MEDIA = %,.5f\n", SOMA);

    }

    public static void MEDIAThree1006() {
        double a = 0;
        double b = 0;
        double c = 0;
        double MEDIA = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        MEDIA = (a / 10 * 2) + (b / 10 * 3) + (c / 10 * 5);

        System.out.printf("MEDIA = %,.1f\n", MEDIA);

    }

    public static void task1007() {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int difference = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        difference = a * b - c * d;

        System.out.print("DIFERENCA  = " + difference + "\n");

    }

    public static void task1008() {
        int num = 0;
        double hour = 0;
        double amount = 0;
        double result = 0;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        hour = sc.nextDouble();
        amount = sc.nextDouble();

        result = hour * amount;

        System.out.printf("NUMBER = %s\n", num);
        System.out.printf("SALARY = U$ %,.2f\n", result);
    }

    public static void task1009() {
        Locale.setDefault(Locale.US);
        double salary, allProductPrice, result;
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        salary = sc.nextDouble();
        allProductPrice = sc.nextDouble();

        result = salary+ (allProductPrice*15)/100 ;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.printf("TOTAL = R$" + " " + df.format(result));
    }


    /*
    import java.util.Scanner;
    import java.text.DecimalFormat;
    import java.util.Locale;
    */
    public static void main(String[] args) {
        // circle1002();
        // SAMO1003();
        // PROD1004();
        //MEDIA1005();
        //MEDIAThree1006();
        //task1007();
        //  task1008();
        task1009();
    }

}
