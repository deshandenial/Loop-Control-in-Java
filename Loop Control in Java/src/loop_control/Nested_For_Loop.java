package loop_control;

public class Nested_For_Loop 
{

	public static void main(String[] args) {
		
		
		for(int x = 10 ; x < 20 ; x=x+1)
		{
			System.out.println("print x value:"+x);
			for(int y = 10 ; y < 20 ; y=y+1)
			{
				System.out.println("\t print y value:"+y);
				
				for(int z = 10 ; z < 20 ; z++)
				{
					System.out.println("\t \t print z value:"+z);
				}
			}
		}
	}
}
