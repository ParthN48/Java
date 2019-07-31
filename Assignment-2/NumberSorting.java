class NumberSorting{
	public static void main(String args[]){
		int nos[] = new int[args.length];
		for (int i = 0; i < nos.length; i++) 
			nos[i] = Integer.parseInt(args[i]);
		for(int i = 0; i < nos.length; i++)
		{
			for(int j = 0; j < nos.length - i -1; j++)
			{
				if(nos[j] > nos[j+1])
				{
					int temp = nos[j];
					nos[j] = nos[j+1];
					nos[j+1] = temp;
				}
			}
		}
		System.out.println("sorted array is: ");
		for (int i = 0; i < nos.length; i++) 
			System.out.println(nos[i]);			
	}
}