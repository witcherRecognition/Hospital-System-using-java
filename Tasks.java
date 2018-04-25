import java.util.*;
import java.io.*;

public class Tasks
{
    public static void Tasks(){
        Scanner in = new Scanner(System.in);
        try{
            CheckCalendar.CheckCalendar();
            System.out.println("Number Of Patient Register: "+PatientInfo.NumOfRegis+"/500");
            
            FileReader fr;
            BufferedReader brT;
            String readTitle;
            AddNewPatient a=null;
            fr = new FileReader("titleTasks.txt");
            brT = new BufferedReader(fr);
            readTitle = brT.readLine();
            while(readTitle!=null){
                System.out.println(readTitle);
                readTitle = brT.readLine();
            }
            
            System.out.println();
            System.out.print("Enter Your Choice: ");
            int task = in.nextInt();
            
            switch(task){
                case 1:{
                        System.out.print('\u000C');//ClearScreen
                        a.AddNewPatient();
                        break;
                       }
                case 2:{
                        System.out.print('\u000C');//ClearScreen
                        ShowPatientInformation.ShowInformation();
                        break;
                       }      
                case 3:{
                        System.out.print('\u000C');//ClearScreen
                        WardPrice.WardPrice();
                        break;
                       }
                case 4:{
                        System.out.print('\u000C');//ClearScreen
                        DisplayWard.DisplayWard();
                        break;
                       }      
                case 5:{
                        System.out.print('\u000C');//ClearScreen
                        Billing.Billing();
                        break;
                       }
                case 6:{
                        System.out.print('\u000C');//ClearScreen
                        Finance.Finance();
                        break;
                       }
                case 7:{
                        System.out.print('\u000C');//ClearScreen
                        Sorting.Sorting();
                        break;
                       }
                case 8:{
                        System.out.print('\u000C');//ClearScreen
                        Program.Program();
                        break;
                       }    
                default:{
                          while(task<1 || task>8){
                           System.out.println("INVALID INPUT!!!! ENTER AGAIN!! ");
                           System.out.print("Enter Your Choice: ");
                           task = in.nextInt();
                          }
                          break;
                         }       
            }
            
            brT.close();
        }catch(Exception e){
            System.out.println("Problem!!!"+e.getMessage());
        }    
    }
}
