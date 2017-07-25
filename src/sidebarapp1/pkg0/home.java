package sidebarapp1.pkg0;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */

public class home extends javax.swing.JFrame {
     String s2[]=new String[33];
      
          
        
       
        
          
          
        
    /**
     * Creates new form home
     * @param sf
     * @throws java.io.IOException
     */
    public home() throws IOException {
       
         try {
             initComponents();
             WeatherDetails w= new WeatherDetails();
              Thread.sleep(10000);
             //Image img = ImageIO.read(getClass().getResource("src/components_buttons_usage1.png"));
             String temp= "";
             String currentWeatherCondition;
             temp=w.currentTemperatureInF;
             currentWeatherCondition=w.currentWeatherCondition;
             
             temp=change(temp);
             jLabel12.setText(temp);
             jLabel14.setText(currentWeatherCondition);
             if(currentWeatherCondition=="mostly sunny"||currentWeatherCondition=="Mostly Clear")
             {ImageIcon image = new ImageIcon("C:\\Users\\MAHE\\Documents\\NetBeansProjects\\SideBarApp1.0\\src\\sunny.png");
            // ImageIcon icon = new ImageIcon(myImg);
            //System.out.println("ho gaya");
            // use icon here
            jLabel18.setIcon(image);
             
             
             }
             if(currentWeatherCondition=="Thunderstorms")
             {ImageIcon image = new ImageIcon("C:\\Users\\MAHE\\Documents\\NetBeansProjects\\SideBarApp1.0\\src\\rainy.png");
            // ImageIcon icon = new ImageIcon(myImg);
            //System.out.println("ho gaya");
            // use icon here
            jLabel18.setIcon(image);
             
             }
            
                     System.out.println(currentWeatherCondition);
              if( currentWeatherCondition=="mostly cloudy")
            {ImageIcon image = new ImageIcon("C:\\Users\\MAHE\\Documents\\NetBeansProjects\\SideBarApp1.0\\src\\cloudy.png");
            // ImageIcon icon = new ImageIcon(myImg);
            //System.out.println("ho gaya");
            // use icon here
            jLabel18.setIcon(image);
             
             
            }
              System.out.println(currentWeatherCondition);
             if(currentWeatherCondition.equals("Partly Cloudy"))
            {System.out.println("HO GAYA");
             ImageIcon image = new ImageIcon("C:\\Users\\MAHE\\Documents\\NetBeansProjects\\SideBarApp1.0\\src\\partly cloudy.png");
            // ImageIcon icon = new ImageIcon(myImg);
            
            // use icon here
            jLabel18.setIcon(image);
             
            }
             w.high[0]=change(w.high[0]);
             jLabel15.setText(w.high[0]);
             w.low[0]=change(w.low[0]);
             jLabel22.setText(w.low[0]);
             w.high[1]=change(w.high[1]);
             jLabel16.setText(w.high[1]);
             w.low[1]=change(w.low[1]);
             jLabel23.setText(w.low[1]);
             w.low[2]=change(w.low[2]);
             jLabel24.setText(w.low[2]);
             w.high[2]=change(w.high[2]);
             jLabel17.setText(w.high[2]);
             //jLabel18.setText(currentWeatherCondition);
         } catch (InterruptedException ex) {
             Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    
    }
    public String change(String temp)
    {int fahrenheit= Integer.parseInt(temp);
             double celsius =  ((fahrenheit-32)* (5.0/9.0));
             celsius=Math.floor(celsius);
             temp=Double.toString(celsius)+"\u00b0"+"C";
     return temp;
    }
        
     
    public void getdata()
    { FileReader r1= null; 
         try {
             r1= new FileReader("market.txt");
             BufferedReader in= new BufferedReader(r1);
             String inp=null;
             //String s1="span id=\"yfs_l84_";
             String s3="</b>";
             int k=0;
             String s="</span>";
             String s0="</a>";
             String s2="";
             String text=null;
             int flag[]=new int[6];
//String sfinal=null;
             while((inp=in.readLine())!= null && k !=25)
             { if(inp.contains(s3)||inp.contains(s)||inp.contains(s0))
             { if(inp.contains("BSE Sensex")||inp.contains("Nifty 50")||inp.contains("Gold</a>")||inp.contains("Oil")
                     ||inp.contains("USD/INR")
                     ||inp.contains("EUR/INR"))
             { s2=inp.substring(0, inp.indexOf("<"));
             k++;
             while((inp=in.readLine())!= null)
             {if(inp.contains(s))
                { s2+=" ";
                  s2+=inp.substring(0, inp.indexOf("<"));
                 k++;
                 break;
                }
             }
             while((inp=in.readLine())!= null)
             {if(inp.contains(s))
                {   s2+=" ";
                    s2+=inp.substring(0, inp.indexOf("<"));
                 k++;
                 break;
                }
             }
             while((inp=in.readLine())!= null)
             {if(inp.contains(s3))
                { s2+=" ";
                  s2+=inp.substring(0, inp.indexOf("<"));
                 k++;
                 break;
                }
             }
             System.out.println("yay"+" "+s2+k);
             }
             }
             
             if(k==4 && flag[0]!=1)
             {  
                flag[0]=1;
                jLabel2.setText(s2);
                 System.out.println("yay1"+" "+s2+k);
                 s2="";
             }
             if(k==8 && flag[1]!=1)
             {  flag[1]=1;
                 
                 jLabel3.setText(s2);
                 s2=null;
             }
             if(k==12 && flag[2]!=1)
             {  flag[2]=1;
                jLabel4.setText(s2);
                 s2=null;
             }
             if(k==16 && flag[3]!=1)
             { flag[3]=1;
                jLabel5.setText(s2);
                 System.out.println("yay1"+" "+s2+k);
                s2="";
             }
             if(k==20 && flag[4]!=1)
             {  flag[4]=1;
                 jLabel6.setText(s2);
                 s2=null;
             }
             if(k==24 && flag[5]!=1)
             {  flag[5]=1;
                 jLabel7.setText(s2);
                 s2=null;
             }
             }  // TODO add your handling code here:
         } catch (FileNotFoundException ex) {
             Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
         } finally {
             try {
                 r1.close();
             } catch (IOException ex) {
                 Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SidebarApp1.0");

        jPanel1.setBackground(new java.awt.Color(238, 235, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Yu Mincho", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIDEBAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 80));

        list1.setBackground(new java.awt.Color(204, 204, 204));
        list1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        list1.setForeground(new java.awt.Color(102, 153, 255));
        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });
        jPanel1.add(list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 323, 178));

        jPanel3.setBackground(new java.awt.Color(102, 145, 198));

        jLabel2.setText("BSE Sensex");

        jLabel3.setText("Nifty 50");

        jLabel4.setText("Gold");

        jLabel5.setText("EUR/INR");

        jLabel6.setText("USD/INR");
        jLabel6.setToolTipText("");

        jLabel7.setText("Oil");
        jLabel7.setToolTipText("Oil");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 425, -1, 100));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAHE\\Pictures\\today.PNG")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setText("jLabel16");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 150, 100));

        jLabel19.setBackground(new java.awt.Color(0, 153, 255));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Tomorrow");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        jLabel20.setBackground(new java.awt.Color(0, 153, 255));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Day After");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 255, 255));
        jLabel22.setText("jLabel22");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        jLabel21.setBackground(new java.awt.Color(0, 153, 255));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Two Days Ahead");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 255, 255));
        jLabel24.setText("jLabel24");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 255, 255));
        jLabel23.setText("jLabel23");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAHE\\Desktop\\App-background1.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 360, 330));

        label3.setText("UPDATE NEWS");
        jPanel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAHE\\Desktop\\components_buttons_usage1 (1).png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 36, 34));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\MAHE\\Desktop\\pasta-texture-twitter-background.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 770, 360));

        label1.setFont(new java.awt.Font("Aharoni", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("NEWS:");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
      
       
      
         
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       FileReader r;
         try {
             r = new FileReader("news.txt");
         
         
        BufferedReader in1= new BufferedReader(r);
        int input,count=1;
        int i=0;
                   // index of string array
        String inp=null;
        String s1="span class=\"C(#0078ff):h Z(2) Pos(r)";
       // String s5="<span class=\"Ff($ff-primary) Fw(600) Lh(18px)";
        String s="</span>";
        String s2= null;
        System.out.println("wooohooo");
        while((inp=in1.readLine())!=null)
        { if(inp.contains(s1))
            { inp=in1.readLine();
                if(inp.contains(s))
                {s2=count+")"+inp.substring(0, inp.indexOf("<"));
                    count++;
                    //System.out.println(s2);
                 list1.add(s2);   

                }
            }
        }
        
      
        
         }
       catch(FileNotFoundException ex) 
         {
             Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);// TODO add your handling code here:
    }                                     
        catch(IOException e)
        {System.out.println(e);}  // TODO add your handling code here:  
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new home().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.List list1;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
