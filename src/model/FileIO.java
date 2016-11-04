/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author Yulizar
 */
public class FileIO implements Serializable{
    public void saveObject(Object o, String file)
            throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oout = new ObjectOutputStream(fout);
        oout.writeObject(o);
        oout.flush();
    }
    
    public Object loadObject (String file)
        throws FileNotFoundException, IOException,
            ClassNotFoundException, EOFException {
        ObjectInputStream ois
                = new ObjectInputStream(new FileInputStream(file));
        return ois.readObject();
    }
}
