package Sort;

public class Sort {
	/**
	 * 冒泡排序
	 * 
	 * @param 排序前数组a
	 */
	public void BubbleSort(int[] a) {
		int n = a.length; // 获取数组a的长度
		for (int i = 0; i < n - 1; i++) // 外循环控制哪个作为比较者
		{
			for (int j = i + 1; j < n; j++) // 内循环控制哪些是被比较者
			{
				if (a[i] > a[j]) // 以升序的方式交换两个比较值
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

	/**
	 * 快速排序
	 * 
	 * @param 排序前数组a
	 * @param 待排序数组左边界left
	 * @param 待排序数组右边界right
	 */
	public void QuickSort(int[] a, int left, int right) {
		int i = left, j = right, key = a[left], temp = 0;
		while (i < j) {
			while (i < j && a[j] >= key)
				j--; // j从后向前遍历，找到一个比key小的值,交换,则j指向key值所在的位置
			if (i < j) // 当j--执行完毕之后,i正好等于j的时候不需要进行额外的交换代码执行
			{
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
			while (i < j && a[i] <= key)
				i++; // i从前向后遍历，找到一个比key大的值,交换,则i指向key值所在得位置
			if (i < j) // 当i++执行完毕之后,i正好等于j的时候不需要进行额外的交换代码执行
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
			}
		} // left,i,right的条件判断是为了当分组只剩下一个元素的时候就无须继续递归了
		if (left < i)
			QuickSort(a, left, i - 1); // 跳出循环之后i和j相等
		if (i < right)
			QuickSort(a, i + 1, right); // 进行递归
	}

	/**
	 * 堆排序
	 * 
	 * @param num
	 */
	// 初始化堆，堆是个完全二叉树。从最后一个非叶子节点开始调整成堆，保证后面的筛选算法正确性
	private int[] buildMaxHeap(int[] array) {
		// 自下而上构造（从最后一个非叶子节点开始调整成堆）
		for (int i = (array.length - 1) / 2 - 1; i >= 0; i--) {
			adjustDownToUp(array, i, array.length);
		}
		return array;
	}

	// 将元素array[k]自下向上逐渐调整树形结构,k假如为父节点、2k+1为左孩子，2k+2为右孩子
	// k的子树都是按照大根堆排好序的
	private void adjustDownToUp(int[] array, int k, int length) {
		int temp = array[k];
		// 从第k个节点的左子节点开始
		for (int i = 2 * k + 1; i < length - 1; i = 2 * i + 1) {
			// 如果左孩子小于右孩子，则当前最大的是右孩子
			if (array[i] < array[i + 1]) {
				i++;
			}
			// 如果父节点大于两个孩子节点中的最大值，由于初始堆调整为大根堆了，在它以下的子树都符合大根堆特征，就没必要继续循环下去了
			if (temp >= array[i]) {
				break;
			} else {
				array[k] = array[i];
				k = i;// 修改关键字指针
			}
		}
		array[k] = temp;
	}

	public int[] heapSort(int[] arr) {
		// 每次无序区只有根元素不符合最大最小堆的性质，所以用筛选算法从根元素开始调整成最小最大堆的形式
		arr = buildMaxHeap(arr);
		// 如果是升序则使用最大堆，如果是降序则使用最小堆，每形成一次最大或最小堆，就将无序区的第一个元素和最后一个元素换位置
		for (int i = arr.length - 1; i > 1; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			adjustDownToUp(arr, 0, i);
		}
		return arr;
	}

	/**
	 * 插值排序 插入排序算法有种递归的思想在里面，它由N-1趟排序组成。初始时，只考虑数组下标0处的元素，只有一个元素，显然是有序的。 然后第一趟
	 * 对下标 1 处的元素进行排序，保证数组[0,1]上的元素有序； 第二趟 对下标 2 处的元素进行排序，保证数组[0,2]上的元素有序；
	 * 第N-1趟对下标 N-1 处的元素进行排序，保证数组[0,N-1]上的元素有序，也就是整个数组有序了。 它的递归思想就体现在：当对位置 i
	 * 处的元素进行排序时，[0,i-1]上的元素一定是已经有序的了
	 */
	public void insertSort(int[] array) {
		int temp;
		for (int p = 1; p < array.length; p++) {
			int j = p;
			temp = array[p];
			for (; j > 0 && temp < array[j - 1]; j--) {
				// 后移元素
				array[j] = array[j - 1];
			}
			array[j] = temp;
		}
	}

	/**
	 * 归并排序
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	public void mergeSort(int[] array, int low, int high) {
		int mid = (high + low) / 2;
		if (low < high) {
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			merge(array, low, mid, high);
		}
	}

	private void merge(int[] array, int low, int mid, int high) {
		// int mid = (high+low)/2;
		int i = low;
		int j = mid + 1;
		int k = 0;
		int[] temp = new int[high - low + 1];
		while (i <= mid && j <= high) {
			if (array[i] < array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = array[i++];
		}
		while (j <= high) {
			temp[k++] = array[j++];
		}
		for (int x = 0; x < temp.length; x++) {
			array[x + low] = temp[x];
		}
	}
}
