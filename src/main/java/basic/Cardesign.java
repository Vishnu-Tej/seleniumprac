package basic;

public class Cardesign {
	String name;
	int price;
	static int wheels=4;
	String color;
	
	public static void main(String[] args) {
		
		Cardesign c1 = new Cardesign();
		c1.name = "bmw";
		c1.color = "blue";
		c1.price = 4000000;
		
		Cardesign c2 = new Cardesign();
		c2.name = "honda";
		c2.color = "black";
		c2.price = 1500000;
		
		Cardesign c3 = new Cardesign();
		c3.name = "audi";
		c3.color = "white";
		c3.price = 5000000;
		
		System.out.println(c1.name+ " " + c1.color+" "+c1.price+" "+ wheels);


	}

}
