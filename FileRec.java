import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
/**
 * Write a description of class FileRec here.
 *
 * @author (2636568)
 * @version (14 March 2019)
 */
public class FileRec
{
    // separated from complex file and we will use to find many modules because it has more subject compared with simple.txt
    
    public Record FilesforSearchandSave() throws IOException {
        
        File inputFile = new File ("simple.txt"); // read simple.txt files
        File outputFile = new File("formatted.txt"); // Create output files called formatted.txt
        
        Scanner in = new Scanner(new File("simple.txt")); // scan insidde simple.txt files
        
        PrintWriter out = new PrintWriter(outputFile); // Print output file
        Record list = new Record(); // create Record Object called list
        out.format("%-20s%-10s%-20s%-20s%-35s%-30s%-15s%-15s%-200s%-15s\n",
            "Module Name","Day","Start time","End Time","Week Patern","Location","Room Size","Class size","Staff","Departure");// create Title of output files
        while(in.hasNext()) // create loop untill it can't scan text.
        {
            
            String line = in.nextLine(); // Scan text inside simple.txt files
            String [] Categories = line.split("\\t",10); // split text by tab and store in 10 array
            String catName  = Categories[0];//create string module name in first array after we split.
            String catDay  = Categories[1];//create string day in second array after we split.
            String catSTime  = Categories[2];//create string time in third array after we split.
            String catETime  = Categories[3];//create string end time in fourth array after we split.
            String catWeek  = Categories[4];//create string week pattern in fifth array after we split.
            String catLo  = Categories[5];//create string Location in sixth array after we split.
            String catRo = Categories[6];//create string Room Size in seventh array after we split.
            String catClass  = Categories[7];//create string Class Size in eight array after we split.
            String catSf  = Categories[8];//create string staff name (more than one people) in ninth array after we split.
            String catDep  = Categories[9];//create string department name in tenth array after we split.

            
            
            
            
           
            
            
            //print all string that we create above 
            out.printf("%-25s%-10s%-20s%-20s%-35s%-30s%-15s%-15s%-200s%-15s" + "\n",catName ,catDay,catSTime,catETime,catWeek,catLo,catRo,catClass,catSf,catDep);
            
            
                
             //Store many string in Entry Objects    
            if(catName .contains(".L#") ) // find part of name containing (.L)
            {
                Entry lecture = new Lecture(catName ,catDay,catSTime,catETime,catWeek,catLo,catRo,catClass,catSf,catDep);//create Entry object
                
                list.addEntry(lecture);//add in Lecture Object
                
            }else if(catName .contains(".CL"))// find part of name containing (.CL)
            {
                Entry cl = new ComputerLab(catName ,catDay,catSTime,catETime,catWeek,catLo,catRo,catClass,catSf,catDep);//create Entry object
                
                list.addEntry(cl);//add in ComputerLab Object
            }else if(catName .contains(".S"))// find part of name containing (.S)
            {
                Entry s = new Seminar(catName ,catDay,catSTime,catETime,catWeek,catLo,catRo,catClass,catSf,catDep);//create Entry object
                
                list.addEntry(s);//add in Seminar Object
            }    
            
            
                 
            }
            
        out.close(); // stop scan after empty text.
        
        return list; // called list 
            
            }
            
            
        
        }
               
       
        
        
    
