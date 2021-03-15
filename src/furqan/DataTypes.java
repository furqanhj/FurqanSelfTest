package furqan;

public class DataTypes {

    public static void main(String[] args) {

        //Primitive Data Types:

        // Data Type                // variable Name        // Assignment Operator      // Value
        //  int                     age                             =                       26
        int age = 26;
        age = 32;
        System.out.println(age);

        // Non-Primitive Data types:
        /*
        1) Strings
        2) Arrays
        3) User-defined Classes
         */


        // Data type    // reference variable  //Assingment operator  // Object Creation
        Fan fan = new Fan();
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();


        fan.age = 26;
        fan1.age = 36;
        fan2.age = 18;

        System.out.println(fan.age);
        System.out.println(fan1.age);
        System.out.println(fan2.age);


        String name = new String();
        name = "Furqan";

        int[] numOfStudents = new int[5];
        numOfStudents[0] = 5;
        numOfStudents[1] = 2;
        numOfStudents[2] = 3;

        String firstName = "Furqan";

        int[] numbers = {1, 22, 45, 66, 78};


    }


}
