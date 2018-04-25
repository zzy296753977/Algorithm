package BinaryTree;

/**
 * 这里的二叉树是二叉搜索树（二叉排序树）即左<中<右
 * 
 * @author Administrator
 *
 */
public class BinaryTree {
	public Node root = null;

	// 生成只有根节点的二叉树
	public BinaryTree(int value) {
		root = new Node(value);
		root.leftChild = null;
		root.rightChild = null;
	}

	// 查找
	public Node findKey(int value) {
		Node currentNode = root;
		while (currentNode != null) {
			if (currentNode.value == value) {
				return currentNode;
			} else if (currentNode.value < value) {
				currentNode = currentNode.leftChild;
			} else {
				currentNode = currentNode.rightChild;
			}
		}
		return null;
	}

	// 插入
	public String insert(int value) {
		if (root == null) {
			root = new Node(value);
			root.leftChild = null;
			root.rightChild = null;
		} else {
			Node currentNode = root;
			Node parentNode = null;
			while (true) {
				if (value < currentNode.value) {
					parentNode = currentNode;
					currentNode = currentNode.leftChild;
					if (currentNode == null) {
						parentNode.leftChild = new Node(value);
						break;
					}
				} else if (value > currentNode.value) {
					parentNode = currentNode;
					currentNode = currentNode.rightChild;
					if (currentNode == null) {
						parentNode.rightChild = new Node(value);
						break;
					}
				} else {
					return "having same value in binary tree";
				}

			}
		}
		return null;
	}

	// 中序遍历递归操作
	public void inOrderTraverse() {
		System.out.print("中序遍历:");
		inOrderTraverse(root);
		System.out.println();
	}

	private void inOrderTraverse(Node node) {
		if (node == null)
			return;
		inOrderTraverse(node.leftChild);
		node.display();
		inOrderTraverse(node.rightChild);

	}

	// 前序遍历
	public void preOrderTraverse() {
		System.out.print("前序遍历:");
		preOrderTraverse(root);
		System.out.println();
	}

	private void preOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		node.display();
		preOrderTraverse(node.leftChild);
		preOrderTraverse(node.rightChild);
	}

	// 后序遍历
	public void postOrderTraverse() {
		System.out.print("后序遍历：");
		postOrderTraverse(root);
		System.out.println();
	}

	private void postOrderTraverse(Node node) {
		if (node == null) {
			return;
		}
		postOrderTraverse(node.leftChild);
		postOrderTraverse(node.rightChild);
		node.display();
	}

	// 得到最小值
	public int getMinValue() {
		Node currentNode = root;
		while (currentNode.leftChild != null) {
			currentNode = currentNode.leftChild;
		}
		return currentNode.value;
	}

	// 得到最大值
	public int getMaxValue() {
		Node currentNode = root;
		while (currentNode.rightChild != null) {
			currentNode = currentNode.rightChild;
		}
		return currentNode.value;
	}

	// 删除
	public boolean delete(int value) {
		//需要删除的节点
		Node currentNode = root;
		//需要删除的节点的父节点
		Node parentNode=null;
		//判断需要删除的节点是否为父节点的左子树
		boolean isLeft = true;
		//删除分为三种情况：删除叶子节点，删除的节点只有左子节点或者只有右子节点，删除的节点有两个节点
		//寻找节点关系和节点的具体位置，从而判断删除的类型
		while(true)
		{
			if(value==currentNode.value)
			{
				break;
			}
			if(value<currentNode.value)
			{
				parentNode=currentNode;
				currentNode=currentNode.leftChild;
			}
			else {
				isLeft=false;
				parentNode=currentNode;
				currentNode=currentNode.rightChild;
			}
		}
		//删除的节点不存在
		if(currentNode==null)return false;
		
		//1.删除的是叶子节点
		if(currentNode.leftChild==null&&currentNode.rightChild==null)
		{
			if(currentNode==root)root=null;
			else {
				//该节点是父节点的左子节点
				if(isLeft)
				{
					parentNode.leftChild=null;
				}
				//该节点是父节点的右子节点
				else {
					parentNode.rightChild=null;
				}
			}
		}
		//2.需要删除的节点有一个左子节点
		else if(currentNode.rightChild==null)
		{
			if(currentNode==root)
			{
				root=root.leftChild;
			}
			else {
				if(isLeft)
				{
					parentNode.leftChild=currentNode.leftChild;
				}
				else{
					parentNode.rightChild=currentNode.leftChild;
				}
				
			}
		}
		//2.需要删除的节点有一个右子节点
		else if(currentNode.leftChild==null)
		{
			if(currentNode==root)
			{
				root=root.rightChild;
			}
			else{
				if(isLeft)
				{
					parentNode.leftChild=currentNode.rightChild;
				}
				else{
					parentNode.rightChild=currentNode.rightChild;
				}
			}
		}
		//3.需要删除的节点左右子节点都在，暂时没有实现
		currentNode=null;
		return true;
	}
	/*
	 * public void inOrderByStack() {} //中序遍历非递归操作
	 * public void preOrderByStack() {} //前序遍历非递归操作
	 * public void postOrderByStack() {} //后序遍历非递归操作
	 */
}
