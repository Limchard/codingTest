import java.util.*;

public class A1018
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int vertical = sc.nextInt();
		int horizontal = sc.nextInt();
		sc.nextLine();
		String[][] chessBoard = new String[vertical][horizontal];
		List<Integer> countB = new ArrayList<>();
		List<Integer> countW = new ArrayList<>();

		createChessBoardB(vertical, sc, horizontal, chessBoard);

		for (int i = 0; i <= horizontal - 8; i++)
		{
			for (int j = 0; j <= vertical - 8; j++)
			{
				countStartB(j, i, chessBoard, countB);
				countStartW(j, i, chessBoard, countW);
			}
		}

		Collections.sort(countB);
		Collections.sort(countW);

		System.out.println(Math.min(countB.get(0), countW.get(0)));
	}


	private static List<Integer> countStartW(int vertical, int horizontal, String[][] chessBoard, List<Integer> countList)
	{
		int count = 0;
		for (int i = vertical; i < vertical + 8; i++)
		{
			for (int j = horizontal; j < horizontal + 8; j++)
			{
				if (i % 2 == 0 && j % 2 == 0)
				{
					if (!"W".equals(chessBoard[i][j]))
						count++;
				}
				else if (i % 2 == 0 && j % 2 != 0)
				{
					if (!"B".equals(chessBoard[i][j]))
						count++;
				}
				else if (i % 2 != 0 && j % 2 == 0)
				{
					if (!"B".equals(chessBoard[i][j]))
						count++;
				}
				else if (i % 2 != 0 && j % 2 != 0)
				{
					if (!"W".equals(chessBoard[i][j]))
						count++;
				}
			}
		}
		countList.add(count);
		return countList;
	}

	private static List<Integer> countStartB(int vertical, int horizontal, String[][] chessBoard, List<Integer> countList)
	{
		int count = 0;
		for (int i = vertical; i < vertical + 8; i++)
		{
			for (int j = horizontal; j < horizontal + 8; j++)
			{
				if (i % 2 == 0 && j % 2 == 0)
				{
					if (!"B".equals(chessBoard[i][j]))
						count++;
				}
				else if (i % 2 == 0 && j % 2 != 0)
				{
					if (!"W".equals(chessBoard[i][j]))
						count++;
				}
				else if (i % 2 != 0 && j % 2 == 0)
				{
					if (!"W".equals(chessBoard[i][j]))
						count++;
				}
				else if (i % 2 != 0 && j % 2 != 0)
				{
					if (!"B".equals(chessBoard[i][j]))
						count++;
				}
			}
		}
		countList.add(count);
		return countList;
	}

	private static void createChessBoardB(int vertical, Scanner sc, int horizontal, String[][] chessBoard)
	{
		for (int i = 0; i < vertical; i++)
		{
			String line = sc.nextLine();
			for (int j = 0; j < horizontal; j++)
			{
				if (!line.isEmpty())
				{
					char ase = line.charAt(j);
					chessBoard[i][j] = String.valueOf(ase);
				}
			}
		}
		sc.close();
	}

}