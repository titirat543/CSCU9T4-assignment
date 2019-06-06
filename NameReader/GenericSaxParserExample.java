import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class GenericSaxParserExample {

    static String egPath = "http://www.cs.stir.ac.uk/~rcc/xml_egs/news/reutersAll.xml";

    public static void main(String[] a) throws ParserConfigurationException,
            SAXException, IOException {
        
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser sp = spf.newSAXParser();
        URL url = new URL(egPath);
        InputStream is = url.openStream();
        final DefaultHandler dh = new DefaultHandler() {
            int lines = 0; // count the number of byline in xml/html files.
            boolean inByline = false;// set up boolean when start and in the end after reading file (only read byline).
            boolean inP = false;// set up boolean when start and in the end after reading file (only read <p>).
            int count =0;//count the number of articles by Henry Tricks  in <p> and byline too.

            @Override
            public void startDocument() throws SAXException {
                System.out.println("woo hoo started the document");//print title befor start reading xml file
            }

            
            @Override
            public void startElement(String uri, String localName,
                    String qName, Attributes attributes) throws SAXException {
                if (localName.equals("p")) {// check if xml has <p> element
                    
                    
                    inP = true; // start for read character in character function.
                }
                
                if(localName.equals("byline"))// check if xml has <byline> element
                {
                   this.lines++;//Count number of byline
                   //System.out.println(qName + "; " + uri);//output in console.
                    inByline = true;// start for read character in character function.
                }
            }

            @Override
            public void characters(char[] ch, int start, int length)
                    throws SAXException {
                if (inP) {//if inP == true
                    
                    if(String.valueOf(ch, start, length).contains("Henry Tricks"))
                    // check if <p> element and <byline> have "Henry Tricks"
                    {
                        this.count++;//count the number of articles by Henry Tricks  in <p> and byline
                    }
                    
                    
                }
                
                if (inByline) {//if inName == true
                    
                    
                    //System.out.println(String.valueOf(ch, start, length));//print output of byline in console.
                    
                }
            }

            @Override
            public void endElement(String uri, String localName, String qName)
                    throws SAXException {
                if (localName.equals("byline")) {//if it find the last byline
                    
                    inByline = false; //become false to stop for reading
                    inP = false;//become false to stop for counting.
                }
            }

            @Override
            public void endDocument() throws SAXException {
                //System.out.println("woo hoo ended the document, there were "
                        //+ this.lines + " byline");//print output of number of byline.
                System.out.println("The articles which are wrote by Henry Tricks have "
                        + this.count + " articles");//print output of number of Henry articles.
            }
        };

        sp.parse(is, dh);
        is.close();
    }
}