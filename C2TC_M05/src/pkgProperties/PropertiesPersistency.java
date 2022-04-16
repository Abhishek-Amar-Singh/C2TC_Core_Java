package pkgProperties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public class PropertiesPersistency
{
	public static void main(String[] args)
	{
		Properties namesWithID = new Properties();
		namesWithID.setProperty("Pinakin", "169");
		namesWithID.setProperty("Kaparadi", "181");
		
		try
		{
			// Writing
			Writer writer = new FileWriter("src/pkgProperties/prop.txt");
			namesWithID.store(writer, "Names and ID");
			writer.close();
			
			// Reading
			Reader reader = new FileReader("src/pkgProperties/prop.txt");
			Properties prop = new Properties();
			prop.load(reader);
			reader.close();
			
			// List properties
			prop.list(System.out);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
