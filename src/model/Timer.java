package model;

import ui.QuestionsWindow;

public class Timer extends Thread{

	//Reference
	private QuestionsWindow questionsWindow;
	
	public Timer(QuestionsWindow questionsWindow) {
		this.questionsWindow = questionsWindow;
	}
	
	@Override
	public void run() {
		
	}
	
}
