package Chapter1;
/**
 * @author Nokwakhiwa Mazibuko
 * This class demonstrates the use of different methods
 * from the 'string' class
 */
public class ExploreStrings {
    public static void main(String[] args) {
       String firstName = "Johnathan";
       String lastName = "Smith";
       String sentence = "Video provides a powerful way to help you prove your point.";

       System.out.println(firstName + "has" + firstName.length() + "letters");
        System.out.println("'m' is found at position (index)" + lastName.indexOf("m") + "from" + lastName);
        System.out.println("Is Smith =" + lastName + "?" + lastName.equals("Smith"));
        System.out.println("The third letter from" + firstName + "is" + firstName.charAt(2));
        System.out.println("The last position of 'n' from" + firstName + "is:" + firstName.lastIndexOf("h") );
        System.out.println("Number of letters (excluding spaces): " + sentence.replace(" ","").length());

    }
}
