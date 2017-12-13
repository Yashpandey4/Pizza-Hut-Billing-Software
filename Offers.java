import java.io.*;
public class Offers
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static void offers()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2014 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t***************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tOFFERS");
        System.out.println("\t\t\t\t\t---------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t                       OFFER                                      COUPON CODE");
        System.out.println("\t\t\t\t\tFREE PERSONAL PIZZA ON PURCHASE OF ANY MEDIUM PIZZA..................PHE05");
        System.out.println("\t\t\t\t\t(**Offer vaid on Mondays only on Supreme and Signature range of Pizzas.)");
        System.out.println("\t\t\t\t\t25% OFF ON BILL OF RS 400 & ABOVE....................................PHE77");
        System.out.println("\t\t\t\t\t(**Offer vaid on Mondays only on A-la-cart order basis.)");
        System.out.println("\t\t\t\t\tFREE PLAIN GARLIC BREAD ON ANOTHER MEDIUM PIZZA......................PHE76");
        System.out.println("\t\t\t\t\t(**Offer vaid on Tuesdays only on Supreme and Signature range of Pizzas.");
        System.out.println("\t\t\t\t\tBUY 1 GET 1 FREE ON ANY MEDIUM PIZZA.................................PHE01");
        System.out.println("\t\t\t\t\t(**Offer vaid on Fridays and Weekends only on Supreme and Signature range of Pizzas.)");
        System.out.println("\t\t\t\t\tBUY ANY MEDIUM PIZZA & GET 50% OFF ON ANOTHER MEDIUM PIZZA...........PHE07");
        System.out.println("\t\t\t\t\t(**Offer vaid on Online Orders on Supreme and Signature range of Pizzas.)");
        System.out.println("\t\t\t\t\t---------------------------------------------------------------------------------------------------");
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