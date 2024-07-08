package java_8_Feature;

public class Practice {

	public static void main(String[] args) {

		{
			int n1 = 0, n2 = 1, n3, i, count = 7;

			for (i = 0; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				for (int j = 1; j <= n3; j++) {
				      System.out.print(" " + n3);
				}
				System.out.println();
			}
		}
	}
}

/*
 * 
 

*	{
			int n1 = 0, n2 = 1, n3, i, count = 8;

			for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;

				int temp = n3;

				// System.out.print(n3+" ");

				for (int k = 1; k <= n3; k++) {

					if (n3 == temp) {
						System.out.print(" " + n3);
					}
				}
				System.out.println();

			}

		}
	}
*/
