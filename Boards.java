import java.util.*;
import java.io.*;
public class Boards
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int mm,t,ord,piz,code,size,number,flag,k;
    static int gross;     static String arr[]=new String[100];    static int j=0;
    static void start()throws IOException
    {
         System.out.println("\f");
         System.out.println("                                                                   ;^1f9 !9                          ");
         System.out.println("                                                              -l<?35ku6s^!9u~                          ");
         System.out.println("                                                         .*leu52UAuj?Ij1=19oI                          ");
         System.out.println("                                                    -*I326u6ZkZ?Lr1j^tjr11io5*                         ");
         System.out.println("                                                  1ZVSu25o<<!11^<j^j^r999r!12I                         ");
         System.out.println("                                                 98|L1^r1!^rIIr11t9j!!99rIi165*                        ");
         System.out.println("                                                luorj9=19I99<9jtj9991t9r!^1I|A6|r9-                    ");
         System.out.println("                                                3e9I^==II19jt<j1ir99!=r<19=99?uUu52k?^_                ");
         System.out.println("                                               j?1^r19I<9<!1r1919I<9^9j9I9<t!r17|aa2kuVuu^*            ");
         System.out.println("                                              !^1j9r^91t91j1!1<9=<191iI^tt9rtjt=9^^917uuUSVU2I*        ");
         System.out.println("                                              *i9j1!9r9r99<I!119<11I1^I911riI<<9191t9^919<tu$9u319     ");
         System.out.println("                                           -^1j1<<irj!r!j999It19<9<1rI1j9^11<I^jr^jr9I9IjI9!1Iju5S6e_  ");
         System.out.println("                                        ~9|2sj9r=r991t<^911!!9rI=t11111i111!I9=<tL|oeuoZ62u2e9<I9l!?;  ");
         System.out.println("                                      <u99ti1rI91rt^991tr<199r^^r<9iIr1e?|uo2Vkkk6kuUuSUAuk$2^j9r.     ");
         System.out.println("                                   _?S$u?I991999t9^919Iij^9jsjt5aZ5k2u66$uUk5V5V5$kVSVdu33ZZ1!~*-       ");
         System.out.println("                                 l7$S291!111jjI99911<?oeS52o3u$u6Uu$u2dokaoj?79l99*lll--               ");
         System.out.println("                               1u263119j91!t<IL72oZu9kVko9*ll1uL=I!9;l_                                ");
         System.out.println("                             lo6aL19991e1?ak6dV2uu8Z2L1l91|e*                                          ");
         System.out.println("                           rk9Z79^I|uSSk2u28u6LI^9_   _jsoZ_                                           ");
         System.out.println("                        l36uo|ZZ6S6866|e9l_.        _?e|o,                                            ");
         System.out.println("                       lu26kkukk55?<l_               9su1-             l**9l9I?osjj_       l!1oj72I    ");
         System.out.println("                      5k$6k1r9:                      lj               3k2u6k62d6kVu     9o25$kk2Vo    ");
         System.out.println("                      ll9*                               -_*l9l^Il9<9 !LkkeoI2uVus,   ~u$uue998Z29    ");
         System.out.println("                                   _!=I71Ill         1e *UVk$udk666$6l      72VSo    ^kkV7*  ?5ku     ");
         System.out.println("                                *o6u2SVk56$97_       ek6l 9oj2|j=o$6d?     1k92V^    <dAuj l9o$U66^!!* ");
         System.out.println("                              1kSdUSSukkAkkAk^     ?V82       ;ekuS^    9o8$ksl     2$ud6386ko628d52: ");
         System.out.println("                              12|ZdA^lto$66kku_   ?5U5^     _?2Skd=   ~s686Ui       Lu86d2u19 -l=*,   ");
         System.out.println("                                 *626:   lekuUV1  tV266l    1V92uo-   IVkuu5UV25eee|e-L??t~            ");
         System.out.println("                                l6k2Z      3$uSI 9k56S!   9kku68=    lkd8uSUudV8822^*                  ");
         System.out.println("                                _k62u_      Lddk^ sudU7  -su82$2l -_   l_*~-*_**l,_                     ");
         System.out.println("                              -kk2U2      9$2ut  oU62  l6u2d25ukakd6uLe7!l^9ljuj    -                  ");
         System.out.println("                              euk2Sl     92$2o   j5k9 l8uu6VS68$5uA2kuSSku66$o1l   lS2                 ");
         System.out.println("                             =uu65|   -!3d8u9     9?   joZ?lll~*l9**l_l*99**      9$51      _-         ");
         System.out.println("                             VkSk69_1LuSS1*       l       -9                     *5ku*l^Iosej_         ");
         System.out.println("                            7Vk5k?9uf|i*         32l     luk_               _l_~96U56268|j9*           ");
         System.out.println("                           -6d5u8*              7do     l2A3             l-:dU862k6k3t9_               ");
         System.out.println("                           ju6621              ?kU1     |SkI ll^*       I6Z l99k$6ul                   ");
         System.out.println("                           Vk6uu              ^62k*    l9ku9 956A9     lkuo   -k6ur                    ");
         System.out.println("                          9k685^             !5A2Z     oUS29^ jk$e    7uSA<   1kV|                     ");
         System.out.println("                          Z2k5j              2uu6-    ^5V6dor.ukVu  9|$2uul  :66kl                     ");
         System.out.println("                         -6$U5l             1ud6Z^ro332k2di  !kS61lo8S|k6k*  lS6?                      ");
         System.out.println("                         ^6u5!         :l19ZSAkA65dV$92u2k-  k5uuuku69_U86l l7kul             *,       ");
         System.out.println("                         <6So         lV68u5V6UU2Ae1*1k8d7   ud5dkkj*  rA5_  ^2j    ~_9;9999I9l9       ");
         System.out.println("                         l3L,         -j2Zk6kd6|l-   2uukr   972o1l     _9*  <6<l9iir91rIIl** 999;      ");
         System.out.println("                                          kUuk|     9$2du                 *9<1j9^99199~-     ,9r9l     ");
         System.out.println("                                         lA5SUI     926Ur            *99!rI!1I!tr=_-          ~9^l     ");
         System.out.println("                                         sSSUul      !1l         l9^9<1I1j91^l_-                       ");
         System.out.println("                                        -d6k6e               -~91999=9I!<9l_                           ");
         System.out.println("                                        ldS6Vl            ~l9<I9j=tj9^*~                               ");
         System.out.println("                                         ?k3t         _*9999^1r^jlll                                   ");
         System.out.println("                                         :       -*^^<r<99j9r9l*                                      ");
         System.out.println("                                               *9^j^!I11^j99l*                                         ");
         System.out.println("                                              ;199<1t19<ll                                             ");
         try 
         {
            Thread.sleep(4000);                 //1000 milliseconds is one second.
         } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
         }
         System.out.println("\f");
    }
    
    static void main()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        mm=t=ord=piz=code=size=number=flag=k=gross=j=0;
        for(int i=0;i<100;i++)
        {
            arr[i]="";
        }
        ob.start();
        ob.main_menu();
    }
    
    static void main_menu()throws IOException //this isnt your MAIN METHOD!!!
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2014 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        System.out.println("\t\t\t\t\tIndia's most trusted restaurant brand, Pizza Hut India offers exciting new range of fresh");
        System.out.println("\t\t\t\t\tItalian cooking. With outlets in over 34 cities, we explore new dishes to leave you lip smacking.");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\tMAIN MENU");
        System.out.println("\t\t\t\t\tHow shall we serve you today?");
        System.out.println("\t\t\t\t\t1. ABOUT US");
        System.out.println("\t\t\t\t\t2. ORDER");
        System.out.println("\t\t\t\t\t3. OFFERS");
        System.out.println("\t\t\t\t\t4. STORE LOCATIONS");
        System.out.println("\t\t\t\t\t5. FEEDBACK");
        System.out.println("\t\t\t\t\t6. EXIT");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        while(true)
        {
            t=0;
            
            while(true)
            {
                try
                {
                    System.out.print("\t\t\t\t\tPlease Enter Your Choice -> ");
                    mm=Integer.parseInt(in.readLine());
                    break;
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("\t\t\t\t\tError!");
                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                }
            }
            switch(mm)
            {
                case 1:
                ob.about_us();
                break;
                
                case 2:
                ob.order();
                break;
                
                case 3:
                ob.offers();
                break;
                
                case 4:
                ob.store_locs();
                break;
                
                case 5:
                ob.feedback();
                break;
                
                case 6:
                ob.exit();
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
    
    void about_us()throws IOException
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
            while(true)
            {
                try
                {    
                    System.out.print("\t\t\t\t\tPlease Enter Your Choice -> ");
                    ord=Integer.parseInt(in.readLine());
                    break;
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("\t\t\t\t\tError!");
                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                }
            }
        
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
                if(code==0)
                {
                    System.out.println("\f");
                    System.out.println("\n\n\n");
                    System.out.println("\t\t\t\t© 2010 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
                    System.out.println("\t\t\t\t\t**************************************************************************************************");
                    System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\t\t\tError 404: It seems that You Haven't Ordered Anything With us yet.");
                    System.out.println("\t\t\t\t\t\tTo Indulge India's Most Loved Lip Smacking Pizzas, Start Ordering From Pizza Hut now!");
                    System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\t\t**************************************************************************************************");
                    try 
                    {
                        Thread.sleep(3000);                 //1000 milliseconds is one second.
                    } 
                    catch(InterruptedException ex) 
                    {
                        Thread.currentThread().interrupt();
                    }
                    ob.order();
                }
                else
                {
                    ob.bill();
                }
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
                Thread.sleep(1000);                 //1000 milliseconds is one second.
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
            while(true)
            {
                try
                {   
                    System.out.print("\t\t\t\t\tPlease Enter Your Choice -> ");
                    piz=Integer.parseInt(in.readLine());
                    break;
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("\t\t\t\t\tError!");
                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                }
            }
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
    
    static void piz_ch()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\t\t\t\t© 2010 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        
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
                    while(true)
                    {
                        try
                        {  
                            System.out.print("\t\t\t\t\tEnter 1 to order a pizza or 2 to go back to the order menu -> ");
                            flag=Integer.parseInt(in.readLine());
                            break;
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("\t\t\t\t\tError!");
                            System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                        }
                    }
                    if(flag==1)
                    {
                        while(true)  
                        {
                            while(true)
                            {
                                try
                                {   
                                    System.out.print("\t\t\t\t\tEnter the Item Code of Pizza you wish to have -> ");
                                    //accept the input in a global variable, say code
                                    code=Integer.parseInt(in.readLine());
                                    break;
                                }
                                catch(NumberFormatException ex)
                                {
                                    System.out.println("\t\t\t\t\tError!");
                                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                                }
                            }
                            if(code>14 || code<=0)
                            {
                                 System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                                 continue;
                            }
                            break;
                        }
                        while(true)  
                        {
                            while(true)
                            {
                                try
                                {   
                                    System.out.print("\t\t\t\t\tEnter the size, i.e., 1 for Personal, 2 for Medium, 3 for Family -> ");
                                    //accept the input in a global variable, say size
                                    size=Integer.parseInt(in.readLine());
                                    break;
                                }
                                catch(NumberFormatException ex)
                                {
                                    System.out.println("\t\t\t\t\tError!");
                                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                                }
                            }
                            if(size>3 || size<=0)
                            {
                                 System.out.println("\t\t\t\t\tINVALID SIZE CODE! Please input a valid one.");
                                 continue;
                            }
                            break;
                        }
                        while(true)  
                        {
                            while(true)
                            {
                                try
                                { 
                                    System.out.print("\t\t\t\t\tEnter the number of such pizzas you would like to order -> ");
                                    //accept the input in a global variable, say number
                                    number=Integer.parseInt(in.readLine());
                                    break;
                                }
                                catch(NumberFormatException ex)
                                {
                                    System.out.println("\t\t\t\t\tError!");
                                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                                }
                            }
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
                    while(true)
                    {
                        try
                        { 
                            System.out.print("\t\t\t\t\tEnter 1 to order a pizza or 2 to go back to the order menu -> ");
                            flag=Integer.parseInt(in.readLine());
                            break;
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("\t\t\t\t\tError!");
                            System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                        }
                    }
                    if(flag==1)
                    {
                        while(true)  
                        {
                            while(true)
                            {
                                try
                                {  
                                    System.out.print("\t\t\t\t\tEnter the Item Code of Pizza you wish to have -> ");
                                    //accept the input in a global variable, say code
                                    code=Integer.parseInt(in.readLine());
                                    break;
                                }
                                catch(NumberFormatException ex)
                                {
                                    System.out.println("\t\t\t\t\tError!");
                                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                                }
                            }
                            if(code>4 || code<=0)
                            {
                                 System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                                 continue;
                            }
                            break;
                        }
                        while(true)  
                        {
                            while(true)
                            {
                                try
                                {  
                                    System.out.print("\t\t\t\t\tEnter the number of such pizzas you would like to order -> ");
                                    //do the same as above,in say number
                                    number=Integer.parseInt(in.readLine());
                                    break;
                                }
                                catch(NumberFormatException ex)
                                {
                                    System.out.println("\t\t\t\t\tError!");
                                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                                }
                            }
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
                System.out.println("\t\t\t\t\t\t\t\tSO CHEEZY PIZZAS");
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
                    while(true)
                    {
                        try
                        {  
                            System.out.print("\t\t\t\t\tEnter 1 to order a pizza or 2 to go back to the order menu -> ");
                            flag=Integer.parseInt(in.readLine());
                            break;
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("\t\t\t\t\tError!");
                            System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                        }
                    }
                    if(flag==1)
                    {
                        while(true)  
                        {
                            while(true)
                            {
                                try
                                {  
                                    System.out.print("\t\t\t\t\tEnter the Item Code of Pizza you wish to have -> ");
                                    //accept the input in a global variable, say code
                                    code=Integer.parseInt(in.readLine());
                                    break;
                                }
                                catch(NumberFormatException ex)
                                {
                                    System.out.println("\t\t\t\t\tError!");
                                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                                }
                            }
                            if(code>4 || code<=0)
                            {
                                 System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                                 continue;
                            }
                            break;
                        }
                        while(true)  
                        {
                            while(true)
                            {
                                try
                                {  
                                    System.out.print("\t\t\t\t\tEnter the number of such pizzas you would like to order -> ");
                                    //do the same as above,in say number
                                    number=Integer.parseInt(in.readLine());
                                    break;
                                }
                                catch(NumberFormatException ex)
                                {
                                    System.out.println("\t\t\t\t\tError!");
                                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                                }
                            }
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
        k=0;
        ob.calculate();
        ob.order();
    }
    
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
                Thread.sleep(1000);                 //1000 milliseconds is one second.
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
        
        while(true)  
        {
            while(true)
            {
                try
                {    
                    System.out.print("\t\t\t\t\tEnter 1 to order a birizza or 2 to go back to the order menu -> ");
                    flag=Integer.parseInt(in.readLine());
                    break;
                }
                catch(NumberFormatException ex)
                {
                    System.out.println("\t\t\t\t\tError!");
                    System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                }
            }
            if(flag==1)
            {
                while(true)  
                {
                    while(true)
                    {
                        try
                        {   
                            System.out.print("\t\t\t\t\tEnter the Item Code of birizza you wish to have -> ");
                            //accept the input in a global variable, say code
                            code=Integer.parseInt(in.readLine());
                            break;
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("\t\t\t\t\tError!");
                            System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                        }
                    }
                    if(code>3 || code<=0)
                    {
                         System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                         continue;
                    }
                    break;
                }
                while(true)  
                {
                    while(true)
                    {
                        try
                        {  
                            System.out.print("\t\t\t\t\tEnter the number of such birizzas you would like to order -> ");
                           //accept the input in a global variable, say number
                           number=Integer.parseInt(in.readLine());
                           break;
                        }
                        catch(NumberFormatException ex)
                        {
                            System.out.println("\t\t\t\t\tError!");
                            System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                        }
                    }
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
                Thread.sleep(1000);                 //1000 milliseconds is one second.
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
                while(true)
                {
                    try
                    {    
                        System.out.print("\t\t\t\t\tEnter 1 to order a side or 2 to go back to the order menu -> ");
                        flag=Integer.parseInt(in.readLine());
                        break;
                    }
                    catch(NumberFormatException ex)
                    {
                        System.out.println("\t\t\t\t\tError!");
                        System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                    }
                }
                if(flag==1)
                {
                    while(true)  
                    {
                        while(true)
                        {
                            try
                            {   
                                System.out.print("\t\t\t\t\tEnter the Item Code of the side you wish to have -> ");
                                //accept the input in a global variable, say code
                                code=Integer.parseInt(in.readLine());
                                break;
                            }
                            catch(NumberFormatException ex)
                            {
                                System.out.println("\t\t\t\t\tError!");
                                System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                            }
                        }
                        if(code<1 || code>5)
                        {
                            System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                            continue;
                        }
                        break;
                    }
                    while(true)  
                    {
                        while(true)
                        {
                            try
                            {      
                                System.out.print("\t\t\t\t\tEnter the number of such items you would like to order -> ");
                                //accept the input in a global variable, say number
                                number=Integer.parseInt(in.readLine());
                                break;
                            }
                            catch(NumberFormatException ex)
                            {
                                System.out.println("\t\t\t\t\tError!");
                                System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                            }
                        }
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
        ob.calculate();
        ob.order();
    }
    
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
                Thread.sleep(1000);                 //1000 milliseconds is one second.
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
        System.out.println("\t\t\t\t\t3. CHOCO CHIP LAVA.............30.00");
        System.out.println("\t\t\t\t\t(Sizzling hot chocolate inside a thick crust cookie with choco chips on top)");
        System.out.println("\t\t\t\t\t4. COKE/PEPSI/MIRINDA..........30.00");
        System.out.println("\t\t\t\t\t(600 ml, Sold at MRP)");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        while(true)  
        {
                while(true)
                {
                    try
                    {     
                        System.out.print("\t\t\t\t\tEnter 1 to order a Dessert or 2 to go back to the order menu -> ");
                        flag=Integer.parseInt(in.readLine());
                        break;
                    }
                    catch(NumberFormatException ex)
                    {
                        System.out.println("\t\t\t\t\tError!");
                        System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                    }
                }
                if(flag==1)
                {
                    while(true)  
                    {
                        while(true)
                        {
                            try
                            {   
                                System.out.print("\t\t\t\t\tEnter the Item Code of the Dessert you wish to have -> ");
                                //accept the input in a global variable, say code
                                code=Integer.parseInt(in.readLine());
                                break;
                            }
                            catch(NumberFormatException ex)
                            {
                                System.out.println("\t\t\t\t\tError!");
                                System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                            }
                        }
                        if(code<1 || code>5)
                        {
                            System.out.println("\t\t\t\t\tINVALID ITEM CODE! Please input a valid one.");
                            continue;
                        }
                        break;
                    }
                    while(true)  
                    {
                        while(true)
                        {
                            try
                            {  
                                System.out.print("\t\t\t\t\tEnter the number of such items you would like to order -> ");
                                //accept the input in a global variable, say number
                                number=Integer.parseInt(in.readLine());
                                break;
                            }
                            catch(NumberFormatException ex)
                            {
                                System.out.println("\t\t\t\t\tError!");
                                System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                            }
                        }
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
                Thread.sleep(1000);                 //1000 milliseconds is one second.
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
                while(true)
                {
                    try
                    {     
                        System.out.print("\t\t\t\t\tEnter 1 to order a Meal or 2 to go back to the order menu -> ");
                        flag=Integer.parseInt(in.readLine());
                         break;
                    }
                    catch(NumberFormatException ex)
                    {
                        System.out.println("\t\t\t\t\tError!");
                        System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                    }
                }
                if(flag==1)
                {
                    while(true)  
                    {
                        while(true)
                        {
                            try
                            {    
                                System.out.print("\t\t\t\t\tEnter the Item Code of the Meal you wish to have -> ");
                                code=Integer.parseInt(in.readLine());
                                break;
                            }
                            catch(NumberFormatException ex)
                            {
                                System.out.println("\t\t\t\t\tError!");
                                System.out.println("\t\t\t\t\tPlease Enter A Valid Number.");
                            }
                        }
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
        number=1;
        ob.calculate();
        ob.order();
    }
    
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
    
    static void calculate()throws IOException
    {
         Boards ob=new Boards();
         switch(ord)//order menu choice-5
         {
              case 1: //pizzas
              {
                   switch(piz)//pizza menu choice-3
                   {
                       case 1://magic pan pizzas
                       {
                           switch(code)//magic pan pizza choice-14
                           {
                               case 1: //TANDOORI PANEER
                               {
                                   if(size==1)
                                   {
                                       gross+=number*220;
                                       arr[j++]="\t\tTANDOORI PANEER[Personal]              "+number+"         220       "+number*220;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*395;
                                       arr[j++]="\t\tTANDOORI PANEER[Medium]                "+number+"        395       "+number*395;
                                   } 
                                   else if(size==3)
                                   {
                                       gross+=number*595;
                                       arr[j++]="\t\tTANDOORI PANEER[Family]                "+number+"       595        "+number*595;
                                   }
                                   System.out.println(arr[j]);
                               }
                               break;
                               
                               case 2: //VEGGIE LOVERS
                               {
                                   if(size==1)
                                   {
                                       gross+=number*220;
                                       arr[j++]="\t\tVEGGIE LOVERS[Personal]                "+number+"        220       "+number*220;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*395;
                                       arr[j++]="\t\tVEGGIE LOVERS[Medium]                  "+number+"        395       "+number*395;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*595;
                                       arr[j++]="\t\tVEGGIE LOVERS[Family]                  "+number+"        595       "+number*595;
                                   }
                               }
                               break;
                               
                               case 3: //PANEER MAKHANI
                               {
                                   if(size==1)
                                   {
                                       gross+=number*220;
                                       arr[j++]="\t\tPANEER MAKHANI[Personal]               "+number+"         220       "+number*220;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*395;
                                       arr[j++]="\t\tPANEER MAKHANI[Medium]                 "+number+"         395       "+number*395;
                                   } 
                                   else if(size==3)
                                   {
                                       gross+=number*595;
                                       arr[j++]="\t\tPANEER MAKHANI[Family]                 "+number+"         595       "+number*595;
                                   }
                               }
                               break;
                               
                               case 4: //COUNTRY FEAST
                               {
                                   if(size==1)
                                   {
                                       gross+=number*220;
                                       arr[j++]="\t\tCOUNTRY FEAST[Personal]                "+number+"         220       "+number*220;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*395;
                                       arr[j++]="\t\tCOUNTRY FEAST[Medium]                  "+number+"         395       "+number*395;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*595;
                                       arr[j++]="\t\tCOUNTRY FEAST[Family]                  "+number+"         595       "+number*595;
                                   }
                               }
                               break;
                               
                               case 5: //FIERY RIDE
                               {
                                   if(size==1)
                                   {
                                       gross+=number*260;
                                       arr[j++]="\t\tFIERY RIDE[Personal]                    "+number+"         260       "+number*260;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*470;
                                       arr[j++]="\t\tFIERY RIDE[Medium]                      "+number+"         470       "+number*470;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*695;
                                       arr[j++]="\t\tFIERY RIDE[Family]                      "+number+"         695       "+number*695;
                                    }
                               }
                               break;
                               
                               case 6: //PANEER VEGORAMA
                               {
                                   if(size==1)
                                   {
                                       gross+=number*260;
                                       arr[j++]="\t\tPANEER VEGORAMA[Personal]               "+number+"        260     "+number*260;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*470;
                                       arr[j++]="\t\tPANEER VEGORAMA[Medium]                 "+number+"        470      "+number*470;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*695;
                                       arr[j++]="\t\tPANEER VEGORAMA[Family]                 "+number+"        695      "+number*695;
                                   }
                               }
                               break;
                               
                               case 7: //VEGGIE SUPREME
                               {
                                   if(size==1)
                                   {
                                       gross+=number*260;
                                       arr[j++]="\t\tVEGGIE SUPREME[Personal]                "+number+"        260      "+number*260;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*470; 
                                       arr[j++]="\t\tVEGGIE SUPREME[Medium]                  "+number+"        470      "+number*470;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*695;
                                       arr[j++]="\t\tVEGGIE SUPREME[Family]                  "+number+"        695      "+number*695;
                                   }
                               }
                               break;
                               
                               case 8: //EXOTICA
                               {
                                   if(size==1)
                                   {
                                       gross+=number*260;
                                       arr[j++]="\t\tEXOTICA[Personal]                       "+number+"         260       "+number*260;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*470;
                                       arr[j++]="\t\tEXOTICA[Medium]                         "+number+"         470       "+number*470;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*695;
                                       arr[j++]="\t\tEXOTICA[Family]                         "+number+"         695       "+number*695;
                                   }
                               }
                               break;
                               
                               case 9: //CHICKEN ITALIA
                               {
                                   if(size==1)
                                   {
                                       gross+=number*250;
                                       arr[j++]="\t\tCHICKEN ITALIA[Personal]                "+number+"         250       "+number*250;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*450;
                                       arr[j++]="\t\tCHICKEN ITALIA[Medium]                  "+number+"         450       "+number*450;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*655;
                                       arr[j++]="\t\tCHICKEN ITALIA[Family]                  "+number+"         655       "+number*655;
                                   }
                               }
                               break;
                               
                               case 10: //CHICKEN TIKKA
                               {
                                   if(size==1)
                                   {
                                       gross+=number*250;
                                       arr[j++]="\t\tCHICKEN TIKKA[Personal]                 "+number+"         250       "+number*250;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*450;
                                       arr[j++]="\t\tCHICKEN TIKKA[Medium]                   "+number+"         450       "+number*450;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*655;
                                       arr[j++]="\t\tCHICKEN TIKKA[Family]                   "+number+"         655       "+number*655;
                                   }
                               }
                               break;
                               
                               case 11: //KADAI CHICKEN
                               {
                                   if(size==1)
                                   {
                                       gross+=number*250; 
                                       arr[j++]="\t\tKADAI CHICKEN[Personal]                 "+number+"        250       "+number*250;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*450;
                                       arr[j++]="\t\tKADAI CHICKEN[Medium]                   "+number+"        450       "+number*450;
                                   } 
                                   else if(size==3)
                                   {
                                       gross+=number*655;
                                       arr[j++]="\t\tKADAI CHICKEN[Family]                   "+number+"        655       "+number*655;
                                   }
                               }
                               break;
                               
                               case 12: //PEPPERONI
                               {
                                   if(size==1)
                                   {
                                       gross+=number*295;
                                       arr[j++]="\t\tPEPPERONI[Personal]                    "+number+"         295       "+number*295;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*515;
                                       arr[j++]="\t\tPEPPERONI[Medium]                      "+number+"         515       "+number*515;
                                   } 
                                   else if(size==3)
                                   {
                                       gross+=number*765;
                                       arr[j++]="\t\tPEPPERONI[Family]                      "+number+"         765       "+number*765;
                                   }
                               }
                               break;
                               
                               case 13: //TRIPLE CHICKEN FEAST
                               {
                                   if(size==1)
                                   {
                                       gross+=number*295;
                                       arr[j++]="\t\tTRIPLE CHICKEN FEAST[Personal]        "+number+"         295       "+number*295;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*515;
                                       arr[j++]="\t\tTRIPLE CHICKEN FEAST[Medium]          "+number+"         515       "+number*515;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*765;
                                       arr[j++]="\t\tTRIPLE CHICKEN FEAST[Family]          "+number+"         765       "+number*765;
                                   }
                               }
                               break;
                               
                               case 14: //CHICKEN SUPREME
                               {
                                   if(size==1)
                                   {
                                       gross+=number*295;
                                       arr[j++]="\t\tCHICKEN SUPREME[Personal]              "+number+"         295       "+number*295;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*515;
                                       arr[j++]="\t\tCHICKEN SUPREME[Medium]                "+number+"         515       "+number*515;
                                    }
                                   else if(size==3)
                                   {
                                       gross+=number*765;
                                       arr[j++]="\t\tCHICKEN SUPREME[Family]                "+number+"         765       "+number*765;
                                   }
                               }
                               break;
                            }
                       }//end of magic pan pizza - case 1
                       break;
                        
                       case 2: //BIG PIZZA
                       {    
                           switch(code)//big pizza choice-4
                           {
                               case 1: //FARM HUT
                               {
                                   gross+=number*219;
                                   arr[j++]="\t\tFARM HUT[Big Pizza]                    "+number+"         219        "+number*219;
                               } 
                               break;
                               
                               case 2: //ITALIAN TREAT
                               {
                                   gross+=number*219;
                                   arr[j++]="\t\tITALIAN TREAT[Big Pizza]               "+number+"         219       "+number*219;
                               }
                               break;
                               
                               case 3: //CHICKEN MEXICANO
                               {
                                   gross+=number*219;
                                   arr[j++]="\t\tCHICKEN MEXICANO[Big Pizza]            "+number+"         219       "+number*219;
                               }
                               break;
                               
                               case 4: //SPICY CHICKEN MAGIC
                               {
                                   gross+=number*219;
                                   arr[j++]="\t\tSPICY CHICKEN MAGIC[Big Pizza]         "+number+"         219        "+number*219;
                               }
                               break;
                            }
                       }//end of big pizza - case 2
                       
                       case 3: //SO CHEESY PIZZAS
                       {
                           switch(code)//SO CHEESY PIZZAS choice-4
                           {
                               case 1: //VEG TREAT
                               {
                                   gross+=number*449;
                                   arr[j++]="\t\tVEG TREAT[So Cheezy]                   "+number+"         449       "+number*449;
                               }
                               break;
                               
                               case 2: //SUPER VEG
                               {
                                   gross+=number*499;
                                   arr[j++]="\t\tSUPER VEG[So Cheezy]                   "+number+"         499       "+number*499;
                               }
                               break;
                               
                               case 3: //HOT'N'SPICY CHICKEN
                               {
                                   gross+=number*499;
                                   arr[j++]="\t\tHOT'N'SPICY CHICKEN[So Cheezy]         "+number+"         499       "+number*499;
                               }
                               break;
                               
                               case 4: //DOUBLE CHICKEN FEAST
                               {
                                   gross+=number*569;
                                   arr[j++]="\t\tDOUBLE CHICKEN FEAST[So Cheezy]        "+number+"         569       "+number*569;
                               }
                               break;
                            } 
                       }//end of so cheezy pizza - case 3
                       break;
                    }//end of pizza choice
              }//end of pizzas
              break;
              
              case 2://BIRIZZAS
              {
                  switch(code)//birizza choice-3
                  {
                       case 1: //VEGGIE
                       {
                           gross+=number*109;
                           arr[j++]="\t\tVEGGIE BIRIZZA                         "+number+"         109       "+number*109;
                       }
                       break;
                       
                       case 2: //PANEER
                       {
                           gross+=number*145;
                           arr[j++]="\t\tPANEER BIRIZZA                         "+number+"         145       "+number*145;
                       }
                       break;
                       
                       case 3: //CHICKEN
                       {
                           gross+=number*165;
                           arr[j++]="\t\tPANEER BIRIZZA                         "+number+"         165       "+number*165;
                       }
                       break;
                    }
              }//end of birizzas
              break;
              
              case 3://SIDES
              {
                  switch(code)//sides choice-5
                  {
                      case 1: //VEG BAKED PASTA
                      {
                           gross+=number*125;
                           arr[j++]="\t\tVEG BAKED PASTA                        "+number+"          125        "+number*125;
                      }
                      break;
                      
                      case 2: //CHICKEN BAKED PASTA
                      {
                           gross+=number*145;
                           arr[j++]="\t\tCHICKEN BAKED PASTA                    "+number+"          145        "+number*145;
                      }
                      break;
                      
                      case 3: //CHICKEN WINGS
                      {
                           gross+=number*149;
                           arr[j++]="\t\tCHICKEN WINGS                          "+number+"          149        "+number*149;
                      }
                      break;
                      
                      case 4: //GARLIC BREAD STIX
                      {
                           gross+=number*99;
                           arr[j++]="\t\tGARLIC BREAD STIX                      "+number+"          99        "+number*99;
                      }
                      break;
                      
                      case 5: //POTATO WEDGES
                      {
                           gross+=number*89;
                           arr[j++]="\t\tPOTATO WEDGES                          "+number+"          89        "+number*89;
                      }
                      break;
                  }
              }//end of sides
              break;
              
              case 4: //Desserts
              {
                  switch(code)//Desserts choice-4
                  {
                      case 1: //CHOCO MOUSSE
                      {
                           gross+=number*69;
                           arr[j++]="\t\tCHOCO MOUSSE                           "+number+"          69        "+number*69;
                      }
                      break;
                      
                      case 2: //CHOCO TRUFFLE CAKE
                      {
                           gross+=number*69;
                           arr[j++]="\t\tCHOCO TRUFFLE CAKE                     "+number+"          69        "+number*69;
                      }
                      break;
                      
                      case 3: //CHOCO CHIP LAVA
                      {
                           gross+=number*30;
                           arr[j++]="\t\tCHOCO CHIP LAVA                        "+number+"          30        "+number*30;
                      }
                      break;
                      
                      case 4: //PEPSI
                      {
                           gross+=number*30;
                           arr[j++]="\t\tPEPSI[600 ml]                          "+number+"          30        "+number*30;
                      }
                      break;
                  }
              }//end of desserts 
              break;
              
              case 5: //Meals
              {
                  switch(code)//meal choice-5
                  {
                      case 1: //MEAL FOR 1
                      {
                           gross+=number*199;
                           arr[j++]="\t\tMEAL FOR 1                             "+number+"         199       "+number*199;
                      }
                      break;
                      
                      case 2: //MEAL FOR 2
                      {
                           gross+=number*449;
                           arr[j++]="\t\tMEAL FOR 2                             "+number+"         449       "+number*449;
                      }
                      break;
                      
                      case 3: //MEAL FOR 4
                      {
                           gross+=number*799;
                           arr[j++]="\t\tMEAL FOR 4                             "+number+"         799       "+number*799;
                      }
                      break;
                      
                      case 4: //VEGGIE MAGIC DUO[combo]
                      {
                           gross+=number*275;
                           arr[j++]="\t\tVEGGIE MAGIC DUO[combo]                 "+number+"         275       "+number*275;
                      }
                      break;
                      
                      case 5: //NON VEGGIE MAGIC DUO
                      {
                           gross+=number*355;
                           arr[j++]="\t\tNON VEGGIE MAGIC DUO[combo]            "+number+"         355       "+number*355;
                      }
                      break;
                  }
              }//End of meals
              break;
         }
    }
    
    static void bill()throws IOException
    {
        Boards ob=new Boards();
        Date ob1=new Date();   
        double stax,vat,total,round;
        stax=vat=total=round=0.0;
        System.out.println("\f");
        System.out.println("\t\t\t\t\tPIZZA HUT INDIA");
        System.out.println("\t\t\t\t  Devyani International Pvt. Ltd.");
        System.out.println("\t\t\t\t\tCinewonder Mall, ");
        System.out.println("\t\t\t\t   Kapurbavdi,GhodBunder Road,");
        System.out.println("\t\t\t\t\tThane (West)-400607.\n");
        System.out.println("\t\t\t\t\t  ORDER MEMO");
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\t\tTb1 16/1\t\t   chk3000\t\t\t  Gst 3");
        System.out.println("\t\t\t\t"+ob1);
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\t\t\t\t\t***DINE IN***");
        System.out.println("\t\t          Item\t\t\t    Quantity    Price\t  Total");               
        for(int i=0;i<j;i++)
        {
             System.out.println(arr[i]);
        }
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t    SUBTOTAL\t\t"+gross+".00");
        System.out.println("\t\t\t\t\tTotal Amount(Before Tax)\t"+gross+".00");
        System.out.println("\t\tTax Details----------------------------------------------------");
        vat=gross*0.125; vat=Math.rint(vat*100)/100;
        System.out.println("\t\t   VAT @ 12.5% \t\t\t\t\t"+vat);
        System.out.println("\t\t\t\tTotal Amount\t\t\t\t"+(gross+vat));
        System.out.println("\t\tService Tax Details--------------------------------------------");
        stax=gross*0.05;  stax=Math.rint(stax*100)/100;
        total=stax+vat+gross;
        System.out.println("\t\t   Service tax @ 4.944% \t\t\t"+stax);
        System.out.println("\t\t\t\tGross Amount\t\t\t\t"+(total));
        if(Math.rint(total)>(total))
        {
            round=Math.rint(total)-total;  round=Math.rint(round*100)/100;
            System.out.println("\t\t\t\tRounded\t\t\t\t\t"+round);
        }
        else
        {
            round=total-Math.rint(total);  round=Math.rint(round*100)/100;
            System.out.println("\t\t\t\tRounded\t\t\t\t\t"+round);
        }
        System.out.println("\t\t\t\tBILL AMOUNT\t\t\t\t"+(Math.rint(total))+"0"); 
        System.out.println("\t\t---------------------------------------------------------------\n");
        System.out.println("\t\t\t\tEmail ID:devyani@dil-rjcorp.com");
        System.out.println("\t\t\t\t  Website:www.dil-rjcorp.com");
        System.out.println("\t\t\t\t     Tel No.:011-4170 6720");
        System.out.println("\t\t\t\t     Fax No.:011-2681 3665");
        System.out.println("\t\t\t\t Thank you foor Choosing Pizza Hut");
        System.out.println("\t\t\t\tSee us online at www.pizzahut.co.in");
        System.out.println("\t\t\t\t\tHAVE A NICE DAY\n");
        System.out.println("\t\t\t  **Please collect your bill after payment**");
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\t\t\t**Take a Survey and Get 15% Off**");
        System.out.println("\t\t1. VISIT www.feedPHback.co.in within the next 3 day");
        System.out.println("\t\t2. Complete the survey. Use the unique survey ID below");
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\t\t\t\tDPIJ456-652998476552");
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\t\t3. Recieve Discount after survey**");
        System.out.println("\t\t**Term and Conditions Apply");
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\t\t************************VISIT AGAIN****************************");
    }
    
    static void store_locs()throws IOException
    {
        Boards ob=new Boards();
        
        System.out.print("\f");
        System.out.print("FINDING YOUR LOCATION ");
        for(int i=1;i<=5;i++)
        {
            System.out.print(". ");
            try 
            {
                Thread.sleep(500);                 //1000 milliseconds is one second.
            } 
            catch(InterruptedException ex) 
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("\f");
        System.out.print("COMPUTING STORES IN YOUR CITY - MUMBAI");
        for(int i=0;i<=8;i++) 
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
                System.out.print("COMPUTING STORES IN YOUR CITY - MUMBAI ");
                k=0;
            }
        }
        k=0;
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2014 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t***************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\tSTORE LOCATIONS");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t1. PH Kandivali ");
        System.out.println("\t\t\t\t\t(17 thakur Cinema and welfare centre,Thakur village Kandivali east)");
        System.out.println("\t\t\t\t\t2. PH RBD Andheri (E) ");
        System.out.println("\t\t\t\t\t(Tandon Mall,Chakala Village, Andheri Kurla Road,Andhetri east)");
        System.out.println("\t\t\t\t\t3. PH RBD Cinewonder ");
        System.out.println("\t\t\t\t\t(Cinewonder Mall,Kapurbavdi,GhodBunder Road , Thane (West))");
        System.out.println("\t\t\t\t\t4. PH RBD Lokhandwala");
        System.out.println("\t\t\t\t\t(Grenville Apts,Lokhandwala , Andheri)");
        System.out.println("\t\t\t\t\t5. PH RBD Mindspace ");
        System.out.println("\t\t\t\t\t(Unit 1, Ground floor,Eureka Towers,Mindspace,malad (West))");
        System.out.println("\t\t\t\t\t6. PH RBD Mulund ");
        System.out.println("\t\t\t\t\t3rd Floor, Runwal Arcade,LBS Marg, Mulund(West)");
        System.out.println("\t\t\t\t\t7. PH RBD Nirmal Mall ");
        System.out.println("\t\t\t\t\t(Shop No 20,Ground floor,Nirmal Mall,LBS Marg,Mulund (West))");
        System.out.println("\t\t\t\t\t8. PH RBD Powai ");
        System.out.println("\t\t\t\t\t(Sentinel,Hiranandani Business Park, Powai)");
        System.out.println("\t\t\t\t\t9. PH RBD Profit Centre ");
        System.out.println("\t\t\t\t\t(Shop No G3, F2, Profit Centre,,120 feet road, Borsapada)");
        System.out.println("\t\t\t\t\t10. PH RBD Sterling ");
        System.out.println("\t\t\t\t\t(Elphiston house 17 murzban road,Opp sterling theatre VT)");
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
            System.out.print("\t\t\t\t\tWas your experience at Pizza Hut Satisfactory? yes/no -> ");
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
    
    static void exit()throws IOException
    {
        Boards ob=new Boards();
        System.out.println("\f");
        System.out.println("\n\n\n");
        System.out.println("\t\t\t\t© 2014 Pizza Hut, Inc. All rights reserved. The Pizza Hut name, logos, and related marks are trademarks of Pizza Hut, Inc.\n");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        System.out.println("\t\t\t\t\t\t\t\t\t\tEXIT");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tThanks For visiting.");
        System.out.println("\t\t\t\t\tHope you enjoyed this unique experience with us.");
        System.out.println("\t\t\t\t\tKeep visiting for more good times.");
        System.out.println("\t\t\t\t\t--------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t**************************************************************************************************");
        try 
        {
            Thread.sleep(1500);                 //1000 milliseconds is one second.
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        System.exit(0);
    }
}