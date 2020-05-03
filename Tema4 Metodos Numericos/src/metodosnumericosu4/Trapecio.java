package metodosnumericosu4;


public class Trapecio {

    private int i;
    private double h, aih, faih;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getAih() {
        return aih;
    }

    public void setAih(double aih) {
        this.aih = aih;
    }

    public double getFaih() {
        return faih;
    }

    public void setFaih(double faih) {
        this.faih = faih;
    }
    
    

    @Override
    public String toString() {
        return "Trapecio{" + "i=" + i + ", h=" + h + ", a+ih=" + aih + ", f(a+ih)=" + faih;
    }
}
