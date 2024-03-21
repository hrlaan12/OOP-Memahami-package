package bangundatar;
import Library.*;


public class PersegiPanjang extends BangunDatar implements Printable, Shape {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }

    public void print() {
        System.out.println("Print Persegi Panjang");
    }

    public void setPaper(String paper) {
        System.out.println("Set Paper Persegi Panjang: " + paper);
    }

    public void setPaper(double paper, double paper2) {
        System.out.println("Set Paper Persegi Panjang: " + paper+ paper2);
    }

    @Override
    public double kelilings() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kelilings'");
    }

    @Override
    public void setPaper(String Paper, String Paper2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPaper'");
    }
}
