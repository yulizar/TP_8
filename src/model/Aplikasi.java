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
public class Aplikasi {
    private ArrayList<Member> listMember;
    private ArrayList<Kategori> listKategori;
    private ArrayList<Mobil> listMobil;
    private FileIO database;
    
    void createAkun(Member member){
        listMember.add(member);
    }
    void addKategori(Kategori kategori){
        listKategori.add(kategori);
    }
    void addMobil(Mobil mobil){
        listMobil.add(mobil);
    }
    void loadMobil() throws IOException, ClassNotFoundException{
            listMobil = (ArrayList<Mobil>) database.loadObject("mobil.dat");
    }
    void saveMobil() throws IOException{
        for (int i = 0; i<listMobil.size(); i++){
            database.saveObject(listMobil.get(i), "mobil.dat");
        }
    }
    void loadKategori() throws IOException, ClassNotFoundException{
            listKategori = (ArrayList<Kategori>) database.loadObject("kategori.dat");
    }
    void saveKategori() throws IOException{
        for (int i = 0; i<listKategori.size(); i++){
            database.saveObject(listKategori.get(i), "kategori.dat");
        }
    }
}
