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
public class Siswa {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getNilai(){
        return nilai;
    }
    
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }

}
