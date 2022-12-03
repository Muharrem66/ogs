public class Minibus implements OgsYes{

    double n;
    double alınanogsfiyati = 89.9;
    @Override
    public void aracadi() {
        System.out.println("BMC Minibüs");
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
