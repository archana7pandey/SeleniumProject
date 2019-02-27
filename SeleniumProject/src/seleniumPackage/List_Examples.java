package seleniumPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<String>();
		
		//list.add(0, "aa"); or
		list.add( "aa");
		list.add( "bb");
		list.add( "cc");
		//add new item in first of list
		
		list.add(0,"aa1");
		
		// add new item in the midddle of the list
		
		list.add(1,"bb1");
		System.out.println(" list before removal of items : " );
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" index is " +i);
		}
		
		// delete first and middle item from the list
		
		list.remove(0);
		list.remove(2);
		
		System.out.println("list after removal of items :");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" index is " +i);
		}
		System.out.println("             " );
		System.out.println(" *******DUPLICATE CHECKING********  " );
		System.out.println("             " );
		DuplicatesItems();
		System.out.println("             " );
		System.out.println(" *******COMPARE TWO LISTS********  " );
		System.out.println("             " );
		CompareList();
		
		System.out.println("             " );
		System.out.println(" *******CHECKING THE CHARACTERS OF String********  " );
		System.out.println("             " );
		CharOfString();
		
		System.out.println("             " );
		System.out.println(" *******ADD TWO LIST AND UPDATE VALUE OF LIST ITEM********  " );
		System.out.println("             " );
	
		
		AddList();
		

		System.out.println("             " );
		System.out.println(" *******REVERSE THE ITEMS OF LIST********  " );
		System.out.println("             " );
		
		ReverseList();
	}

	public static void DuplicatesItems()
	{
    List<String> list1=new ArrayList<String>();
		
		
		list1.add( "aa");
		list1.add( "bb");
		list1.add( "aa");
		list1.add( "cc");
		
		for(int i=0;i<list1.size();i++)
		{
			
			int count=Collections.frequency(list1,list1.get(i));
			
	     	//System.out.println(count);
	     	
	     	if(count>=2)
	     	{
	     		System.out.println(list1.get(i)+"--> is Duplicate");
	     	}
	     	else
	     	{
	     		System.out.println(list1.get(i)+"--> is not Duplicate");
	     	}
	     	
		}
		
		
	}
	
	
	public static void CompareList()
	{
		 List<String> list2=new ArrayList<String>();
			
			
			list2.add( "aa");
			list2.add( "bb");
			list2.add( "dd");
			list2.add( "cc");
			
		 List<String> list3=new ArrayList<String>();
			
			
			list3.add( "ee");
			list3.add( "ff");
			list3.add( "gg");
			list3.add( "cc");
			
			for(int i=0;i<list2.size();i++)
			{
				boolean result =list2.contains(list3.get(i));
				System.out.println(result);
				if(!result)
				{
					System.out.println("Two List are not equal");
					break;
				}
			}
			
	}

	
	
	public static void CharOfString()
	{
		String str="Selenium";
		char actual =str.charAt(0);
		char expected='S';
		if(actual==expected)
		{
			System.out.println("First Character is S");
		}
		
		else
		{
			System.out.println("First Character is not S");
		}
		
		boolean resul=str.startsWith("S");
		if(resul)
		{
		System.out.println("First Character is S");
		}
		
		boolean resul2=str.endsWith("m");
		if(resul2)
		{
		System.out.println("Last Character is m");
		}
		
		boolean resul3=str.contains("e");
		if(resul3)
		{
		System.out.println("String having Character is e");
		}
		
	}

	public static void AddList()
	{
		 List<String> list4=new ArrayList<String>();
			
			
		 list4.add( "aa");
		 list4.add( "bb");
		 list4.add( "dd");
		 list4.add( "cc");
			
		 list4.set(0, "archana"); //modify list item value
		 
		 
		 List<String> list5=new ArrayList<String>();
			
			
		 list5.add( "ee");
		 list5.add( "ff");
		 list5.add( "gg");
		 list5.add( "cc");
		 
		 list4.addAll(list5);
		 for(int i=0;i<list4.size();i++)
			{
			
		     		System.out.println(list4.get(i));
		     	
			}
			
	}
	
	public static void ReverseList()
	{
		
		 List<String> list6=new ArrayList<String>();
			
			
		 list6.add( "ee");
		 list6.add( "ff");
		 list6.add( "gg");
		 list6.add( "cc");
		 
		 for(int i=list6.size()-1;i>=0;i--)
			{
			
		     		System.out.println(list6.get(i));
		     	
			}
		 
		 
	}

}
