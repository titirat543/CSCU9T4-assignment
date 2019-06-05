
/**
 * Write a description of class ComputerLab here.
 *
 * @author (2636568)
 * @version (14 March 2019)
 */
public class ComputerLab extends Entry
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class ComputerLab
     */
    public ComputerLab(String n,String d,String st,String ed,String w,String l,String r,String cl,String sf,String dep)
    {
        // initialise instance variables - called from Emtry Class.
        super(n,d,st,ed,w,l,r,cl,sf,dep);
    }

    
    public String getEntry () 
    {
         
            String result = " This Practical " + getName () + " in " + getDay()  + " start at "
             +getStartTime() +" Week Pattern: "+getWeekPattern() +" Location: "
             + getWeekPattern()  + " at "+getLocation() +" Room Size: "
             +getRoomsize() +" Class Size: "+getClassSize() + "Staff: "
             +getStaff() +" Department: " + getDepartment() +"\n";
             
             result = result.toUpperCase();//result be UpperCase text.
             
             int Class = Integer.parseInt(getClassSize());// Casting Class size be integer
             int Room =  Integer.parseInt(getRoomsize());// Casting Room size be integer
             
             if(Class > Room)//Check condition
             {
                 
                 result = result.toLowerCase();//result be LowerCase text.
                 
                 
                }
        
   
             return result; //called result.
  } //getComputerLab
}
