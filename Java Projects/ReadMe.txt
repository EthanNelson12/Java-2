  static Appointment app[];
    // Defines a method to check the appointment date and displays information
    static void occursOn(int year, int month, int day)
    {
        // Sets the found status to 0 for not found appointment
        int flag = 0;
        // Loops till number of appointment
        for(int i = 0; i < app.length; i++)
        {
            // Checks if current object is of type Onetime class
            if(app[i] instanceof Onetime)
            {
                // Converts the current object to Onetime class object
                Onetime o = (Onetime)app[i];
                // Checks if year, month and day of parameter is equals to
                // the current object year, month and day
                if(o.year == year && o.month == month && o.day == day)
                {
                    // Sets the flag value to 1 for found appointment
                    flag = 1;
                    // Displays the current object information
                    System.out.println("\n *********** One Time Appointment ***********");
                    System.out.println(o);
                }
            }
            // Otherwise checks if current object is of type Daily class
            else if(app[i] instanceof Daily)
            {
                // Converts the current object to Daily class object
                Daily d = (Daily)app[i];
                // Checks if current object day is equals to parameter day
                if(d.day == day)
                {
                    // Sets the flag value to 1 for found appointment
                    flag = 1;
                    // Displays the current object information
                    System.out.println("\n *********** Daily Appointment ***********");
                    System.out.println(d);
                }
            }
            // Otherwise current object is of type Monthly class
            else
            {
                // Converts the current object to Monthly class object
                Monthly m = (Monthly)app[i];
                // Checks if current object month is equals to parameter month
                if(m.month == month)
                {
                    // Sets the flag value to 1 for found appointment
                    flag = 1;
                    // Displays the current object information
                    System.out.println("\n *********** Monthly Appointment ***********");
                    System.out.println(m);
                }
            }
        }
        // Checks if flag value is 0 then appointment is not available on the date
        if(flag == 0)
        {
            // Displays the not found information
            System.out.println("\n No Appointment on: " + day + "/" + month + "/" + year);
            System.out.println("\n *********** *********** ***********\n");
        }
    }





 // Declares an array of object of class Appointment of size 6

        app = new Appointment[6];

        // Creates object of class Onetime

        app[0] = new Onetime("see the cardiology", 2010, 10, 2);

        app[1] = new Onetime("see the gynic", 2019, 5, 28);

        // Creates object of class Daily

        app[2] = new Daily("see the dentist", 2);

        app[3] = new Daily("see the pedeatric", 9);

        // Creates object of class Monthly

        app[4] = new Monthly("see the gynic", 5);

        app[5] = new Monthly("see the dentist", 4);

        // Calls the method to check the appointment

        occursOn(2010, 10, 2);

        occursOn(2020, 10, 14);

        occursOn(0, 0, 2);

        occursOn(0, 5, 2);