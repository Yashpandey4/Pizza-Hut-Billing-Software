import java.io.*;
public class sides
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int flag,code,number,k;
    static void sides()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println(" ad88888ba   88           88             ");            
        System.out.println("d8\"     \"8b  \"\"           88                   ");       
        System.out.println("Y8,                       88                         "); 
        System.out.println("`Y8aaaaa,    88   ,adPPYb,88   ,adPPYba,  ,adPPYba,  "); 
        System.out.println("  `\"\"\"\"\"8b,  88  a8\"    `Y88  a8P_____88  I8[    \"\"  "); 
        System.out.println("        `8b  88  8b       88  8PP\"\"\"\"\"\"\"   `\"Y8ba,   "); 
        System.out.println("Y8a     a8P  88  \"8a,   ,d88  \"8b,   ,aa  aa    ]8I  "); 
        System.out.println(" \"Y88888P\"   88   `\"8bbdP\"Y8   `\"Ybbd8\"\'  `\"YbbdP\"\'  "); 
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
        System.out.println("\t\t\t\t\tSavour the Side stories and compliment your meals if just the Pizzas aren't enough.");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tSIDES");
        System.out.println("\t\t\t\t\t       Name                  Price");
        System.out.println("\t\t\t\t\t1. VEG BAKED PASTA...........125.00");
        System.out.println("\t\t\t\t\t(Spicy Tomato Sauce with Mozzarella Cheese, Onion, Capsicum and Chopped Parsley mixed with Fussilli Pasta.)");
        System.out.println("\t\t\t\t\t2. CHICKEN BAKED PASTA.......145.00");
        System.out.println("\t\t\t\t\t(Spicy Tomato Sauce with Mozzarella Cheese, Onion, Capsicum and Chopped Parsley mixed with Fussilli Pasta.)");
        System.out.println("\t\t\t\t\t3. CHICKEN WINGS.............149.00");
        System.out.println("\t\t\t\t\t(6 piece of tender, juicy chicken wings tossed in spicy BBQ sauce.)");
        System.out.println("\t\t\t\t\t4. GARLIC BREAD STIX..........99.00");
        System.out.println("\t\t\t\t\t(Freshly Baked, Buttery Garlic Bread Sticks served with Cheese!)");
        System.out.println("\t\t\t\t\t5. POTATO WEDGES..............89.00");
        System.out.println("\t\t\t\t\t(Crispy potato wedges seasoned with a tinge of garlic!)");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        while(true)  
        {
                System.out.print("\t\t\t\t\tEnter 1 to order a side or 2 to go back to the order menu->");
                flag=Integer.parseInt(in.readLine());
                if(flag==1)
                {
                    while(true)  
                    {
                        System.out.print("\t\t\t\t\tEnter the Item Code of the side you wish to have->");
                        //accept the input in a global variable, say code
                        code=Integer.parseInt(in.readLine());
                        if(code<1 || code>5)
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
                            System.out.println("\t\t\t\t\tSorry, but our policy doesn't permit us bulk ordering above 20 sides in a single order.");
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
        number=1;
        ob.calculate();
        ob.order();
    }
}