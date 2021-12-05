package model;

public class NodeName {
	
	private String key;
	private Player value;
	
	
	//Enlaces
	private NodeName left;
	private NodeName right;
	
	public NodeName(String key, Player value) {
		this.key = key;
		this.value = value;
	}
	
	public void insert(String newkey, Player value) {
		if(newkey.compareTo(this.key)<=0 ) {
			//insertar a la izquierda
			if(this.left == null) {
				this.left = new NodeName(newkey,value);
			}else {
				this.left.insert(newkey, value);
			}
			
		}else {
			//insertar a la derecha
			if(this.right == null) {
				this.right = new NodeName(newkey, value);
			}else {
				this.right.insert(newkey, value);
			}
		}
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Player getValue() {
		return value;
	}
	public void setValue(Player value) {
		this.value = value;
	}

	public NodeName getLeft() {
		return left;
	}

	public void setLeft(NodeName left) {
		this.left = left;
	}

	public NodeName getRight() {
		return right;
	}

	public void setRight(NodeName right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "NodeName [key=" + key + "]";
	}
	
	
	
	
	
}
