class PushSeventoBack
{
	public String getString()
	{
		String input ="";
		try 
		{
			input = ((new java.io.BufferedReader(new java.io.InputStreamReader(System.in))).readLine());
		}catch(java.io.IOException e){}
		return input;
	}
	public void getData()
	{
		System.out.println("Enter the number...:");
		int iteration = Integer.parseInt(getString());
		int Elements[] = new int[iteration];
		System.out.println("Enter the number one by one...:");
		for(int i=0;i<iteration;i++)
			Elements[i] = Integer.parseInt(getString());
		process(Elements);
	}
	public void process(int num[])
	{
		boolean isexe1 = true, isexe2 = true;
		int left = 0;
		int right = num.length-1;
		while( left<right )
		{

			if(num[right] != 7)isexe2 = false;

			if(num[left] == 7)isexe1 = false;

			if(isexe2 == false && isexe1 == false)
			{
				int temp = num[left];
				num[left] = num[right];
				num[right] = temp;
				isexe1 = true;
				isexe2 = true;
			}

			if(isexe2)   right--;
			if(isexe1)   left++;
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
	public static void main(String ar[])
	{
		new PushSeventoBack().getData();
	}
}
