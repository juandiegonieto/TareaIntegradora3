package model;

public class TreeController {

	 /**
	 * funtion the Class
	 * va a ser en donde aperemos todo aqui vamos a sumar a 
	 * y arestar puntajes crear y modificar arboles etc...
	 * 
	 */
	
	//Reference
	private Player player;
	
	private String namePlayer;
	private operationRandom operations;
	private TotalQuestionnaireTime time;
	
	public TreeController(String namePlayer) {
		super();
		this.namePlayer=namePlayer;
		operations=new operationRandom();
	}
	
	public void getOperationRandom() {
		player=new Player(namePlayer);
	}
	
	
	/**
	 * en este metodo vas a resivir la respuesta que te dio el buttom para poder 
	 * comparar la respueta a ver si es la correcta o no 
	 */
	public void revisortheOperations(String theoreticalAnswer) {
		int numAnswer=Integer.parseInt(theoreticalAnswer);
		if(numAnswer==operations.decisionOperation()) {
			player.setScore(player.getScore()+10);
		}else {
			player.setScore(player.getScore()-10);
		}
	}
	
	/**
	 * este metodo devuelve la operacions que se dealiza con los numeros a operar 
	 * lista para ponerla en la lavel 
	 * 
	 */
	public String toStringOperations() {
		String Op=""
				+ "";
		switch (operations.getTypeOperation()) {
		case 1:
			Op=operations.getN1()+","+operations.getTypeOp()+","+operations.getN2();
			break;
		case 2:
			Op=operations.getN1()+","+operations.getTypeOp()+","+operations.getN2();
			break;
		case 3:
			Op=operations.getN1()+","+operations.getTypeOp()+","+operations.getN2();
			break;
		case 4://en este caso como calculamos la funcions invers a la division por eso estamos mostrando el resuktado para llegar a auna division entera
			Op=operations.decisionOperation()+","+operations.getTypeOp()+","+operations.getN2();
			break;
		
		}
		return Op;
	}
	
	/**
	 * esta es la respuesta correcta dada en un String 
	 * por si la necesitas mostrar 
	 * 
	 * @return
	 */
	public String toStringAnswer() {
		String Op="";
		if(operations.getTypeOperation()==4) {
			Op=""+operations.getN2();
		}else {
			Op=""+operations.decisionOperation();
		}
		return Op;
	}
	
	/**
	 * este motdo va a regresar un String en el cual estan todas las respuestas para ponerla en los bottom 
	 * la respuesta correcta se encuentra en la primara posiscion 
	 * esta sepasrado por "-" para hacerle Split
	 * 
	 * 
	 * 
	 * @return
	 */
	public String toStringAnswerError() {
		String Op=" ";
		if(operations.getTypeOperation()==4) {
			for(int i=0;i<=2;i++) {
				int Ans1=(int) ((Math.random() * ((operations.getN2()+5) - (operations.getN2()-5))) + (operations.getN2()-5));
				Op=Ans1+"-"+Op;
			}
			Op=operations.getN2()+"-"+Op;
			Op=""+operations.getN2();
		}else {
			for(int i=0;i<=2;i++) {
				int Ans1=(int) ((Math.random() * ((operations.decisionOperation()+5) - (operations.decisionOperation()-5))) + (operations.decisionOperation()-5));
				Op=Ans1+"-"+Op;
			}
			Op=operations.getN2()+"-"+Op;
			Op=""+operations.getN2();
		}
		return Op;
	}
	
	public void addPlayerToTreeNAme() {
		NodeName p=new NodeName(player.getUsername(), player);
		p.insert(namePlayer, player);
	}
	
}
