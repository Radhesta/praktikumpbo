package pertemuan1;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  R A  D H E S T A
 */
public class Luasbangundatar2 {
    private String input;
        
        private int p,l,t,pilih,hasil;
        
        public void Hitung(){
        input=JOptionPane.showInputDialog("Pilih salah satu Menu \n=========================== \n 1. Volume Balok\n 2. Volume kubus\n===========================");
        pilih=Integer.parseInt(input);
    
        if(pilih==1)
        {
        input=JOptionPane.showInputDialog("Masukkan Panjang Balok ");
        p=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("Masukkan lebar Balok ");
        l=Integer.parseInt(input);
        input=JOptionPane.showInputDialog("Masukkan Tinggi Balok ");
        t=Integer.parseInt(input);
            hasil=p*l*t;
            JOptionPane.showMessageDialog(null, "Hasil volume Balok : "+hasil+"cm3","Thanks!!",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(pilih==2)
        {
        input=JOptionPane.showInputDialog("Masukkan sisi Kubus ");
        p=Integer.parseInt(input);
        
            hasil=p*p*p;
            JOptionPane.showMessageDialog(null, "Hasil volume Kubus : "+hasil+"cm3","Thanks!!",JOptionPane.INFORMATION_MESSAGE);           
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"Maaf inputanmu SALAH","Silahkan Coba Lagi"
                    ,JOptionPane.INFORMATION_MESSAGE);
        }
        }
}

    

