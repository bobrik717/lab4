package integral;

public class Main {
    public static final long STEPS = 1000000L;
    public static double intagral(double a,double b, MathFunction f){
        double h = ( b - a ) / Main.STEPS;
        double summa = 0.0;
        for (int i = 0; i < Main.STEPS; i++) {
            double x = a + h * i + h / 2;
            double y = f.F(x);
            summa += y*h;
        }
        return summa;
    }
    
    public static void main(String[] args) {
        double p = Main.intagral(0, Math.PI/2,
                new MathFunction(){ public double F(double x){ return Math.pow(Math.sin(x), 2); } });
        System.out.println(p);
    }
}