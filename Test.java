package exercice;

public class Test {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		System.out.print("n1 = " + n1 + " n2 = " + n2);
		
		n1 = n2++;
		System.out.print("n1 = " + n1 + " n2 = " + n2);
		
		n1 = n2++;
		System.out.print("n1 = " + n1 + " n2 = " + n2);
		
		n1 = n1++;
		System.out.print("n1 = " + n1 + " n2 = " + n2);

	}
	
	{
		int i = 4;
		if ( i % 2 != 0) System.out.print(" i est impair");
	}
	
	{
		int i = 4;
		if ( i % 2 == 0)
		{
			System.out.print(" i est pair ");
		}
		else
		{
			System.out.print(" i est impair ");
		}
	}
	

}
