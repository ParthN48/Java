class PrimeNumber{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int i = 2,count = 1;
		while(count <= n)
		{
			boolean flag = true;
			for(int j = 2; j <= Math.sqrt(i); j++)
			{
				if(i % j == 0)
				{
					flag = false;
					break;
				}	
			}
			if(flag)
			{
				System.out.println(i);
				count++;
			}
			i++;	
		}	
	}
}