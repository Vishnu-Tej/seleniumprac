package basic;

public class StingsManipulation {

	public static void main(String[] args) {
		
		String s1 = "This is my java code and am so happy";
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.indexOf("s", 4));
		System.out.println(s1.indexOf("s", s1.indexOf('s')+1));
		System.out.println(s1.indexOf("m", s1.indexOf('s')+1));
		//System.out.println(s1.lastIndexOf("s", ));
		
	}

}
