class  ArrayListClass
{
	private int a[];
	private int indexes;
	private int size;
	ArrayListClass(int size)
	{
		a=new int[size];
		indexes=-1;
		this.size=size;
	}
	public void add(int num)
	{
		if(indexes==this.size-1)
		{
			int temp[]=a;
			this.size=this.size+(this.size/2);
			a=new int[this.size];
			for(int i=0;i<=indexes;i++)
			{
				a[i]=temp[i];
			}
			indexes++;
			a[indexes]=num;
		}
		else
		{
			indexes++;
			a[indexes]=num;
		}
	}
	public void traverse()
	{
		for(int i=0;i<=indexes;i++)
			System.out.print(a[i]+ " ");
	}
}
public class ArrayList {

	public static void main(String[] args) {
        ArrayListClass l1=new ArrayListClass(5);		
         for(int i=1;i<=5;i++)
        	 l1.add(i*10);
         l1.add(100);
         l1.traverse();
	}
}
