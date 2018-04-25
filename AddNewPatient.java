import java.util.*;
import java.io.*;

public class AddNewPatient
{
 
    public static void AddNewPatient(){
        Scanner in = new Scanner(System.in);
        PatientInfo pat = new PatientInfo();
        AddAddress addr = new AddAddress();
        GenerateRegID generate = new GenerateRegID();
        char answer = 'y';
        int reg_no = 0;
        
         try{
             FileReader fr;
             BufferedReader brT=null;
             String readTitle;
             
             FileWriter fw;
             BufferedWriter bw;
             PrintWriter pw;
             
             FileWriter fRecord;
             BufferedWriter bRecord;
             PrintWriter pRecord;
             
           do{ 
             reg_no = generate.GenerateRegID();
             fw = new FileWriter("Patient/Patient"+reg_no+".txt");
             bw = new BufferedWriter(fw);
             pw = new PrintWriter(bw);
             
             fr = new FileReader("titleAddPatient.txt");
             brT = new BufferedReader(fr);
             readTitle = brT.readLine();
             
             fRecord = new FileWriter("Patient/RegisterationNumber.txt",true);
             bRecord = new BufferedWriter(fRecord);
             pRecord = new PrintWriter(bRecord);
            
             while(readTitle!=null){
                 System.out.println(readTitle);
                 readTitle = brT.readLine();
             }
             
             System.out.println();
             System.out.println("Registeration Number: PI"+reg_no);
             System.out.print("Enter Patient Name: ");
             String name = in.nextLine();
             System.out.print("Enter Patient IC(xxxxxxxxxxxx): ");
             String ic = in.nextLine();
             AddDOB.get = ic;
             AddDOB.AddDOB();
             System.out.print("Enter Phone Number(xxx-xxxxxxxx): ");
             String phoneNo = in.nextLine();
             System.out.println();
             
             fr = new FileReader("titleStatus.txt");
             brT = new BufferedReader(fr);
             readTitle = brT.readLine();
             while(readTitle!=null){
                 System.out.println(readTitle);
                 readTitle = brT.readLine();
             }
             System.out.print("Status: ");
             int choice = in.nextInt();
             String status = null;
             switch(choice)
                {
                 case 1: status = "Married";
                         break;
                 case 2: status = "Single";
                         break; 
                 case 3: status = "Widow";
                         break;
                 case 4: status = "Widower";
                         break;
                 default:{
                          while(choice<1 || choice>4){
                           System.out.println("INVALID INPUT!!!! ENTER AGAIN!! ");
                           System.out.print("STATUS: ");
                           choice = in.nextInt();
                          }
                          break;
                         }
                }
             System.out.println(in.nextLine());
                
             fr = new FileReader("titleBloodGroup.txt");
             brT = new BufferedReader(fr);
             readTitle = brT.readLine();
             while(readTitle!=null){
                 System.out.println(readTitle);
                 readTitle = brT.readLine();
             }
             System.out.print("Enter BLOOD GROUP: ");
             choice = in.nextInt();
             String bld_group = null;
             switch(choice){
                 case 1:bld_group = "A+";
                        break;
                 case 2:bld_group = "A-";
                        break;
                 case 3:bld_group = "B+";
                        break;
                 case 4:bld_group = "B-";
                        break;
                 case 5:bld_group = "AB+";
                        break;
                 case 6:bld_group = "AB-";
                        break;
                 case 7:bld_group = "O+";
                        break;
                 case 8:bld_group = "O-";
                        break;
                        
                 default:{
                          while(choice<1 || choice>8){
                           System.out.println("INVALID INPUT!!!! ENTER AGAIN!! ");
                           System.out.print("BLOOD GROUP: ");
                           choice = in.nextInt();
                          }
                          break;
                         }
             }
             System.out.println(in.nextLine());
             AddAddress.AddAddress();
             System.out.println();
             
             pat = new PatientInfo(name,status,reg_no,ic,phoneNo,bld_group);
             pw.println(pat.savePI());
             PatientInfo.PI.insertAtFront(pat);
             PatientInfo.t.insertNode(pat);
             pRecord.println(reg_no+";");
             brT.close();
             pw.close();
             pRecord.close();
             System.out.print("WANT TO ENTER INFORMATION FOR ANOTHER PATIENT ?(y,Y/n,N): ");
             answer = in.next().charAt(0);
             System.out.print(in.nextLine());
             System.out.print('\u000C');//ClearScreen 
           }while(answer == 'y'|| answer == 'Y');
           
           System.out.print('\u000C');//ClearScreen   
           Tasks.Tasks();
         }catch(Exception e){
             System.out.println("Problem!"+e.getMessage());
         }
    }
}
