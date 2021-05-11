package basics;

public class Methods {
	public String getCountryCapital(String Countryname){
		//System.out.println("country capital");
		if(Countryname.equals("india")){
			//System.out.println("Newdelhi");
			return "Newdelhi";
		}
		return null;
	}
	public boolean isUscitizen(String nameofperson){
		System.out.println("is us Citizen ");
		if(nameofperson.equals("vishnu")){
			return false;
		}
		else if (nameofperson.equals("arina")){
			return true;
		}
		return false;
	}
	public static int sum(int a ,int b){
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		
		Methods m = new Methods();
		String s1 = m.getCountryCapital("germany");
		System.out.println(s1);

		System.out.println(m.isUscitizen("aarina"));
		
		//m.sum(10, 21);//here Static method is called using object of the class,so it is giving an warning.
		
	}

}
