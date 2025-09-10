package Chapter4;

import java.util.Scanner;

/**
 * @author Nokwakhiwa Mazibuko
 *
 */
public class ReturnTypeMethods {
    public static void main(String[] args) {
        String name = getPen().next();

    }
    public  static String getAdress(){
        return "123 Main street";
    }
    public static int getSum(){
        int num1 = 5;
        int num2 = 15;

        return  num1 + num1;
    }

    public static Scanner getPen(){
        return new Scanner(System.in);
    }

    public boolean isEven(){
        int num =12;
        return num % 2 ==0;
    }
}
