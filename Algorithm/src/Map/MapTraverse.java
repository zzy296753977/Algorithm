package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * TreeMap HashMap遍历方法
 * @author Administrator
 *
 */
public class MapTraverse {
	public void TreeMapTraverse() {
		// TreeMap 自动排序
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		// 输入key value
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int key = input.nextInt();
			int value = input.nextInt();
			// 去重
			if (map.containsKey(key)) {
				map.put(key, value + map.get(key));
			} else {
				map.put(key, value);
			}
		}

		// 遍历map中的键
		for (Integer key : map.keySet()) {

			System.out.println("Key = " + key);

		}

		// 遍历map中的值
		for (Integer value : map.values()) {

			System.out.println("Value = " + value);

		}
		
		//遍历map中的key和value
				for(Map.Entry<Integer, Integer> set : map.entrySet())
				{
					System.out.println(set.getKey()+" "+set.getValue());
				}
	}

	public void HashMapTraverse() {
		// HashMap 排列顺序不固定
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// 输入key value
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int key = input.nextInt();
			int value = input.nextInt();
			// 去重
			if (map.containsKey(key)) {
				map.put(key, value + map.get(key));
			} else {
				map.put(key, value);
			}
		}
		//遍历map中的键
		for (Integer key : map.keySet()) {

			System.out.println("Key = " + key);

		}
		

		// 遍历map中的值
		for (Integer value : map.values()) {

			System.out.println("Value = " + value);

		}
		
		//遍历map中的key和value
		for(Map.Entry<Integer, Integer> set : map.entrySet())
		{
			System.out.println(set.getKey()+" "+set.getValue());
		}

	}

}
