package BigInteger;
//ʵ������λ�������������
public class Add {
	public String function(String A,String B)
	{
		String result="";
		int lenA = A.length();
		int lenB = B.length();
		//����λ��
		if(lenA>lenB)
		{
			for(int i=0;i<lenA-lenB;i++)
			{
				B="0"+B;
			}
		}
		else {
			for(int i=0;i<lenB-lenA;i++)
			{
				A="0"+A;
			}
		}
		lenA = A.length();
		//�ӵ�λ����λ��ӣ�����Ǹ�λ���ұ��ǵ�λ
		int isCarryBit = 0;//��λ
		int isOverFlow = 0;//���λ�Ƿ����
		int sumTemp = 0;//ÿһλ�����ʱ�洢ֵ
		for(int i=lenA-1;i>=0;i--)
		{
			sumTemp = (A.charAt(i)-'0')+(B.charAt(i)-'0')+isCarryBit;
			isCarryBit=0;
			//�н�λ
			if(sumTemp>9)
			{
				//���λ�н�λ���������
				if(i==0)
				{
					isOverFlow=1;
				}
				//��ͨλ�н�λ
				else
				{
					isCarryBit=1;
				}
				result = (sumTemp-10)+result;
			}
			else 
			{
				result=sumTemp+result;
			}
		}
		if(isOverFlow==1)
		{
			result=isOverFlow+result;
		}
		return result;
	}
}
