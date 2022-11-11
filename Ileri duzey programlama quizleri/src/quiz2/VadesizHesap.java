package quiz2;

public class VadesizHesap extends  BankaHesabi{
    private int islemSayisi ;
    private static final int ucretsizIslemAdedi = 3 ;
    private static final int transferUcreti = 2 ;


    public VadesizHesap(String hesapAdi, String hesapNumarasi) {
        super(hesapAdi, hesapNumarasi);
        islemSayisi = 0 ;
    }

    public boolean paraYatir(double miktar) {
        if (super.paraYatir(miktar)) {
            islemSayisi++;
            return true;
        }
        return false;
    }
    public int getIslemSayisi() {
        return islemSayisi;
    }

    public void setIslemSayisi(int islemSayisi) {
        this.islemSayisi = islemSayisi;
    }

    public boolean paraCek(double miktar) {
        if (super.paraCekme(miktar)) {
            islemSayisi++;
            return true;
        }
        return false;
    }

    public void kesintiUcreti() {
        if (islemSayisi >  ucretsizIslemAdedi) {
            double kesinti =  transferUcreti * (islemSayisi - ucretsizIslemAdedi);
            if (super.paraCekme(kesinti)) {
                islemSayisi = 0;
            }
        }

    }

}