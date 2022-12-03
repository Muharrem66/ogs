public class Otomobil implements OgsYes{

    double n;
    double alınanogsfiyati = 60.5;
    @Override
    public void aracadi() {

        System.out.println("BWM Otomobil");

    }

    @Override
    public void alınanogsfiyati(double n) {
        this.n = n;

    }

    @Override
    public double fiyat() {
        return n*fiyat();
    }
}
