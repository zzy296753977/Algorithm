package Application;

import BinaryTree.BinaryTree;



public class Application {
	public static void main(String [] args)
	{	
		//Ã°ÅİÅÅĞò²âÊÔ	sort.BubbleSort(a);
		//¿ìËÙÅÅĞò²âÊÔ	sort.QuickSort(a, 0, a.length-1);
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
