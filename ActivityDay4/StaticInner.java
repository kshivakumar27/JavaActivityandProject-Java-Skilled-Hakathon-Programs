package Activity1;

public class StaticInner {
	
	
		static int sum = 20;
		
		
		static class StaticInner1 {
			public int D;
			public int rem;
			
			
			public StaticInner1()
	        {
	            
				D = 4;
	            
	            rem = sum%D;
	        }
			private int getD()
	        {
	            return D;
	        }
			private int getRem()
	        {
	            return rem;
	        }
			private int getQuotient()
	        {
	            System.out.println("inside static inner class");
	            return sum / D;
	        }
		
	    

	public static void main(String[] args) {
	
		StaticInner1 inner = new StaticInner1();
		System.out.println("Divisor = "+ inner.getD());
	    System.out.println("Remainder = " + inner.getRem());
	    System.out.println("Quotient = " + inner.getQuotient());

		}
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
