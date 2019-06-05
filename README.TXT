------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Timetabling(CSCU9T4) in University of Stilring
PURPOSE OF PROJECT: 
-reading and parsing of a file(simple.txt) with data in tab-separated format,
creation and description of a suitable object model in which to store the data (using the
information below),
-construction of the GUI to browse and amend the data (e.g. based on that from the practicals),  
writing an HTML file to allow the data to be displayed in a web browser.

VERSION or DATE: 14 March 2019

HOW TO START THIS PROJECT:
-check purpose of project.
-draw diagram structure for designning: picture 1
-Create Abstract class(Entry) with consist of 3 Superclass(Lecture,ComputerLab and Seminar) for classify information.
-Create GUI program by RecordGUI.java.
-Create method which adding,removing,finding information,formatted whole data in Record.java.
-Create method which adding,removing,finding our information,formatted our data in HTML file by MyTT.java.
-Create process how to formatted string in simple.txt. and store string information in each Superclass by Filec.java.
-codeing which refer from practical 1-4 in CSCU9T4
-run and check any condition and error.

AUTHORS: student number : 2636568

USER INSTRUCTIONS:

-When you run this program,it will show diagram in picture2
1.  10 JTextfield + 10 JLabel(Module Name,Day,Start Time,end time, week pattern, location, room size, class size, staff, department)
2    6 JButton(Add New Module,FindByName,Add module for create  Your Own Timetable,Check your timetable subject,RemoveRecord,FormattedwholeTimetable,
FormattedHTMLTimetable(For Your Own Timetable))
3.   1 JtextArea.(Show output anything).


In Add New Module Button.
1.Before click this button,Just make sure that you put information correctly,MAKE SURE THAT YOU PUT ONLY ONE MODULE such as
-ACCP002.L# correct
-ACCU9AD/FINU9FD.L# not correct.
Others field are fine if we have more than one person,building.
!Always have FULL STOP after type module such as ACCP002.
!AFTER FULL STOP,it should follow:
       -.L# , (L/number : L/01) which describe about this module is Lecture.
       -.CL# , (CL/number : CL/01) which describe about this module is Computer Lab.
       -.S# , (S/number : S/01) which describe about this module is Seminar.

2.You don't need to fill all textfiled if you are not sure some information like Endtime,it allow to save.
But if you want to edit again,just delete first and continue fill again.

3.If you put subject informatiom more than one time.Don't worry,it will say "You put more than one module"



In "Add module for create  Your Own Timetable" Button.
1.function is same "Add New Module" Button.
2.just make sure about you want to put ONLY module that you will start because if you click "Add New Module" Button,it will not generate your own timetable,
So it is difficult to find and create HTML FILES too.






In FindByName Button.
1.Before click this button,Just make sure that you put name correctly,This button is very sensitive such as
CSC will return all computing modules. The match need not be an initial match: that is, U9 returns all undergraduate modules
but it is good if you just put your specific name(it might return more than one so just make sure about your Name is correct).

2.It will show like if you find CSCU9A1.CL/01 and then

-THIS PRACTICAL CSCU9A1.CL/01 IN MONDAY START AT 13:05 WEEK PATTERN: 2-6, 8-12 LOCATION: 2-6, 8-12 AT C.1A11 ROOM SIZE: 60 CLASS SIZE: 50STAFF: SAVI MAHARAJ/LESLIE SMITH DEPARTMENT: NATCSM CS

!All text will show ALL  UPPER CASE letter except:
-FOR COMPUTER LAB:computer labs should be in lower case with all data fields with a message if the class size exceeds the room size.
-FOR SEMINAR:seminars should be in lower case with a message if the class size either is less than half of the room size or more than 10% above room size.




In "Check your timetable subject" Button.
1.Before click this button,Just make sure that you have your own module correctly,
it has the same function as FindByName Button.but it 's necessary to put Name to find.
(Also it might return more than one so ).

2.It will show like if you find CSCU9A1.CL/01 and then

-THIS PRACTICAL CSCU9A1.CL/01 IN MONDAY START AT 13:05 WEEK PATTERN: 2-6, 8-12 LOCATION: 2-6, 8-12 AT C.1A11 ROOM SIZE: 60 CLASS SIZE: 50STAFF: SAVI MAHARAJ/LESLIE SMITH DEPARTMENT: NATCSM CS

!All text will show ALL  UPPER CASE letter except:
-FOR COMPUTER LAB:computer labs should be in lower case with all data fields with a message if the class size exceeds the room size.
-FOR SEMINAR:seminars should be in lower case with a message if the class size either is less than half of the room size or more than 10% above room size.

3.IF YOU SEE WHITE SCREEN IN TEXTAREA,it mean you didn't generate timetable yet.So make sure,you create first or "Add module for create  Your Own Timetable".





In "FormattedwholeTimetable" Button.
1.Don't put any information,just click.
2.after click this button,you have to look "WholeTimetable.txt" which is similar in "formatted.txt".
3.it save ALL TIMETABLE OF ALL MODULES.


In "FormattedHTMLTimetable(For Your Own Timetable)" Button.
1.Don't put any information,But you have to check YOUR OWN MODULES BY USING "Check your timetable subject" Button,
If you don't find,just add it.
!!!! USE ONLY "Add module for create  Your Own Timetable" Button.

2.after click this button,you have to look "timtable.html" which is similar in "formatted.txt" BUT HAVE LINE FOR SEPARATEING EACH FILEDS.
3.it save JUST ONLY YOUR OWN MODULES.




IN RemoveRecord Button.
1.Just put the Name,it will remove ALL INFORMATION both YOUR OWN timetable and ORIGINAL LIST.
2.Make sure before delete every time.


!!If YOU SEE MANY MODULES,You can scoll down-up and left-right inside TextArea after you want to look.







