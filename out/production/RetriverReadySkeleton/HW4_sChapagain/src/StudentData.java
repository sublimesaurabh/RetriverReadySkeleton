// Saurabh Chapagain
// Date: April 27, 2022.
// s205@umbc.edu

public class StudentData {

        // create 3 private properties studentID, studentName, studentAge
        private int studentID;
        private String studentName;
        private int studentAge;

        //create default constructor and assign default values to above properties
        public StudentData() {
            studentID = 0;
            studentName = "";
            studentAge = 0;
            System.out.println("default StudentData constructor: " + " Student ID: " + studentID + " Student Name: " + studentName + " Student Age: " + studentAge);
        }

        //create parameterized constructor which takes 3 parameters
        public StudentData(int studentID, String studentName, int studentAge) {
            this.studentID = studentID;
            this.studentName = studentName;
            this.studentAge = studentAge;
            System.out.println("parameterized StudentData constructor with 3 parameters: " + "Student ID: " + studentID + " Student Name: " + studentName + " Student Age: " + studentAge);
        }


         // define Getter and setter methods for all properties
        public void setStudentID(int studentID) {
            this.studentID = studentID;
        }

        public int getStudentID() {
            return studentID;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentAge(int studentAge) {
            this.studentAge = studentAge;
        }

        public int getStudentAge() {
            return studentAge;
        }


}
