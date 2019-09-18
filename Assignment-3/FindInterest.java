interface Interest{
	public void interest(double principalAmount, double rateOfInterest,double noOfYears);
}

class SimpleInterest implements Interest{
	double principalAmount,rateOfInterest,noOfYears;
	public void interest(double principalAmount, double rateOfInterest,double noOfYears)
	{
		System.out.println("Simple Interest is : " +
						 (principalAmount*rateOfInterest*noOfYears)/100);
	}
}
class CompoundInterest implements Interest{
	double principalAmount,rateOfInterest,noOfYears;
	public void interest(double principalAmount, double rateOfInterest,double noOfYears)
	{
		double amount = principalAmount * Math.pow(1 + (rateOfInterest / 100),noOfYears);
		double interest = amount - principalAmount; 
		System.out.println("Compound Interest is : " + interest);
	}
}
class FindInterest{
	public static void main(String args[]){
		int choice = Integer.parseInt(args[0]);
		double principalAmount = Double.parseDouble(args[1]);
		double rateOfInterest = Double.parseDouble(args[2]);
		double noOfYears = Double.parseDouble(args[3]);
		switch(choice){
			case 1: SimpleInterest s = new SimpleInterest();
					s.interest(principalAmount,rateOfInterest,noOfYears);
					break;

			case 2:	CompoundInterest c = new CompoundInterest();
					c.interest(principalAmount,rateOfInterest,noOfYears);
					break;

			default : System.out.println("Invalid Input");
					  break;			
		}
	}
}