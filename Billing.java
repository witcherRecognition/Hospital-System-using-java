import java.util.*;
import java.io.*;

public class Billing
{
    public static void Billing(){
        Scanner in = new Scanner(System.in);
        PatientInfo p = null;
        PatientInfo hold = null;
        double balance=0;
        int count=0;
        char answer = 'y';
        try{
            FileReader fr;
            BufferedReader br=null;
            String readTitle;
        
            FileWriter fw = new FileWriter("Billing.doc");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
           
           do{ 
            fr = new FileReader("titleBilling.txt");
            br = new BufferedReader(fr);
            
            readTitle = br.readLine();
            while(readTitle!=null){
                System.out.println(readTitle);
                readTitle = br.readLine();
            }
            
            System.out.print("Enter Patient Registeration No.:PI ");
            int reg = in.nextInt();
            hold = (PatientInfo)PatientInfo.PI.getFirst();
            while(hold!=null){
                if(hold.getReg_no()!=reg){
                    count++;
                    p=hold;
                }
                hold = (PatientInfo)PatientInfo.PI.getNext();
            } 
            if(count>0){ 
             double total = p.getPay();
            
             System.out.println("Amount need to Pay:RM"+total);
             System.out.println("Enter Payment: ");
             double payment = in.nextDouble();
            
             balance = payment - total;
             double pay=0;
             while(balance<0){
                System.out.println("Amount not enough: RM"+balance);
                System.out.println("Enter Amount: RM");
                pay = in.nextDouble();
                
                balance = balance + pay;
                payment = payment + pay;
             }
            
             //PrintWriter Billing
             pw.println("---------------------");
             pw.println("|       BILLING     |");
             pw.println("---------------------");
             pw.println("Patient Registeration No.:PI "+reg);
             pw.println("Total cost      : RM "+total);
             pw.println("Payment receive : RM "+payment);
             pw.println("Balance         : RM "+balance);
             System.out.println("Your Bill Has Been Print");
             p.SpaceMoving();
            }
            else{
                if(PatientInfo.NumOfRegis==0){
                System.out.println("Database is Empty!!");
                System.out.println("Press Enter to continue... ");
                System.in.read();
                System.out.print('\u000C');//ClearScreen
                Tasks.Tasks();
              }
              p.attempt++;
              if(p.attempt==3){
                System.out.println("You Have Entered Wrong Registration Number 3 times. ");
                System.out.println("Access Denied!!! ");
                System.out.println("Please Try Again Later. ");
                System.out.println("Press Enter to continue... ");
                System.in.read();
                p.attempt = 0;
                System.out.print('\u000C');//ClearScreen
                Tasks.Tasks();
              }
              
              System.out.println("Sorry, the registration number is invalid. ");
              System.out.println("Press Enter to continue... ");
              System.in.read();
              System.out.print('\u000C');//ClearScreen
              Billing();
                
            }
             System.out.println();
             System.out.print("Want to Pay Another Billing?(Y,y/N,n): ");
             answer = in.next().charAt(0);
             System.out.print('\u000C');//ClearScreen
           }while(answer=='y'||answer=='Y'); 
            br.close();
            pw.close();
            System.out.print('\u000C');//ClearScreen
            Tasks.Tasks();
        }catch(Exception e){
            System.out.println("Problem!!"+e.getMessage());
        }
    }
}
