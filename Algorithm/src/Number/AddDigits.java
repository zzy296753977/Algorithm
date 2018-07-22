package Number;
//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
public class AddDigits {
	 public int addDigits(int num) {
	        if(num/10==0)
	            return num;
	        else
	        {
	            int sum = 0;
	            //num>=10是防止10的倍数出现
	            while(num%10!=0||num>=10)
	            {
	                sum+=num%10; 
	                num=num/10;
	            }
	           return addDigits(sum);
	        }
	    }
}
