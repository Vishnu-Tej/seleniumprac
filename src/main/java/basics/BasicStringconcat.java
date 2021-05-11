package basics;

public class BasicStringconcat {

	public static void main(String[] args) {
		// String can concatenate with any data type.
		// if we pass the variable then it prints the value of it.
		// we can also pass the value directly.
		//we can make concatenation.
//we can cast low to high,but not high to low.i.e;we can store byte in integer;but integer can't be stored in byte.
		
		//eg 1.
		System.out.println("hello good morning");// direct value
		int i =10;
		System.out.println(i);//prints value of i
		
		String name = "vishnu";
		System.out.println("Good morning "+ name);// Concatenation
		
		
	// eg 2.
		
		int tiffinbill = 250;
		int lunchbill = 300;
		int totalbill = tiffinbill+lunchbill;
		System.out.println(totalbill);//prints 550
System.out.println("totalbill is "+tiffinbill+lunchbill);//output is 250300.if we keep brackets then it will prints its value.
	// eg.3
      int a = 100;int b= 200;
      String s1 = "hi";
      String s2 = "goodmorning";
      System.out.println(s1+s2);//higoodmorning
      System.out.println(a+b+s1+s2);//300higoodmorning
      System.out.println(s1+s2+a+b);//higoodmorning100200
      System.out.println("the value of a is "+a);
      
    // eg.4
      byte b1 = (byte) 100; byte b2= 75;
      byte diff = (byte)(b1-b2);
      System.out.println(b1-b2);
   System.out.println(diff); // as range of byte exceed,we have to type cast.then it wont show error.
   
   int i1 = b1-b2;// as it is integer it wont give error.bcoz integer is higher than byte.so we can store byte into Integer.
   //but we can't store integer value into byte.
   System.out.println(i1);
   
   //eg.5
   long l1 = 1000;long l2 = 500;
   long l3= l1-l2;
   System.out.println(l3);
   
   char c1 = 'v';
   char c2 = 't';
   System.out.println(c1+c2);
   char c3 = 0;
   char c4 =1;
   System.out.println(c3+c4);
   
   
   
   
      
      
		
		
	}

}
