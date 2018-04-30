package Array;

public class FindInDoubleDimensionalArray 
{
	 //����һ������ÿһ�У���ÿһ���ö����������Ӷ�n^2logn
	 public boolean Find(int target, int [][] array) 
	 {
		 //����ÿһ��
		 for(int i=0;i<array.length;i++)
		 {
			 //��ÿһ�н��ж�������
			 int left = 0;
			 int right = array[0].length-1;
			 int middle;
			 while(left<=right)
			 {
				 middle=(left+right)/2;
				 if(array[i][middle]==target)
				 {
					 return true;
				 }
				 else if(array[i][middle]<target)
				 {
					 left=middle+1;
				 }
				 else {
					right = middle-1;
				}
			 }
		 }
		 return false;   
	 }
	 //�������������½ǿ�ʼ���������������һ����С�����������һ��
	 //��ͼ����֪��Ϊʲôֻ�����ƺ����ƶ�������������
	 public boolean Find2(int target, int [][] array) 
	 {
		int i = array.length-1;
		int j=0;
		while(i>=0&&j<array[0].length)
		{
			if(target==array[i][j])
			{
				return true;
			}
			else if(target<array[i][j])
			{
				i--;
				continue;
			}
			else {
				j++;
				continue;
			}
		}
		return false; 
	 }
}
