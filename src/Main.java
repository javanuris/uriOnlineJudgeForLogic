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

        result = salary + (allProductPrice * 15) / 100;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.printf("TOTAL = R$" + " " + df.format(result));
    }

    public static void task1010() {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int productId1 = sc.nextInt();
        int productUnits1 = sc.nextInt();
        float productPrice1 = sc.nextFloat();

        float totalPrice1 = productUnits1 * productPrice1;

        int productId2 = sc.nextInt();
        int productUnits2 = sc.nextInt();
        float productPrice2 = sc.nextFloat();

        float totalPrice2 = productUnits2 * productPrice2;

        float productsResult = totalPrice1 + totalPrice2;

        DecimalFormat df = new DecimalFormat("####.00");

        System.out.printf("VALOR A PAGAR:" + " " + "R$" + " " + df.format(productsResult));

    }

    private static void codingBat() {
        int firstArr[] = {1, 2, 3};
        int secondArr[] = {4, 5, 6};
        int middle[] = new int[2];
        middle[0] = firstArr[1];
        middle[1] = secondArr[1];
        System.out.println(firstArr);
    }

    private static void codingBatFix23() {
        int firstArr[] = {1, 2, 1};
        boolean status = true;
        for (int i = 0; i < 2; i++) {
            if (firstArr[i] == 2 && firstArr[i + 1] == 3) {
                firstArr[i + 1] = 0;
            }
        }
    }

    private static void codingBatmakeMiddle() {
        int firstArr[] = {8, 6, 7, 5, 3, 0, 9};
        int avarageNum = firstArr.length / 2;

        int resalt[] = new int[3];
        resalt[0] = firstArr[avarageNum];
        resalt[1] = firstArr[avarageNum + 1];
        resalt[2] = firstArr[avarageNum + 2];

    }


    private static void codingBatunlucky1() {
        int firstArr[] = {1, 1, 1, 3, 1};
        boolean result = false;
        for (int i = 0; i < firstArr.length - 1; i++) {
            if (i < 2 || i > firstArr.length - 1)
                if (firstArr[i] == 1 && firstArr[i + 1] == 3) {
                    result = true;
                }

        }
        System.out.println(result);
    }

    private static void codingBatmakeLast() {
        int firstArr[] = {4, 5, 6, 1, 1, 1};
        int secondArr[] = {1, 4, 5, 6};
        int result = 0;

        for (int i = 0; i < firstArr.length - 1; i++) {
            if (firstArr[i] == 1) {
                result++;
            }
        }

        for (int i = 0; i < secondArr.length - 1; i++) {
            if (secondArr[i] == 1) {
                result++;
            }
        }
    }

    public static void plusTwo() {
        int firstArr[] = {4, 5, 6};
        int secondArr[] = {1, 4, 5};
        int index = 0;
        int result[] = new int[firstArr.length + secondArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            result[i] = firstArr[i];
            index++;
        }
        for (int i = 0; i < secondArr.length; i++) {
            result[i + index] = secondArr[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void maxTriple() {
        int firstArr[] = {7, 9, 8,10, 5};
        int secondArr[] = {7, 9, 8,10, 5};
        int middle = firstArr[firstArr.length/2];
        int firstElement = firstArr[0];
        int lastElement = firstArr[firstArr.length-1];

        int result[] = {firstElement , middle , lastElement};
        int resultSum = result[0];

        for (int i = 0; i < result.length; i++) {
            if (resultSum < result[i]) {
                resultSum = result[i];
            }
        }

        System.out.println(resultSum);


    }


    public static void make2() {
        int firstArr[] = {4, 5};
        int secondArr[] = {4, 9, 8, 10, 5};
        int result[] = new int[2];

        if (firstArr.length == 1) {
            result[0] = firstArr[0];
            result[1] = secondArr[0];
        }
        if (firstArr.length == 0) {
            result[0] = secondArr[0];
            result[1] = secondArr[1];
        }
        if (firstArr.length >= 2) {
            result[0] = firstArr[0];
            result[1] = firstArr[1];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static void double23() {
        int firstArr[] = { 3,3};



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
        //task1009();
        // task1010();
        // codingBat();
        // codingBatFix23();
        //codingBatmakeMiddle();
        //codingBatunlucky1();
        //plusTwo();
        //maxTriple();
        //make2();
        double23();

    }


}
