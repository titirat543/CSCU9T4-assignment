
/**
 * Write a description of class Lecture here.
 *
 * @author (2636568)
 * @version (14 March 2019)
 */
public class Lecture extends Entry
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Lecture
     */
    public Lecture(String n,String d,String st,String ed,String w,String l,String r,String cl,String sf,String dep)
    {
        // initialise instance variables - called from Emtry Class.
        super(n,d,st,ed,w,l,r,cl,sf,dep);
        
    }
    
 
    
    

     
    public  String getEntry () 
    {
        // initilize result.
        String result = " This Lecture " + getName () + " in " + getDay()  + " start at "
             +getStartTime() +" Week Pattern: "+getWeekPattern() +" Location: "
             + getWeekPattern()  + " at "+getLocation().toUpperCase() +" Room Size: "
             +getRoomsize() +" Class Size: "+getClassSize() + "Staff: "
             +getStaff() +" Department: " + getDepartment() +"\n";
             
            
   
             return result = result.toUpperCase();//be Uppercase text.
  } //getLecture
}
