
import java.io.*;
public class pizza
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int piz,t;
    static void pizzas()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("                   .----------------.  .----------------.  .----------------.  .----------------.  .----------------.       ");
        System.out.println("                   | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |");
        System.out.println("                   | |   ______     | || |     _____    | || |   ________   | || |   ________   | || |      __      | |");
        System.out.println("                   | |  |_   __ \\   | || |    |_   _|   | || |  |  __   _|  | || |  |  __   _|  | || |     /  \\     | |");
        System.out.println("                   | |    | |__) |  | || |      | |     | || |  |_/  / /    | || |  |_/  / /    | || |    / /\\ \\    | |");
        System.out.println("                   | |    |  ___/   | || |      | |     | || |     .'.' _   | || |     .'.' _   | || |   / ____ \\   | |");
        System.out.println("                   | |   _| |_      | || |     _| |_    | || |   _/ /__/ |  | || |   _/ /__/ |  | || | _/ /    \\ \\_ | |");
        System.out.println("                   | |  |_____|     | || |    |_____|   | || |  |________|  | || |  |________|  | || ||____|  |____|| |");
        System.out.println("                   | |              | || |              | || |              | || |              | || |              | |");
        System.out.println("                   | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |");
        System.out.println("                   '----------------'  '----------------'  '----------------'  '----------------'  '----------------' ");
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
        System.out.println("\t\t\t\t\tOur World Famous thick crust pizzas-Baked to perfection to suit your taste.");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tPIZZAS");
        System.out.println("\t\t\t\t\t1. MAGIC PAN PIZZAS.........our signature Pizzas");
        System.out.println("\t\t\t\t\t2. THE BIG PIZZAS...........for people who like it BIGGG");
        System.out.println("\t\t\t\t\t3. SO CHEEZY PIZZAS.........Indias Cheeziest Pizzas");
        System.out.println("\t\t\t\t\t4. EXIT TO ORDER MENU");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        
        while(true)
        {
            t=0;
            System.out.print("\t\t\t\t\tPlease Enter Your Choice -> ");
            piz=Integer.parseInt(in.readLine());
            switch(piz)
            {
                case 1:
                
                case 2:
                
                case 3:
                ob.piz_ch();
                break;
                
                case 4:
                ob.order();
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
