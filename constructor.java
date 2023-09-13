public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "sradha";
        s1.roll = 456;
        s1.password = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;


        Student s2 = new Student(s1);//copy constructor  
        s2.password = "xyz";
        s1.marks[2] = 100;//i cahnge this line after all this if it was shallow the marks will changed but for deep it will not

        for(int i=0;i<3;i++) {
            System.out.println(s2.marks[i]);
        }

        // Student s2 = new Student("xyz");
        // Student s3 = new Student(123);
        //Student s4 = new Student("aman",123)
        // System.out.println(s1.name);
    }
    
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];


//this is called shallow copy constructor
// Student(Student s1){
//     marks = new int[3];
//     this.name = s1.name;
//     this.roll = s1.roll;
//     this .marks = s1.marks;
// }
//deep copy costructor
Student(Student s1){
    marks = new int [3];
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i=0; i<marks.length; i++){
        this.marks[i] = s1.marks[i];
    }

}
    //non-parameterized constructor
    Student(){
        marks = new int[3];
        System.out.println("constructor is called");
    } 
    //parametarized constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}  