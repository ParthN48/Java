class ValidateEmail{
	public static void main(String args[]){
		String email = args[0];
		String errorMessage = "";
		int firstCharUnicode = email.codePointAt(0);
		if(!((firstCharUnicode >= 48 && firstCharUnicode <= 57) || (firstCharUnicode >= 97 && firstCharUnicode <= 122)))
			errorMessage += "First character must be either in lower case or digit";
	
		String emailparts[]  = email.split("@");
		int emailNameLength = emailparts[0].length();
		if(emailNameLength < 8 || emailNameLength > 20)
			errorMessage += "\nUsername length must be between 8 to 20";
			
		for(int i = 1; i < emailNameLength; i++)	
		{
			int charUnicode = emailparts[0].codePointAt(i);
			if(!((charUnicode >= 48 && charUnicode<= 57) || (charUnicode >= 65 && charUnicode <= 90) || 
							(charUnicode >= 97 && charUnicode <= 122) || (charUnicode == 46) || (charUnicode == 95)))
				errorMessage += "\nOnly a-z, A-Z, 0-9 and underscore and dot are valid";
		}
		int atPosition = email.indexOf('@');
		if(atPosition == -1)
			errorMessage += "\natleast one @ is required";
		if(atPosition != -1)	
		{
			int dotPosition = email.indexOf('.');
				if(dotPosition == -1)
					errorMessage += "\nDomain name is required";
				if(dotPosition != -1)
				{
					if(dotPosition  - atPosition <= 2)
						errorMessage += "\ndistance between @ and . must be more than 2";
				}
		}
		if(errorMessage.length() == 0)
			System.out.println("valid email Address");
		else
			System.out.println(errorMessage);		
	}
}