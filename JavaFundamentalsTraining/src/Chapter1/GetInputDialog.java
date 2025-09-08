package Chapter1;

import javax.swing.*;

/**
 * @author Nokwakhiwa Mazibuko
 * This class demonstrate how to get input from the user
 * using dialog input box
 */
public class GetInputDialog {
    public static void main(String[] args) {
        String firstname;
        int age;
        char initial;
        double height;
        float salary;
        boolean isMarried = true;


        firstname = JOptionPane.showInputDialog("Please enter your name");
        initial = JOptionPane.showInputDialog("Please enter your initial").charAt(0);



        age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height in meters"));
        salary = Float.parseFloat(JOptionPane.showInputDialog("Please enter your salary"));

        // Display details
        String output = String.format("""
                        Name: %s (%s)
                        Age: %d
                        Height: %.2f 
                        Salary: %.2f
                        Married?: %b """ , firstname, initial, age, height,salary,isMarried);


        JOptionPane.showMessageDialog(null, output);





    }
}
