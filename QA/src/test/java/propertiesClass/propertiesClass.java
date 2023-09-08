package propertiesClass;

import java.io.FileInputStream;
import java.util.Properties;
public class propertiesClass {

	public static void main(String[] args) throws Throwable {
FileInputStream fis=new FileInputStream("C:\\testing\\testing.properties");
Properties p=new Properties();
p.load(fis);
String s=p.getProperty("password");
System.out.println(s);
}

}
