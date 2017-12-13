
import java.io.*;
public class main_Menu
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int mm,t;
    static void main_menu()throws IOException //this isnt your MAIN METHOD!!!
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2014 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        System.out.println("\t\t\t\t\tIndia's most trusted restaurant brand, Pizza Hut India offers exciting new range of fresh");
        System.out.println("\t\t\t\t\tItalian cooking. With outlets in over 34 cities, we explore new dishes to leave you lip smacking.");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tMAIN MENU");
        System.out.println("\t\t\t\t\tHow shall we serve you today?");
        System.out.println("\t\t\t\t\t1. ABOUT US");
        System.out.println("\t\t\t\t\t2. ORDER");
        System.out.println("\t\t\t\t\t3. OFFERS");
        System.out.println("\t\t\t\t\t4. STORE LOCATIONS");
        System.out.println("\t\t\t\t\t5. FEEDBACK");
        System.out.println("\t\t\t\t\t6. EXIT");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        while(true)
        {
            t=0;
            System.out.print("\t\t\t\t\tPlease Enter Your Choice -> ");
            mm=Integer.parseInt(in.readLine());
            switch(mm)
            {
                case 1:
                ob.about_us();
                break;
                
                case 2:
                ob.order();
                break;
                
                case 3:
                ob.offers();
                break;
                
                case 4:
                ob.store_locs();
                break;
                
                case 5:
                ob.feedback();
                break;
                
                case 6:
                ob.exit();
                break;
                
                default:
                System.out.println("\t\t\t\t\tWrong Choice!");
                t=1;
            }
            if(t==1)
            continue;
             else
            break;
        }
    }
}
        
    
    
   
       