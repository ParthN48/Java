class BasicCalc{
	public static void main(String args[]){
		double operand1 = Double.parseDouble(args[0]);
		char operator = args[1].charAt(0); 	
		double operand2 = Double.parseDouble(args[2]);
		double result = 0;
		switch(operator){
			case '+': result = operand1 + operand2;
					  System.out.println(operand1 + " + "  + operand2 + "  = " + result);
					  break;
			case '-': result = operand1 - operand2;	
					  System.out.println(operand1 + " - "  + operand2 + "  = " + result);
					  break;
			case '*': result = operand1 * operand2;
					  System.out.println(operand1 + " * "  + operand2 + "  = " + result);
					  break;
			case '/': result = operand1 / operand2;
					  System.out.println(operand1 + " / "  + operand2 + "  = " + result);
					  break;
			default : System.out.println("Invalid Try again");
					  break;		  		  	
		}

	}
}