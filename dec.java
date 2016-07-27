import java.util.Arrays;

public static void main(String args[])
{
int [] arr={4,5,7,2,8};
Arrays.sort(arr);
for(int i=arr.length-1;i>=0;i--)
{
System.out.print(arr[i]);
}
}
