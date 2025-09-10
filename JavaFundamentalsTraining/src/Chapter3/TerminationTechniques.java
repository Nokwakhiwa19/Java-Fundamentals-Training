package Chapter3;

/**
 * @author Nokwakhiwa Mazibuko
 * Break: end/ exit the loop
 * continue: will skip the current iteration and start the next iteration
 */
public class TerminationTechniques {
    public static void main(String[] args) {
        //break: exit / end the loop
        for(int i=0; i< 20; i++){
            System.out.println("i = " + i + ", ");
            if (i==5) break;

        }
        //Continue: skip current iteration
        System.out.println("==========Continue========");
        for(int i=0; i< 20; i++){
            if (i % 5 == 0) continue;
            System.out.println("i = " + i);


        }
        for(int i=0; i< 15; i++){
            if (i ==5) break;
            if (i == 3) continue;
            System.out.println("i = " + i);


        }
    }
}
