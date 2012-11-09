class prob10 
{
	public static boolean Prime(long num)
	{
		if(num == 2) return true;
		if(num%2 == 0 || num == 1)	return false;
		int sqrt_num = (int) (Math.sqrt(num))+1;	
		for(int i=3; i<sqrt_num; i++)
			{
			if(num%i==0) return false;
			}	
		return true;
	}	
	public static void main(String[] args) 
		{
		long max = 2000000;
		long sum = 2;
		long counter = 3;
		while(counter<=max)
			{
			if(Prime(counter)) sum = sum+counter;
			counter = counter+2;
			}
		System.out.println(sum);
		}
}
