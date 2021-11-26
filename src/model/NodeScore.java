package model;

import java.util.ArrayList;

public class NodeScore {
	
	private int key;
	private ArrayList<Player> value;

	//Links
	private NodeScore left;
	private NodeScore right;
	
	public NodeScore(int key) {
		this.key = key;
		this.value = new ArrayList<>();
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
	
	public void insert(int newKey, Player player) {
		if(newKey<this.key) {
			//insertar a la izquierda
			if(this.left == null) {
				this.left = new NodeScore(newKey);
				this.left.getValue().add(player);
			}else {
				this.left.insert(newKey, player);
			}
			
		}else if(newKey>this.key){
			//insertar a la derecha
			if(this.right == null) {
				this.right = new NodeScore(newKey);
				this.right.getValue().add(player); 
			}else {
				this.right.insert(newKey, player);
			}
		}
	}
	
}
