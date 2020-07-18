
import java.io.*;
public class Store_locs
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static void store_locs()throws IOException
    {
        Boards ob=new Boards();
        int k=0;
        System.out.print("\f");
        System.out.print("FINDING YOUR LOCATION ");
        for(int i=1;i<=5;i++)
        {
            System.out.print(". ");
            try 
            {
                Thread.sleep(500);                 //1000 milliseconds is one second.
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("\f");
        System.out.print("COMPUTING STORES IN YOUR CITY - MUMBAI");
        for(int i=0;i<=8;i++) 
        {
            try 
            {
                Thread.sleep(500);                 //1000 milliseconds is one second.
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
            System.out.print(". "); k++;
            
            if(k==5)
            {
                System.out.print("\f");
                System.out.print("COMPUTING STORES IN YOUR CITY - MUMBAI ");
                k=0;
            }
        
        }
      
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2014 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t***************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\tSTORE LOCATIONS");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t1. PH Kandivali ");
        System.out.println("\t\t\t\t\t(17 thakur Cinema and welfare centre,Thakur village Kandivali east)");
        System.out.println("\t\t\t\t\t2. PH RBD Andheri (E) ");
        System.out.println("\t\t\t\t\t(Tandon Mall,Chakala Village, Andheri Kurla Road,Andhetri east)");
        System.out.println("\t\t\t\t\t3. PH RBD Cinewonder ");
        System.out.println("\t\t\t\t\t(Cinewonder Mall,Kapurbavdi,GhodBunder Road , Thane (West))");
        System.out.println("\t\t\t\t\t4. PH RBD Lokhandwala");
        System.out.println("\t\t\t\t\t(Grenville Apts,Lokhandwala , Andheri)");
        System.out.println("\t\t\t\t\t5. PH RBD Mindspace ");
        System.out.println("\t\t\t\t\t(Unit 1, Ground floor,Eureka Towers,Mindspace,malad (West))");
        System.out.println("\t\t\t\t\t6. PH RBD Mulund ");
        System.out.println("\t\t\t\t\t3rd Floor, Runwal Arcade,LBS Marg, Mulund(West)");
        System.out.println("\t\t\t\t\t7. PH RBD Nirmal Mall ");
        System.out.println("\t\t\t\t\t(Shop No 20,Ground floor,Nirmal Mall,LBS Marg,Mulund (West))");
        System.out.println("\t\t\t\t\t8. PH RBD Powai ");
        System.out.println("\t\t\t\t\t(Sentinel,Hiranandani Business Park, Powai)");
        System.out.println("\t\t\t\t\t9. PH RBD Profit Centre ");
        System.out.println("\t\t\t\t\t(Shop No G3, F2, Profit Centre,,120 feet road, Borsapada)");
        System.out.println("\t\t\t\t\t10. PH RBD Sterling ");
        System.out.println("\t\t\t\t\t(Elphiston house 17 murzban road,Opp sterling theatre VT)");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t***************************************************************************************************");
        while(true)
        {
                   System.out.print("\t\t\t\t\tEnter \"back\" to return to the main menu -> ");
                   String t1=in.readLine();
                   if(t1.equalsIgnoreCase("back"))
                   ob.main_menu();
                   else
                   {
                        System.out.println("\t\t\t\t\tWrong Input!");
                        continue;
                   }
                   break;
        }
    }
}