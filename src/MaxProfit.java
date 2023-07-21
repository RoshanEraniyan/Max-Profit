import java.util.*;


class MaxProfit
{
    public static void maxProfit(int[] array)
    {
        Arrays.sort(array);
        System.out.println(array[array.length-1]-array[0]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        maxProfit(array);
    }
}