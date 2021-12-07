package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PlayerData {
	

	private ObservableList<Player> players;
	
	
	public PlayerData() {
		players = FXCollections.observableArrayList();
	}
	
	
	
	public ObservableList<Player> getData(){
		return players;
	}
	
	
}
