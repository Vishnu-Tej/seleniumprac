package basics;

public class Comparisonoperators {

	public static void main(String[] args) {
		int a = 100; int b= 150; int c =210; int d =400; 
	//Eg 1::
		if(a>b){
			System.out.println("a is big");
		}
		else{
			System.out.println("b is big");
		}
		//Eg 2::
		
		boolean x = true;
		if(x){
			System.out.println("passed");
		}
		else{
			System.out.println("failed");
		}
		
		//Eg 3::
		
		boolean y= false;
		if(y){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		
		//Eg 4::
		if(a>b||b>a)
		{
			System.out.println("A or B is big");
		}
		//Eg 5::
		
		if(a>b && a>c){
			System.out.println("A is biggest number");
		}
		else if(b>c){
			System.out.println("B is biggest number");
		}
		else{
			System.out.println("C is biggest number");
		}
		
		//Eg 6::
		//int a = 100; int b= 150; int c =210; int d =400;
		if (a>b && a>c && a>d){
			System.out.println("A is big");
		}
		else if (b>c && b>d){
			System.out.println("B is big");
		}
		else if (c>d){
			System.out.println("C is big");
		}
		else {
			System.out.println("D is big");
		}
	}

}

