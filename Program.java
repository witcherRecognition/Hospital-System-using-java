import java.util.*;
import java.io.*;

public class Program
{
    public static void Program(){
        Scanner in = new Scanner(System.in);
        int count = 0;
        try{
            if(count==0){
                ReadOnly.ReadOnly();
            }
            
            FileReader frT;
            BufferedReader brT=null;
            String readTitle;
            
            CheckCalendar.CheckCalendar();
            System.out.println("Number Of Patient Register: "+PatientInfo.NumOfRegis+"/500");
            frT = new FileReader("titleWelcome.txt");
            brT = new BufferedReader(frT);
             
             readTitle = brT.readLine();
             while(readTitle!=null){
                 System.out.println(readTitle);
                 readTitle = brT.readLine();
             }
            System.out.print("Enter Your Choice: ");
            int choose = in.nextInt();
            
            switch(choose){
                case 1:{
                        brT.close();
                        System.out.print('\u000C');//ClearScreen
                        Tasks.Tasks();
                       }
                case 2:{
                        System.out.print('\u000C');//ClearScreen
                        About.About();
                       }
                case 3:{
                        System.out.print('\u000C');//ClearScreen
                        Instruction.Instruction();
                       }
                case 4:{
                        System.out.print('\u000C');//ClearScreen
                        Exit.Exit();
                       }
                default:{
                         while(choose<=0||choose>4){
                             System.out.println("Wrong Input! ");
                             System.out.print("Please choose Again: ");
                             choose = in.nextInt();
                         }
                        }       
            }
            
            brT.close();
        }catch(Exception e){
            System.out.println("Problem!!"+e.getMessage());
        }
    }
}
