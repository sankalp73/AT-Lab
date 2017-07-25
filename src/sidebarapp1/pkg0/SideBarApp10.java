/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidebarapp1.pkg0;

import java.io.IOException;

/**
 *
 * @author MAHE
 */
public class SideBarApp10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //String sf[]=new String[33];
        int i=1;
        parsenews.parse(); 
       // while(i==1)
        //WeatherDetails w= new WeatherDetails(); 
         // TODO code application logic here
        home h= new home();
        h.show();
        
       
        while(i==1)
        {market.market();
        h.getdata();
        }
      }
    
}
