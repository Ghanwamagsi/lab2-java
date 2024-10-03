class Student{
    String name,Rollno;
    int marks_in_subject1,marks_in_subject2,marks_in_subject3;
    Student(String name, String Rollno,int sub1,int sub2,int sub3){
        this.name=name;
        this.Rollno=Rollno;
        this.marks_in_subject1=sub1;
        this.marks_in_subject2=sub2;
        this.marks_in_subject3=sub3;
        System.out.print("working");

    }
}
public class Constructors{
    public static void main(String[] args){
      Student obj=new Student("najaf","23ai01",23,50,100);
      
    }
}