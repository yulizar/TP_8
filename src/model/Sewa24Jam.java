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
public class Sewa24Jam implements StrategiPenyewaan{

    @Override
    public double kalkulasiBiaya(long biaya) {
        return biaya*0.2;
    }
    
}
