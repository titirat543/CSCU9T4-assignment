// GUI and main program for the RecordGUI
//All import Library.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.io.IOException;
import javax.swing.JScrollPane;
import javax.swing.text.DefaultCaret;
import java.io.PrintWriter;
import java.io.FileWriter;
import javax.swing.text.PlainDocument;

public class RecordGUI extends JFrame implements ActionListener
{
    private JTextField Name = new JTextField(13); // create only one module name textfield.
    private JTextField Day = new JTextField(10);  // create day textfield for study in one module .
    private JTextField StartTime = new JTextField(10); // the start time textfield in one module.
    private JTextField EndTime = new JTextField(10);// create finish time textfield in one module.
    private JTextField WeekPattern = new JTextField(25); // create week pattern textfield for module .
    private JTextField Location = new JTextField(10);// create location textfield for module .
    private JTextField Roomsize = new JTextField(7);// create size of room textfield for module.
    private JTextField Classsize = new JTextField(5);//create size of class textfield for module.
    private JTextField Staff = new JTextField(30);//create name of staff textfield for module.
    private JTextField Department = new  JTextField(30);//create name of department textfield for module.
    
    private JLabel labn = new JLabel("Module Name: ");// create module name Label.
    private JLabel labd = new JLabel(" Day:");// create day Label.
    private JLabel labs = new JLabel(" Start time:");// create Start time Label.
    private JLabel labe = new JLabel(" End Time:");// create End Time Label.
    private JLabel labw = new JLabel(" week pattern:");// create week pattern Label.
    private JLabel labl = new JLabel("Location:");// create End Time Label.
    private JLabel labr = new JLabel(" Room size:");// create Room size Label.
    private JLabel labc = new JLabel(" Class size:");// create Class size Label.
    private JLabel labst = new JLabel(" Staff :");// create Staff Label.
    private JLabel labdep = new JLabel("Department :");// create Department Label.
    //Create information before insert input.
    private JLabel labsave = new JLabel("Make sure that You put the Last letter in one module,Look README.TXT LINE 38-41 ");
    //Create information before insert input.
    private JLabel labnotice = new JLabel("Before you create your timetable,click check button first,if you don't have subject,Add fisrt AND CLICK ADD MODULE FOR YOUR TIMETABLE.");
    
    
    private JButton addR = new JButton("Add New Module");// Add new module information.
    private JButton FindAllByNameR = new JButton("FindByName");// find module information.
    private JButton addTTR = new JButton("Add module for create  Your Own Timetable");// Add new module information.
    private JButton FindAllByNameRR = new JButton("Check your timetable subject");// find module information in you own timetable.
    private JButton RemoveSR = new JButton("RemoveRecord");// remove module information.
    private JButton SaveR = new JButton("FormattedWholeTimetable"); //Allow User to save whole timetable in txt file.
    private JButton HtmlR = new JButton("FormattedHTMLTimetable"); //Allow User to save your timetable in html file.
    
    private JTextArea outputArea = new JTextArea(30,50);//Create TextArea show information
    
    private JScrollPane scrollPane = new JScrollPane(outputArea); //create scrollPane.
    private DefaultCaret caret = (DefaultCaret) outputArea.getCaret();//create caret.
    FileRec reading = new FileRec();//create FileRec Object.
    
    
    private Record list ;//initilize Record Object which have many modules from text files.
    private MyTT  mytimetable = new MyTT();//initilize MyTT Object which we want to generate our timetable.
    
    public static void main(String[] args) {
        RecordGUI applic = new RecordGUI();
   } //
   
