/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.lang.reflect.Method;

/**
 *
 * @author 
 * Nama         : Moch. Star Ramadhan
 * NIM          : 10116482
 * Deskripsi    : Tugas 3
 */
class Mahasiswa {
    
    private int i, nim, noUrut, batasUrut, nimTerakhir, nimPertama;
    private String nama, index, ket;
    private double quis, uts, uas, na;
    /*
     public int getNoUrut() {
     return noUrut;
     }

     public void setNoUrut(int noUrut) {
     this.noUrut = noUrut;
     }

     public int getBatasUrut() {
     return batasUrut;
     }

     public void setBatasUrut(int batasUrut) {
     this.batasUrut = batasUrut;
     }

     public int getNimTerakhir() {
     return nimTerakhir;
     }

     public void setNimTerakhir(int nimTerakhir) {
     this.nimTerakhir = nimTerakhir;
     }

     public int getNimPertama() {
     return nimPertama;
     }

     public void setNimPertama(int nimPertama) {
     this.nimPertama = nimPertama;
     }
     */
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double getQuis() {
        return quis;
    }
    
    public void setQuis(double quis) {
        this.quis = quis;
    }
    
    public double getUts() {
        return uts;
    }
    
    public void setUts(double uts) {
        this.uts = uts;
    }
    
    public double getUas() {
        return uas;
    }
    
    public void setUas(double uas) {
        this.uas = uas;
    }
    
    private void hitungNilai() {
        /*
         for (noUrut = noUrut; noUrut <= batasUrut; noUrut++) {
         System.out.println("Nama ke " + noUrut + "\t" + nama);
         }
         for (nimTerakhir = nimTerakhir; nimTerakhir >= nimPertama; nimTerakhir--) {
         System.out.println("NIM ke " + nimTerakhir + "\t 7.51.15.036." + nimTerakhir);
         }
         */
        for (i = 1; i <= 5; i++) {
            System.out.println("Nama ke " + i + "\t" + nama);
        }
        for (nim = 8; nim >= 1; nim--) {
            System.out.println("NIM ke " + nim + "\t 7.51.15.036." + nim);
        }

        na = (0.2 * quis) + (0.3 * uts) + (0.5 * uas);
        System.out.println("\nNilai Akhir = \t" + na);
        
        if (na >= 80 && na<= 100) {
            index="A";
            ket="Sangat Baik";
        }else if (na >= 68) {
            index="B";
            ket="Baik";
        }else if (na >= 56) {
            index="C";
            ket="Cukup";
        }else if (na >= 45) {
            index="D";
            ket="Kurang";
        }else if (na >=0 && na<45) {
            index="E";
            ket="Sangat Kurang";
        }
        
        System.out.println("\nIndex = " + index);
        System.out.println("Keterangan = " + ket);
    }
}

public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        /*
         mhs.setNoUrut(1);
         mhs.setBatasUrut(10);
         mhs.setNimTerakhir(8);
         mhs.setNimPertama(1);
         */
        mhs.setNama("Rizki Adam Kurniawan");
        mhs.setQuis(75);
        mhs.setUts(45);
        mhs.setUas(34);

        Method countNilai = mhs.getClass().getDeclaredMethod("hitungNilai");
        countNilai.setAccessible(true);
        countNilai.invoke(mhs);
    }
    
}
