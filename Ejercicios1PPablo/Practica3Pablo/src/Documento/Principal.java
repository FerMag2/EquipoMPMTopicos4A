/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documento;

/**
 *
 * @author Pablo Che
 */

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

public class Principal {
    
    public static Document ObtenerDocument(String host) {
        Document html = null;

        try {
            html = Jsoup.connect(host).get();
            
        } catch (Exception e) {
            
            System.out.print("Error al obtener documento");
        }
        return html;
    }
}
