import java.util.Scanner;
class Array_Search
{
    void find(int array[],int n,int b)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]==b)
            {
                count++;
            }
        }
        System.out.println("COUNT: "+count);
    }
}
public class Search {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        int b=scanner.nextInt();
        Array_Search arraySearch=new Array_Search();
        arraySearch.find(array,n,b);
    }
}
