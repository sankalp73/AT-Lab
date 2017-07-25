/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidebarapp1.pkg0;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author MAHE
 */
public class market {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {}
    
       // TODO code application logic here
    public static void market() throws IOException {
    try {
        FileWriter fr= new FileWriter("newsf.txt",true);
        
        URL my= new URL("https://in.finance.yahoo.com/");
        URLConnection myURLConnection = my.openConnection();
        myURLConnection.connect();
        File market= new File("market.txt");
       FileWriter f = new FileWriter(market);
      
        
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
    }
    catch(IOException e)
    {System.out.println(e);}
    }
    //reading from the file
        public static void getinfo() throws IOException
        {
        FileReader r= new FileReader("market.txt"); 
        BufferedReader in1= new BufferedReader(r);
        int input,count=1;
        int i=0;
      
        String inp=null;
        String s1="span id=\"yfs_l84_";
        String s3="</b>";
    
        String s="</span>";
        String s0="</a>";
        String s2=null;
        while((inp=in1.readLine())!=null)
        { if(inp.contains(s3)||inp.contains(s)||inp.contains(s0))
          { s2=inp.substring(0, inp.indexOf("<"));
              
              if(s2!= null)
              System.out.println(s2);
              
             }
            
          }            
        
              r.close();
  }
    
    
       
       
        } // TODO code application logic here
    
    

