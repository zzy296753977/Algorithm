package Array;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		/**
		 * posָ����Ϊ��ָ�룬i���б������飬�ѷ������ҳ�����ֵ����Ϊi�ܵñ�pos�죬���Բ����ȸ���δ�ҵ�ֵ
		 * ������֮��pos���յ��ж�Զ���ͻ�ʣ���ٸ���0��λ��
		 */
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0)
				nums[pos++] = nums[i];
		}
		for (; pos < nums.length; pos++) {
			nums[pos] = 0;
		}
	}
}
