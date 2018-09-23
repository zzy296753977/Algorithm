package Company;

import java.util.Arrays;
import java.util.Scanner;

public class Tecent {
	/**
	 * 假定一种编码的编码范围是a ~ y的25个字母，从1位到4位的编码，如果我们把该编码按字典序排序，形成一个数组如下： a, aa, aaa,
	 * aaaa, aaab, aaac, … …, b, ba, baa, baaa, baab, baac … …, yyyw, yyyx, yyyy
	 * 其中a的Index为0，aa的Index为1，aaa的Index为2，以此类推。 编写一个函数，输入是任意一个编码，输出这个编码对应的Index.
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
			index = index + 1;// 边界
			// System.out.println("len"+i+":"+index);
		}

		// 去掉a的情况
		index = index - 1;
		System.out.println(index);
	}

	/**
	 * 给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。输入值小于1000。 如，输入为10,
	 * 程序应该输出结果为2。（共有两对质数的和为10,分别为(5,5),(3,7)）
	 */
	public void function2() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		boolean[] flag = new boolean[n];
		for (int i = 0; i < n; i++)
			flag[i] = true;
		// 画圈法，从2开始，将小于n的i倍数全部划掉
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
	 * geohash编码：geohash常用于将二维的经纬度转换为字符串，分为两步：第一步是经纬度的二进制编码，第二步是base32转码。
	 * 此题考察纬度的二进制编码：算法对纬度[-90,
	 * 90]通过二分法进行无限逼近（取决于所需精度，本题精度为6）。注意，本题进行二分法逼近过程中只采用向下取整来进行二分
	 * ，针对二分中间值属于右区间。算法举例如下： 针对纬度为80进行二进制编码过程： 1) 区间[-90, 90]进行二分为[-90, 0),[0,
	 * 90]，成为左右区间，可以确定80为右区间，标记为1； 2) 针对上一步的右区间[0, 90]进行二分为[0, 45),[45,
	 * 90]，可以确定80是右区间，标记为1； 3) 针对[45, 90]进行二分为[45, 67),[67,90],可以确定80为右区间，标记为1；
	 * 4) 针对[67,90]进行二分为[67, 78),[78,90]，可以确定80为右区间，标记为1； 5) 针对[78, 90]进行二分为[78,
	 * 84),[84, 90]，可以确定80为左区间，标记为0； 6) 针对[78, 84)进行二分为[78, 81), [81,
	 * 84)，可以确定80为左区间，标记为0；
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
	 * 游戏里面有很多各式各样的任务，其中有一种任务玩家只能做一次，这类任务一共有1024个，任务ID范围[1,1024]。请用32个unsigned
	 * int类型来记录着1024个任务是否已经完成。初始状态都是未完成。
	 * 输入两个参数，都是任务ID，需要设置第一个ID的任务为已经完成；并检查第二个ID的任务是否已经完成。
	 * 输出一个参数，如果第二个ID的任务已经完成输出1，如果未完成输出0。如果第一或第二个ID不在[1,1024]范围，则输出-1。
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
	 * 小Q定义了一种数列称为翻转数列: 给定整数n和m, 满足n能被2m整除。对于一串连续递增整数数列1, 2, 3, 4...,
	 * 每隔m个符号翻转一次, 最初符号为'-';。 例如n = 8, m = 2, 数列就是: -1, -2, +3, +4, -5, -6, +7,
	 * +8. 而n = 4, m = 1, 数列就是: -1, +2, -3, + 4. 小Q现在希望你能帮他算算前n项和为多少。
	 */
	public void function5() {
		// 要考虑n数字很大int撑不下的问题
		Scanner scanner = new Scanner(System.in);
		Long n = scanner.nextLong();
		Long m = scanner.nextLong();
		System.out.println((m * n) / 2);

	}

	/**
	 * 牛牛和羊羊正在玩一个纸牌游戏。这个游戏一共有n张纸牌, 第i张纸牌上写着数字ai。 牛牛和羊羊轮流抽牌, 牛牛先抽,
	 * 每次抽牌他们可以从纸牌堆中任意选择一张抽出, 直到纸牌被抽完。 他们的得分等于他们抽到的纸牌数字总和。 现在假设牛牛和羊羊都采用最优策略,
	 * 请你计算出游戏结束后牛牛得分减去羊羊得分等于多少。 输入包括两行。 第一行包括一个正整数n(1 <= n <= 105),表示纸牌的数量。
	 * 第二行包括n个正整数ai(1 <= ai <= 109),表示每张纸牌上的数字。
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
	 * 小Q的父母要出差N天，走之前给小Q留下了M块巧克力。小Q决定每天吃的巧克力数量不少于前一天吃的一半，但是他又不想在父母回来之前的某一天没有巧克力吃
	 * ，请问他第一天最多能吃多少块巧克力
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
