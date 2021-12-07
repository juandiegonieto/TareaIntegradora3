package model;

import ui.QuestionsWindow;

public class TotalQuestionnaireTime extends Thread{

	//Reference
	private QuestionsWindow questionsWindow;
	private TreeController treeController;
		
	/**
	 * este es para hacer el hilo del tiempo total que tiene para responder 
	 * 
	 * 
	 * @param treeController
	 * @param questionsWindow
	 */
	public TotalQuestionnaireTime(TreeController treeController,QuestionsWindow questionsWindow) {
		this.questionsWindow = questionsWindow;
		 this.treeController=treeController;
		
	}
		
	@Override
	public void run() {
		boolean rom=true;
		for(int i=120; i!=0; i--) {
			try {
				Thread.sleep(1000);
				questionsWindow.tell(i);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
}
