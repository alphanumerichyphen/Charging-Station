class initial
{
	// Driver Code 
	public static void main(String[] args) 
	{ 
		int[][] adm = { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
						{ 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
						{ 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
						{ 0, 0, 7, 0, 9, 0, 14, 0, 0 }, 
						{ 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
						{ 0, 0, 4, 0, 10, 0, 2, 0, 0 }, 
						{ 0, 0, 0, 14, 0, 2, 0, 1, 6 }, 
						{ 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
						{ 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

		System.out.println("City\t\t\t| Distance");
		System.out.println("___________________________________");
		for(int i = 0; i < 9; i++)
		{
			for(int j = i+1; j < 9; j++)
			{
				if(i != j && adm[i][j] != 0)
				{
					char a = (char)(i+65);
					char b = (char)(j+65);
					System.out.println("City "+a+" to City "+b+"\t| "+adm[i][j]);
				}
			}
		}
	}
}
