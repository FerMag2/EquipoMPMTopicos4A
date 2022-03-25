/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Directorio;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Pablo Che
 */

public class Directorios {
    
    String[] directorios;
    int i = 0;
    int tam = 0;
    
    public String[] directoriosPagina (String host) {
        
        try {
            
            final Document doc = Jsoup.connect(host).get();
            Elements busc = doc.select("[href]");
            directorios = new String[busc.size()];
            tam = busc.size();

            for (Element link : busc) {
                directorios[i] = (link.tagName() + link.attr("abs:href") + "\n");
                i++;
            }
            return directorios;
        } catch (Exception e) {
        }
        return null;
    } 
}