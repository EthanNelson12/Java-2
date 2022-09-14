
class Appointment
{
    private String description;
  
    Appointment(String des)
        {

            description = des;

        }

    // Overrides toString() method to return description

    public String toString()
    {

        return "\n\n Appointment Information: " + description;

    }

}