package ShortCircuitSolution;
//��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
public class ShortCircuitEvaluate 
{
	 public int Sum_Solution(int n) {
	        
		 	int temp=n;
		 	//�����������ǰ��false��ִ�к��������������ݹ����
		 	boolean s=(temp!=0)&&((temp+=Sum_Solution(n-1))!=0);
	        return (temp);
	    }
}
