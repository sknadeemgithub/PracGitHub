
public class Missing {
public static void main(String args[])
{
	int num[]= {1,2,3,5,6,7,8,9,10};
	int find=4;
	boolean found=false;
	
	for(int n:num)
	{
		if(n==find)
	
	found=true;
	break;
	}
	if(found)
	{
		System.out.println("Number found"+found);
	}
	else 
	{
		System.out.println("Number is missing:"+found);
	}
}
}

