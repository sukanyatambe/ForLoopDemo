package com.prowings.basics;

public class ForLoopDemo8 {

	public static void main(String[] args) {
		// inverted half pyramid
    int rows=5;
		
		for(int i=rows; i>=1; --i)
		{
			for(int j=1; j<=i; ++j)
			{
				System.out.print( j+ " ");
		}
		System.out.println();
	}

}
}

