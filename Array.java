class Array {
public static void main(String args[])
{
int num[]={6,2,88,44,99,11,8};
int count,i=0,j=0;
count=num.length;
System.out.println("Array length = " +count);
System.out.println("Array Elements  ");
for(i=0;i<count;i++)
	System.out.print(num[i]+"  ");
for(i=0;i<count;i++)
for(j=i+1;j<count;j++)
{
	if(num[i]<num[j])
	{
		int temp=num[i];
		num[i]=num[j];
		num[j]=temp;
	}
}

System.out.println("Sorted Array ");
for(i=0;i<count;i++)
System.out.print(num[i]+" ");
}
}