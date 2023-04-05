

import java.util.ArrayList;
import java.util.List;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		String website = "This is testing website";
		char letter = 'A';
		double dec = 5.99;
		boolean myCard = true;
		
		
		System.out.println(a);
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard);		
		System.out.println(a+ " this is a integer value.");		
		System.out.println("This is a example.");
		System.out.println("This is "+a+" integer value.");
		
//		Array		
		int[] arr = new int [10];
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		arr [3] = 4;
		arr [4] = 5;
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
//		print array one by one
		System.out.println(arr2[4]);
		
//		Print array with loop
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(i);
		}
		
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.println(i);
		}
		
		for (int x: arr)
		{
			System.out.println(x);
		}
		
//		array in string
		
		String[] name = {"John", "Joe", "Smith"};
		
		for (int i = 0; i< name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		
//		run loop with string
		
		for (String s: name)
		{
			System.out.println(s);
		}
		
//		print value multiple of two in array
		
		for (int y = 0; y< arr2.length; y++)
		{
			if(arr2[y] % 2 == 0)
			{
			System.out.println(arr2[y]+ "is the multiple of 2.");
			break;
			}
			else 
			{
				System.out.println(arr2[y]+ "The values are not multiple of 2.");
			}
		
		}
		
//		create object of the class - boject.method
		ArrayList<String> z =  new ArrayList();
		z.add("Smith");
		z.add("Goerge");
		z.add("Joe");
		z.add("John");
		z.get(2);
		System.out.println(z.get(2));
		
//		get data into the object array
		
		for (int i =0; i< z.size(); i++)
		{
			System.out.println(z.get(i));
		}
		System.out.println("***********");
		
		for (String val :z)
		{
			System.out.println(val);
		}
		
//		item is present in ArrayList
		
		System.out.println( z.contains("John"));
		
		int[] arr21 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
//		List<int[]> nameArrayList = Arrays.asList(arr21);
		System.out.println("John");
		
//		 string is an object. // String literal
		
		String s = "This is test String";
		String s1 = "This is test String";
		String s4 = "Hello World";
		
		
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
//		Split Array
		
		String ss = "Hello World";
		String[] splittedString = ss.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);		

		System.out.println(splittedString[1].trim());
		
//		Print array character wise
		
//		for (int x = ss.length()-1; x< ss.length(); x--)
//		{
//			break;
//			System.out.println( ss.charAt(1));
//			break;
//		}
		
	}
}
