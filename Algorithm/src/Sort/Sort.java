package Sort;

public class Sort {
	/**
	 * ð������
	 * 
	 * @param ����ǰ����a
	 */
	public void BubbleSort(int[] a) {
		int n = a.length; // ��ȡ����a�ĳ���
		for (int i = 0; i < n - 1; i++) // ��ѭ�������ĸ���Ϊ�Ƚ���
		{
			for (int j = i + 1; j < n; j++) // ��ѭ��������Щ�Ǳ��Ƚ���
			{
				if (a[i] > a[j]) // ������ķ�ʽ���������Ƚ�ֵ
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

	/**
	 * ��������
	 * 
	 * @param ����ǰ����a
	 * @param ������������߽�left
	 * @param �����������ұ߽�right
	 */
	public void QuickSort(int[] a, int left, int right) {
		int i = left, j = right, key = a[left], temp = 0;
		while (i < j) {
			while (i < j && a[j] >= key)
				j--; // j�Ӻ���ǰ�������ҵ�һ����keyС��ֵ,����,��jָ��keyֵ���ڵ�λ��
			if (i < j) // ��j--ִ�����֮��,i���õ���j��ʱ����Ҫ���ж���Ľ�������ִ��
			{
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
			while (i < j && a[i] <= key)
				i++; // i��ǰ���������ҵ�һ����key���ֵ,����,��iָ��keyֵ���ڵ�λ��
			if (i < j) // ��i++ִ�����֮��,i���õ���j��ʱ����Ҫ���ж���Ľ�������ִ��
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j--;
			}
		} // left,i,right�������ж���Ϊ�˵�����ֻʣ��һ��Ԫ�ص�ʱ�����������ݹ���
		if (left < i)
			QuickSort(a, left, i - 1); // ����ѭ��֮��i��j���
		if (i < right)
			QuickSort(a, i + 1, right); // ���еݹ�
	}

	/**
	 * ������
	 * 
	 * @param num
	 */
	// ��ʼ���ѣ����Ǹ���ȫ�������������һ����Ҷ�ӽڵ㿪ʼ�����ɶѣ���֤�����ɸѡ�㷨��ȷ��
	private int[] buildMaxHeap(int[] array) {
		// ���¶��Ϲ��죨�����һ����Ҷ�ӽڵ㿪ʼ�����ɶѣ�
		for (int i = (array.length - 1) / 2 - 1; i >= 0; i--) {
			adjustDownToUp(array, i, array.length);
		}
		return array;
	}

	// ��Ԫ��array[k]���������𽥵������νṹ,k����Ϊ���ڵ㡢2k+1Ϊ���ӣ�2k+2Ϊ�Һ���
	// k���������ǰ��մ�����ź����
	private void adjustDownToUp(int[] array, int k, int length) {
		int temp = array[k];
		// �ӵ�k���ڵ�����ӽڵ㿪ʼ
		for (int i = 2 * k + 1; i < length - 1; i = 2 * i + 1) {
			// �������С���Һ��ӣ���ǰ�������Һ���
			if (array[i] < array[i + 1]) {
				i++;
			}
			// ������ڵ�����������ӽڵ��е����ֵ�����ڳ�ʼ�ѵ���Ϊ������ˣ��������µ����������ϴ������������û��Ҫ����ѭ����ȥ��
			if (temp >= array[i]) {
				break;
			} else {
				array[k] = array[i];
				k = i;// �޸Ĺؼ���ָ��
			}
		}
		array[k] = temp;
	}

	public int[] heapSort(int[] arr) {
		// ÿ��������ֻ�и�Ԫ�ز����������С�ѵ����ʣ�������ɸѡ�㷨�Ӹ�Ԫ�ؿ�ʼ��������С���ѵ���ʽ
		arr = buildMaxHeap(arr);
		// �����������ʹ�����ѣ�����ǽ�����ʹ����С�ѣ�ÿ�γ�һ��������С�ѣ��ͽ��������ĵ�һ��Ԫ�غ����һ��Ԫ�ػ�λ��
		for (int i = arr.length - 1; i > 1; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			adjustDownToUp(arr, 0, i);
		}
		return arr;
	}

	/**
	 * ��ֵ���� ���������㷨���ֵݹ��˼�������棬����N-1��������ɡ���ʼʱ��ֻ���������±�0����Ԫ�أ�ֻ��һ��Ԫ�أ���Ȼ������ġ� Ȼ���һ��
	 * ���±� 1 ����Ԫ�ؽ������򣬱�֤����[0,1]�ϵ�Ԫ������ �ڶ��� ���±� 2 ����Ԫ�ؽ������򣬱�֤����[0,2]�ϵ�Ԫ������
	 * ��N-1�˶��±� N-1 ����Ԫ�ؽ������򣬱�֤����[0,N-1]�ϵ�Ԫ������Ҳ�����������������ˡ� ���ĵݹ�˼��������ڣ�����λ�� i
	 * ����Ԫ�ؽ�������ʱ��[0,i-1]�ϵ�Ԫ��һ�����Ѿ��������
	 */
	public void insertSort(int[] array) {
		int temp;
		for (int p = 1; p < array.length; p++) {
			int j = p;
			temp = array[p];
			for (; j > 0 && temp < array[j - 1]; j--) {
				// ����Ԫ��
				array[j] = array[j - 1];
			}
			array[j] = temp;
		}
	}

	/**
	 * �鲢����
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
