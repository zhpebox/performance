import javax.websocket.server.ServerContainer;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.eclipse.jetty.websocket.jsr356.server.deploy.WebSocketServerContainerInitializer;
//import com.web.test.MyWebSocket;

public class JettyServer {
    public static void main(String[] args) {
        int port = 8082;
        Server server = new Server(port);
        WebAppContext webAppContext = new WebAppContext("webapp","/GeneratorDataWeb");  
  
        webAppContext.setDescriptor("webapp/WEB-INF/web.xml");  
        webAppContext.setResourceBase("src/main/webapp");  
        webAppContext.setDisplayName("GeneratorDataWeb");  
        webAppContext.setClassLoader(Thread.currentThread().getContextClassLoader());  
        webAppContext.setConfigurationDiscovered(true);  
        webAppContext.setParentLoaderPriority(true);  
        

        server.setHandler(webAppContext);  
        System.out.println(webAppContext.getContextPath());  
        System.out.println(webAppContext.getDescriptor());  
        System.out.println(webAppContext.getResourceBase());  
        System.out.println(webAppContext.getBaseResource()); 

        try {  
             ServerContainer wscontainer = WebSocketServerContainerInitializer.configureContext(webAppContext);
            // Add WebSocket endpoint to javax.websocket layer
//             wscontainer.addEndpoint(MyWebSocket.class);   //这行是如果需要使用websocket就加上，不需要就注释掉这行，mywebsocket是自己写的websocket服务类

             server.start();
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        System.out.println("server is  start, port is "+port+"............");  
    }

}