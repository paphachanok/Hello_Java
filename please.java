// import scanner
import java.util.Scanner;

public class please {
    public static void main(String[] args){
        // days to seconds
        System.out.println("Here's #1");
        System.out.println("Calculate days to seconds");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        System.out.println(day);

        int h = day*24;  // wtf why "hour" is not resolved as variablr???
        int m = h*60;
        int s = m*60;
        System.out.println(s);

        // calculate factorial
        System.out.println("Here's #2");
        System.out.println("Give 1 number to Calculate factorial");
        // Scanner nums = new Scanner(System.in);
        int num = scan.nextInt();
        int fact = 1;

        while(num>0)
        {
            fact*=num;  //! don't have to declare "int fact =" again
            num--;
        }
        System.out.println(fact);

        // remaining loan after 3 months
        System.out.println("Here's #3");
        System.out.println("Calculate remaining loan after 3 months");
        // Scanner scanner = new Scanner(System.in);
        int amount = scan.nextInt();

        for( int month=1; month<=3; month++ ){
            amount = (amount*90)/100;  //! we pay him back 10% so, the remaining is 90%
        }
        System.out.println(amount);

        // Create an array and get The sum of the multiple of 4
        System.out.println("Here's #4");
        System.out.println("Calculate the sum that is the multiple of 4");
        System.out.println("Create an array's length (how many number of elements in an array)");
        // Scanner scanA = new Scanner(System.in);
        int length_A = scan.nextInt(); 
        int[] array = new int[length_A]; //! create array's length (how many number of elements)
        System.out.println("Give the elements");
        for( int i=0; i<length_A; i++){
            array[i] = scan.nextInt(); //! fill the array with elements
        } 
        //! Above this line is to create the length of the array then fullfill it with that number of elements

        System.out.println("To make sure that the array is working");
        System.out.println(array[2]);

        int sum=0;
        for( int z=0; z<array.length; z++ ){
            if(array[z]%4 == 0){  //! Use "==", dont use "="
                sum = sum+array[z];
            }
        }
        System.out.println(sum);


        // Create an array and calculate the area of the square
        System.out.println("Here's #5");
        System.out.println("How many square do you want to calculate the area?");
        // Scanner scanB = new Scanner(System.in);
        int length_B = scan.nextInt();
        int[] side_len = new int[length_B];
        System.out.println("What's the length of those squares?");
        for(int j=0; j<side_len.length; j++){
            side_len[j] = scan.nextInt();
        } 

        System.out.println("Here's the results");
        for(int t: side_len){  //! using enhanced for loop, you can save a lot of time and variables
            System.out.println(t*t);
        }



        // output every element in multidimentional array
        System.out.println("Here's #6");
        System.out.println("Output every element in multidimentional array");
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
       
        for(int c=0; c<matrix.length; c++){
            for(int d=0; d<3; d++){
                System.out.println(matrix[c][d]);
            }
        }

        // Reverse a string
        System.out.println("Here's #7 (String)");
        System.out.println("Reverse a text");
        Scanner scanC = new Scanner(System.in);
        String text = scanC.nextLine();
        char[] arr = text.toCharArray();

        int e = arr.length-1;
        for(int f=e; f>=0; f--){
            System.out.print(arr[f]);
        }
    }
}
