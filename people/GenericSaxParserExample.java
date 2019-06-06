
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

    static String egPath = "http://www.cs.stir.ac.uk/~rcc/xml_egs/people_ns/people.xml";

    public static void main(String[] a) throws ParserConfigurationException,
            SAXException, IOException {
        
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser sp = spf.newSAXParser();
        URL url = new URL(egPath);
        InputStream is = url.openStream();
        final DefaultHandler dh = new DefaultHandler() {
            int lines = 0;
            int count = 1;
            boolean inName = false;

            @Override
            public void startDocument() throws SAXException {
                System.out.println("woo hoo started the document");
            }

            @Override
            public void startElement(String uri, String localName,
                    String qName, Attributes attributes) throws SAXException {
                if (localName.equals("name")) {
                    this.lines++;
                    System.out.println(qName + "; " + uri);
                    inName = true;
                }
            }

            @Override
            public void characters(char[] ch, int start, int length)
                    throws SAXException {
                if (inName) {
                    System.out.println( String.valueOf(ch, start, length));
                    
                }
            }

            @Override
            public void endElement(String uri, String localName, String qName)
                    throws SAXException {
                if (localName.equals("name")) {
                    // System.out.println(qName + "; " + uri);
                    inName = false;
                }
            }

            @Override
            public void endDocument() throws SAXException {
                  System.out.println("woo hoo ended the document, there were "
                        + this.lines + " names");
            System.out.println("woo hoo ended the document, there were "
                        + count + " names");
            }
        };

        sp.parse(is, dh);
        is.close();
    }
}