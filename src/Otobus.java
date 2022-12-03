public class Otobus implements OgsYes{
    double n;
    double alinanogsfiyati =501.6;
    @Override
    public void aracadi() {
        System.out.println("Mercedes A15230");

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
