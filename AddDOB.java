import java.util.*;
import java.text.*;

public class AddDOB
{
    public static String get;
    public static void AddDOB(){
        //Other public variable
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        // Display current time and date information.
        //Substring kalau yg depan dia x amik
        //EG. year = "20/04/1996"
        //year = year.substring(0,2)
        //Output dia 20
        String strdate = sdf.format(calendar.getTime()).substring(6,10);
        int inYear = Integer.parseInt(strdate)-1000;
        int yearB = 0,monthB = 0,dayB = 0;
        
        String ic = get;
        
        yearB = Integer.parseInt(ic.substring(0,2));
        yearB = 1900+yearB;
        if(yearB<=inYear)
            yearB = 2000+(yearB-1900);
            
        monthB = Integer.parseInt(ic.substring(2,4));
        dayB = Integer.parseInt(ic.substring(4,6));
        Person.d.setDate(dayB,monthB,yearB);
        Person.d.show_date();
    }
}
