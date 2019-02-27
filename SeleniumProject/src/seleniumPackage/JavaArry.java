package seleniumPackage;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] typesOfInsurance = {"Life Insurance", "Car Insurance", "Health Insurance"}; 
		
		System.out.println("array before reverse: " + Arrays.toString(typesOfInsurance) );

		List<String> listOfProducts = Arrays.asList(typesOfInsurance); 
		Collections.reverse(listOfProducts);
		String[] reversed = listOfProducts.toArray(typesOfInsurance); 
		System.out.println("array after reverse: " + Arrays.toString(reversed) );

		/*int [] aa=new int [2];
		
		aa[0]=1;
		aa[1]=2;
		
		String [] ss=new String[3];
		ss[0]="s";*/
		
				
	}

}
