
package sidebarapp1.pkg0;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */

import java.io.BufferedReader;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException; 
import java.net.URL;
import java.net.URLConnection;
import static javafx.application.Platform.exit;

/**
 *
 * @author MAHE
 */

public class parsenews {
 public static void main(String[] args) {}
    
    /**
     * @param args the command line arguments
     */
    public static void parse() throws IOException {
        FileWriter fr= new FileWriter("newsf.txt");
        BufferedWriter bw=new BufferedWriter(fr);
        String sf[]=new String[33];
        String s2=null;
        File newsf= new File("newsf.txt");
        FileWriter f1 = new FileWriter(newsf);
        BufferedWriter w1= new BufferedWriter(f1);// TODO code application logic here
        try {
        URL my= new URL("https://in.news.yahoo.com/");
        URLConnection myURLConnection;
            myURLConnection = my.openConnection();
        myURLConnection.connect();
        File news= new File("news.txt");
       FileWriter f = new FileWriter(news);
       FileReader r= new FileReader(news); 
        
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    myURLConnection.getInputStream()));
        int input0;
        BufferedWriter w= new BufferedWriter(f);
            while ((input0 = in.read()) != -1) 
            {
                    w.write(input0);
                    if(input0=='>')
                   
                     w.newLine();
                    
                    
                    
                    
            }
            
            
     
        w.close();
        in.close();
        f.close();
           //reading from the file
        
        
              r.close();
            //return(sf);
        }
    
        catch (MalformedURLException e) { 
        System.out.println(e); // new URL() failed
        // ...
        } 
        catch (IOException e) { 
            System.out.println(e);        
        
            }   
        }
    //System.out.println("connected");
   
    
    }   

    
    


    

