package basics;

public class Loops {

	public static void main(String[] args) {
	// while Loop:
		
//whenever we use while loop, 1st initialize the variable from where to start.
//2nd create a while keyword & inside it write condition part.
// 3rd  write logic which is needed.
// last is incremental part.
//inside while we have given condition.it works like if condition.
	//eg:1
		int i =0;
		while(i<=5){
			System.out.println(i);
			i++;
		}
		//System.out.println(i);
		
		
        // For Loop:
//In for loop all three parts initialization,condition and increment will be written in a single line
		//eg:2
		for (int j = 5;j<=10;j++){
		System.out.println(j);
	}
		//eg:3
		for (int x =10;x<=20;x=x+2){
			System.out.println(x);
		}
		
		//eg:4
		for(int y=0;y<20;y++){
			if(y%5==0){
				System.out.println("Hello good morning");
			}
			System.out.println(y);
		}
		
		
	}

}
