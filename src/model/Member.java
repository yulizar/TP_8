/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Yulizar
 */
public class Member extends Akun{

    private String noMember;
    private ArrayList<Penyewaan> penyewaan;
    
    public Member(String nama, String username, String password, int number) {
        super(nama, username, password);
        
    }
    
    public void sewaMobil(Penyewaan penyewaan){
        
    }
    
    public Penyewaan getPenyewaan(){
        return null;
        
    }

    public String getNoMember() {
        return noMember;
    }

    public void setNoMember(String noMember) {
        this.noMember = "MEM-"+noMember;
    }

    public void setPenyewaan(ArrayList<Penyewaan> penyewaan) {
        this.penyewaan = penyewaan;
    }
    
    
}
