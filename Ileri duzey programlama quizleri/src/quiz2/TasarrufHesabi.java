package quiz2;

public class TasarrufHesabi extends  BankaHesabi{
    private double faizOrani ;

    public TasarrufHesabi(String hesapAdi, String hesapNumarasi, double faizOrani) {
        super(hesapAdi, hesapNumarasi);
        this.faizOrani = faizOrani ;
    }
   public void faizEkle()
    {
       double faiz = ( faizOrani/100) * (getBakiye());
       paraYatir(faiz);
    }

}
