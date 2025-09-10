package Chapter3;
/**
 * @author Nokwakhiwa Mazibuko
 * Do while loop will execute atleast once
 */
public class DoWhile {
    public static void main(String[] args) {
        char option= 'a';

        do{
          System.out.println("option = " + option);

          option++;
        }while(option!= 'g');
    }
}
