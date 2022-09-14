// Creates a derived class Daily from super class Appointment

class Daily extends Appointment
{
   int day;
    
    Daily(String des, int d)
    {
        super(des);
        day = d;
    }
    // Overrides toString() method to return daily appointment information
    public String toString()
    {
        return super.toString() + "\n Appointment Day: " + day;
    }
}