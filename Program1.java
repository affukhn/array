//wap to copy one array element into another//
class  program1
{
	public static void main(String[] args) 
	{
		int[] a={2,4,5,6,7,8};
		int []b=copyArray(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.print("b= " + b[i] + "   ");
		}
	}
	public static int[] copyArray(int[]a)
	{
        int []b=new int[a.length];
          for (int i=0;i<a.length ;i++ )
          {
			  b[i]=a[i];
          }
           return b;
	}
}
