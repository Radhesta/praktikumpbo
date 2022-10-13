/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author R A D H E S T A 
 */
public class SiswaObj {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Siswa s1 = new Siswa();
        s1.setNama("Radhesta");
        System.out.println("Nama  : " + s1.getNama());
        s1.setNilai(90);
        System.out.println("Nilai : " + s1.getNilai());
        s1.setKelas("XI RPL B");
        System.out.println("Kelas : " + s1.getKelas());
    }
}