   public RecordGUI() {
        //Check that correct  formatted file from complex.txt
        try
        {
            this.list =reading.FilesforSearchandSave();

        }
        catch(IOException e)
        {

        }
       
        // Set Layout
        setLayout(new FlowLayout()); 
        
        //Set laber + textfield
        add(labn); //Module Name
        add(Name);
        Name.setEditable(true);
        add(labd);//Day
        add(Day);
        Day.setEditable(true);
        add(labs);//StartTime
        add(StartTime);
        StartTime.setEditable(true);
        add(labe);//EndTime
        add(EndTime);
        EndTime.setEditable(true);
        add(labw);//WeekPattern
        add(WeekPattern);
        WeekPattern.setEditable(true);
        add(labl);//Location
        add(Location);
        Location.setEditable(true);
        add(labr);//Roomsize
        add(Roomsize);
        Roomsize.setEditable(true);
        add(labc);//Classsize
        add(Classsize);
        Classsize.setEditable(true);
        add(labst);//Staff Name
        add(Staff);
        Staff.setEditable(true);
        add(labdep);//Department
        add(Department);
        Department.setEditable(true);
        
        //Create Button
        add(labsave); // Create information Label.
        add(addR); //Add Button
        addR.addActionListener(this);
        add(FindAllByNameR);//FindAllByName Button
        FindAllByNameR.addActionListener(this);
        add(RemoveSR);//Remove Button
        RemoveSR.addActionListener(this);
        add(SaveR);//SaveWholeTimetable Button
        SaveR.addActionListener(this);
        add(labnotice);
        add(addTTR); //Add your own timetable Button
        addTTR.addActionListener(this);
        add(FindAllByNameRR);//check your own modules.
        FindAllByNameRR.addActionListener(this);
        add(HtmlR);//SaveHtmlTimetable Button
        HtmlR.addActionListener(this);
        
        

        add(outputArea);// Create Output Area.
        add(scrollPane);// Create scrollPane inside Output Area.
        scrollPane.setViewportView(outputArea);
        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        outputArea.setEditable(false); 
        setSize(1000,800);// Create  Output Area size.
        setVisible(true); 
        
        
        blankDisplay();//Create method after many event.
        
        
        
        
   } // constructor
   
