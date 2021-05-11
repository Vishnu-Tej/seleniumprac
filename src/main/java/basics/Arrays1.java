package basics;

public class Arrays1 {

	public static void main(String[] args) {
		
		String s [] = new String[4];
		s[0]= "India";
		s[1]= "America";
		s[2] = "Australia";
		s[3] = "Newzeland";
		
		for(int i =0;i<s.length;i++){
		if(s[i].equals("India")){
			System.out.println(s[i] + " NewDelhi is the capital");
		}
		else if(s[i].equals("America")){
			System.out.println(s[i] + " Washinghton is the capital");
		}else if (s[i].equals("Australia")){
			System.out.println(s[i] + " sydney is the capital");
		}else if(s[i].equals("Newzeland")){
			System.out.println(s[i] + " Wellington is the capital");
		}
		else{
			System.out.println(s[i] + " country capital is not defined");
		}
		}
		
	}

}
