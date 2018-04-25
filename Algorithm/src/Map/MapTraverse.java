package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * TreeMap HashMap��������
 * @author Administrator
 *
 */
public class MapTraverse {
	public void TreeMapTraverse() {
		// TreeMap �Զ�����
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		// ����key value
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int key = input.nextInt();
			int value = input.nextInt();
			// ȥ��
			if (map.containsKey(key)) {
				map.put(key, value + map.get(key));
			} else {
				map.put(key, value);
			}
		}

		// ����map�еļ�
		for (Integer key : map.keySet()) {

			System.out.println("Key = " + key);

		}

		// ����map�е�ֵ
		for (Integer value : map.values()) {

			System.out.println("Value = " + value);

		}
		
		//����map�е�key��value
				for(Map.Entry<Integer, Integer> set : map.entrySet())
				{
					System.out.println(set.getKey()+" "+set.getValue());
				}
	}

	public void HashMapTraverse() {
		// HashMap ����˳�򲻹̶�
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// ����key value
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int key = input.nextInt();
			int value = input.nextInt();
			// ȥ��
			if (map.containsKey(key)) {
				map.put(key, value + map.get(key));
			} else {
				map.put(key, value);
			}
		}
		//����map�еļ�
		for (Integer key : map.keySet()) {

			System.out.println("Key = " + key);

		}
		

		// ����map�е�ֵ
		for (Integer value : map.values()) {

			System.out.println("Value = " + value);

		}
		
		//����map�е�key��value
		for(Map.Entry<Integer, Integer> set : map.entrySet())
		{
			System.out.println(set.getKey()+" "+set.getValue());
		}

	}

}
