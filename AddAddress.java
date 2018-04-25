import java.util.*;

public class AddAddress
{
    public static void AddAddress(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("ENTER ADDRESS: ");
        System.out.print("No of House: ");
        String houseNo = in.nextLine();
        System.out.print("STREET: ");
        String street = in.nextLine();
        System.out.print("POSCODE: ");
        String poscode = in.nextLine();
        System.out.print("CITY: ");
        String city = in.nextLine();
        System.out.print("STATE: ");
        String state = in.nextLine();
        System.out.print("COUNTRY: ");
        String country = in.nextLine();
        
        Person.add.setData(houseNo,street,poscode,city,state,country);
    }
}
