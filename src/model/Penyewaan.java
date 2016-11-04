/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yulizar
 */
public class Penyewaan {
    private StrategiPenyewaan jenisPenyewaan;
    private Mobil mobil;
    private double totalBiaya;

    public Penyewaan(StrategiPenyewaan jenisPenyewaan, Mobil mobil) {
        this.jenisPenyewaan = jenisPenyewaan;
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
}
