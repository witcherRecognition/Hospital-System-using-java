
public class DateOfBirth extends Date
{
    private String Day_d;
    private String Month_d;
    
    public DateOfBirth(){super();}  
    public DateOfBirth(int d,int m,int y){
        super(d,m,y);
    }
    
    public void show_date(){
        int rem;
        
        rem = date%10;
        switch(date)
        {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:{
                     Day_d = "th";
                     break;
                    }
        }
        switch(rem)
        {
            case 1:{
                    Day_d = "st";
                    break;
                   }
            case 2:{
                    Day_d = "nd";
                    break;
                   }      
            case 3:{
                    Day_d = "rd ";
                    break;
                   }       
        }
        switch(month)
        {
            case 1:{
                    Month_d = "January";
                    break;
                   }
            case 2:{
                    Month_d = "February";
                    break;
                   }
            case 3:{
                    Month_d = "March";
                    break;
                   }       
            case 4:{
                    Month_d = "April";
                    break;
                   }       
            case 5:{
                    Month_d = "May";
                    break;
                   }       
            case 6:{
                    Month_d = "June";
                    break;
                   }
            case 7:{
                    Month_d = "July";
                    break;
                   }       
            case 8:{
                    Month_d = "August";
                    break;
                   }       
            case 9:{
                    Month_d = "September";
                    break;
                   }       
            case 10:{
                     Month_d = "October";
                     break;
                    }       
            case 11:{
                     Month_d = "November";
                     break;
                    }        
            case 12:{
                     Month_d = "December";
                     break;
                    }        
        }
    }
    
    public String toString(){
            return 
            "\nDate Of Birth: "+date+Day_d+" "+Month_d+" "+year;
        }
        
    public String saveDOB(){
        return 
        date+";"+month+";"+year;
    }    
}
