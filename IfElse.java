package exercice;

public class IfElse {

	public static void main(String[] args) {
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
	
	{
		int i = 1;
		switch (i)
		{
		case 0 :
			System.out.print(" 0 ");
			break;
		case 1 :
			System.out.print(" 1 ");
			break;
		case 2 :
			System.out.print(" 2 ");
			break;
			default :
				System.out.print(i);
				break;



		}
	}

}
