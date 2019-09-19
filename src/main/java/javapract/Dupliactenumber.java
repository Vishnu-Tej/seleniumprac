package javapract;

public class Dupliactenumber {

	public static void main(String[] args) {
		int a[] = {1,2,3,3,5,9};
		for(int i=0;i<a.length;i++){
			for(int j=1+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
			}
		}

	}

}
