package List;

import java.util.ArrayList;
import java.util.List;

//Given a non-negative index k where k ¡Ü 33, return the kth index row of the Pascal's triangle.
public class PascalsTriangleII {
	//O(k)space
	public List<Integer> getRow(int rowIndex) {
		List<Integer> preList = new ArrayList<Integer>();
		preList.add(1);
		for (int i = 1; i < rowIndex + 1; i++) {
			List<Integer> currentList = new ArrayList<Integer>();
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					currentList.add(1);
				} else {
					currentList.add(preList.get(j - 1) + preList.get(j));
				}
			}
			preList = currentList;
		}
		return preList;
	}
}
