
public class Address
{
    private String houseNo;
    private String street;
    private String poscode;
    private String city;
    private String state;
    private String country;
    
    public Address(){}
    public Address(String h,String s,String p,String ct,String st,String c){
        houseNo = h;
        street = s;
        poscode = p;
        city = ct;
        state = st;
        country = c;
    }
    
    public void setData(String h,String s,String p,String ct,String st,String c){
        houseNo = h;
        street = s;
        poscode = p;
        city = ct;
        state = st;
        country = c;
    }
    
    public String gethouseNo(){return houseNo;}
    public String getstreet(){return street;}
    public String getposcode(){return poscode;}
    public String getcity(){return city;}
    public String getstate(){return state;}
    public String getcountry(){return country;}
    
    public String toString(){
        return "\nAddress: "
        +"\n"+houseNo
        +", "+street
        +"\n"+poscode
        +" "+city
        +", "+state
        +", "+country;
    }
    
    public String saveAddress(){
        return houseNo+";"+street+";"+poscode+";"+city+";"
        +state+";"+country;
    }
}
