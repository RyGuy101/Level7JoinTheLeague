package org.jointheleague.roots;

public class SquareRootCalc
{
	public static void main(String[] args)
	{
		// for (int i = 0; i <= 100; i++)
		// {
		// System.out.print(squareRootAndRemainder(i)[0]+", ");
		// System.out.print(squareRootAndRemainder(i)[1]);
		// System.out.println();
		// }
		int[] root2 = squareRootAndRemainder((int) (2 * Math.pow(10,8)));
		System.out.print(root2[0] + ", ");
		System.out.print(root2[1]);
	}

	static int[] squareRootAndRemainder(int n)
	{
		int a;
		int b = 0;
		int c = n;
		for (a = 0; 1 << a < c; a += 2)
		{
		}
		while (a > 0)
		{
			assert (b * b << a) + c == n;
			assert 0 <= c && c <= (2 * b + 1) << a;
			a -= 2;
			b *= 2;
			int d = (2 * b + 1) << a;
			if (d <= c)
			{
				c -= d;
				b++;
			}
		}
		return new int[] { b, c };
	}
}
