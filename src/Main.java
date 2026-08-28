//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

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






    }


    static void methodVakul(){
        System.out.println("Hello vakul");
    }

}
