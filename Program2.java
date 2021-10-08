//wap to copy  two array into the thrid array//
class  Program2
{
	public static void main(String[] args) 
	{
		int []a ={2,4,6,8,10};
		int []b={1,3,5,7,9};
	    int []c=copyArray(a,b);
		for (int i=0;i<c.length;i++ )
		   System.out.print(c[i] + "  ");
	}

   public static int[] copyArray(int []a,int []b)
   {
	   int []c=new int[a.length+b.length];
	   int i;
	   for (i=0;i<a.length;i++ )
	   {
            c[i]=a[i];
	   }
	   for (int j=0;j<b.length;j++ )
	   {
		   c[i]=b[j];
		   i++;
	   }
	   return c;
   }
}
