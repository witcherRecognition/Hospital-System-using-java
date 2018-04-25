import java.util.*;
import java.io.*;

public class ShowPatientInformation
{
   public static void ShowInformation(){
        Scanner in = new Scanner(System.in);
        try{
            PatientInfo show=null;
            PatientInfo hold = null;
            int count=0;
            char answer='y';
            FileReader fr;
            BufferedReader brT=null;
            String readTitle;
            
           do{
             fr = new FileReader("titleShowPatient.txt");
             brT = new BufferedReader(fr);
             readTitle = brT.readLine();
             
              while(readTitle!=null){
                 System.out.println(readTitle);
                 readTitle = brT.readLine();
             }
             
            System.out.print("Enter Patient Registeration Number: PI");
            int search = in.nextInt();
            
            show = (PatientInfo)PatientInfo.PI.getFirst();
            while(show!=null){
                if(show.getReg_no()==search){
                    count++;
                    hold = show;
                }
                show = (PatientInfo)PatientInfo.PI.getNext();
            }
            
            if(count>0){
                System.out.println(hold.toString());
            }
            else{
              if(PatientInfo.NumOfRegis==0){
                System.out.println("Database is Empty!!");
                System.out.println("Press Enter to continue... ");
                System.in.read();
                System.out.print('\u000C');//ClearScreen
                Tasks.Tasks();
              }
              show.attempt++;
              if(show.attempt==3){
                System.out.println("You Have Entered Wrong Registration Number 3 times. ");
                System.out.println("Access Denied!!! ");
                System.out.println("Please Try Again Later. ");
                System.out.println("Press Enter to continue... ");
                System.in.read();
                show.attempt = 0;
                System.out.print('\u000C');//ClearScreen
                Tasks.Tasks();
              }
              
              System.out.println("Sorry, the registration number is invalid. ");
              System.out.println("Press Enter to continue... ");
              System.in.read();
              System.out.print('\u000C');//ClearScreen
              ShowInformation();
              
            }
            System.out.println();
            System.out.print("Want to see Information of Another Patient?(Y,y/N,n): ");
            answer = in.next().charAt(0);
            System.out.print('\u000C');//ClearScreen
           }while(answer=='y'||answer=='Y');
            brT.close();
            System.out.print('\u000C');//ClearScreen
            Tasks.Tasks();
        }catch(Exception e){
            System.out.println("Problem!"+e.getMessage());
        }
   }
}
