package model;

public class ScoreTree {

	private NodeScore root;
	
	public void add(int key) {
		if (root == null) {
			root = new NodeScore(key);
		} else {
			root.insert(key);
		}
	}

	// El activador del metodo recursivo
	public void triggerInorder() {
		inorder(root);
	}

	// Recursivo
	public void inorder(NodeScore node) {
		// Caso base
		if (node == null) {
			return;
		}
		// Recursivo

		inorder(node.getLeft());
		System.out.println(node.getKey());
		inorder(node.getRight());
	}

	public NodeScore triggerSearch(int key) {
		return search(root, key);
	}

	// Recursivo
	public NodeScore search(NodeScore node, int key) {
		// Caso base
		if (node == null) {
			return null;
		}

		if (key == node.getKey()) {
			return node;
			
		}
		// Procedimiento recursivo
		if (key< node.getKey()) {
			return search(node.getLeft(), key);
		} else {
			return search(node.getRight(), key);
		}

	}

	
	public void triggerMaxLevel() {
		int level = getMaxLevel(root, 1);
		System.out.println(level);
	}

	public int getMaxLevel(NodeScore node, int level) {

		if (node == null) {
			return level-1;
		} else {

			int A = getMaxLevel(node.getLeft(), level + 1);
			int B = getMaxLevel(node.getRight(), level + 1);

			return Math.max(A, B);
		}

	}
	
	public NodeScore getMin(NodeScore current){
		if (current.getLeft() == null) {
			return current;
		} else {
			return getMin(current.getLeft());
		}
	}
	
	public NodeScore getMax(NodeScore current) {
		if (current.getRight() == null) {
			return current;
		}else {
			return getMax(current.getRight());
		}
	}
	
	public void triggerDelete(int key) {
		if (root != null){
			root = delete(root, key);
		}
	}
	
	public NodeScore delete(NodeScore current, int key){
		
		if (current.getKey() == key){
			if (current.getLeft() == null && 
					current.getRight() == null){
				return null;
			} else if (current.getLeft() != null && current.getRight() != null) {
				
				NodeScore succesor = getMin(current.getRight());
				NodeScore newRightTree = delete(current.getRight(), succesor.getKey());
				
				succesor.setLeft(current.getLeft());
				succesor.setRight(newRightTree);

				return succesor;
			} else if (current.getLeft() != null) {
				return current.getLeft();
			} else {
				return current.getRight();
			}
			
		} else if (key < current.getKey() ){
			NodeScore newLeftTree = delete(current.getLeft(), key);
			current.setLeft(newLeftTree);
		} else {
			NodeScore newRightTree = delete(current.getRight(), key);
			current.setRight(newRightTree);
		}
		
		return current;
	}

	public NodeScore getRoot() {
		return root;
	}

	public void setRoot(NodeScore root) {
		this.root = root;
	}

	
}