import java.util.Scanner;

public class Scanner_next {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        /*
        Scanner doesn't read whole sentence - difference between 
        next() and nextLine() of scanner class
        */
        String s = scan.next();
        s += scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/*
Input:
42
3.1415
Welcome to HackerRank's Java tutorials!

Expected Output:
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42
*/
