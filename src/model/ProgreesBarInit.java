package model;

import ui.UserWindow;

public class ProgreesBarInit extends Thread{
	
	//Reference
	UserWindow userWindow;
	
	public ProgreesBarInit(UserWindow userWindow) {
		this.userWindow = userWindow;
	}
	
	@Override
	public void run() {
		for(double i=0; i<1; i+=0.1) {
			try {
				Thread.sleep(100);
				userWindow.tell(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		userWindow.nextWindow();
		
	}
	
}
