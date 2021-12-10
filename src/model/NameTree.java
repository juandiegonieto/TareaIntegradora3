package model;

public class NameTree {
	
	private NodeName root;
	
	
	public void add(String key, Player value) {
		if (root == null) {
			root = new NodeName(key, value);
		} else {
			root.insert(key, value);
		}
	}

	// El activador del metodo recursivo
	public void triggerInorder() {
		inorder(root);
	}

	// Recursivo
	public void inorder(NodeName node) {
		// Caso base
		if (node == null) {
			return;
		}
		// Recursivo

		inorder(node.getLeft());
		System.out.println(node.getKey());
		inorder(node.getRight());
	}

	public NodeName triggerSearch(String key) {
		return search(root, key);
	}

	// Recursivo
	public NodeName search(NodeName node, String key) {
		// Caso base
		if (node == null) {
			return null;
		}

		if (key == node.getKey()) {
			return node;
		}
		// Procedimiento recursivo
		if (key.compareTo(node.getKey())<=0) {
			return search(node.getLeft(), key);
		} else {
			return search(node.getRight(), key);
		}

	}

	
	public void triggerMaxLevel() {
		int level = getMaxLevel(root, 1);
		System.out.println(level);
	}

	public int getMaxLevel(NodeName node, int level) {

		if (node == null) {
			return level-1;
		} else {

			int A = getMaxLevel(node.getLeft(), level + 1);
			int B = getMaxLevel(node.getRight(), level + 1);

			return Math.max(A, B);
		}

	}
	
	public NodeName getMin(NodeName current){
		if (current.getLeft() == null) {
			return current;
		} else {
			return getMin(current.getLeft());
		}
	}
	
	public NodeName getMax(NodeName current) {
		if (current.getRight() == null) {
			return current;
		}else {
			return getMax(current.getRight());
		}
	}
	
	public void triggerDelete(String key) {
		if (root != null){
			root = delete(root, key);
		}
	}
	
	public NodeName delete(NodeName current, String key){
		
		if (current.getKey() == key){
			if (current.getLeft() == null && 
					current.getRight() == null){
				return null;
			} else if (current.getLeft() != null && 
					current.getRight() != null) {
				NodeName succesor = getMin(current.getRight());
				NodeName newRightTree = delete(current.getRight(), succesor.getKey());
				
				succesor.setLeft(current.getLeft());
				succesor.setRight(newRightTree);

				return succesor;
			} else if (current.getLeft() != null) {
				return current.getLeft();
			} else {
				return current.getRight();
			}
			
		} else if (key.compareTo(current.getKey())<=0 ){
			NodeName newLeftTree = delete(current.getLeft(), key);
			current.setLeft(newLeftTree);
		} else {
			NodeName newRightTree = delete(current.getRight(), key);
			current.setRight(newRightTree);
		}
		
		return current;
	}

	public NodeName getRoot() {
		return root;
	}

	public void setRoot(NodeName root) {
		this.root = root;
	}
	
	
	
}