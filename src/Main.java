//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import java.util.ArrayList;
import java.util.Scanner;

//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//void main() {
//    System.out.println("Hello world");
//}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int num= sc.nextInt();
        //num=num+1;

        //decleration
        int[] student = new int[5];
        int[] student2 = new int[5];

        //initializiation
        student = new int[]{99, 85, 76, 78, 90};
        student2 = new int[]{95, 94, 91, 90, 89};

        int[] student3 = {99, 98, 97, 96, 95};
        //99->student3[0]
        //98->student3[1]
        //95->student3[4]
        // int siz= student3.length

        System.out.println(student3[3]);

        System.out.println(student[2]);

        //create 3 variables  avg1, avg2,avg3
        //using for loop store the average of 3 students in that variable


        int avg1 = 0;
        int avg2 = 0;
        int avg3 = 0;
        for (int i = 0; i < 5; i++) {
            avg1 = avg1+  student[i];
            avg2 = avg2 + student2[i];
            avg3 = avg3 + student3[i];

        }
        avg1 = avg1 / 5;
        System.out.println("avg1 -" + avg1);
        avg2 = avg2 / 5;
        System.out.println("avg2 -" + avg2);
        avg3 = avg3 / 5;
        System.out.println(+avg3);

        // arr[]={s1,s2,s3 .... s100}
        //stu[]={marks1,marks2...}
        // for(students){
        //for(marks){
    //}


    //ArrayList
        //its size is not fixed
        //it offers a lot of opearations
        //like add remove,size etc
        //int[] arr=new int[5];
        ArrayList<Integer> number=new ArrayList<>();
        //add operation
        number.add(99);
        number.add(128);
        number.add(135);
        number.add(156);
        number.add(278);

        //number - {99,128,135,156,,278}
        //Remove Operation
        number.remove(3);
        //Set Operation
        number.set(0,90);//index number and value
        //Size Operation
        int siz= number.size();

        //check if some element is present

        boolean aa=number.contains(95);


        System.out.println(number);
        System.out.println(aa);

        // create student using arralist and add 6 subject marks into it and calculate the average (try use most number of operations)

    }


    static void methodVakul(){
        System.out.println("Hello vakul");
    }

}
