public class CurrancyConverter{
	/**
			Invalid, 2 arguments are required <br/>
			i.e. CurrancyConverter <currancyType> <currancy><br/>
			<currancyType> <br/> 1. USD to INR <br/> 2. INR to USD
			<currancy> <br/> either INR or USD
	**/
	public static void main(String args[]){
		if(args.length != 2)
		{
			System.out.println("Invalid, 2 arguments are required");
			System.out.println("i.e. CurrancyConverter <currancyType> <currancy>");
			System.out.println("<currancyType> \n 1. USD to INR \n 2. INR to USD");
			System.out.println("<currancy> \n either INR or USD");
		}
		int currancyType = Integer.parseInt(args[0]);
		float currancy = Float.parseFloat(args[1]);
		int rate = 70;
		

		if(currancyType == 1)
			System.out.println("$" + currancy + " = " + currancy*rate  + " INR");
		else
			System.out.println("INR" + currancy + " = " + currancy/rate + " $");

	}
}