import quiz2.BankaHesabi;
import quiz2.TasarrufHesabi;
import quiz2.VadesizHesap;

public class Main {
    public static void main(String[] args) {
        BankaHesabi bankaHesabi = new BankaHesabi("Muhammet İlbaş","200303031");
        bankaHesabi.paraYatir(10000);
        bankaHesabi.paraYatir(15000);

        System.out.println(bankaHesabi.getHesapNumarasi()+" "+"Hesap numaralı "+bankaHesabi.getHesapAdi()
        +" "+" Bakiye:  "+ bankaHesabi.getBakiye()+"Tl");

        bankaHesabi.paraCekme(3000);
        bankaHesabi.paraCekme(2500);

        System.out.println(bankaHesabi.getHesapNumarasi()+" "+" Hesap numaralı "+bankaHesabi.getHesapAdi()
              +" " +" Bakiye: "+ bankaHesabi.getBakiye()+"Tl");
        System.out.println("-------------------------------------------------------------------------------------------");

        TasarrufHesabi tasarrufHesabi = new TasarrufHesabi("Muhammet ilbaş","200303031",20);
        tasarrufHesabi.paraYatir(10000);
        tasarrufHesabi.paraYatir(15000);
        System.out.println(tasarrufHesabi.getHesapNumarasi()+" "+"Hesap numaralı "+tasarrufHesabi.getHesapAdi()
                +" "+" Bakiye:  "+ tasarrufHesabi.getBakiye()+"Tl");
        System.out.println("*****");
        tasarrufHesabi.faizEkle();
        System.out.println(tasarrufHesabi.getHesapNumarasi()+" "+"Hesap numaralı "+tasarrufHesabi.getHesapAdi()
                +" "+" Bakiye:  "+ tasarrufHesabi.getBakiye()+"Tl");
        System.out.println("-------------------------------------------------------------------------------------------");

        VadesizHesap vadesizHesap = new VadesizHesap("MUHAMMET İLBAŞ","200303031");
        vadesizHesap.paraYatir(500);
        vadesizHesap.paraCek(200);
        vadesizHesap.paraYatir(700);

        vadesizHesap.kesintiUcreti();

        System.out.println(vadesizHesap.getHesapNumarasi()+" "+" "+"Hesap numaralı "+vadesizHesap.getHesapAdi()
                +" "+" Bakiye:  "+ vadesizHesap.getBakiye()+"Tl");
        vadesizHesap.paraYatir(200);
        vadesizHesap.kesintiUcreti();
        System.out.println(vadesizHesap.getHesapNumarasi()+" "+" "+"Hesap numaralı "+vadesizHesap.getHesapAdi()
                +" "+" Bakiye:  "+ vadesizHesap.getBakiye()+"Tl");



    }
}