package Activity1;

import java.util.*;

 class CustomeException {



	
	public static void main(String[] args) throws CustomException {
		Scanner sc=new Scanner(System.in);

		 String name;
		 int Age;
		
		try {
		
		System.out.println("name");
		name=sc.nextLine();
		System.out.println("age");
		Age = Integer.parseInt(sc.nextLine());
		sc.close();
			if(Age<18)
			{
				throw new CustomException("InvalidAgeRangeException");
			}
			

			System.out.println("Player name : " +name);
			System.out.println("Player age : " +Age);
			
			
			
			
		}
			catch (CustomException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
	
	
		
		
	}
	
	}
	







