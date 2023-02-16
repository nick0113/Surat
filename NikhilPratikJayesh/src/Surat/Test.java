package Surat;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int year = 2016;
      
      if(year % 400==0 || (year % 4==0 && year % 100!= 0))
      {
    	  System.out.println("leap year");
      }
      else
      {
    	  System.out.println("Not leap year");
      }
	}
	
	int n=10;
	if(n/2==0)
	{
		System.out.println("even number");
	}
	else
	{
		System.out.println("odd number");
	}

}
}


