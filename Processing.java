
/**
 * Write a description of class Processing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Processing
{
    static void main()
    {
        int k=0;
        System.out.print("\f");
        System.out.print("PROCESSING ");
        for(long i=0;i<=399999999;i++) 
        {
             
            if(i%25000000==0)
            {
            System.out.print(". "); k++;
            }
            if(k==5)
            {
                System.out.print("\f");
                System.out.print("PROCESSING ");
                k=0;
            }
        
        }
      
        System.out.println("\f");
    }
}