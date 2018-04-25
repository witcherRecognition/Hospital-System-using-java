import java.util.*;
import java.io.*;

public class DisplayWard
{
    public static int space1=25, space2=25, space3=25, space4=25, space5=25;
    public static int level1=75, level2=75, level3=75, level4=75, level5=75;
   public static void DisplayWard(){
       Scanner in = new Scanner(System.in);
       PatientInfo p=null;
       PatientInfo hold = null;
       char answer = 'y';
       int ward,totalspace,totalward1,totalward2;
     try{  
       do{
           totalward1 = space1+space2+space3+space4+space5;
           totalward2 = level1+level2+level3+level4+level5;
           totalspace = totalward1+totalward2;
        System.out.println("=====================================================");
        System.out.println("\t\t                Ward Availablity System");
        System.out.println("=====================================================");
        System.out.println("\t(We have 2 type of choice and "+totalspace+" total space)");
        System.out.println("\t\t\t|-------View available------- |");
        System.out.println("\t\t\t|                             "+"|");
        System.out.println("\t\t\t| 1.First Class Ward   = "+totalward1+"  |");
        System.out.println("\t\t\t|   Level 1 total space= "+space1+"   |");
        System.out.println("\t\t\t|   Level 2 total space= "+space2+"   |");
        System.out.println("\t\t\t|   Level 3 total space= "+space3+"   |");
        System.out.println("\t\t\t|   Level 4 total space= "+space4+"   |");
        System.out.println("\t\t\t|   Level 5 total space= "+space5+"   |");
        System.out.println("\t\t\t| 2.Economy Class Ward = "+totalward2+"  |");
        System.out.println("\t\t\t|   Level 1 total space= "+level1+"   |");
        System.out.println("\t\t\t|   Level 2 total space= "+level2+"   |");
        System.out.println("\t\t\t|   Level 3 total space= "+level3+"   |");
        System.out.println("\t\t\t|   Level 4 total space= "+level4+"   |");
        System.out.println("\t\t\t|   Level 5 total space= "+level5+"   |");
        System.out.println("\t\t\t|   Total space left   = "+totalspace+"  |");
        System.out.println("\t\t\t|_____________________________| ");
        System.out.println("\n===============================================");
        System.out.println();
       
            int reg=0;
            int count=0;
            System.out.print("Enter Patient Registeration No.:PI ");
            reg = in.nextInt();
            hold = (PatientInfo)PatientInfo.PI.getFirst();
            while(hold!=null){
                if(hold.getReg_no()!=reg){
                    count++;
                    p=hold;
                }
                hold = (PatientInfo)PatientInfo.PI.getNext();
            } 
            System.out.println();
           
         if(count>0){ 
           System.out.print("\t\tChoose Ward(1/2): ");
           ward = in.nextInt();
            if(ward>2 || ward <=0){
                System.out.println("\t\tThe Ward That You Selected Is "+ward);
                while(ward>2 || ward <=0){
                    System.out.println("\t\t    +++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("\t\t    We don't have this ward, Please try again!");
                    System.out.println("\t\t    +++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print("\t\t    Please enter the ward that you want : ");
                    ward = in.nextInt();
                }
            }
            
            int space=0;
            if(ward==1){
                System.out.print("Enter Level You Want to Choose: ");
                space = in.nextInt();
                p.setSpace(space);
                switch(space)
                {   
                    case 1:if (space1>0){
                            System.out.println("\t\tThe ward is available");
                            space1--;
                           }
                           else
                           {
                              System.out.println("============================================");
                              System.out.println("\t\tSorry, No more space at 1");
                              System.out.println("============================================");
                            }    
                           break;

                    case 2:if (space2>0){
                               System.out.println("\t\tThe ward is available");
                               space2--;
                           }
                           else
                           {
                               System.out.println("============================================");
                               System.out.println("\t\tSorry, No more space at 2");
                               System.out.println("============================================");
                           }    
                           break;

                    case 3:if (space3>0){
                                System.out.println("\t\tThe ward is available");
                                space3--;
                           }
                           else
                           {
                                System.out.println("============================================");
                                System.out.println("\t\tSorry, No more space at 3");
                                System.out.println("============================================");
                           }
                           break;

                    case 4:if (space4>0){
                                System.out.println("\t\tThe ward is available");
                                space4--;
                           }
                           else
                           {
                                System.out.println("============================================");
                                System.out.println("\t\tSorry, No more space at 4");
                                System.out.println("============================================");
                           }
                           break;

                    case 5:if (space5>0){
                                System.out.println("\t\tThe ward is available");
                                space5--;
                           }
                           else
                           {
                                System.out.println("============================================");
                                System.out.println("\t\tSorry, No more space at 5");
                                System.out.println("============================================");
                           }
                           break;

                    default:
                            while(space<=0||space>5){
                                System.out.println("Wrong Input !!");
                                System.out.print("Enter Level You Want to Choose: ");
                                space = in.nextInt();
                            }
                            break;

                }
            }
            else if(ward==2){
                System.out.print("Enter Level You Want to Choose: ");
                space = in.nextInt();
                p.setSpace(space);
                switch(space)
                {   
                    case 1:if (space1>0){
                            System.out.println("\t\tThe ward is available");
                            level1--;
                           }
                           else
                           {
                              System.out.println("============================================");
                              System.out.println("\t\tSorry, No more space at 1");
                              System.out.println("============================================");
                            }    
                           break;

                    case 2:if (space2>0){
                               System.out.println("\t\tThe ward is available");
                               level2--;
                           }
                           else
                           {
                               System.out.println("============================================");
                               System.out.println("\t\tSorry, No more space at 2");
                               System.out.println("============================================");
                           }    
                           break;

                    case 3:if (space3>0){
                                System.out.println("\t\tThe ward is available");
                                level3--;
                           }
                           else
                           {
                                System.out.println("============================================");
                                System.out.println("\t\tSorry, No more space at 3");
                                System.out.println("============================================");
                           }
                           break;

                    case 4:if (space4>0){
                                System.out.println("\t\tThe ward is available");
                                level4--;
                           }
                           else
                           {
                                System.out.println("============================================");
                                System.out.println("\t\tSorry, No more space at 4");
                                System.out.println("============================================");
                           }
                           break;

                    case 5:if (space5>0){
                                System.out.println("\t\tThe ward is available");
                                level5--;
                           }
                           else
                           {
                                System.out.println("============================================");
                                System.out.println("\t\tSorry, No more space at 5");
                                System.out.println("============================================");
                           }
                           break;

                    default:
                            while(space<=0||space>5){
                                System.out.println("Wrong Input !!");
                                System.out.print("Enter Level You Want to Choose: ");
                                space = in.nextInt();
                            }
                            break;

                }
            }
            
            p.setWard(ward);
            System.out.print("Enter How Many Day Stay: ");
            int day = in.nextInt();
            double pay = p.calcPrice(day);
            p.setPay(pay);
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
              DisplayWard();
              
         }
             
         
         
           System.out.print("Do You Want To Continue (Y,y/N,n): ");
           answer = in.next().charAt(0);
           System.out.print('\u000C');//ClearScreen   
       }while(answer=='y'||answer=='Y');
       System.out.print('\u000C');//ClearScreen   
       Tasks.Tasks();
     }catch(Exception e){
            System.out.println("Problem!!"+e.getMessage());
        }  
   }
   
}
