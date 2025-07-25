package javatask1;

public class Operators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        
		        // Bitwise shift operators
		        int x = 8;
		        System.out.println("x = " + x);
		        System.out.println("x >> 1 = " + (x >> 1));  // 4
		        System.out.println("x << 1 = " + (x << 1));  // 16
		        System.out.println();
		        
		        // Logical vs Bitwise AND
		        boolean b1 = true, b2 = false;
		        System.out.println("b1 = " + b1 + ", b2 = " + b2);
		        System.out.println("b1 & b2 = " + (b1 & b2));   // false (bitwise)
		        System.out.println("b1 && b2 = " + (b1 && b2)); // false (logical)
		        System.out.println();
		        
		        // Logical vs Bitwise OR
		        boolean b3 = true, b4 = false;
		        System.out.println("b3 = " + b3 + ", b4 = " + b4);
		        System.out.println("b3 | b4 = " + (b3 | b4));   // true (bitwise)
		        System.out.println("b3 || b4 = " + (b3 || b4)); // true (logical)
		  
	}

}
