package model;

import java.util.ArrayList;

public class NodeScore {
	
	private int key;
	private ArrayList<Player> value;
	
	//Enlaces
	private NodeScore left;
	private NodeScore right;
		
	
	public NodeScore(int key) {
		this.key = key;
		this.value = new ArrayList<>();
	}
	
	public void insert(int newkey) {
		if(newkey<this.key) {
			//insertar a la izquierda
			if(this.left == null) {
				this.left = new NodeScore(newkey);
			}else {
				this.left.insert(newkey);
			}
			
		}else {
			//insertar a la derecha
			if(this.right == null) {
				this.right = new NodeScore(newkey);
			}else {
				this.right.insert(newkey);
			}
		}
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public ArrayList<Player> getValue() {
		return value;
	}
	public void setValue(ArrayList<Player> value) {
		this.value = value;
	}

	public NodeScore getLeft() {
		return left;
	}

	public void setLeft(NodeScore left) {
		this.left = left;
	}

	public NodeScore getRight() {
		return right;
	}

	public void setRight(NodeScore right) {
		this.right = right;
	}
	
	

}