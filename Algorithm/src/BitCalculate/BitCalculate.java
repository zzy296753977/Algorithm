package BitCalculate;
//дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
public class BitCalculate 
{
	//�ǵݹ�ķ���
	 public int Add1(int num1,int num2) 
	 {
		 int sum,carry;
		 while(num2!=0)
		 {
			 //��÷ǽ�λ��ֵ
			 sum = num1^num2;
			 //��ý�λ��ֵ
			 carry=(num1&num2)<<1;
			 num1 = sum;
			 num2 = carry;
		 }
		 return num1;
	 }
	 //�ݹ�ķ���
	 public int Add2(int num1,int num2)
	 {
		 //�ݹ��������
		 if(num2==0)
		 {
			 return num1;
		 }
		 //��÷ǽ�λ��ֵ
		 int sum = num1^num2;
		 //��ý�λ��ֵ
		 int carry=(num1&num2)<<1;
		 return(Add2(sum,carry));
	 }
}
