/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriMinggu11.EXERCISE1;

/**
 *
 * @author PC-HP
 */
public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama,int gaji,int bonus) {
        super.nama = nama;
        super.gaji = gaji;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public int getGaji() {
        return gaji;
    }
    
    
}
