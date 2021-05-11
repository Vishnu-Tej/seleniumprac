package basic;

public class Strings {

	public static void main(String[] args) {

		final int a = 110;
		final int b;
		b=11;
		System.out.println(b+a);
		
		System.out.println("899,pdtr");
		
		int a1 =10;int b1= a1++;
		System.out.println(a1);//11
		System.out.println(b1);//10
		
	    int a3 =100;int b3 =++a3;
		System.out.println(a3);//101
		System.out.println(b3);//101
		
		int a2=99;int b2=a2--;
		System.out.println(a2);//98
		System.out.println(b2);//99
		
		int a4=50;int b4= --a4;
		System.out.println(a4);
		System.out.println(b4);
		
		char c ='a';
		System.out.println(++c);//b here it increments value of"a" to "b"
		
		// it gives error as can't convert boolean to integer
		 boolean bo = true;
		//System.out.println(++bo);
	}

	
}

