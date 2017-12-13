
import java.io.*;
public class Desserts
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int flag,code,number,k;
    static void dessserts()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("oooooooooo.                                                      .            ");
        System.out.println("888\'   `Y8b                                                   .o8             ");
        System.out.println("888      888  .ooooo.   .oooo.o  .oooo.o  .ooooo.  oooo d8b .o888oo  .oooo.o  ");
        System.out.println("888      888 d88\' `88b d88(  \"8 d88(  \"8 d88\' `88b `888\"\"8P   888   d88(  \"8  ");
        System.out.println("888      888 888ooo888 `\"Y88b.  `\"Y88b.  888ooo888  888       888   `\"Y88b.   ");
        System.out.println("888     d88\' 888    .o o.  )88b o.  )88b 888    .o  888       888 . o.  )88b  ");
        System.out.println("o888bood8P\'   `Y8bod8P\' 8\"\"888P\' 8\"\"888P\' `Y8bod8P\' d888b      \"888\" 8\"\"888P\'  ");
        try 
        {
                Thread.sleep(2000);                 //1000 milliseconds is one second.
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2010 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        System.out.println("\t\t\t\t\tDessert-e-licious. Fresh from our ovens. And Blenders.");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tDESSERTS & DRINKS");
        System.out.println("\t\t\t\t\t       Name                    Price");
        System.out.println("\t\t\t\t\t1. CHOCO MOUSSE................69.00");
        System.out.println("\t\t\t\t\t(Alternating layers of choco creme and brownie, topped with fresh almonds)");
        System.out.println("\t\t\t\t\t2. CHOCO TRUFFLE CAKE..........69.00");
        System.out.println("\t\t\t\t\t(Sizzling hot chocolate over a perfectly baked brownie with choco chips on top)");
        System.out.println("\t\t\t\t\t3. CHOCO CHIP LAVA..........30.00");
        System.out.println("\t\t\t\t\t(Sizzling hot chocolate inside a thick crust cookie with choco chips on top)");
        System.out.println("\t\t\t\t\t4. COKE/PEPSI/MIRINDA..........30.00");
        System.out.println("\t\t\t\t\t(600 ml, Sold at MRP)");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        while(true)  
        {
                System.out.print("\t\t\t\t\tEnter 1 to order a Dessert or 2 to go back to the order menu->");
                flag=Integer.parseInt(in.readLine());
                if(flag==1)
                {
                    while(true)  
                    {
                        System.out.print("\t\t\t\t\tEnter the Item Code of the Dessert you wish to have->");
                        //accept the input in a global variable, say code
                        code=Integer.parseInt(in.readLine());
                        if(code<1 || code>4)
                        {
                            System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                            continue;
                        }
                        break;
                    }
                    while(true)  
                    {
                        System.out.print("\t\t\t\t\tEnter the number of such items you would like to order->");
                        //accept the input in a global variable, say number
                        number=Integer.parseInt(in.readLine());
                        if(number>20)
                        {
                            System.out.println("\t\t\t\t\tSorry, but our policy doesn't permit us bulk ordering above 20 Desserts in a single order.");
                            System.out.println("\t\t\t\t\tPlease consult our website for more information.");
                            continue;
                        }
                        if(number<0)
                        {
                            System.out.println("\t\t\t\t\tINVALID NUMBER OF ITEMS! Please input a valid one.");
                            continue;
                        }
                        if(number==0)
                        {
                            System.out.println("\t\t\t\t\tYou have to order more than one item!");
                            continue;
                        }
                        break;
                    }
                   
                }
                else if(flag==2)
                {
                   ob.order();
                }
                else   
                {  
                    System.out.println("\t\t\t\t\tWrong choice!"); 
                    continue;
                }
                break;
        }
        System.out.print("\f");
        System.out.print("ORDERING ");
        for(int i=0;i<=6;i++) 
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
                System.out.print("ORDERING ");
                k=0;
            }
        }
        k=0;
        ob.calculate();
        ob.order();
    }
}