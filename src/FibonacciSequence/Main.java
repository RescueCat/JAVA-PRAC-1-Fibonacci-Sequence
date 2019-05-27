/*
 * Main entry to the program
 */
package FibonacciSequence;

/**
 *
 * @author Jonathan Houston
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FibonacciSequence fs = new FibonacciSequence();
        
        System.out.print("Please set 'n', the length of the sequence, 'f0', "
                + "the first number in the sequence, and 'f1', the second"
                + " number in the sequence. \n");
        
        fs.getN();
        fs.getF0();
        fs.getF1();
        fs.getSequence();
        
    }
    
}
