import java.io.*;
public class Feedback
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static void feedback()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2014 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t***************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\tFEEDBACK");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tLET US KNOW ABOUT YOUR EXPERIENCE WITH PIZZA HUT.");
        System.out.println("\t\t\t\t\tWe value your opinion and welcome your feedback. Kindly answer the following question.");
        while(true)
        {
            System.out.print("\t\t\t\t\tWas your experience at Pizza Hut Satisfactory? yes/no ->");
            String fb=in.readLine();
            if(fb.equals("no"))
            {
                System.out.println("\t\t\t\t\tThanks for your feedback. We are sorry for the unsatisfactory experience.");
                System.out.println("\t\t\t\t\tWe will get back to you within 24 hours.");
            }
            else if(fb.equals("yes"))
            {
                System.out.println("\t\t\t\t\tThanks for your feedback. Keep Visiting Pizza hut for more good times!");
            }
            else
            {
                System.out.println("\t\t\t\t\tWrong Choice!");
                continue;
            }
            break;
        }
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