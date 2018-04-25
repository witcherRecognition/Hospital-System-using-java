

public abstract class Date
{
    protected int date;
    protected int month;
    protected int year;
    public abstract String toString();
    
    public Date(){}
    
    public Date(int d,int m,int y){
        date = d;
        month = m;
        year = y;
    }
    
    public void setDate(int d,int m,int y){
        date = d;
        month = m;
        year = y;
    }
    
    public int getdate(){return date;}
    public int getmonth(){return month;}
    public int getyear(){return year;}
    
}

