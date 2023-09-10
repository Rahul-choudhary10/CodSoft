
import java.util.*;

public class student_cal {
    static int takeMarks(){
        Scanner sc = new Scanner(System.in);
        int sub;
        do {
            sub = sc.nextInt();
            if (sub < 0 || sub > 100) {
                System.out.println("PLEASE ENTER VALID NUMBER BETWEEN 0 AND 100.");
            }
        } while (sub < 0 || sub > 100);
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE MARKS FOR TOTAL THREE SUBJECT:");
        System.out.print("ENTER THE VALUE OF MATHS : ");
        int maths = takeMarks();
        System.out.print("ENTER THE VALUE OF SCIENCE : ");
        int science = takeMarks();
        System.out.print("ENTER THE VALUE OF ENGLISH : ");
        int english = takeMarks();
        int total = maths + science + english;
        System.out.println("YOU OBTAINED THE "+ total +" OUT OF 300 MARKS");
        float ptg = total * 100 / 300;
        System.out.println("YOU OBTAINED THE "+ptg+" %");
        if (ptg >= 90) {
            System.out.println("YOU HAVE GOT A GRADE 'EXCELLENT'");
        } else if (ptg >= 80 && ptg < 90) {
            System.out.println("YOU HAVE GOT B GRADE 'VERY GOOD'");
        } else if (ptg >= 70 && ptg < 80) {
            System.out.println("YOU HAVE GOT C GRADE 'GOOD'");
        } else if (ptg >= 60 && ptg < 70) {
            System.out.println("YOU HAVE GOT D GRADE 'NEED TO IMPROVE'");
        } else if (ptg >= 50) {
            System.out.println("YOU HAVE GOT E GRADE 'WORK HARD'");
        } else {
            System.out.println("YOU HAVE GOT F GRADE 'YOU ARE FAIL'");
        }
    }
}
