public class NumberConvertion{
	/**
			Invalid, 2 arguments are required <br/>
			i.e. NumberConvertion <converterType> <number><br/>
			<converterType> <br/> 1. Binary to Decimal <br/> 2. Decimal to Binary
			<number> <br/> Any number
	**/			
	public static void main(String args[]){
		if(args.length != 2)
		{
			System.out.println("Invalid, 2 arguments are required");
			System.out.println("i.e. NumberConvertion <converterType> <number>");
			System.out.println("<converterType> \n 1. Binary to Decimal \n 2. Decimal to Binary");
			System.out.println("<number> \n Any number");
		}
		int converterType = Integer.parseInt(args[0]);
		int number = Integer.parseInt(args[1]);

		if(converterType == 1)
		{
			long decimal = 0;
			int power = 0;
			while(number > 0)
			{
				int remiender = number % 10;
				int num = remiender * (int)Math.pow(2,power);
				decimal += num;
				power++;
				number /= 10;
			}
			System.out.println("Decimal number is: " + decimal);
		}
		else
		{
			String binary = new String();
			while(number > 0)
			{
				int remiender = number % 2;
				binary = remiender + binary;
				number /= 2;

			}
			System.out.println("Binary number is: " + binary);
		}
	}
}