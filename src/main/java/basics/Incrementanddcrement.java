package basics;

public class Incrementanddcrement {

	public static void main(String[] args) {
		int i=1;
		int j= i++;
		System.out.println(i);//2
		System.out.println(j);//1
		int i1=2;
		int i2=++i1;
		System.out.println(i1);//3
		System.out.println(i2);//3
		
		int x = 5;
		int y= x--;
		System.out.println(x);//4
		System.out.println(y);//5
		
		int x1 = -3;
		int y1 = --x1;
		System.out.println(x1);//-4
		System.out.println(y1);//-4
	}

}
