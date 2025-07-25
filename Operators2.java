package javatask1;

public class Operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        
		        // Post-increment
		        int a = 5;
		        System.out.println("a = " + a);
		        System.out.println("a++ = " + (a++));  // Prints 5
		        System.out.println("a after a++ = " + a);  // Prints 6
		        System.out.println();
		        
		        // Pre-increment
		        int b = 5;
		        System.out.println("b = " + b);
		        System.out.println("++b = " + (++b));  // Prints 6
		        System.out.println("b after ++b = " + b);  // Prints 6
		        System.out.println();
		        
		        // In expressions
		        int x = 3;
		        int y = 3;
		        System.out.println("x++ * 2 = " + (x++ * 2));  // 6, x becomes 4
		        System.out.println("++y * 2 = " + (++y * 2));  // 8, y becomes 4
		    }
		}

