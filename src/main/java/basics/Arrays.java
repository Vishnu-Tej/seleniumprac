package basics;

public class Arrays {
	 
		
	public static void main(String[] args) {
		int i[] = new int[3];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		System.out.println(i.length);
		//System.out.println(i[3]);
		for (int k=0;k<i.length;k++){
			System.out.println(i[k]);
		}
		
		double d[]= new double[2];
		d[0]=12.26;
		d[1]=100;
		System.out.println(d[1]);
		
		
		String [] ar = new String [3];
		ar[0]="vishnu";
		ar[1]="tej";
		ar[2]="automation";
		for(int x=0;x<ar.length;x++){
			System.out.println(ar.length);
			if(ar[x].equals("vishnu")){
				System.out.println("Love urself"+ar[x]);
			}
			else{
				System.out.println("I too love"+ar[x]);
			}
		}

	}


}
