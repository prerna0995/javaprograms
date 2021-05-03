import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyClass.readPropertyFile();
		PropertyClass.writePropertyFile();
		PropertyClass.readPropertyFile();
	}

	public static void readPropertyFile() throws IOException {
		Properties p = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("resources/abc.properties");
			p.load(fis);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			fis.close();
		}
		System.out.println(p);
		//System.out.println(p.getProperty("a"));
	} 

	public static void writePropertyFile() throws IOException {
		try {
			Properties p = new Properties();
			p.setProperty("d", "4");
			
			FileOutputStream fos = new FileOutputStream("resources/abc.properties");
			p.store(fos, "added d parameter");
			fos.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
