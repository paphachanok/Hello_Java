
import java.util.Scanner;

public class please_2 {

    //! To declare your own method, it needs to be outside "main"
    //! it's still working whether you write it before or after "main"
    static void sayWelcome(){
        System.out.println("Welcome!");
    }

    //! Don't forget to declare the 'type'
    public static double avg(double s1, double s2, double s3, double s4){
        return (s1+s2+s3+s4)/4;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Here's #8 -> Method");
        System.out.println("Enter the number of people to say Hello!");
        int numnerOfPeople = scan.nextInt();

        for(int a=0; a<numnerOfPeople; a++){
            sayWelcome();
        }

        // Scanner scanB = new Scanner(System.in);
        System.out.println("Here's #9 -> Method");
        System.out.println("Enter 4 numbers to calculate the avg");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        double s3 = scan.nextDouble();
        double s4 = scan.nextDouble();

        double Avg = avg(s1, s2, s3, s4);
        System.out.println(Avg);


    }


}
