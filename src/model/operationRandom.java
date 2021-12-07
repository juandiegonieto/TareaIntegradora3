package model;

public class operationRandom {

	//operador inicual ej: dividendo minuendo
	private int n1;
	//operdor degundario Ej: divisor Sustraendo
	private int n2;
	//es un numero random para decidir que operacion hacer 
	private int TypeOperation;
	//es la operacion que se realiza
	private String TypeOp;

	/**
	 * @param typeOperation
	 */
	public operationRandom() {
		TypeOperation = (int) ((Math.random() * (4 - 1)) + 1);;
		n1=(int) ((Math.random() * (100 - 0)) + 0);
		n2=(int) ((Math.random() * (100 - 0)) + 0);
		switch (TypeOperation) {
		case 1:
			TypeOp="+";
			break;
		case 2:
			TypeOp="-";
			break;
		case 3:
			TypeOp="x";
			break;
		case 4:
			TypeOp="/";
			break;
		
		}
	}
	
	public int decisionOperation() {
		int operationResult=0;
		
		switch (TypeOperation) {
		case 1://suma
			operationResult=n1+n2;
			break;
			
		case 2://resta
			operationResult=n1-n2;
			break;
			
		case 3://multiplicacion
			operationResult=n1*n2;
			break;
			
		case 4://divicion
			operationResult=n1*n2;
			break;
		}
		return operationResult;
	}
	
	public String getTypeOp() {
		return TypeOp;
	}

	public void setTypeOp(String typeOp) {
		TypeOp = typeOp;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getTypeOperation() {
		return TypeOperation;
	}

	public void setTypeOperation(int typeOperation) {
		TypeOperation = typeOperation;
	}
	
	
	
}
