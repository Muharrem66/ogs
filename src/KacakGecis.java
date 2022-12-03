public class KacakGecis implements OgsYes{
    double n;
    double alinanceza = 15895.5632;
    @Override
    public void aracadi() {
        System.out.println("Sistemde Kayıtsız Araç");
    }

    @Override
    public void alınanogsfiyati(double n) {
        this.n=n;

    }

    @Override
    public double fiyat() {
        return n*fiyat();
    }
}
