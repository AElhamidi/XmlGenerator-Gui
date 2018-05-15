
import org.jdom2.Attribute;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


/**
 *
 * @author GameOver
 */
public class xmlGenerator {

    private xmlGenerator() {}
    
    
    
    public void writeXML(){
        	try 
		{
			
			Element list=new Element("list");
			Document document=new Document(list);
				
				Element man=new Element("man");
					man.setAttribute(new Attribute("name", "Julien"));
					man.addContent(new Element("sons").setText(""));
					
					Element daughter1=new Element("daugthers");
						
						Element woman1=new Element("woman");
							woman1.setAttribute(new Attribute("name", "Sophie"));
							woman1.addContent(new Element("sons").setText(""));
							woman1.addContent(new Element("daugthers").setText(""));	
						daughter1.addContent(woman1);
						
						Element woman2=new Element("woman");
							woman2.setAttribute(new Attribute("name", "Ursule"));
							woman2.addContent(new Element("sons").setText(""));
							woman2.addContent(new Element("daugthers").setText(""));	
						daughter1.addContent(woman2);
						
					man.addContent(daughter1);
				
				list.addContent(man);
				
				Element woman=new Element("woman");
					man.setAttribute(new Attribute("name", "Marie"));
				
					Element son=new Element("son");
						Element man1=new Element("man");
							man1.setAttribute(new Attribute("name", "Joseph"));
							man1.addContent(new Element("sons").setText(""));
							Element daughter2=new Element("daughters");
								Element woman3=new Element("woman");
									woman3.setAttribute(new Attribute("name", "Marie"));
									woman3.addContent(new Element("sons").setText(""));
									woman3.addContent(new Element("daugthers").setText(""));
								
								daughter2.addContent(woman3);
							man1.addContent(daughter2);
						son.addContent(man1);
					woman.addContent(son);	
				
					woman.addContent(new Element("daughters").setText(""));
			
				list.addContent(woman);
				
				//addition of DocType to XML docment
				
				DocType docType = new DocType("list");
				
				docType.setInternalSubset("<!ELEMENT list (man | woman)*>\r\n" + 
				    	"<!ELEMENT man (sons, daughters)>\r\n" + 
				    	"<!ATTLIST man name CDATA #REQUIRED>\r\n" + 
						"<!ELEMENT woman (sons, daughters)>\r\n" + 
				    	"<!ATTLIST woman name CDATA #REQUIRED>\r\n" + 
				    	"<!ELEMENT sons (man)*>\r\n" + 
				    	"<!ELEMENT daughters (woman)*>\r\n");
				
				document.setDocType(docType);
				
				
				// new XMLOutputter().output(doc, System.out);
				XMLOutputter xmlOutput = new XMLOutputter();

				// display in xml File
				xmlOutput.setFormat(Format.getPrettyFormat());
//				xmlOutput.output(document, new FileWriter("gender-sorted.xml"));
                            // display on eclipse consol
                                xmlOutput.output(document,System.out);
                                
                             // display on JTextArea
                            String xmlDoc=xmlOutput.outputString(document);
                            
                            //setText(xmlDoc);
				
				
			
		
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
    
    }
    
    public void readXML(){
    
    }
    
}
