package BinaryTree;

/**
 * ����Ķ������Ƕ���������������������������<��<��
 * 
 * @author Administrator
 *
 */
public class BinaryTree {
	public Node root = null;

	// ����ֻ�и��ڵ�Ķ�����
	public BinaryTree(int value) {
		root = new Node(value);
		root.leftChild = null;
		root.rightChild = null;
	}

	// ����
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

	// ����
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

	// ��������ݹ����
	public void inOrderTraverse() {
		System.out.print("�������:");
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

	// ǰ�����
	public void preOrderTraverse() {
		System.out.print("ǰ�����:");
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

	// �������
	public void postOrderTraverse() {
		System.out.print("���������");
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

	// �õ���Сֵ
	public int getMinValue() {
		Node currentNode = root;
		while (currentNode.leftChild != null) {
			currentNode = currentNode.leftChild;
		}
		return currentNode.value;
	}

	// �õ����ֵ
	public int getMaxValue() {
		Node currentNode = root;
		while (currentNode.rightChild != null) {
			currentNode = currentNode.rightChild;
		}
		return currentNode.value;
	}

	// ɾ��
	public boolean delete(int value) {
		//��Ҫɾ���Ľڵ�
		Node currentNode = root;
		//��Ҫɾ���Ľڵ�ĸ��ڵ�
		Node parentNode=null;
		//�ж���Ҫɾ���Ľڵ��Ƿ�Ϊ���ڵ��������
		boolean isLeft = true;
		//ɾ����Ϊ���������ɾ��Ҷ�ӽڵ㣬ɾ���Ľڵ�ֻ�����ӽڵ����ֻ�����ӽڵ㣬ɾ���Ľڵ��������ڵ�
		//Ѱ�ҽڵ��ϵ�ͽڵ�ľ���λ�ã��Ӷ��ж�ɾ��������
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
		//ɾ���Ľڵ㲻����
		if(currentNode==null)return false;
		
		//1.ɾ������Ҷ�ӽڵ�
		if(currentNode.leftChild==null&&currentNode.rightChild==null)
		{
			if(currentNode==root)root=null;
			else {
				//�ýڵ��Ǹ��ڵ�����ӽڵ�
				if(isLeft)
				{
					parentNode.leftChild=null;
				}
				//�ýڵ��Ǹ��ڵ�����ӽڵ�
				else {
					parentNode.rightChild=null;
				}
			}
		}
		//2.��Ҫɾ���Ľڵ���һ�����ӽڵ�
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
		//2.��Ҫɾ���Ľڵ���һ�����ӽڵ�
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
		//3.��Ҫɾ���Ľڵ������ӽڵ㶼�ڣ���ʱû��ʵ��
		currentNode=null;
		return true;
	}
	/*
	 * public void inOrderByStack() {} //��������ǵݹ����
	 * public void preOrderByStack() {} //ǰ������ǵݹ����
	 * public void postOrderByStack() {} //��������ǵݹ����
	 */
}
