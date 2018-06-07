package FIRSTPACKAGE;
public class Student //insert student details and display information
{
    String name;
    int age;
    float height;
    double weight;
    int student_id;
    char gender;
    long rollno;
    int mark1;
    Short m1, m2;
    // not used boolean, short datatype


    public void studentDetails(String nam, int a, float h, double weigh, int stid, char gen, long rol)
    {
        name = nam;
        age = a;
        height = h;
        weight = weigh;
        student_id = stid;
        gender = gen;
        rollno = rol;

    }

    public void passMark(int m1)
    {
        mark1 = m1;
        if (mark1 >50 ) {
            System.out.println("Examination passed");

        }
        else if(mark1==50) {
            System.out.println("Examination Passed");

        }

        else {
            System.out.println("Examination Failed");
        }

    }
    public void display()
    {
        System.out.println("Student Name="+name);
        System.out.println("Age="+age);
        System.out.println("Height="+height);
        System.out.println("Weight="+weight);
        System.out.println("Studentid="+student_id);
        System.out.println("Gender="+gender);
        System.out.println("RollNo"+rollno);
    }

}
