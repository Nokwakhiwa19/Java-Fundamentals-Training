package Chapter4.Exercises;

public class StudentGrade {
    public static void main(String[] args) {
        greetings();
        displayOutput(); //displays student details


    }
    
    public static void greetings(){
        System.out.println("Dear Student, Below are your course details");
    }
    
    public static String determineGrade(double testMark){
        String grade;
        if (testMark<40){
            grade = "F";
        } else if (testMark<=49) {
            grade = "D-";
            
        } else if (testMark<=59) {
            grade ="D";
            
        } else if (testMark<=69) {
            grade ="C";
            
        } else if (testMark<=79) {
            grade ="B";
            
        } else if (testMark<=89) {
            grade = "A";
            
        } else {
            grade = "A+";
            
        }
        return grade;

    }
    public static int determineAge(int year){
        int currentYear = 2025;
        int currentAge = currentYear - year;
        return currentAge;
    }
    public static void displayOutput(){
        String firstName = "Nokwakhiwa";
        String lastName = "Mazibuko";
        System.out.println("Student Name: " + firstName + "\nLast Name: " + lastName);
        System.out.println("Age: " + determineAge(2000));
        System.out.println("Grade: " + determineGrade(90));


    }
    
}
