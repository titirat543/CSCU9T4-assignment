------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:  Using SAX for more serious applications
PURPOSE OF PROJECT:
-write a Java SAX program that prints out the byline of this file.
-Now write a program that will work over a large document containing many such articles, 
and will print to the output the number of articles written by the author Henry Tricks. 


VERSION or DATE: 31/03/2019

HOW TO START THIS PROJECT:
1. Understanding the SAX code from http://www.cs.stir.ac.uk/~rcc/xml_egs/sax/nameReader.txt
2.Look at the example of a newsML article here: http://www.cs.stir.ac.uk/~rcc/xml_egs/news/2286newsML.xml
to understand the structure in this file.
3.change SAX code in GenericSaxParserExample.java.(for print byline elements)
4.go to http://www.cs.stir.ac.uk/~rcc/xml_egs/news/reutersAll.xml find the Henry's Name.
5.write the new code in GenericSaxParserExample.java.(for print the number of articles from Henry Tricks)

AUTHORS:2636568(Student number)


USER INSTRUCTIONS:
1.chage to http://www.cs.stir.ac.uk/~rcc/xml_egs/news/reutersAll.xml from http://www.cs.stir.ac.uk/~rcc/xml_egs/sax/nameReader.txt
in "static String egPath".
2.Follwing from sceenshot photo in NameReader folder.It has 1 name in byline and 3 names in <p>,we need to scan both byline and <p> in Character method.
3. using this.line to count number of byline.
   using this.count to count number of Henry Tricks articles. 
   
4.Usinf both inP and inByline boolean.
5.output will print the number of Byline and number of articles writen by Henry Tricks.


