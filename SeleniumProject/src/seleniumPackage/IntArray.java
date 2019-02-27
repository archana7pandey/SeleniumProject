package seleniumPackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class IntArray {

	
	@Test
	public void ReverseArray()
	{
		//basic///
		int[] a1={7,8,9};
		int[] a2=a1;
		System.out.println(a2[2]);//9
		String [][] newstr={{"aa","bb","cc"},{"AA1","BB1","CC1"}};
		System.out.println((newstr[0][1]));
		//end basic///
		
		
		String[] str={"1","2","3","4","5"};
		System.out.println("Array values before"+Arrays.toString(str));
		List<String> lstStr=Arrays.asList(str);
		Collections.reverse(lstStr);
		
	    String[] Revstr =lstStr.toArray(str);
	    
	    System.out.println("Array values before"+Arrays.toString(Revstr));
	}
	
	
	
}
