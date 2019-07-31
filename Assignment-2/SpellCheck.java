class SpellCheck{
	public static void main(String args[]){
		String array[] = {"parth","kuldip","rushi","abhi","darshit","rutvik","tejas"};
		String check = args[0];
		int a[] = new int[26];
		int b[] = new int[26];
		boolean flag = false;
		int i,j;

		for(i = 0; i < array.length; i++)
		{	
			String name1 = array[i];
			for(j = 0; j < name1.length(); j++)
			{
				int position = name1.codePointAt(j);
				if(position >= 65 && position <= 91)
					a[position - 65]++;
				if(position >= 97 && position <= 122)
					a[position - 97]++;
			}
			for(j = 0; j < check.length(); j++)
			{
				int position = check.codePointAt(j);
				if(position >= 65 && position <= 91)
					b[position - 65]++;
				if(position >= 97 && position <= 122)
					b[position - 97]++;
			}
            
			for(j = 0; j < a.length; j++)
			{
				if(a[j] != b[j])
				{
					flag = false;
					for (int k = 0; k < a.length; k++)
                        a[k] = b[k] = 0;
                    break;
				}
                else
                	flag = true;
            }
			if(flag)
			{
				System.out.println(name1 + " is the correct one.");
				break;
			}
		}
		if(i > 6)
			System.out.println(check +" name doesn't exitst.");
	}
}