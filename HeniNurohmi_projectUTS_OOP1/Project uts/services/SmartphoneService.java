package services;

import java.util.*;
import entity.*;

public class SmartphoneService {

    private static List<smartphone> data = new LinkedList<smartphone>();

    public void tambahData(smartphone smp) {
        data.add(smp);
        System.out.println("data telah tersimpan");
    }

    public void ubahData(smartphone smp) {
        int idx = data.indexOf(smp);
        if(idx >= 0) {
            data.set(idx, smp);
            System.out.println("data telah berubah");
        }
    }

    public void hapusData(String merk) {
        int idx = data.indexOf(new smartphone(merk, "", "", "" ));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void tampilkanData() {
        System.out.println("\n--= Data Smartphone =--");
        int urutan = 1;
        for (smartphone smp : data){
            System.out.println("data ke-" + urutan++);
            System.out.println("  MERK : " + smp.getMerk());
            System.out.println("  HARGA : " + smp.getHarga());
            System.out.println("  SERI : " + smp.getSeri());
            System.out.println("  WARNA : " + smp.getWarna());
        }
    }

}