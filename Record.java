// An implementation of a  Record as an ArrayList
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;


import java.util.*;
/**
 * Write a description of class RecordMethod here.
 *
 * @author (2636568)
 * @version (14 March 2019)
 */
public class Record
{
    // instance variables - replace the example below with your own
    private static List<Entry> list;
    
    
    
    /**
     * Constructor for objects of class RecordMethod
     */
    public Record()
    {
        // initialise List variables
        list = new ArrayList<Entry>();
    }

     public void addEntry(Entry e) {
       list.add(e);   
        //Add Entry information in list.
   } // addClass
    
   //Find All Record by the date
   public String FindAllByName(String n){
       ListIterator<Entry> iter = list.listIterator();//initialise ListIterator
       String result = " "  ;//initialise String result
       
       while (iter.hasNext()) { //Scan inside iter.
          Entry current = iter.next(); // Call Entry inside iter.
          
          
          if (current.getName().toLowerCase().contains(n.toLowerCase()) )//check Name is same input(n) both Upper,h lower case.
             {
                 
                     result += current.getEntry();//get all information which have the same name
                     
              }
          
              
           
          
       }
       
       
       
       return result ; // called back result 
    }   
    
    public String RemoveEntry (String n) {
       ListIterator<Entry> iter = list.listIterator();//initialise ListIterator
       String result = "";//initialise String result
       
       while(iter.hasNext()){//Scan inside iter.
           
       Entry current = iter.next();// Call Entry inside iter.
       if ( current.getName().equals(n)) //find the name that we want to delete.
             {
                 
                 iter.remove();//remove it.
                 
                }else{
                    result = "We can't Delete,Are you sure your name is correct?"; // if input not equal name inside Entry Object.
                }
            
            }     
       return result;//called result back.
   } // RemoveEntry 
   
   public boolean checkDuplicateEntry(String n,String d,String st,String ed,String w) //checks if the entry exists
    {
        
        ListIterator<Entry> iter = list.listIterator();//initialise ListIterator
        boolean result = true;//initialise boolean result
        while(iter.hasNext()) //Scan inside iter.
        {
            Entry current =iter.next();// Call Entry inside iter.
            
            if(current.getName().equals(n) && current.getDay().equals(d) && current.getStartTime().equals(st) 
            && current.getEndTime().equals(ed) && current.getWeekPattern().equals(w))//ckeck name,day,Starttime,Week pattern which are in Entry or not.
            {
                result=false;//if it have already in Entry.
                return result;//called result back.
            }
            
        }
        return result;//called result back.
    }
   
   public String CreateHtml(String n){
       ListIterator<Entry> iter = list.listIterator();//initialise ListIterator
       String result = " "  ;//initialise String result
       
       while (iter.hasNext()) { //Scan inside iter.
          Entry current = iter.next(); // Call Entry inside iter.
          
          
          if (current.getName().toLowerCase().contains(n.toLowerCase()) )//check Name is same input(n) both Upper,h lower case.
             {
                 
                     result += current.getEntry();//get all information which have the same name
                     
              }
          
              
           
          
       }
       
       
       
       return result ; // called back result 
    } 
   
    public static void createFormattedTimetable() throws IOException // method to create a text file from the new entries
    {
        PrintWriter out = new PrintWriter("WholeTimetable.txt");
        ListIterator<Entry> iter=list.listIterator();//initialise ListIterator
        out.format("%-20s%-10s%-20s%-20s%-35s%-30s%-15s%-15s%-200s%-15s" + "\n",
            "Module Name","Day","Start time","End Time","Week Patern","Location","Room Size",
            "Class size","Staff","Departure");//create Title of outputfile.
        while(iter.hasNext())//Scan inside iter.
        {
            Entry current=iter.next();// Call Entry inside iter.
            // Call All timtable information after formated.
           out.printf("%-20s%-10s%-20s%-20s%-35s%-30s%-15s%-15s%-200s%-15s" + "\n",
            current.getName(),current.getDay(),current.getStartTime(),
            current.getEndTime(),
            current.getWeekPattern(),current.getLocation(), 
            current.getRoomsize(),current.getClassSize(),
            current.getStaff(),current.getDepartment());
            //similar formatted,txt files,you can check. 
        }
        out.close(); // close scanner
    }
   
    
      
    }
   
   

