package Array;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		/**
		 * pos指针作为总指针，i先行遍历数组，把非零数找出来赋值，因为i跑得比pos快，所以不会先覆盖未找的值
		 * 遍历完之后，pos离终点有多远，就还剩多少个填0的位置
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
