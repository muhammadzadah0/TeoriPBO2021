/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriMinggu11.EXERCISE2;

/**
 *
 * @author PC-HP
 */
public class TestElektronik {
    public static void main(String[] args) {
        Manusia zadah = new Manusia();
        TelevisiJadul tvJadul = new TelevisiJadul();
        TelevisiModern tvModern = new TelevisiModern();
        
        zadah.nyalahkanPerangkat(tvJadul);
        zadah.nyalahkanPerangkat(tvModern);
    }
}
