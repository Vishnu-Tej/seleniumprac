package basic;

public class Datatype {

	public static void main(String[] args) {
		int a1 = 10;
	        a1=20;
	        
	        byte b1 =11;
	        byte age = b1;
	        System.out.println(age +a1);
	        
	        float f1 = 12.12f;
	        System.out.println(f1);
	        
	        double d1 = 1211.12;
	        System.out.println(d1);
	        
	        char c1 = 'v';
	        boolean b = true;
	        System.out.println(c1);
	        System.out.println(b);
	        
	        String s1 = "vishnu";
	        String s2 = "1000";
	        String s3 = "123.12";
	//String s4 = true;---> can,t store boolean into a string
	        
	        int foodbill = 1000;
	        int mocktail = 250;
	        int total = foodbill +  mocktail;
	        System.out.println("total bill is " + total);
	        
// In below o/p we have to use brackets after string concatenation	        
	        System.out.println("total bill is " + foodbill + mocktail);
	// correct way of concatenation 
	        System.out.println("total bill is " + (foodbill + mocktail));

	}

}
