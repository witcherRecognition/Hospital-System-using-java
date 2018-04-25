import java.util.*;
import java.text.*;
import java.io.*;

public class CheckCalendar
{
    public static int countC=0;
    public static void CheckCalendar(){
        
        String months[] = {  
             "Jan", "Feb", "Mar", "Apr",   
             "May", "Jun", "Jul", "Aug",  
             "Sep", "Oct", "Nov", "Dec"};   
     // Create a calendar initialized with the  
     // current date and time in the default  
     // locale and timezone.  
     Calendar calendar = Calendar.getInstance(); 
     // Display current time and date information.
     System.out.print("Date: ");  
     System.out.print(calendar.get(Calendar.DATE) + " "); 
     System.out.print(months[calendar.get(Calendar.MONTH)]+ " ");   
     System.out.println(calendar.get(Calendar.YEAR));  
  
     System.out.print("Time: ");  
     System.out.print(calendar.get(Calendar.HOUR) + ":");  
     System.out.print(calendar.get(Calendar.MINUTE) + ":");  
     System.out.println(calendar.get(Calendar.SECOND));
     
     while(countC==0){
        try{
            FileWriter fw = new FileWriter("SYSTEMLOG.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            FileReader fr = new FileReader("titleLog.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String read = br.readLine();
            while(read!=null){
                pw.println(read);
                read = br.readLine();
            }
            
            pw.print("DATE: ");
            pw.print(calendar.get(Calendar.DATE) + " ");
            pw.print(months[calendar.get(Calendar.MONTH)]+ " "); 
            pw.println(calendar.get(Calendar.YEAR));
            
            pw.print("TIME: ");  
            pw.print(calendar.get(Calendar.HOUR) + ":");  
            pw.print(calendar.get(Calendar.MINUTE) + ":");  
            pw.println(calendar.get(Calendar.SECOND));
            
            countC++;
            pw.println();
            pw.println();
            pw.close();
            br.close();
        }catch(Exception e){
            System.out.println("Problem!"+e.getMessage());
        }
     }
    }
}
