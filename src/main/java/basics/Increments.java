package basics;

public class Increments {

	public static void main(String[] args) {
		int a=1;
		int b = ++a; //Pre-increment
		System.out.println(a);//2
		System.out.println(b);//2
		
		int c=2;
		int d = c++;//post increment
		System.out.println(c);//3
		System.out.println(d);//2
		
		int e = -2;
		int f = e--; //post-decrement 
		System.out.println(e);//-3
		System.out.println(f);//-2
		
		int g = -3;
		int h = --g; //pre-decrement
		System.out.println(g);//-4
		System.out.println(h);//-4
		
	}

}
