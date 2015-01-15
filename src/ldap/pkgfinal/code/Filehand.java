/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ldap.pkgfinal.code;

import java.io.*;
//import java.security.acl;

/**
 *
 * @author Rahul
 */
public class Filehand implements Serializable {

    private String owner;
    private String[] files = {"", "", "", "", ""};

    Filehand(String a, String[] b) {
        owner = a;
        files = b;
    }

    Filehand() {
        owner = "admin";
        files[0] = "file1";
        files[1] = "file2";
        files[2] = "file3";
        files[3] = "file4";
        files[4] = "file5";



    }

    //void display() {
        /*int i;
        System.out.println("OWNER: " + owner);
        System.out.print("FILES accesed: ");
        for (i = 0; i < files.length; i++) {
            System.out.print(files[i] + " ");// +files[1] + " "+ files[2] + " "+ files[3] + " "+ files[4] + " ");
        }
        System.out.println();
    }
    /*String getowner1()
    {
    String t=owner;
    return t;
    }
    String[] getfiles()
    {
    String t[] = files;
    return t;
    }*/

    int in1(String f, String o) {
        int i = 0, flag = 0;
        //String[] file;
        try {
            FileInputStream fs1 = new FileInputStream("abc.txt");
            ObjectInputStream os1 = new ObjectInputStream(fs1);
            Filehand q1 = (Filehand) os1.readObject();
            if (o.equals(q1.owner)) {

                for (i = 0; i < q1.files.length; i++) {
                    if (f.equals(q1.files[i])) {
                        flag = 1;

                    }
                }
                //display();


            } else {
                Filehand q2 = (Filehand) os1.readObject();
                if (o.equals(q2.owner)) {

                    for (i = 0; i < q2.files.length; i++) {
                        if (f.equals(q2.files[i])) {
                            flag = 1;

                        }
                    }
                  //  display();
                } else {
                    Filehand q3 = (Filehand) os1.readObject();
                    if (o.equals(q3.owner)) {

                        for (i = 0; i < q3.files.length; i++) {
                            if (f.equals(q3.files[i])) {
                                flag = 1;

                            }
                        }
                    //    display();
                    } else {
                        Filehand q4 = (Filehand) os1.readObject();
                        if (o.equals(q4.owner)) {

                            for (i = 0; i < q4.files.length; i++) {
                                if (f.equals(q4.files[i])) {
                                    flag = 1;

                                }
                            }
                      //      display();
                        }
                    }
                }
            }
            
            os1.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //System.out.println("flag " + flag);
        return flag;
        /**
         * @param args the command line arguments
         */
    }
}
