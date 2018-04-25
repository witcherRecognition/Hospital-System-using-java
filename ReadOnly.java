import java.io.*;
import java.util.*;
public class ReadOnly
{
    public static void ReadOnly(){
        Stack holdReg = new Stack();
        PatientInfo p = null;
        
        try{
            FileReader fr = new FileReader("Patient/RegisterationNumber.txt");
            BufferedReader br = new BufferedReader(fr);
            String in;
            int readReg=0;
            
            fr = new FileReader("Patient/RegisterationNumber.txt");
            br = new BufferedReader(fr);
            in=br.readLine();
            while(in!=null){
                StringTokenizer st = new StringTokenizer(in,";");
                readReg = Integer.parseInt(st.nextToken());
                GenerateRegID.ReadReg(readReg);
                holdReg.push(readReg);
                in=br.readLine();
            }
            
            while(!holdReg.isEmpty()){
                fr = new FileReader("Patient/Patient"+holdReg.pop()+".txt");
                br = new BufferedReader(fr);
                String name="";
                String status="";
                String ic="";
                String phoneNo="";
                String bld_group="";
                String houseNo="";
                String street="";
                String poscode="";
                String city="";
                String state="";
                String country="";
                int date=0,month=0,year=0;
                in = br.readLine();
                while(in!=null){
                    StringTokenizer st = new StringTokenizer(in,";");
                    name = st.nextToken();
                    status = st.nextToken();
                    readReg = Integer.parseInt(st.nextToken());
                    ic = st.nextToken();
                    phoneNo = st.nextToken();
                    bld_group = st.nextToken();
                    houseNo = st.nextToken();
                    street = st.nextToken();
                    poscode = st.nextToken();
                    city = st.nextToken();
                    state = st.nextToken();
                    country = st.nextToken();
                    date = Integer.parseInt(st.nextToken());
                    month = Integer.parseInt(st.nextToken());
                    year = Integer.parseInt(st.nextToken());
                    
                    p = new PatientInfo(name,status,readReg,ic,phoneNo,bld_group);
                    Person.add.setData(houseNo,street,poscode,city,state,country);
                    Person.d.setDate(date,month,year);
                    Person.d.show_date();
                    PatientInfo.PI.insertAtFront(p);
                    PatientInfo.t.insertNode(p);
                    in=br.readLine();
                }
            }
            br.close();
        }catch(Exception e){
            System.out.println("Problem!!"+e.getMessage());
        }
    }
}
