package Chapter1;
/**
 * @author Nokwakhiwa Mazibuko
 * using contanta values: Shouldn't change during program
 * execution
 * Use 'final' keyword to indicate that a variable is constant
 */
public class UsingContants {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2025;
        final String COMPANY_NAME = "iLAB";
        String welcomeMessage;

        welcomeMessage = "Welcome to " + COMPANY_NAME +"\t"+ CURRENT_YEAR +"\t"+ "Internship Programme";
        System.out.println(welcomeMessage);

    }
}
