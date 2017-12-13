
import java.io.*;
public class About_us
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static void about_us()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2014 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t***************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tABOUT US");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tIt was the summer of 1958 when Dan and Frank Carney decided to open a pizzeria. With mouth-watering");
        System.out.println("\t\t\t\t\tpizzas prepared by the founders themselves, Pizza Hut soon became the most popular neighbourhood");
        System.out.println("\t\t\t\t\trestaurant. From then to over 13,200 restaurants across the world today, we have come a long way."); 
        System.out.println("\t\t\t\t\tToday, Pizza Hut is about much more than pizzas. From freshly sauteed pastas & delicious appetizers");
        System.out.println("\t\t\t\t\tto mocktails, desserts, soups and salads, we have a wide range for you to feast on. All this,");
        System.out.println("\t\t\t\t\tcombined with the warm, inviting ambience and friendly service, will lead to endless conversations,");
        System.out.println("\t\t\t\t\tlaughter and memories that you'll cherish forever. So, let your hair down and feel at ease."); 
        System.out.println("\t\t\t\t\tGo ahead and enjoy the All New Pizza Hut experience!");
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
                
    
