/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.pbo11.pkg10116482.mochstarramadhan;

import java.lang.reflect.Method;

/**
 *
 * @author 
 * Nama : Moch. Star Ramadhan
 * NIM : 10116482 
 * Deskripsi : Tugas 3
 */
class Mahasiswa {

    int nim, i;
    String nama, ket;
    double quis, uts, uas, na;
    char index;

    void profil() {
        for (i = 1; i <= 5; i++) {
            System.out.println("Nama ke " + i + "\t" + nama);
        }
        for (nim = 8; nim >= 1; nim--) {
            System.out.println("NIM ke " + nim + "\t 7.51.15.036." + nim);
        }
    }

    void hitungNilai() {

        na = (0.2 * quis) + (0.3 * uts) + (0.5 * uas);
        System.out.println("\nNilai Akhir = \t" + na);

    }

    void indexNilai() {

        if (na >= 80 && na <= 100) {
            index = 'A';
            ket = "Sangat Baik";
        } else if (na >= 68) {
            index = 'B';
            ket = "Baik";
        } else if (na >= 56) {
            index = 'C';
            ket = "Cukup";
        } else if (na >= 45) {
            index = 'D';
            ket = "Kurang";
        } else if (na >= 0 && na < 45) {
            index = 'E';
            ket = "Sangat Kurang";
        }

        System.out.println("\nIndex = " + index);
        System.out.println("Keterangan = " + ket);
    }
}

public class TUGAS3PBO1110116482MOCHSTARRAMADHAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String nama;
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Rizki Adam Kurniawan";
        mhs.quis = 75;
        mhs.uts = 45;
        mhs.uas = 34;
        mhs.profil();
        mhs.hitungNilai();
        mhs.indexNilai();
    }

}
