package basic;

public class Finallyconcept {

	public static int getMarks(String name){
		if(name.equals("tom")){
			try{
				int i=9/0;
			}
			catch(ArithmeticException e){
				return 90;
			}
			finally{
				return 80;
			}
		}
		else if (name.equals("peter")){
			return 88;
		}
		else{
			System.out.println("name is not found");
			return -1;
			}
	}
	public static void main(String[] args) {
		
		System.out.println(getMarks("tom"));
		

	}

}
