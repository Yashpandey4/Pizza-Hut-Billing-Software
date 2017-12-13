
import java.io.*;
public class order
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);
    static int ord,t;
    static void order()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2010 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        System.out.println("\t\t\t\t\tWhat Shall we bake for you today?");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tORDER MENU");
        System.out.println("\t\t\t\t\t1. PIZZA....................enjoy from over 80 lip smacking varieties");
        System.out.println("\t\t\t\t\t2. BIRIZZA..................the joy of biryani combined with the fun of pizza hut");
        System.out.println("\t\t\t\t\t3. SIDES....................If you haven't had enough with just the pizzas");
        System.out.println("\t\t\t\t\t4. DESSERTS AND DRINKS......Fresh from our ovens. And Blenders");
        System.out.println("\t\t\t\t\t5. VALUE MEALS..............Our pizzas for your entire family at reasonable rates");
        System.out.println("\t\t\t\t\t6. PROCEED TO CHECKOUT");
        System.out.println("\t\t\t\t\t7. EXIT TO MAIN MENU");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        
        while(true)
        {
            t=0;
            System.out.print("\t\t\t\t\tPlease Enter Your Choice -> ");
            ord=Integer.parseInt(in.readLine());
            switch(ord)
            {
                case 1:
                ob.pizzas();
                break;
                
                case 2:
                ob.birizza();
                break;
                
                case 3:
                ob.sides();
                break;
                
                case 4:
                ob.dessserts();
                break;
                
                case 5:
                ob.meals();
                break;
                
                case 6:
                
                break;
                
                case 7:
                ob.main_menu();
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
        
        
        

    