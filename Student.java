import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
public class Student {
    String Name  ;
    ArrayList<Integer> Grades = new ArrayList<>(5);

    public void GetName(){
        Name = this.Name;
        System.out.println(Name);
    }
    public void GetGrades(){
        System.out.println(" The Grades of " + Name + " in Maths, English, Science, Social Science, Hindi are as follows:");
        System.out.println(this.Grades);
    }
    public void GetGradeReport(){
        int sum=0;
        int size = 5;
        for(int i = 0; i <size; i++){
            sum = sum + Grades.get(i);
        }
        int average = sum/5;
        System.out.println(Name + "'s Grade Report is as follows");
        System.out.println( "The Student's Average is: " + average);

        if(average >=90 && average <=100){
            System.out.println("The Students Performance has been Outstanding");
        }

        else if(average <90 && average >= 80){
            System.out.println("The Students Performance has been Excellent");
        }
        else if(average <80 && average >= 70){
            System.out.println("The Students Performance has been Very Good");
        }
        else if(average <70 && average >= 60){
            System.out.println("The Students Performance has been Good");
        }
        else if(average <60 && average >= 50){
            System.out.println("The Students Performance has been Average");
        }
        else if(average < 50 && average >=0){
            System.out.println("The Student has failed this Semester");
        }
        else{
            System.out.println("Wrong Entries");
        }
    }
    public void GetAverage(){
       int sum=0;
        int size = 5;
        for(int i = 0; i <size; i++){
            sum = sum + Grades.get(i);
        }
        int average = sum/5;
        System.out.println(Name + "'s Grade Average is " + average);   
    }
    public void UpdateGrades(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("0 for Maths, 1 for English, 2 for Science, 3 for Social Science, 4 for Hindi");
        int gr = Sc.nextInt();
        System.out.println("What is the updated marks");
        int newgrade = Sc.nextInt();
        this.Grades.set(gr, newgrade);
    }
        public static void main(String[] args){
        }
    }