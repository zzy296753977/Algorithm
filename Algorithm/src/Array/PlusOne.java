package Array;
//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
public class PlusOne {
	 public int[] plusOne(int[] digits) 
	 {
		  boolean carry = false;
			 digits[digits.length-1]++;
			 for(int i=digits.length-1;i>=0;i--)
			 {
				 if(digits[i]<=9)
				 {
					 return digits;
				 }
				 if(i!=0&&digits[i]>9)
	             {
	                 digits[i]=0;
	                 digits[i-1]++;
	             }
					 
				 if(i==0&&digits[i]>9)
				 {
					 carry=true;
					 digits[i]=0;
				 }
			 }
			 //Òç³ö
			 if(carry==true)
			 {
				 int [] result = new int [digits.length+1];
				 result[0]=1;
				 for(int i=1;i<digits.length+1;i++)
					 result[i]=digits[i-1];
				 return result;
			 }
			 return digits;
	 }
}
