package model;

public class NodeName {
	
	private String key;
	private Player value;
	
	public NodeName(String key, Player value) {
		this.key = key;
		this.value = value;
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
	
	
	
}
