package Core_javas7;

public class imp_met {
	static String s1 = new String("PRANAV PRADEEP SHUKLA");		// string one
	static String s2 = new String("PRADEEP");	//// string 2 to be compared
	static String s3 = new String("SHU  KLA");	//// string 3 to be compared
	
	public static void check_substring(String a1,String a2)
	{
		int num_of_char_matched=0,loop1=0,loop2=0;
		boolean strin_found=false,string_not_found=false;
		do		// stsrting do loop
		{
			if(a1.charAt(loop1)==a2.charAt(loop2))	// check if string elements match
			{
				System.out.println("CHAR MATCH");	//test match
				loop2++;// elements in both string matched
				loop1++;// increment both string pointers...
				num_of_char_matched++;	// number of characters matched 
				System.out.println(loop1+"  "+loop2);  // test msg
				if(loop1>=a1.length())	// check if all elements in test string are compared
				{
					strin_found=true;	// if elements matched...
				}
			}
			
			else
			{
				System.out.println("Discontinued...");	// if element mismatch occured
				loop2++;	// next element in reference string
				loop1=0;	// test string pointer reset 
				num_of_char_matched=0;	// sequence counter reset
				//System.out.println(loop2+"  "+loop1);
				if(loop2>a1.length())	// string pointer exceeded string length...
				{
					string_not_found=true;	// string element mismatch
				}
			}
			
		}while((string_not_found==false)&&(strin_found==false));// repeat while one of the flag sets 
		
		System.out.println(num_of_char_matched);// test msg
		
		if((strin_found)&&(num_of_char_matched==a1.length()))// if elements matched and total elements matched = test string length
		{
			System.out.println("==================================");
			System.out.println("TEST String  is sub string of Referance String");
			System.out.println("==================================");// print is a sub string
		}
		if(string_not_found)
		{
			System.out.println("==================================");// print not a sub string
			System.out.println("Test String is not sub string of Referance String");
			System.out.println("==================================");// print not a sub string
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_of_char_matched=0,loop1=0,loop2=0;
		boolean strin_found=false,string_not_found=false;
		System.out.println("STRING Length:"+s2.length());
		
		imp_met string_test =new imp_met();
		imp_met.check_substring(s2,s1);
		imp_met.check_substring(s3,s1);
		/*do		// stsrting do loop
		{
			if(s2.charAt(loop1)==s1.charAt(loop2))	// check if string elements match
			{
				System.out.println("CHAR MATCH");	//test match
				loop2++;// elements in both string matched
				loop1++;// increment both string pointers...
				num_of_char_matched++;	// number of characters matched 
				System.out.println(loop1+"  "+loop2);  // test msg
				if(loop1>=s2.length())	// check if all elements in test string are compared
				{
					strin_found=true;	// if elements matched...
				}
			}
			
			else
			{
				System.out.println("Discontinued...");	// if element mismatch occured
				loop2++;	// next element in reference string
				loop1=0;	// test string pointer reset 
				num_of_char_matched=0;	// sequence counter reset
				//System.out.println(loop2+"  "+loop1);
				if(loop2>s2.length())	// string pointer exceeded string length...
				{
					string_not_found=true;	// string element mismatch
				}
			}
			
		}while((string_not_found==false)&&(strin_found==false));// repeat while one of the flag sets 
		
		System.out.println(num_of_char_matched);// test msg
		
		if((strin_found)&&(num_of_char_matched==s2.length()))// if elements matched and total elements matched = test string length
		{
			System.out.println("==================================");
			System.out.println("String 2 is sub string of String1");
		}
		if(string_not_found)
		{
			System.out.println("==================================");// print not a sub string
			System.out.println("String 2 is not sub string of String1");
		}
		
		
		System.out.println("==================================");
		System.out.println("STRING Length:"+s3.length());
		loop1=0;				// 
		loop2=0;				//
		num_of_char_matched=0;	//	reset all pointers and flags
		strin_found=false;		//
		string_not_found=false;	//
		do			/// repeat for string two
		{
			if(s3.charAt(loop1)==s1.charAt(loop2))
			{
				System.out.println("CHAR MATCH");
				loop2++;
				loop1++;
				num_of_char_matched++;
				System.out.println(loop1+"  "+loop2);
				if(loop1>=s3.length())
				{
					strin_found=true;
				}
			}
			
			else
			{
				System.out.println("Discontinued...");
				loop2++;
				loop1=0;
				num_of_char_matched=0;
				//System.out.println(loop2+"  "+loop1);
				if(loop2>s3.length())
				{
					string_not_found=true;
				}
			}
			
		}while((string_not_found==false)&&(strin_found==false));
		
		System.out.println(num_of_char_matched);
		if((strin_found)&&(num_of_char_matched==s3.length()))
		{
			System.out.println("==================================");
			System.out.println("String 3 is sub string of String1");
		}
		else
		{
			System.out.println("==================================");
			System.out.println("String 3 is not sub string of String1");
		}*/
	}

}
