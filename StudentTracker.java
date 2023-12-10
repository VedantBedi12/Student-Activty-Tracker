import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class StudentTracker {
    public static void main(String[] args){
        Scanner Inp = new Scanner(System.in);
        System.out.println("How many Entries");
        int number = Inp.nextInt();

    for( int i = 1; i <= number; i++){
        Scanner Input = new Scanner(System.in);
        System.out.println("enter name ");
        String name = Input.nextLine();

        System.out.println("Enter the Grades of the Student as Follows: Maths, English, Science, Social Science, Hindi");
        int gr1 = Input.nextInt();
        int gr2 = Input.nextInt();
        int gr3 = Input.nextInt();
        int gr4 = Input.nextInt();
        int gr5 = Input.nextInt();

        Student s = new Student();
        s.Name = name;
        s.Grades.add(gr1);
        s.Grades.add(gr2);
        s.Grades.add(gr3);
        s.Grades.add(gr4);
        s.Grades.add(gr5);


        s.GetGrades();
        s.GetGradeReport();
        s.GetAverage();
        s.GetName();

        System.out.println("If you have made a wrong entry, you can correct it now. How many incorrect entries ?");
        int inc = Input.nextInt();
        for( int j = 1; j <= inc; j++){
        s.UpdateGrades();
        }

        System.out.println("Do you want the correct Grade Report now. Enter 1 for Yes or 0 for no");
        int yn = Input.nextInt();
        if( yn == 1){
            s.GetGradeReport();
        }

    }
    }

        

    }


