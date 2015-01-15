/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ldap.pkgfinal.code;

import java.awt.Desktop;
import java.net.*;
import java.io.*;


/**
 *
 * @author ANURAG
 */
public class serverldap {
    public static void main(String args[])
    {
        try
        {
             
             ServerSocket ss = new ServerSocket(1056);
             Socket ss1 = ss.accept();
             
             PrintWriter pw= new PrintWriter(ss1.getOutputStream(),true);
             String str="hi";
             pw.println(str);
               BufferedReader br=new BufferedReader(new InputStreamReader(ss1.getInputStream()));
             
             //String st;
             //st=br.readLine();
               String q,p;
               int flag=0;
               q=br.readLine();
               p=br.readLine();
             //System.out.println(br.readLine());
             //System.out.println(br.readLine());
           Fileuser use1 = new Fileuser();
        //try {
            flag=use1.userfile(q,p);
            //String str1= String.valueOf(flag);
            pw.println(String.valueOf(flag));
            int i;
            Filehand qqw = new Filehand();
            String a=br.readLine();
            i = qqw.in1(a, q);
            pw.println(String.valueOf(i));
                //try {
                    
        } 
        
        catch (IOException ex) {
            //Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
        
        
             
        catch(Exception e)
        {
             System.out.println("exex");
        }
    }
    
}
