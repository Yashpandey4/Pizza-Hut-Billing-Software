

   import java.io.*;
public class SPOJ
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
	InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        
        int arr[]=new int[100];    
        System.out.println("Enter the numbers");
        for(int i=0;i<100;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<100;i++)
        {
            arr[i]=Integer.parseInt(in.readLine());
        }
        for(int i=0;i<100;i++)
        {
            if(arr[i]!=42)
            { 
                        System.out.println(arr[i]);
                    }
                   else
                   {
                       break;
                    }
        }
}}