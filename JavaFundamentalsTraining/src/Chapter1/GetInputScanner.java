package Chapter1;

import java.util.Scanner;

/**
 * @author Nokwakhiwa Mazibuko
 * This class demonstrate how to input from the user
 * Using Scanner object
 */
public class GetInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firtname;
        int age;
        double height;
        float salary;
        boolean isMarried = true;
        char initial;

        System.out.println("Please enter Initial: ");
        initial = sc.next().charAt(0);
        System.out.println("Please enter firtname: ");
        firtname = sc.next();
        System.out.println("Please enter age: ");
        age = sc.nextInt();
        System.out.println("Please enter heiht: ");
        height = sc.nextDouble();
        System.out.println("Please enter Salary: ");
        salary = sc.nextFloat();

        //isMarried = sc.nextBoolean();

        System.out.println("\n=======Details==========");
        //System.out.println("Initial: ");
        System.out.println("Name: "+ firtname + "(" + initial + ")"+
        "\nAge: "+ age+
        "\nheight: "+ height+
        "\nSalary: "+ salary+
        "\nMarried?: ("+ isMarried +")");




    }
}
