package Company;

import java.util.Arrays;
import java.util.Scanner;

public class Tecent {
	/**
	 * �ٶ�һ�ֱ���ı��뷶Χ��a ~ y��25����ĸ����1λ��4λ�ı��룬������ǰѸñ��밴�ֵ��������γ�һ���������£� a, aa, aaa,
	 * aaaa, aaab, aaac, �� ��, b, ba, baa, baaa, baab, baac �� ��, yyyw, yyyx, yyyy
	 * ����a��IndexΪ0��aa��IndexΪ1��aaa��IndexΪ2���Դ����ơ� ��дһ������������������һ�����룬�����������Ӧ��Index.
	 */
	public void function1() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int len = input.length();
		int diff = 4 - len;
		int index = 0;
		if (diff > 0) {
			for (int i = 0; i < diff; i++)
				input = input + "y";
			len = input.length();
			index = -25;
		}

		for (int i = 1; i <= len; i++) {
			for (int j = 1; j <= i; j++) {
				index = (int) (index + (input.charAt(j - 1) - 'a')
						* (Math.pow(25, i - j)));
			}
			index = index + 1;// �߽�
			// System.out.println("len"+i+":"+index);
		}

		// ȥ��a�����
		index = index - 1;
		System.out.println(index);
	}

	/**
	 * ����һ������������д��������ж��ٶ������ĺ͵���������������������������������ֵС��1000�� �磬����Ϊ10,
	 * ����Ӧ��������Ϊ2�����������������ĺ�Ϊ10,�ֱ�Ϊ(5,5),(3,7)��
	 */
	public void function2() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		boolean[] flag = new boolean[n];
		for (int i = 0; i < n; i++)
			flag[i] = true;
		// ��Ȧ������2��ʼ����С��n��i����ȫ������
		for (int i = 2; i * i < n; i++) {
			if (flag[i]) {
				for (int j = i; i * j < n; j++) {
					flag[i * j] = false;
				}
			}
		}
		for (int i = 2; i <= n / 2; i++) {
			for (int j = 2; j < n; j++) {
				if (flag[i] && flag[j] && i + j == n) {
					// System.out.println(i+","+j);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	/**
	 * geohash���룺geohash�����ڽ���ά�ľ�γ��ת��Ϊ�ַ�������Ϊ��������һ���Ǿ�γ�ȵĶ����Ʊ��룬�ڶ�����base32ת�롣
	 * ���⿼��γ�ȵĶ����Ʊ��룺�㷨��γ��[-90,
	 * 90]ͨ�����ַ��������ޱƽ���ȡ�������辫�ȣ����⾫��Ϊ6����ע�⣬������ж��ַ��ƽ�������ֻ��������ȡ�������ж���
	 * ����Զ����м�ֵ���������䡣�㷨�������£� ���γ��Ϊ80���ж����Ʊ�����̣� 1) ����[-90, 90]���ж���Ϊ[-90, 0),[0,
	 * 90]����Ϊ�������䣬����ȷ��80Ϊ�����䣬���Ϊ1�� 2) �����һ����������[0, 90]���ж���Ϊ[0, 45),[45,
	 * 90]������ȷ��80�������䣬���Ϊ1�� 3) ���[45, 90]���ж���Ϊ[45, 67),[67,90],����ȷ��80Ϊ�����䣬���Ϊ1��
	 * 4) ���[67,90]���ж���Ϊ[67, 78),[78,90]������ȷ��80Ϊ�����䣬���Ϊ1�� 5) ���[78, 90]���ж���Ϊ[78,
	 * 84),[84, 90]������ȷ��80Ϊ�����䣬���Ϊ0�� 6) ���[78, 84)���ж���Ϊ[78, 81), [81,
	 * 84)������ȷ��80Ϊ�����䣬���Ϊ0��
	 */
	public void function3() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String result = "";
		int left = -90;
		int right = 90;
		for (int i = 0; i < 6; i++) {
			int mid = (left + right) / 2;
			if (n >= left && n < mid) {
				result = result + "0";
				right = mid;
			}
			if (n >= mid && n < right) {
				result = result + "1";
				left = mid;
			}
		}
		System.out.println(result);
	}

	/**
	 * ��Ϸ�����кܶ��ʽ����������������һ���������ֻ����һ�Σ���������һ����1024��������ID��Χ[1,1024]������32��unsigned
	 * int��������¼��1024�������Ƿ��Ѿ���ɡ���ʼ״̬����δ��ɡ�
	 * ����������������������ID����Ҫ���õ�һ��ID������Ϊ�Ѿ���ɣ������ڶ���ID�������Ƿ��Ѿ���ɡ�
	 * ���һ������������ڶ���ID�������Ѿ�������1�����δ������0�������һ��ڶ���ID����[1,1024]��Χ�������-1��
	 */
	public void function4() {
		Scanner scanner = new Scanner(System.in);
		int setId = scanner.nextInt();
		int getId = scanner.nextInt();
		if (setId > 1024 || setId < 1 || getId > 1024 || getId < 1) {
			System.out.println(-1);
			return;
		}
		int[] tasks = new int[32];
		for (int i = 0; i < 32; i++) {
			tasks[i] = 0;
		}
		int setStart = 0, setOffset = 0;
		int getStart = 0, getOffset = 0;
		setOffset = setId % 32;
		setStart = setId / 32 - 1;
		getOffset = getId % 32;
		getStart = getId / 32 - 1;
		tasks[setStart] = (int) Math.pow(2, setOffset);
		if (tasks[getStart] == Math.pow(2, getOffset)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

	/**
	 * СQ������һ�����г�Ϊ��ת����: ��������n��m, ����n�ܱ�2m����������һ������������������1, 2, 3, 4...,
	 * ÿ��m�����ŷ�תһ��, �������Ϊ'-';�� ����n = 8, m = 2, ���о���: -1, -2, +3, +4, -5, -6, +7,
	 * +8. ��n = 4, m = 1, ���о���: -1, +2, -3, + 4. СQ����ϣ�����ܰ�������ǰn���Ϊ���١�
	 */
	public void function5() {
		// Ҫ����n���ֺܴ�int�Ų��µ�����
		Scanner scanner = new Scanner(System.in);
		Long n = scanner.nextLong();
		Long m = scanner.nextLong();
		System.out.println((m * n) / 2);

	}

	/**
	 * ţţ������������һ��ֽ����Ϸ�������Ϸһ����n��ֽ��, ��i��ֽ����д������ai�� ţţ��������������, ţţ�ȳ�,
	 * ÿ�γ������ǿ��Դ�ֽ�ƶ�������ѡ��һ�ų��, ֱ��ֽ�Ʊ����ꡣ ���ǵĵ÷ֵ������ǳ鵽��ֽ�������ܺ͡� ���ڼ���ţţ�����򶼲������Ų���,
	 * ����������Ϸ������ţţ�÷ּ�ȥ����÷ֵ��ڶ��١� ����������С� ��һ�а���һ��������n(1 <= n <= 105),��ʾֽ�Ƶ�������
	 * �ڶ��а���n��������ai(1 <= ai <= 109),��ʾÿ��ֽ���ϵ����֡�
	 */
	public void function6() {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String value = scanner.nextLine();
		String[] values = value.split("\\s+");
		int[] arrays = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			arrays[i] = Integer.parseInt(values[i]);
		}
		Arrays.sort(arrays);
		int sum = 0;
		for (int i = arrays.length - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				sum = sum + arrays[i];
			} else {
				sum = sum - arrays[i];
			}
		}
		System.out.println(Math.abs(sum));
	}

	/**
	 * СQ�ĸ�ĸҪ����N�죬��֮ǰ��СQ������M���ɿ�����СQ����ÿ��Ե��ɿ�������������ǰһ��Ե�һ�룬�������ֲ����ڸ�ĸ����֮ǰ��ĳһ��û���ɿ�����
	 * ����������һ������ܳԶ��ٿ��ɿ���
	 */
	public void function7() {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = 1;
		}
		M = M - array.length;
		int current = 0;
		while (M > 0) {
			current++;
			array[0]++;
			M--;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1] * 0.5) {
					array[i]++;
					M--;
				} else {
					break;
				}
			}
		}
		if (M == 0) {
			System.out.println(array[0]);
		} else {
			System.out.println(array[0] - 1);
		}
	}
	
	
}
