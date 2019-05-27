/******************************************************************************
FibonacciSequence by Jonathan Houston (05.27.2019)
Purpose:
    This program 's intent is to print a fibonacci sequence from 0 to n.
Object Parameters:
    n: the amount of numbers in the sequence 
    f0: The first number in the sequence
    f1: the second number in the sequence
Results:
    Print to standard out the sequence 
Returns:
    none
Notes:
    This program will use longs as variables, and will malfunction when numbers 
    grow to be bigger than 8 bytes (19 places).
    The console will be used to set N, f0, and F1;
    **************************************************************************/

/*
(05/27/2019 @ 11:19pm (UTC))
TO-DO's:
    - Set the minumum and maximum amount for the sequence
    - Implement measure to stop the sequence before malfunctioning 
        (postive->negative sequence, vice versa)
    - Implement measure to check user input, and explain with output errors
    - Implement UI 
*/
package FibonacciSequence;
import java.util.Scanner;

class FibonacciSequence {
    long f0;
    long f1;
    int n;
    
    Scanner scan = new Scanner(System.in);
    
    public FibonacciSequence(){
        this.f0 = 0;
        this.f1 = 0;
        this.n = 0;
    }
    
    public void getN() {
        
        System.out.print("n: ");
        n = scan.nextInt();
        System.out.println("\n Sequence will be " + n + " long. \n");
    }
    
    void getF0() {
        System.out.print("f0: ");
        f0 = scan.nextLong();
        System.out.println("\n First number of the Sequence will be " 
                + f0 + " .\n");
    }

    void getF1() {
        System.out.print("f0: ");
        f1 = scan.nextLong();
        System.out.println("\n Second number of the Sequence will be " 
                + f1 + " .\n");
    }

    void getSequence() {
        int i;
        long number;
        System.out.println("Your fibonacci sequence: ");
        System.out.print(f0 + "\n");
        System.out.print(f1 + "\n");
        
        for(i = 0; i <= n; i++)
        {
            number = f0 + f1;
            f0 = f1;
            f1 = number;
            System.out.print(number + "\n");
        }
    }
}
