/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacee;

/**
 *
 * @author shandy
 */
public class InterfaceB implements InterfaceA {

    @Override
    public void Bakso() {
        int harga = 8000;
        int uang = 0;
        int kembalian;

        System.out.println("Anda memilih menu Bakso dengan harga Rp. " + harga);
        System.out.println("masukan nominal uang anda" + uang);
        uang = input.nextInt();
        if (harga == uang) {
            System.out.println("uang anda pas");
        } else if (harga > uang) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        } else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " + kembalian);
        }
    }

    @Override
    public void Rawon() {
        int harga = 12000;
        int uang;
        int kembalian;
        System.out.println("Anda memilih menu Rawon dengan harga Rp. " + harga);
        System.out.println("masukan nominal uang anda");
        uang = input.nextInt();

        if (harga == uang) {
            System.out.println("uang anda pas");
        } else if (harga > uang) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        } else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " + kembalian);
        }
    }

    @Override
    public void Seblak() {
        int harga = 15000;
        int uang = 0;
        System.out.println("anda memilih menu Seblak dengan harga Rp."+harga);
        System.out.println("masukan nominal uang anda");
        int kembalian;

        uang = input.nextInt();
        System.out.println("masukan nominal uang anda");
        if (harga == uang) {
            System.out.println("uang anda pas");
        } else if (harga > uang) {
            System.out.println("uang anda tidak cukup untuk membeli menu ini");
        } else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " + kembalian);
        }
    }

    @Override
    public void Soto() {
        int harga = 12000;
        int uang;
        int kembalian;
        System.out.println("anda memilih menu Soto dengan harga Rp."+harga);
        System.out.println("masukan nominal uang anda");
        uang = input.nextInt();

        if (harga == uang) {
            System.out.println("uang anda pas");
        } else if (harga > uang) {
            System.out.println("uang anda tidak cukup");
        } else if (harga < uang) {
            kembalian = uang - harga;
            System.out.println("kembalian anda = " + kembalian);
        }
    }
}
