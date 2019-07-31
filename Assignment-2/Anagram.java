class Anagram{
	public static void main(String args[]){
		String string1 = args[0];
		String string2 = args[1];

		if(string1.length() != string2.length())
		{
			System.out.println("String is not anagram");
			System.exit(0);
		}
		else
		{
			int a[] = new int[26];
			int b[] = new int[26];
			for (int i = 0; i < string1.length(); i++)
			{
				int charUnicode = string1.codePointAt(i);
				if(charUnicode >= 65 && charUnicode <= 91)
					a[charUnicode - 65]++;
				if(charUnicode >= 97 && charUnicode <= 122)
					a[charUnicode - 97]++;
			}
			for (int i = 0; i < string2.length(); i++)
			{
				int charUnicode = string2.codePointAt(i);
				if(charUnicode >= 65 && charUnicode <= 91)
					b[charUnicode - 65]++;
				if(charUnicode >= 97 && charUnicode <= 122)
					b[charUnicode - 97]++;
			}
			boolean flag = true;
			for(int i = 0; i < 26; i++)
			{
				
				if(a[i] != b[i])
				{	
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("String is Anagram");
			else
				System.out.println("String is not Anagram");			
		}

	}
}