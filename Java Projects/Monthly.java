// Creates a derived class Monthly from super class Appointment

class Monthly extends Appointment
{
    int month;
    // Parameterized constructor
    Monthly(String des, int m)
    {
        super(des);
        month = m;
    }// End of parameterized constructor
    // Overrides toString() method to return monthly appointment information
    public String toString()
    {
        return super.toString() + "\n Appointment Day: " + month;
    }// End of method
}// End of class Monthly
