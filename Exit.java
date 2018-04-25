import java.io.*;
public class Exit
{
    public static void Exit(){
        try{
            FileReader frT = new FileReader("titleExit.txt");
            BufferedReader brT = new BufferedReader(frT);
            String readTitle;
            
            readTitle = brT.readLine();
            while(readTitle!=null){
                System.out.println(readTitle);
                readTitle = brT.readLine();
            }
            System.in.read();
            System.exit(1);
            brT.close();
        }catch(Exception e){
            System.out.println("Problem!"+e.getMessage());
        }
    }
}
