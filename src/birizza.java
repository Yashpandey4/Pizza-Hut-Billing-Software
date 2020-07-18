
import java.io.*;
public class birizza
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int flag,code,number,k;
    static void birizza()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("                    ,ggggggggggg,                                                           ");
        System.out.println("                    dP\"\"\"88\"\"\"\"\"\"Y8,                                                ");         
        System.out.println("                    Yb,  88      `8b                                                         ");
        System.out.println("                     `\"  88      ,8P  gg               gg                                    ");
        System.out.println("                         88aaaad8P\"   \"\"               \"\"                                ");    
        System.out.println("                         88\"\"\"\"Y8ba   gg    ,gggggg,   gg      ,gggg,     ,gggg,    ,gggg,gg ");
        System.out.println("                         88      `8b  88    dP\"\"\"\"8I   88     d8\"  Yb    d8\"  Yb   dP\"  \"Y8I"); 
        System.out.println("                         88      ,8P  88   ,8\'    8I   88    dP    dP   dP    dP  i8\'    ,8I ");
        System.out.println("                         88_____,d8\'_,88,_,dP     Y8,_,88,_,dP  ,adP\' ,dP  ,adP\' ,d8,   ,d8b,");
        System.out.println("                        88888888P\"  8P\"\"Y88P      `Y88P\"\"Y88\"   \"\"Y8d88\"   \"\"Y8d8P\"Y8888P\"`Y8");
        System.out.println("                                                                 ,d8I\'      ,d8I\'            ");
        System.out.println("                                                               ,dP\'8I     ,dP\'8I             ");
        System.out.println("                                                              ,8\"  8I    ,8\"  8I             ");
        System.out.println("                                                              I8   8I    I8   8I             ");
        System.out.println("                                                              `8, ,8I    `8, ,8I             ");
        System.out.println("                                                               `Y8P\"      `Y8P\"  ");
        try 
            {
                Thread.sleep(3000);                 //1000 milliseconds is one second.
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2010 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        System.out.println("\t\t\t\t\tA Delicious Masala rice sealed in Flavoured crust and served with tasty gravy.");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tBIRIZZAS");
        System.out.println("\t\t\t\t\t      Name                  Price");
        System.out.println("\t\t\t\t\t1.   VEGGIE..................109 ");
        System.out.println("\t\t\t\t\t(Corn, Capsicum and Seasonal vegetables)");
        System.out.println("\t\t\t\t\t2.   PANEER..................145 ");
        System.out.println("\t\t\t\t\t(Paneer cubes, Capsicum and Seasonal vegetables)");
        System.out.println("\t\t\t\t\t3.  CHICKEN..................165 ");
        System.out.println("\t\t\t\t\t(Chicken and Seasonal Vegetables)");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        while(true)  
        {
                System.out.print("\t\t\t\t\tEnter 1 to order a birizza or 2 to go back to the order menu->");
                flag=Integer.parseInt(in.readLine());
                if(flag==1)
                {
                    while(true)  
                    {
                        System.out.print("\t\t\t\t\tEnter the Item Code of birizza you wish to have->");
                        //accept the input in a global variable, say code
                        code=Integer.parseInt(in.readLine());
                        if(code>3 || code<=0)
                        {
                             System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                             continue;
                        }
                        break;
                    }
                    while(true)  
                    {
                        System.out.print("\t\t\t\t\tEnter the number of such birizzas you would like to order->");
                        //accept the input in a global variable, say number
                        number=Integer.parseInt(in.readLine());
                        if(number>20)
                        {
                            System.out.println("\t\t\t\t\tSorry, but our policy doesn't permit us bulk ordering above 20 birizzas in a single order.");
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
                            System.out.println("\t\t\t\t\tYou have to order more than one birizza!");
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
                    
                    
    