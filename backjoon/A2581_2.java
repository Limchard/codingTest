import java.util.Scanner;

public class A2581_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int minNumber = -1;
		boolean minNumberCheck = true;
		int primeNumber = 0;
		int count = 0;

		for (int i = m; m <= n; m++)
		{
			if (m == 2)
			{
				minNumber = m;
				minNumberCheck = false;
				primeNumber = 2;
			}

			count = 2;
			for (int j = m - 1; j > 1; j--)
			{
				if (m % j == 0)
					continue;
				else
					count++;

				if (count == m)
				{
					primeNumber = primeNumber + m;
					if (minNumberCheck)
					{
						minNumber = m;
						minNumberCheck = false;
					}
				}
			}
		}
		if (-1 == minNumber)
			System.out.println(minNumber);
		else
		{
			System.out.println(primeNumber);
			System.out.println(minNumber);
		}
	}
}
