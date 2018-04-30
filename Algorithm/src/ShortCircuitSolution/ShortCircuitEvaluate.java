package ShortCircuitSolution;
//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
public class ShortCircuitEvaluate 
{
	 public int Sum_Solution(int n) {
	        
		 	int temp=n;
		 	//利用与操作符前面false不执行后面语句的特征，递归求解
		 	boolean s=(temp!=0)&&((temp+=Sum_Solution(n-1))!=0);
	        return (temp);
	    }
}
