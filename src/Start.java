import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.xml.XmlConfiguration;


public class Start {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		 /*Start.java和etc文件夹在同一个项目的src下面.*/
		 Resource jetty_xml = Resource.newSystemResource("./etc/jetty.xml");
		 /*Start和etc文件夹在同一个目录下.  
		  *如将Satrt.java打成jar包, 并和etc文件夹放到同一个目录下面.
		  */
//		 Resource jetty_xml = Resource.newResource("etc/jetty.xml");
		 
		 XmlConfiguration configuration = new XmlConfiguration(jetty_xml.getInputStream());
		 Server server = (Server) configuration.configure();
		 server.start();
		 server.join();
	}

}
