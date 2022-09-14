import java.util.Scanner;

// Creates a derived class Onetime from super class Appointment

class Onetime extends Appointment
{
    int day;
    int month;
    int year;
    // Parameterized constructor
    Onetime(String des, int y, int m, int d)
    {
        super(des);
        day = d;
        month = m;
        year = y;
        
    }
        // Overrides toString() method to return one time appointment information
    public String toString()
    {
        return super.toString() + "\n Appointment Date: " + day + "/" + month + "/" + year;
    }

    public void OccursOn(int month, int day, int year)
    {
        Appointment apps[] = new Appointment[6];
        for(int i = 0; i < apps.length; i++)
        {
            if(apps[i] instanceof Onetime)
            {
                {
                    // Converts the current object to Onetime class object
                    Onetime o = (Onetime)apps[i];
                    // Checks if year, month and day of parameter is equals to
                    // the current object year, month and day
                    if(o.year == year && o.month == month && o.day == day)
                    {
                        
                        // Displays the current object information
                        System.out.println("\n *********** One Time Appointment ***********");
                        System.out.println(o);
                    }
                }
            }
        }
    }   
}    
