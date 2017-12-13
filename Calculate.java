import java.io.*;
public class Calculate
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int ord,piz,code;  static int size,number;
    static int gross;         static String arr[]=new String[100];    static int j=0;
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
                                       arr[j++]="\t\tTANDOORI PANEER[Personal]               "+number+"        220      "+number*220;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*395;
                                       arr[j++]="\t\tTANDOORI PANEER[Medium]                 "+number+"        395      "+number*395;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*595;
                                       arr[j++]="\t\tTANDOORI PANEER[Family]                 "+number+"        595      "+number*595;
                                   }
                                   System.out.println(arr[j]);
                               }
                               break;
                               
                               case 2: //VEGGIE LOVERS
                               {
                                   if(size==1)
                                   {
                                       gross+=number*220;
                                       arr[j++]="\t\tVEGGIE LOVERS[Personal]                 "+number+"        220      "+number*220;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*395;
                                       arr[j++]="\t\tVEGGIE LOVERS[Medium]                   "+number+"        395      "+number*395;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*595;
                                       arr[j++]="\t\tVEGGIE LOVERS[Family]                   "+number+"        595      "+number*595;
                                   }
                               }
                               break;
                               
                               case 3: //PANEER MAKHANI
                               {
                                   if(size==1)
                                   {
                                       gross+=number*220;
                                       arr[j++]="\t\tPANEER MAKHANI[Personal]                "+number+"        220      "+number*220;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*395;
                                       arr[j++]="\t\tPANEER MAKHANI[Medium]                  "+number+"        395      "+number*395;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*595;
                                       arr[j++]="\t\tPANEER MAKHANI[Family]                  "+number+"        595      "+number*595;
                                   }
                               }
                               break;
                               
                               case 4: //COUNTRY FEAST
                               {
                                   if(size==1)
                                   {
                                       gross+=number*220;
                                       arr[j++]="\t\tCOUNTRY FEAST[Personal]                 "+number+"        220      "+number*220;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*395;
                                       arr[j++]="\t\tCOUNTRY FEAST[Medium]                   "+number+"        395      "+number*395;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*595;
                                       arr[j++]="\t\tCOUNTRY FEAST[Family]                   "+number+"        595      "+number*595;
                                   }
                               }
                               break;
                               
                               case 5: //FIERY RIDE
                               {
                                   if(size==1)
                                   {
                                       gross+=number*260;
                                       arr[j++]="\t\tFIERY RIDE[Personal]                    "+number+"        260       "+number*260;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*470;
                                       arr[j++]="\t\tFIERY RIDE[Medium]                      "+number+"        470       "+number*470;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*695;
                                       arr[j++]="\t\tFIERY RIDE[Family]                      "+number+"        695       "+number*695;
                                   }
                               }
                               break;
                               
                               case 6: //PANEER VEGORAMA
                               {
                                   if(size==1)
                                   {
                                       gross+=number*260;
                                       arr[j++]="\t\tPANEER VEGORAMA[Personal]               "+number+"        260       "+number*260;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*470;
                                       arr[j++]="\t\tPANEER VEGORAMA[Medium]                 "+number+"        470        "+number*470;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*695;
                                       arr[j++]="\t\tPANEER VEGORAMA[Family]                 "+number+"        695        "+number*695;
                                   }
                               }
                               break;
                               
                               case 7: //VEGGIE SUPREME
                               {
                                   if(size==1)
                                   {
                                       gross+=number*260;
                                       arr[j++]="\t\tVEGGIE SUPREME[Personal]                "+number+"        260        "+number*260;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*470;
                                       arr[j++]="\t\tVEGGIE SUPREME[Medium]                  "+number+"        470        "+number*470;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*695;
                                       arr[j++]="\t\tVEGGIE SUPREME[Family]                  "+number+"        695        "+number*695;
                                   }
                               }
                               break;
                               
                               case 8: //EXOTICA
                               {
                                   if(size==1)
                                   {
                                       gross+=number*260;
                                       arr[j++]="\t\tEXOTICA[Personal]                      "+number+"         260        "+number*260;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*470;
                                       arr[j++]="\t\tEXOTICA[Medium]                        "+number+"         470        "+number*470;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*695;
                                       arr[j++]="\t\tEXOTICA[Family]                        "+number+"         695        "+number*695;
                                   }
                               }
                               break;
                               
                               case 9: //CHICKEN ITALIA
                               {
                                   if(size==1)
                                   {
                                       gross+=number*250;
                                       arr[j++]="\t\tCHICKEN ITALIA[Personal]               "+number+"         250        "+number*250;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*450;
                                       arr[j++]="\t\tCHICKEN ITALIA[Medium]                 "+number+"         450        "+number*450;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*655;
                                       arr[j++]="\t\tCHICKEN ITALIA[Family]                 "+number+"         655        "+number*655;
                                   }
                               }
                               break;
                               
                               case 10: //CHICKEN TIKKA
                               {
                                   if(size==1)
                                   {
                                       gross+=number*250;
                                       arr[j++]="\t\tCHICKEN TIKKA[Personal]               "+number+"          250        "+number*250;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*450;
                                       arr[j++]="\t\tCHICKEN TIKKA[Medium]                 "+number+"          450        "+number*450;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*655;
                                       arr[j++]="\t\tCHICKEN TIKKA[Family]                 "+number+"          655        "+number*655;
                                   }
                               }
                               break;
                               
                               case 11: //KADAI CHICKEN
                               {
                                   if(size==1)
                                   {
                                       gross+=number*250; 
                                       arr[j++]="\t\tKADAI CHICKEN[Personal]               "+number+"          250        "+number*250;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*450;
                                       arr[j++]="\t\tKADAI CHICKEN[Medium]                 "+number+"          450        "+number*450;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*655;
                                       arr[j++]="\t\tKADAI CHICKEN[Family]                 "+number+"          655        "+number*655;
                                   }
                               }
                               break;
                               
                               case 12: //PEPPERONI
                               {
                                   if(size==1)
                                   {
                                       gross+=number*295;
                                       arr[j++]="\t\tPEPPERONI[Personal]                   "+number+"          295        "+number*295;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*515;
                                       arr[j++]="\t\tPEPPERONI[Medium]                     "+number+"          515        "+number*515;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*765;
                                       arr[j++]="\t\tPEPPERONI[Family]                     "+number+"          765        "+number*765;
                                   }
                               }
                               break;
                               
                               case 13: //TRIPLE CHICKEN FEAST
                               {
                                   if(size==1)
                                   {
                                       gross+=number*295;
                                       arr[j++]="\t\tTRIPLE CHICKEN FEAST[Personal]        "+number+"          295        "+number*295;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*515;
                                       arr[j++]="\t\tTRIPLE CHICKEN FEAST[Medium]          "+number+"          515        "+number*515;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*765;
                                       arr[j++]="\t\tTRIPLE CHICKEN FEAST[Family]          "+number+"          765        "+number*765;
                                   }
                               }
                               break;
                               
                               case 14: //CHICKEN SUPREME
                               {
                                   if(size==1)
                                   {
                                       gross+=number*295;
                                       arr[j++]="\t\tCHICKEN SUPREME[Personal]             "+number+"          295        "+number*295;
                                   }
                                   else if(size==2)
                                   {
                                       gross+=number*515;
                                       arr[j++]="\t\tCHICKEN SUPREME[Medium]               "+number+"          515        "+number*515;
                                   }
                                   else if(size==3)
                                   {
                                       gross+=number*765;
                                       arr[j++]="\t\tCHICKEN SUPREME[Family]               "+number+"          765        "+number*765;
                                   }
                               }
                               break;
                            }
                       }//end of magic pan pizza - zase 1
                       break;
                        
                       case 2: //BIG PIZZA
                       {    
                           switch(code)//big pizza choice-4
                           {
                               case 1: //FARM HUT
                               {
                                   gross+=number*219;
                                   arr[j++]="\t\tFARM HUT[Big Pizza]                      "+number+"           219         "+number*219;
                               }
                               break;
                               
                               case 2: //ITALIAN TREAT
                               {
                                   gross+=number*219;
                                   arr[j++]="\t\tITALIAN TREAT[Big Pizza]                 "+number+"           219        "+number*219;
                               }
                               break;
                               
                               case 3: //CHICKEN MEXICANO
                               {
                                   gross+=number*219;
                                   arr[j++]="\t\tCHICKEN MEXICANO[Big Pizza]              "+number+"           219        "+number*219;
                               }
                               break;
                               
                               case 4: //SPICY CHICKEN MAGIC
                               {
                                   gross+=number*219;
                                   arr[j++]="\t\tSPICY CHICKEN MAGIC[Big Pizza]           "+number+"           219        "+number*219;
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
                                   arr[j++]="\t\tVEG TREAT[So Cheezy]                    "+number+"            449        "+number*449;
                               }
                               break;
                               
                               case 2: //SUPER VEG
                               {
                                   gross+=number*499;
                                   arr[j++]="\t\tSUPER VEG[So Cheezy]                    "+number+"            499        "+number*499;
                               }
                               break;
                               
                               case 3: //HOT'N'SPICY CHICKEN
                               {
                                   gross+=number*499;
                                   arr[j++]="\t\tHOT'N'SPICY CHICKEN[So Cheezy]          "+number+"            499        "+number*499;
                               }
                               break;
                               
                               case 4: //DOUBLE CHICKEN FEAST
                               {
                                   gross+=number*569;
                                   arr[j++]="\t\tDOUBLE CHICKEN FEAST[So Cheezy]         "+number+"            569        "+number*569;
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
                           arr[j++]="\t\tVEGGIE BIRIZZA                                 "+number+"            109        "+number*109;
                       }
                       break;
                       
                       case 2: //PANEER
                       {
                           gross+=number*145;
                           arr[j++]="\t\tPANEER BIRIZZA                                 "+number+"            145        "+number*145;
                       }
                       break;
                       
                       case 3: //CHICKEN
                       {
                           gross+=number*165;
                           arr[j++]="\t\tPANEER BIRIZZA                                 "+number+"            165        "+number*165;
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
                           arr[j++]="VEG BAKED PASTA                                   "+number+"            125        "+number*125;
                      }
                      break;
                      
                      case 2: //CHICKEN BAKED PASTA
                      {
                           gross+=number*145;
                           arr[j++]="\t\tCHICKEN BAKED PASTA                           "+number+"            145        "+number*145;
                      }
                      break;
                      
                      case 3: //CHICKEN WINGS
                      {
                           gross+=number*149;
                           arr[j++]="\t\tCHICKEN WINGS                                 "+number+"            149        "+number*149;
                      }
                      break;
                      
                      case 4: //GARLIC BREAD STIX
                      {
                           gross+=number*99;
                           arr[j++]="\t\tGARLIC BREAD STIX                             "+number+"            99        "+number*99;
                      }
                      break;
                      
                      case 5: //POTATO WEDGES
                      {
                           gross+=number*89;
                           arr[j++]="\t\tPOTATO WEDGES                                 "+number+"            89        "+number*89;
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
                           arr[j++]="\t\tCHOCO MOUSSE                                 "+number+"            69        "+number*69;
                      }
                      break;
                      
                      case 2: //CHOCO TRUFFLE CAKE
                      {
                           gross+=number*69;
                           arr[j++]="\t\tCHOCO TRUFFLE CAKE                           "+number+"            69        "+number*69;
                      }
                      break;
                      
                      case 3: //CHOCO CHIP LAVA
                      {
                           gross+=number*30;
                           arr[j++]="\t\tCHOCO CHIP LAVA                              "+number+"            30        "+number*30;
                      }
                      break;
                      
                      case 4: //PEPSI
                      {
                           gross+=number*30;
                           arr[j++]="\t\tPEPSI[600 ml]                                "+number+"            30        "+number*30;
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
                           arr[j++]="\t\tMEAL FOR 1                                  "+number+"            199        "+number*199;
                      }
                      break;
                      
                      case 2: //MEAL FOR 2
                      {
                           gross+=number*449;
                           arr[j++]="\t\tMEAL FOR 2                                  "+number+"            449        "+number*449;
                      }
                      break;
                      
                      case 3: //MEAL FOR 4
                      {
                           gross+=number*799;
                           arr[j++]="\t\tMEAL FOR 4                                  "+number+"            799        "+number*799;
                      }
                      break;
                      
                      case 4: //VEGGIE MAGIC DUO[combo]
                      {
                           gross+=number*275;
                           arr[j++]="VEGGIE MAGIC DUO[combo]                         "+number+"            275        "+number*275;
                      }
                      break;
                      
                      case 5: //NON VEGGIE MAGIC DUO
                      {
                           gross+=number*355;
                           arr[j++]="NON VEGGIE MAGIC DUO[combo]                     "+number+"            355        "+number*355;
                      }
                      break;
                  }
              }//End of meals
              break;
         }
    }
}

              
              
               
                       
                               
                           
                            
                        
                       
                               