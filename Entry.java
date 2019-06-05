
/**
 * Write a description of class Entry here.
 * 
 * blue print for Lecture,Computer Lab and Seminar Lab.
 *
 * @author (Student Number:2636568)
 * @version (14/03/2018)
 */
public  abstract class Entry
{
    // initilize 10 variables - store information from formattedsimple.txt file.
    private String Name;
    private String Day;
    private String StartTime;
    private String EndTime;
    private String WeekPattern;
    private String Location;
    public String Roomsize;
    public String ClassSize;
    private String Staff;
    private String Department;
    
    
    /**
     * Constructor for objects of class Entry
     */
    public Entry(String n,String d,String st,String ed,String w,String l,String r,String cl,String sf,String dep)
    {
        // initialise instance variables
        Name = n;
        Day = d;
        StartTime = st;
        EndTime = ed;
        WeekPattern = w;
        Location = l;
        Roomsize = r;
        ClassSize = cl;
        Staff = sf;
        Department = dep;
    }

    /**
     * Object for Name of course
     * 
     * @return name
     */
    public String getName () 
    {
        // get Name back.
        return  Name;
    }
    
    /**
     * Object for Day for one course
     * 
     * @return day
     */
    public String getDay() 
    {
        // get Day back.
        return  Day;
    }
    
    /**
     * Object for startTime for one course
     * 
     * @return startTime
     */
    public String getStartTime() 
    {
        // get StartTime back.
        return  StartTime;
    }
    
    /**
     * Object for endTime for one course
     * 
     * @return endTime 
     */
    public String getEndTime() 
    {
        // get EndTime back.
        return  EndTime;
    }
    
    /**
     * Object for WeekPattern for course
     * 
     * @return WeekPattern
     */
    public String getWeekPattern() 
    {
        // get WeekPattern back.
        return  WeekPattern;
    }
    
    /**
     * Object for Location in course.
     * 
     * @return Location
     */
    public String getLocation() 
    {
        // get Location back.
        return  Location;
    }
    
    /**
     * Object for Roomsize in course
     * 
     * @return Roomsize
     */
    public String getRoomsize() 
    {
        // get Roomsize back.
        return  Roomsize;
    }
    
    /**
     * Object for ClassSize in course
     * 
     * @return ClassSize
     */
    public String getClassSize() 
    {
        // get ClassSize back.
        return  ClassSize;
    }
    
    /**
     * Object for Staff in the course
     * 
     * @return Staff
     */
    public String getStaff() 
    {
        // get Staff back.
        return  Staff;
    }
    
    /**
     * Object for Department in the course
     * 
     * @return Department
     */
    public String getDepartment() 
    {
        // get Department back.
        return  Department;
    }
    
    
    public  abstract String getEntry() ;
    
        
   //getEntry
}


