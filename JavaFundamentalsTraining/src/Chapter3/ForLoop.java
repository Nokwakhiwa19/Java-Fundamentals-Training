package Chapter3;
/**
 * @author Nokwakhiwa Mazibuko
 * Use the for loop when you know the number of times
 * the loop should execute
 *
 */
public class ForLoop {
    public static void main(String[] args) {

        //Display java 5 times
        for(int x=1; x<=5; x++){
            System.out.print(x + "- Java");
        }
        //Multiple conditions
        System.out.println("===Multiple conditions=======");
        for(int x=1, y=5; x<10 && y >=0; x++,y-- ) {
            System.out.println(x + "<------>" + y);
        }
    }
}
