package Application;

import BinaryTree.BinaryTree;



public class Application {
	public static void main(String [] args)
	{	
		//ð���������	sort.BubbleSort(a);
		//�����������	sort.QuickSort(a, 0, a.length-1);
		BinaryTree test = new BinaryTree(10);
		test.insert(4);
		test.insert(6);
		test.insert(9);
		test.insert(1);
		test.delete(6);
		test.preOrderTraverse();
		test.inOrderTraverse();
		test.postOrderTraverse();
		System.out.println(test.getMinValue());
	}

}
