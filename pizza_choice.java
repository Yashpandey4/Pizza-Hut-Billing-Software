
import java.io.*;
public class pizza_choice
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int code,size,number,flag,piz;
    void piz_ch()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\t\t\t\t© 2010 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        int k=0;
           switch(piz)
            {
                case 1:
                System.out.println("\t\t\t\t\tTastiest pizzas staring @ Rs.55*");
                System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t\t\t\t\tMAGIC PAN PIZZAS");
                System.out.println("\t\t\t\t\t\t\t\tVEG PIZZAS");
                System.out.println("\t\t\t\t\t      Name         Personal    Medium    Family");
                System.out.println("\t\t\t\t\tSIGNATURE");
                System.out.println("\t\t\t\t\t1.TANDOORI PANEER....220        395        595 ");
                System.out.println("\t\t\t\t\t(Paneer, onion, capsicum, red paprika and tomato.)");
                System.out.println("\t\t\t\t\t2.VEGGIE LOVERS......220        395        595 ");
                System.out.println("\t\t\t\t\t(Mushroom, onion, tomato and capsicum.)");
                System.out.println("\t\t\t\t\t3.PANEER MAKHANI.....220        395        595 ");
                System.out.println("\t\t\t\t\t(Paneer, capsicum, onion, and red paprika.)");
                System.out.println("\t\t\t\t\t4.COUNTRY FEAST......220        395        595 ");
                System.out.println("\t\t\t\t\t(Sweet corn, mushroom, tomato, onion and capsicum.)");
                System.out.println("\t\t\t\t\tSUPREME");
                System.out.println("\t\t\t\t\t5.FIERY RIDE.........260        470        695 ");
                System.out.println("\t\t\t\t\t(Tomato, Onion, Capsicum, Sweet Corn , Olives , Jalapenos & Green Chillies.)");
                System.out.println("\t\t\t\t\t6.PANEER VEGORAMA....260        470        695 ");
                System.out.println("\t\t\t\t\t(Paneer, Onion, Capsicum, Sweet Corn, Red Capsicum, Black Olives, Red Paprika & Green Chillies.)");
                System.out.println("\t\t\t\t\t7.VEGGIE SUPREME.....260        470        695 ");
                System.out.println("\t\t\t\t\t(Mushroom, capsicum, onion, tomato, baby corn and olives.)");
                System.out.println("\t\t\t\t\t8.EXOTICA............260        470        695 ");
                System.out.println("\t\t\t\t\t(Red capsicum, baby corn, capsicum, olives and jalapenos.)");
                
                System.out.println("\n\t\t\t\t\t\t\t\tNON-VEG PIZZAS");
                System.out.println("\t\t\t\t\t      Name            Personal    Medium    Family");
                System.out.println("\t\t\t\t\tSIGNATURE");
                System.out.println("\t\t\t\t\t9.CHICKEN ITALIA........250        450        655 ");
                System.out.println("\t\t\t\t\t(Chunks of chicken,cheese 'n' onion chicken sausage,sweet corn,olives and jalapenos.)");
                System.out.println("\t\t\t\t\t10.CHICKEN TIKKA........250        450        655 ");
                System.out.println("\t\t\t\t\t(Tandoori chicken, onion, tomato and green chillies.)");
                System.out.println("\t\t\t\t\t11.KADAI CHICKEN....... 250        450        655 ");
                System.out.println("\t\t\t\t\t(Kadai Chicken, onion, capsicum, red capsicum, green chillies, coriander and cheese.)");
                System.out.println("\t\t\t\t\tSUPREME");
                System.out.println("\t\t\t\t\t12.PEPPERONI............295        515        765 ");
                System.out.println("\t\t\t\t\t(100% pork pepperoni.)");
                System.out.println("\t\t\t\t\t13.TRIPLE CHICKEN FEAST.295        515        765 ");
                System.out.println("\t\t\t\t\t(Mexican Chicken, Plain Chicken, Chicken Hot & Spicy, Onion, Capsicum, Sweet Corn & Green Chillies.)");
                System.out.println("\t\t\t\t\t14.CHICKEN SUPREME......295        515        765 ");
                System.out.println("\t\t\t\t\t(Chicken Hot 'n' Spicy, chicken tikka and chunky chicken.)");
                System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
                
                while(true)  
                {
                    System.out.print("\t\t\t\t\tEnter 1 to order a pizza or 2 to go back to the order menu->");
                    flag=Integer.parseInt(in.readLine());
                    if(flag==1)
                    {
                        while(true)  
                        {
                            System.out.print("\t\t\t\t\tEnter the Item Code of Pizza you wish to have->");
                            //accept the input in a global variable, say code
                            code=Integer.parseInt(in.readLine());
                            if(code>14 || code<=0)
                            {
                                 System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                                 continue;
                            }
                            break;
                        }
                        while(true)  
                        {
                            System.out.print("\t\t\t\t\tEnter the size, i.e., 1 for Personal, 2 for Medium, 3 for Family->");
                            //accept the input in a global variable, say size
                            size=Integer.parseInt(in.readLine());
                            if(size>3 || size<=0)
                            {
                                 System.out.println("\t\t\t\t\tINVALID SIZE CODE! Please input a valid one.");
                                 continue;
                            }
                            break;
                        }
                        while(true)  
                        {
                            System.out.print("\t\t\t\t\tEnter the number of such pizzas you would like to order->");
                            //accept the input in a global variable, say number
                            number=Integer.parseInt(in.readLine());
                            if(number>20)
                            {
                                System.out.println("\t\t\t\t\tSorry, but our policy doesn't permit us bulk ordering above 20 pizzas in a single order.");
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
                                System.out.println("\t\t\t\t\tYou have to order more than one pizza!");
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
                break; //case 1 break
                
                case 2:
                System.out.println("\t\t\t\t\tBIG on size-BIG on Taste-BIG on Choice. Any BIG pizza for Rs.219");
                System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t\t\tTHE BIG PIZZA");
                System.out.println("\n\t\t\t\t\t\t\tVEG PIZZAS");
                System.out.println("\t\t\t\t\t       Name                   Price");
                System.out.println("\t\t\t\t\t   1.FARM HUT..................219");
                System.out.println("\t\t\t\t\t(Onion, Mushroom, Capsicum, Tomato & Cheese)");
                System.out.println("\t\t\t\t\t   2.ITALIAN TREAT.............219");
                System.out.println("\t\t\t\t\t(Capsicum, Black Olives, Tomato, Onion and Cheese)");
                
                System.out.println("\n\t\t\t\t\t\t\tNON-VEG PIZZAS");
                System.out.println("\t\t\t\t\t        Name                  Price");
                System.out.println("\t\t\t\t\t3.CHICKEN MEXICANO.............219");
                System.out.println("\t\t\t\t\t(Mexican Chicken, Onion, Capsicum, Sweet Corn & Cheese)");
                System.out.println("\t\t\t\t\t4.SPICY CHICKEN MAGIC..........219");
                System.out.println("\t\t\t\t\t(Chicken, Tomato, Onion, Green Chilies and Cheese)");
                System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
                while(true)  
                {
                    System.out.print("\t\t\t\t\tEnter 1 to order a pizza or 2 to go back to the order menu->");
                    flag=Integer.parseInt(in.readLine());
                    if(flag==1)
                    {
                        while(true)  
                        {
                            System.out.print("\t\t\t\t\tEnter the Item Code of Pizza you wish to have->");
                            //accept the input in a global variable, say code
                            code=Integer.parseInt(in.readLine());
                            if(code>4 || code<=0)
                            {
                                 System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                                 continue;
                            }
                            break;
                        }
                        while(true)  
                        {
                            System.out.print("\t\t\t\t\tEnter the number of such pizzas you would like to order->");
                            //do the same as above,in say number
                            number=Integer.parseInt(in.readLine());
                            if(number>20)
                            {
                                System.out.println("\t\t\t\t\tSorry, but our policy doesn't permit us bulk ordering above 20 pizzas in a single order.");
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
                                System.out.println("\t\t\t\t\tYou have to order more than one pizza!");
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
                break; //case 2 break
                
                case 3:
                System.out.println("\t\t\t\t\tCheese Loaded in every bite-cheddar on the side,creamy in the middle and mozzarela on top.");
                System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
                System.out.println("\t\t\t\t\t\t\t\tSO CHEESY PIZZAS");
                System.out.println("\t\t\t\t\t\t\tVEG PIZZAS");
                System.out.println("\t\t\t\t\t      Name                  Price");
                System.out.println("\t\t\t\t\t   1.VEG TREAT...............449");
                System.out.println("\t\t\t\t\t(Onion, Tomato, Capsicum, Sweet Corn, Jalapeno & Cheese)");
                System.out.println("\t\t\t\t\t   2.SUPER VEG...............499");
                System.out.println("\t\t\t\t\t(Mushroom, Capsicum, Onion, Sweet Corn, Red Paprika, Black Olives & Cheese)");
                
                System.out.println("\n\t\t\t\t\t\t\tVEG PIZZAS");
                System.out.println("\t\t\t\t\t       Name                 Price");
                System.out.println("\t\t\t\t\t3.HOT'N'SPICY CHICKEN........499");
                System.out.println("\t\t\t\t\t(Hot 'n' spicy Chicken, Mushroom, Tomato, Onion, Olives & Cheese)");
                 System.out.println("\t\t\t\t\t4.DOUBLE CHICKEN FEAST......569");
                System.out.println("\t\t\t\t\t(Chicken Tikka, Chicken Plain, Red Paprika, Capsicum, Sweet Corn, Jalapeno & Cheese)");
                System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
                while(true)  
                {
                    System.out.print("\t\t\t\t\tEnter 1 to order a pizza or 2 to go back to the order menu->");
                    flag=Integer.parseInt(in.readLine());
                    if(flag==1)
                    {
                        while(true)  
                        {
                            System.out.print("\t\t\t\t\tEnter the Item Code of Pizza you wish to have->");
                            //accept the input in a global variable, say code
                            code=Integer.parseInt(in.readLine());
                            if(code>4 || code<=0)
                            {
                                 System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                                 continue;
                            }
                            break;
                        }
                        while(true)  
                        {
                            System.out.print("\t\t\t\t\tEnter the number of such pizzas you would like to order->");
                            //do the same as above,in say number
                            number=Integer.parseInt(in.readLine());
                            if(number>20)
                            {
                                System.out.println("\t\t\t\t\tSorry, but our policy doesn't permit us bulk ordering above 20 pizzas in a single order.");
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
                                System.out.println("\t\t\t\t\tYou have to order more than one pizza!");
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
                break; //case 3 break
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
        k=0; ob.order(); ob.calculate();
    }
}
            