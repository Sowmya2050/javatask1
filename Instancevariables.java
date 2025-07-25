package javatask1;
// Check the default values of uninitialized instance variables. 

public class Instancevariables {
		// TODO Auto-generated method stub
		
		    int i;
		    boolean b;
		    char c;
		    
		    public static void main(String[] args) {
		       Instancevariables obj = new Instancevariables();
		        System.out.println("int: " + obj.i);      // 0
		        System.out.println("boolean: " + obj.b);   // false
		        System.out.println("char: '" + obj.c + "'"); // '\u0000'
		    }
		}
