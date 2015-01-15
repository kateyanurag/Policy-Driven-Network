/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ldap.pkgfinal.code;

//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author Rahul
 */
public class Fileuser implements Serializable {
private String user;
private String pass;

    /**
     * @param args the command line arguments
     */
Fileuser(String u,String p)
{
    user=u;
    pass=p;
}

   
 Fileuser()
{
    
}
int userfile(String u,String p) throws FileNotFoundException, IOException
{
    int flag=0;
        try {
            FileInputStream f=new FileInputStream("userfile.txt");
            ObjectInputStream of=new ObjectInputStream(f);
            Fileuser us=new Fileuser();
            while(true)// for(int i=0;i<us.files.length;i++)////for(int i=0;;i++)
            {
            us=(Fileuser) of.readObject();
            if(us.user.equals(u) && us.pass.equals(p))
            {
                flag=1;
            f.close();
            break;
            }
            }
        } 
        catch (ClassNotFoundException ex) {
            //Logger.getLogger(Fileuser.class.getName()).log(Level.SEVERE, null, ex);
            flag=0;
        }
    return flag;
    
}
}

