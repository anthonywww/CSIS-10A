
/**
 * class TimeTestApp tests our new Time class by creating
 *   objects and trying out the object methods on them
 *   
 *   We develop this class in the lecture, watch the video
 *   to see the class being developed and follow along
 */
public class TimeTestApp
{
    public static void main(String [] args){
        System.out.println("\f");  // start with blank screen
        
        //**************** Demo 1 ********************
        // Create an object of class Time and store a reference to it
        //  in variable t
        Time t = new Time(); 
        System.out.println("t = " + t.hour 
                            + ":" + t.minute 
                            + ":" + t.second);        
        t.hour = 11;
        t.minute = 8;
        t.second = 3.5;
        
        // add another statement to print the values in t
        
        //**************** end Demo 1 *****************/
        /**************** Demo 2 ********************
        // Define the "No-Arg" (Default) Constructor in the Time class to set
        //   the default time to 12:00:00
        // 
        // Re-run Demo 1 and observe the change in the hour field 
        //**************** end Demo 2 *****************/
        /**************** Demo 3 ********************
        // Define the "Overloaded" (Explicit) Constructor in the Time class to 
        //   let the user set the initial time 
        
        // create a new Time object initialized to 10:45:00 and store in appt

        // print the appointment time
        
        // you can also set the different fields of a time object directly (for now)
        // change the hour field of appt to 11 and print again
    
        
        // however, this can create problems
        // change the minute field to 901 and print again

        
        
        // Therefore, in order to preserve the integrity of a Time object
        //   we will make the instance variables private. This means
        //   only methods of the Time class will be allowed to change the
        //   instance variables.
        
        // In the Time class, add the word 'private' in front of the
        //   instance variable declarations
        
        //   Also, all the t.hour and appt.hour etc expressions above
        //   are now been made illegal and must be commented out
        
        //**************** end Demo 3 *****************/
        /**************** Demo 4 ********************
        // Add the getters and setters (getHour, setHour, etc) to Time class
        // Comment out demos 1 - 3            
        // Then edit the below statements to use the get and set 
        //  methods of Time class
        
        Time appt = new Time(10,45,00);
        System.out.println("Your appointment is at: " + appt.hour + ":" 
                            + appt.minute + ":" + appt.second);        
        
        // change the hour field to 11 and print again

        
        // still can create illegal Time values
        //    Add code to the setMinute method to prevent illegal minutes
        appt.setMinute(901);
        // and print again
        
        //**************** end Demo 4 *****************/
        /**************** Demo 5 ********************
        // Default printing for Time objects only shows special Hex code 
        
        System.out.println("Your appointment is at " + appt);
        
        //**************** end Demo 5 *****************/
        /**************** Demo 6 ********************
        // Define a print method for Time objects and use that to print  
        
        System.out.print("Your appointment is at ");
        appt.print();

        //**************** end Demo 6 *****************/        

        
        
    }
}
