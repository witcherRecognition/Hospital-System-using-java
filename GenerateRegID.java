import java.util.*;

public class GenerateRegID
{
    public static ArrayList<Integer> list = new ArrayList<Integer>(PatientInfo.size);
    public static int countReg=0;
    public static int GenerateRegID(){       
       if(countReg==0){ 
        for(int i = 1; i <= PatientInfo.size; i++) {
            list.add(i);
        }
       } 
       
         Random rand = new Random();
         int index;
         int reg_no=0;
         if(list.size()!=0){
          index = rand.nextInt(list.size());   
          reg_no = list.get(index);
          list.remove(index);
          PatientInfo.NumOfRegis++;
        }
       countReg++;
       return reg_no;  
    }
    
    public static int ReadReg(int a){
        if(countReg==0){ 
        for(int i = 1; i <= PatientInfo.size; i++) {
            list.add(i);
        }
       } 
       
       Random rand = new Random();
       int index;
       int reg_no=0;
         if(list.size()!=0){
          index = a;   
          reg_no = list.get(index);
          list.remove(index);
          PatientInfo.NumOfRegis++;
        }
       countReg++;
       return reg_no; 
    }
}
