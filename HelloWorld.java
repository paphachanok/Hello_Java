
public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello world!");

        //  Prefix & Postfix
        int a=12;
            ++a;
        System.out.println(a);

        int y=87;
            y++;
        System.out.println(y);  // ?wtf why this not working????

        // String concatenation
        String firstname, lastname;
        firstname = "Paphachanok";
        lastname = "Poti";
        System.out.println("My name is " + firstname + " " + lastname);
        
        // else if
        int age = 25;
        int money = 200;
        if (age <= 0){
            System.out.println("Error");
        } else if(age <= 16){
            System.out.println("Too young");
        } else{
            System.out.println("You're pass!");
        }
        
        // logical operator
        if (age > 18 && money > 500){
            System.out.println("Welcome!");
        } else{
            System.out.println("No");
        }
        if (age > 18 || money > 500){
            System.out.println("Welcome!");
        }

        // Switch statement
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Sunday");  //? there is no indentation but, it's still working
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Wednesday");
        }

        // Switch statement with multiple comma
        // ! You can't declare the same variable in Java
        String daytype = switch(day) {
            case 1, 2, 3, 4, 5 -> "Working day";  //! notice the " -> " after the case
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(daytype);

        // While loop
        System.out.println("While loop goes here");
        int x = 6;
        while(x <10)
        {
            System.out.println(x);
            x++;
        }
        
        // For loop
        System.out.println("For loop goes here");
        for( x=1; x<=5; x++){  //* for (initial; condition; increment/decrement)
            System.out.println(x);
        }

        // for loop with even number
        System.out.println("for loop with even num");
        for( x=0; x<10; x+=2){
            System.out.println(x);
        }

        // do...while loop
        System.out.println("do..while goes here");
        x =1;
        do {
            System.out.println(x);
            x++;
        } while(x<0);

        // break & continue
        System.out.println("Testing break");
        x = 1;
        while(x>0){
            System.out.println(x);
            if(x==4){  
                break;  //! break when the condition is true
            }
            x++;
        }

        System.out.println("Testing continue"); //! continue used to "skip" and continue testing the condition
        for (x=10; x<=40; x+=10){
            if(x==30){
                continue;
            }
            System.out.println(x);
        }

        // Array
        System.out.println("Here's array");
        String[] letters = {"a", "b", "c", "d"}; //* letter[] also work but this way is better
        System.out.println(letters[2]);

        System.out.println(".length property");
        int[] arr = new int[5];
        System.out.println(arr.length);

        // calculate the sum of the array using for loop
        System.out.println("calculate the sum of the array using for loop");
        int[] myArr = {6, 9, 23, 78, 87};
        int sum = 0;
        for( int z=0; z<myArr.length; z++){  //! z < myArr, as the last element's index is "myArr.length - 1"
            sum = sum+myArr[z];
        }
        System.out.println(sum);

        // Enhanced for loop --> go through every elements in the array
        System.out.println("Enhanced for loop");
        int[] prime_num = {2,3,5,7,11};
        for(int t: prime_num){
            System.out.println(t);
        }

        // Multidimentional array
        System.out.println("Multidimentional array");
        int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} }; //* there are 2 []
        int k = sample[1][0];  //! the second set of array, with the first element
        System.out.println(k);
        

    }
}