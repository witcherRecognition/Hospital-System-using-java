import java.io.*;

public class Finance
{
    public static void Finance(){      
        try{
            FileReader fr = new FileReader("titleFinance.txt");
            BufferedReader br = new BufferedReader(fr);
            String readTitle;
            
            readTitle = br.readLine();
            while(readTitle!=null){
                System.out.println(readTitle);
                readTitle = br.readLine();
            }
           System.out.println("FINANCE GET: "+PatientInfo.t.TotalIncome());
            System.out.println("Press Enter to Back... ");
            System.in.read();
            br.close();
            System.out.print('\u000C');//ClearScreen
            Tasks.Tasks();
        }catch(Exception e){
            System.out.println("Problem!"+e.getMessage());
        }
    }
}
