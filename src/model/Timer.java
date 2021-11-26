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
		for(int i=30; i!=0; i--) {
			try {
				Thread.sleep(1000);
				questionsWindow.tell(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
