package Chapter5;
/**
 * @author Nokwakhiwa Mazibuko
 *This class shows how to declare, assign and use array elements
 */
public class DeclaiaringArrays {
    public static void main(String[] args) {
        //Declaire
        int[] arNumbers;
        String[] arNames;
        double[] arPrices;

        arNumbers = new int[5];
        arNames = new String[5];
        arPrices = new double[5];

        //Assign
        arNumbers[0] = 5;
        arNumbers[1] = 15;
        arNumbers[2] = 52;
        arNumbers[3] = 54;
        arNumbers[4] = 65;

        System.out.println(arNumbers[2]);
        System.out.println(arNames[2]);
        System.out.println(arPrices[2]);

    }
}
