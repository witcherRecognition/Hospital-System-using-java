import java.io.*;
import java.text.*;
import java.util.*;

public abstract class Person 
{
    protected String name;//Eg, Mohd amiraul bin boh jah
    protected String status;//Marrriage,single,widower > For men, widow>For Women
    protected int reg_no;//registration number..Eg, PIXXX.
    protected String ic;//Get gender
    protected String phoneNo;
    protected String bld_group;//A+,A-,B+,B-,AB+,AB-,O+,O-
    
    //Abstract
    public abstract String toString();
    //object in object
    public static Address add = new Address();
    public static DateOfBirth d = new DateOfBirth();
    
    //Other public variable
    // Calendar calendar = Calendar.getInstance();
    // SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
     // Display current time and date information.
     //Substring kalau yg depan dia x amik
     //EG. year = "20/04/1996"
     //year = year.substring(0,2)
     //Output dia 20
    //String strdate = sdf.format(calendar.getTime()).substring(6,10);
    //public int inYear = Integer.parseInt(strdate)-1000;
    
    public Person(){}
    
    public Person(String n,String s,int r,String ic,String p,String b){
        name = n;
        status = s;
        reg_no = r;
        this.ic = ic;
        phoneNo = p;
        bld_group = b;
    }
    
    public void setData(String n,String s,int r,String ic,String p,String b){
        name = n;
        status = s;
        reg_no = r;
        this.ic = ic;
        phoneNo = p;
        bld_group = b;
    }
    
    public String getName(){return name;}
    public String getStatus(){return status;}
    public int getReg_no(){return reg_no;}
    public String getIc(){return ic;}
    public String getPhoneNo(){return phoneNo;}
    public String getBld_group(){return bld_group;}
    
     public String findgen(){//Female Or Male
        int a = Integer.parseInt(ic.substring(10,12));
        String gen = null;
        if(a%2==0)
        gen = "Female";
        else
        gen = "Male";
        
        return gen;
    }
}
