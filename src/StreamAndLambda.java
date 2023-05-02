import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class StreamAndLambda {
	
	
	
	// Count the number of names starting with Alphabet A
	@Test
	public void regular()
	{
		ArrayList<String> names= new ArrayList<String>();
		names.add("Abhijit");
		names.add("Aman");
		names.add("karam");
		names.add("Ram");
		names.add("Abhay");
		int count = 0;
		
		for(int i =0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
				
			}
		}
		System.out.println(count);

	}

}
