import java.io.*;

public class Sorting
{
    public static void Sorting(){
        try{
            FileReader fr = new FileReader("titleSorting.txt");
            BufferedReader br = new BufferedReader(fr);
            String readTitle;
            
            readTitle = br.readLine();
            while(readTitle!=null){
                System.out.println(readTitle);
                readTitle = br.readLine();
            }
            PatientInfo.t.SortingPatient();
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
