package quiz2;

public class BankaHesabi implements  BankaIslemleri{
    private String hesapAdi,hesapNumarasi ;
    private double bakiye ;

    public BankaHesabi(String hesapAdi, String hesapNumarasi) {
        this.hesapAdi = hesapAdi;
        this.hesapNumarasi = hesapNumarasi;
        bakiye = 0 ;
    }

    public String getHesapAdi() {
        return hesapAdi;
    }

    public void setHesapAdi(String hesapAdi) {
        this.hesapAdi = hesapAdi;
    }

    public String getHesapNumarasi() {
        return hesapNumarasi;
    }

    public void setHesapNumarasi(String hesapNumarasi) {
        this.hesapNumarasi = hesapNumarasi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public boolean paraCekme(double miktar) {
        if (miktar<= bakiye)
        {
            bakiye -= miktar ;
            return true ;
        }
        else
        {
            return false ;
        }

    }

    @Override
    public boolean paraYatir(double miktar)
    {
        if (miktar > 0)
        {
            bakiye += miktar;
            return true ;
        }
        else
        {
            return false;
        }
    }
}
