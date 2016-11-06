/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author my computer
 */
public class FileIO {
    void saveObject(Object o,String filename) throws IOException{
        try(FileOutputStream fout = new FileOutputStream(filename)){
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(o);
            oout.flush();
        }
    }
    
    Object loadObject(String filename) throws IOException, ClassNotFoundException{
        Object o;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            o = ois.readObject();
        }
        return o;
    }
}
