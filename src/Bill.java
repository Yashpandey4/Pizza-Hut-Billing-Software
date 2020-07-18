import java.io.*;
import java.util.*;
public class Bill
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new  BufferedReader(read);
    static int gross;         static String arr[]=new String[100];    static int j=0;
    static void bill()throws IOException
    {
        Boards ob=new Boards();
        Date ob1=new Date();   
        double stax,vat,total;
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
        System.out.println("\t\t\t\t\t***DINE IN***\n");
        System.out.println("\t\t          Item\t\t\t    Quantity    Price\t  Total");               
        for(int i=0;i<j;i++)
        {
             System.out.println(arr[j]);
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
        System.out.println("\t\t   Service tax @ 4.944% \t\t\t\t"+stax);
        System.out.println("\t\t\t\tGross Amount\t\t\t\t"+(total));
        if(Math.rint(total)>(total))
        System.out.println("\t\t\t\tRounded\t\t\t\t\t"+(Math.rint(total)-total));
        else
        System.out.println("\t\t\t\tRounded\t\t\t\t\t"+(total-Math.rint(total)));
        System.out.println("\t\t\t\tBILL AMOUNT\t\t\t\t"+(Math.rint(total))+"0"); 
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("\t\t\t\tEmail ID:devyani@dil-rjcorp.com");
        System.out.println("\t\t\t\t  Website:www.dil-rjcorp.com");
        System.out.println("\t\t\t\t     Tel No.:011-4170 6720");
        System.out.println("\t\t\t\t     Fax No.:011-2681 3665");
        System.out.println("\t\t\t\t Thank you foor Choosing Pizza Hut");
        System.out.println("\t\t\t\tSee us online at www.pizzahut.co.in");
        System.out.println("\t\t\t\t\tHAVE A NICE DAY\n");
        System.out.println("\t\t\t  **Please collect your bill after payment**");
        System.out.println("\t\t---------------------------------------------------------------");
        System.out.println("\t\t************************VISIT AGAIN****************************");
    }
}