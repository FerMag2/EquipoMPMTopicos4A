package Ip;


import java.net.Socket;

/**
 *
 * @author Pablo Che
 */
public class IpDireccion {

    public String direccion(String url) {
        try {
            
            Socket conector = new Socket(url, 443);
            String ip = conector.getInetAddress().getHostAddress();
            return ip;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        return null;
    }
    
}
