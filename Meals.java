import java.io.*;
public class Meals
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int flag,code,k;
    static void meals()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("ooo        ooooo                     oooo           ");
        System.out.println("`88.       .888\'                     `888           ");
        System.out.println(" 888b     d\'888   .ooooo.   .oooo.    888   .oooo.o ");
        System.out.println(" 8 Y88. .P  888  d88\' `88b `P  )88b   888  d88(  \"8 ");
        System.out.println(" 8  `888\'   888  888ooo888  .oP\"888   888  `\"Y88b. "); 
        System.out.println(" 8    Y     888  888    .o d8(  888   888  o.  )88b ");
        System.out.println("o8o        o888o `Y8bod8P\' `Y888\"\"8o o888o 8\"\"888P\' ");
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
        System.out.println("\t\t\t\t\tOur pizzas for your entire family at reasonable rates.");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tVALUE MEALS");
        System.out.println("\t\t\t\t\t       Name                    Price");
        System.out.println("\t\t\t\t\t1. MEAL FOR 1..................199.00");
        System.out.println("\t\t\t\t\t(Paneer Birizza + Plain Garlic Bread (2pc) + Pepsi)");
        System.out.println("\t\t\t\t\t2. MEAL FOR 2..................449.00");
        System.out.println("\t\t\t\t\t(1 Medium Pizza + 1 Garlic Bread + Pepsi)");
        System.out.println("\t\t\t\t\t3. MEAL FOR 4..................799.00");
        System.out.println("\t\t\t\t\t(2 Medium Pizzas + 1 Garlic Bread + 2 Desserts)");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  COMBOS");
        System.out.println("\t\t\t\t\t4. VEGGIE MAGIC DUO............275.00");
        System.out.println("\t\t\t\t\t(Tomato and Corn,Green Capsicum and Corn Onion,Tomato and Green Chillies,Paneer and Green Capsicum)");
        System.out.println("\t\t\t\t\t5. NON VEGGIE MAGIC DUO........355.00");
        System.out.println("\t\t\t\t\t(Chicken and Green Capsicum,Onion Chicken and Green Chillies,Chicken and Corn, Chicken and Tomato)");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        while(true)  
        {
                System.out.print("\t\t\t\t\tEnter 1 to order a Meal or 2 to go back to the order menu->");
                flag=Integer.parseInt(in.readLine());
                if(flag==1)
                {
                    while(true)  
                    {
                        System.out.print("\t\t\t\t\tEnter the Item Code of the Meal you wish to have->");
                        code=Integer.parseInt(in.readLine());
                        if(code<1 || code>5)
                        {
                            System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
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