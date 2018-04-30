package Application;

import Array.RemoveElement;

public class Application {
	public static void main(String [] args)
	{	
		
		int [] arr = {0,0,1,1,1,2,2,3,4};
		RemoveElement test = new RemoveElement();
		for(int i=0;i<test.removeElement(arr, 1)-3;i++)System.out.println(arr[i]);
	}

}
