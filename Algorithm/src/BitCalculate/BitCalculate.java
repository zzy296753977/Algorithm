package BitCalculate;
//写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
public class BitCalculate 
{
	//非递归的方法
	 public int Add1(int num1,int num2) 
	 {
		 int sum,carry;
		 while(num2!=0)
		 {
			 //获得非进位的值
			 sum = num1^num2;
			 //获得进位的值
			 carry=(num1&num2)<<1;
			 num1 = sum;
			 num2 = carry;
		 }
		 return num1;
	 }
	 //递归的方法
	 public int Add2(int num1,int num2)
	 {
		 //递归结束条件
		 if(num2==0)
		 {
			 return num1;
		 }
		 //获得非进位的值
		 int sum = num1^num2;
		 //获得进位的值
		 int carry=(num1&num2)<<1;
		 return(Add2(sum,carry));
	 }
}
