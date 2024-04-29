package Task2;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subject count: ");
        int numOfsub = sc.nextInt();
        int[] marks = new int[numOfsub];
        for(int i=0;i<numOfsub;i++){
            System.out.print("Enter subject " + (i+1) + " Mark : ");
            marks[i] = sc.nextInt();
        }

        int totalmarks = 0;
         for(int mark : marks){
            totalmarks += mark;
         }

         float avargePercent = (float) totalmarks/numOfsub;

        String grade;
        if(91 <= avargePercent && avargePercent <= 100 )
            grade = "A";
        else if(81 <= avargePercent && avargePercent <=90 )
            grade = "B";
        else if(71 <= avargePercent && avargePercent <= 80)
            grade = "C";
        else if(61 <= avargePercent && avargePercent <= 70)
            grade = "D";
        else if(51 <= avargePercent && avargePercent <= 60)
            grade = "E";
        else
            grade = "F";
        System.out.println("******Result******");
        System.out.println("Total Marks: " + (totalmarks) +"/"+ (numOfsub * 100));
        System.out.println("Average Percentage: " + avargePercent);
        System.out.println("Grade: " + grade);
        
    }
    
}
 