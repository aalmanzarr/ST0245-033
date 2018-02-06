
/**
 * Write a description of class PUNTO1 here.
 * 
 * @author Andres Almanzar 
 * @version 1.0
 */
public class PUNTO1{
    public static void hanoi (int n, String A, String B, String C) {
	if (n == 1) {
	    System.out.println(A + " a " + C);
	}else {
	    hanoi(n - 1, A, C, B);
	    System.out.println(A + " a " + C);
	    hanoi(n - 1, B, A, C);

	}
    }
}