   public void actionPerformed(ActionEvent event) {    
        if (event.getSource() == addR) { //Create Add function
           String n = Name.getText(); // insert Name.
           String d = Day.getText();// insert Day.
           String st = StartTime.getText();//insert StartTime.
           String ed =EndTime.getText();//insert EndTime.
           String w =WeekPattern.getText();//insert WeekPattern.
           String l =Location.getText();//insert Location.
           String r =Roomsize.getText();//insert Roomsize.
           String cl = Classsize.getText();//insert Classsize.
           String sf = Staff.getText();//insert Staff.
           String dep = Department.getText();//insert Department.
           
           if(n.length() <= 13){ //Check Name no more than 13 charector.
           
           boolean checkEntry=false; // initilize boolean checkEntry.
           checkEntry=list.checkDuplicateEntry(n,d,st,ed,w);// check input by checkDuplicateEntry method.
           
           
           
           
           if(checkEntry == true){ // if true,go to check Catagory inside if condition
            
               
                
               
                   // for add in lecture Object.
                   
                    if(n.contains(".L#") || n.contains(".L/")){// find part of name containing (.L)
               
                   Entry e = new Lecture(n, d, st, ed, w, l, r, cl,sf,dep);//create Entry object
                   list.addEntry(e);//add in Lecture Object
                   outputArea.setText("Record added in Lecture\n"); // tell information.
                  }else if(n.contains(".CL#")|| n.contains(".CL/")){// find part of name containing (.CL)
                    Entry e = new ComputerLab(n, d,st, ed, w, l, r, cl,sf,dep);//create Entry object
                    list.addEntry(e);//add in ComputerLab Object
                    outputArea.setText("Record added in computer lab\n");// tell information.
                  }else if(n.contains(".S")|| n.contains(".S/")){// find part of name containing (.S)
                    Entry e = new Seminar(n, d, st, ed, w, l, r, cl,sf,dep);//create Entry object
                    list.addEntry(e);//add in ComputerLab Object
                    outputArea.setText("Record added in Seminar\n");// tell information.
                   } else
                   {
                      outputArea.setText("Please check the behide module name");//check text.
                   }
           
           }else{
               
               outputArea.setText("information have input already.");//if we find Name inside Entry Object.
            
            }
           } else if(n.length() == 0) {
               outputArea.setText("No name =,it is empty.");//if we don't find anything.
            }  else {
               outputArea.setText("You put more one module.");//if we find More One Name.
            }  
        }
        
        
        if(event.getSource() == RemoveSR){ //Create Remove function.
           String n = Name.getText();//insert Name.
           
           outputArea.setText("Delete..Record");//Show output.
           String result = list.RemoveEntry(n);//called RemoveEntry method from list.
           String result1 = mytimetable.RemoveEntry(n);//called RemoveEntry method from my own timetable.
           outputArea.setText(result);//show result.
           outputArea.setText(result1);//show result.
        }
        
        
        if(event.getSource() == FindAllByNameR){//Create FindAllByName function.
           String n = Name.getText();//insert Name.
           String result;//initilize string result.
           if(n.isEmpty())//input is Empty.
           {
               result = "Don't forget insert name  Also ,Don't forget .L# ,.CL and .S after modules";
               
            }else{//input isn't empty.
           
                result = list.FindAllByName(n);// Called FindAllByName Methohd .
            }
           outputArea.setText(result);//show result.
        }
        
        if(event.getSource() == SaveR){//Create Save function.
           //show result.
           
            try //Make sure file correct.
            {
                Record.createFormattedTimetable();
            }
            catch(IOException e)
            {

            }
           
        }
        
        if (event.getSource() == addTTR) { //Create Add function
           String n = Name.getText(); // insert Name.
           String d = Day.getText();// insert Day.
           String st = StartTime.getText();//insert StartTime.
           String ed =EndTime.getText();//insert EndTime.
           String w =WeekPattern.getText();//insert WeekPattern.
           String l =Location.getText();//insert Location.
           String r =Roomsize.getText();//insert Roomsize.
           String cl = Classsize.getText();//insert Classsize.
           String sf = Staff.getText();//insert Staff.
           String dep = Department.getText();//insert Department.
           
           if(n.length() <= 13 || n.length() > 0){ //Check Name no more than 13 charector.
           
               boolean checkEntry=false; // initilize boolean checkEntry.
               checkEntry=mytimetable.checkDuplicateEntry(n,d,st,ed,w);// check input by checkDuplicateEntry method.
           
           
           
           
                if(checkEntry == true){ // if true,go to check Catagory inside if condition
            
               
                
               
                   // for add in lecture Object.
                    if(n.contains(".L#") || n.contains(".L/")){// find part of name containing (.L)
               
                   Entry e = new Lecture(n, d, st, ed, w, l, r, cl,sf,dep);//create Entry object
                   mytimetable.addEntry(e);//add in Lecture Object
                   outputArea.setText("Record added in Lecture\n"); // tell information.
                  }else if(n.contains(".CL#")|| n.contains(".CL/")){// find part of name containing (.CL)
                    Entry e = new ComputerLab(n, d,st, ed, w, l, r, cl,sf,dep);//create Entry object
                    mytimetable.addEntry(e);//add in ComputerLab Object
                    outputArea.setText("Record added in computer lab\n");// tell information.
                  }else if(n.contains(".S")|| n.contains(".S/")){// find part of name containing (.S)
                    Entry e = new Seminar(n, d, st, ed, w, l, r, cl,sf,dep);//create Entry object
                    mytimetable.addEntry(e);//add in ComputerLab Object
                    outputArea.setText("Record added in Seminar\n");// tell information.
                   } else if(n.equals("") || d.equals("") ||st.equals("") ||ed.equals("")||w.equals("")
                   ||l.equals("")||r.equals("")||cl.equals("")||sf.equals("")||dep.equals(""))//check input all textfield.
                   {
                    outputArea.setText("Please make sure that you FILL ALL OF THEM");//tell information.
                   }else
                   {
                      outputArea.setText("Please check the behide module name");//check text.
                   }
           
           }else{
               
               outputArea.setText("information have input already.");//if we find Name inside Entry Object.
            
            }
           
        } else if (n.length() == 0){
               outputArea.setText("it is Empty");//if we don't have name input.
            } else{
                outputArea.setText("you put more module.");//if we  have more one name.
            } 
        }
        
        if(event.getSource() == FindAllByNameRR){//Create FindAllByName function.
           //insert Name.
          String result = mytimetable.FindAllByName();// Called FindAllByName Methohd .
            if(result.isEmpty())
            {
               outputArea.setText("it's empty");
            }else{
            outputArea.setText(result);
        }//show result.
        }
        
        
        if(event.getSource() == HtmlR ){//Create html function.
           try //Make sure file correct.
            {
                MyTT.createHTMLTimetable();
            }
            catch(IOException e)
            {

            }
           
           
        }
        
        
       blankDisplay();//After Listenner function,called blank all input.
    } // actionPerformed
    
    public void blankDisplay(){ // Set All input be empty.
       Name.setText("");
       Day.setText("");
       StartTime.setText("");
       EndTime.setText("");
       WeekPattern.setText("");
       Location.setText("");
       Roomsize.setText("");
       Classsize.setText("");   
       Staff.setText("");
       Department.setText("");
       
    }// blankDisplay
}