import java.io.*;

public class Instruction
{
    public static void Instruction(){
        try{
            FileReader frT = new FileReader("titleInstruction.txt");
            BufferedReader brT = new BufferedReader(frT);
            String readTitle; 
                        
            readTitle = brT.readLine();
                        
            while(readTitle!=null){
                System.out.println(readTitle);
                readTitle = brT.readLine();
            }
            System.out.println("Press Enter to Back... ");
            System.in.read();
            brT.close();
            System.out.print('\u000C');//ClearScreen
            Program.Program();
        }catch(Exception e){
            System.out.println("Problem!"+e.getMessage());
        }
    }
}
