// Saurabh Chapagain
// Date: April 27, 2022.
// s205@umbc.edu

public class HomeworkFour {
    public static void main(String[] args) {
        //Part One of Homework Four
        //making object of class
        //Creating an object using Constructor with 3 int arguments
        hw4 obj1 = new hw4(12, 34, 56);

        //Part Two of Homework Four
        //This object creation would call the default constructor
        StudentData stuObj= new StudentData();
        /*This object creation would call the parameterized
         * constructor StudentData(int, String, int)*/
        stuObj = new StudentData(34567,"Saurabh Chapagain",20);


    }
}
