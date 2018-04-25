import java.io.*;
import java.text.*;
import java.util.*;

public class PatientInfo extends Person
{
    public static int size = 500;
    public static int NumOfRegis = 0;
    public static int attempt=0;
    public static LinkList PI = new LinkList();//Pegang Data Patient
    public static BSTree t = new BSTree();
    private int ward;
    private double Pay;
    private int space;
    
    public PatientInfo(){
        super();
    }
    
    public PatientInfo(String n,String s,int r,String ic,String p,String b){
        super(n,s,r,ic,p,b);
    }
    
    public void setWard(int w){ward = w;}
    public void setPay(double p){Pay = p;}
    public void setSpace(int s){space = s;}
    
    public int getWard(){return ward;}
    public double getPay(){return Pay;}
    
    public double calcPrice(int day){
        double price=0;
        if(ward==1)
            price = (1500*day)+(100*day);
        else
            price = (500*day)+(50*day);
        return price;    
    }
    
    public void SpaceMoving(){
        int space=0;
        if(ward==1){
            switch(space){
               case 1:{
                        DisplayWard.space1++;
                        break;
                      }    
               case 2:{
                        DisplayWard.space2++;
                        break;
                      }
               case 3:{
                        DisplayWard.space3++;
                        break;
                      }
               case 4:{
                        DisplayWard.space4++;
                        break;
                      }
               case 5:{
                        DisplayWard.space5++;
                        break;
                      }      
            }
        }
        else if(ward==2){
            switch(space){
               case 1:{
                        DisplayWard.level1++;
                        break;
                      }    
               case 2:{
                        DisplayWard.level2++;
                        break;
                      }
               case 3:{
                        DisplayWard.level3++;
                        break;
                      }
               case 4:{
                        DisplayWard.level4++;
                        break;
                      }
               case 5:{
                        DisplayWard.level5++;
                        break;
                      }      
            }
        }
    }
    
      public String toString(){//Show Info of Patient
        return
        "\nRegistration Number: PI"+reg_no
        +"\nName: "+name
        +"\nStatus: "+status
        +"\nBlood Group: "+bld_group
        +"\nIC No.: "+ic
        +"\nPhone No.: "+phoneNo
        +"\nGender: "+findgen()
        +"\n"+add.toString()
        +"\n"+Person.d.toString();
      }
      
      public String savePI(){
          return 
          name+";"+status+";"+reg_no+";"+ic+";"+phoneNo+";"+bld_group
          +";"+add.saveAddress()+";"+Person.d.saveDOB();
      }
}
