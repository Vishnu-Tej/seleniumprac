package javapract;

public class DecreaseNumberBy1 {
public static int num;
	public static void main(String[] args) {
		decreaseNumberbyone(3);
	}	
	public static int decreaseNumberbyone(int num){
		if (num>=0){
			decreaseNumberbyone(num-1);
		}
		System.out.println("Number:" + num);
		return num;
	}
	
}
