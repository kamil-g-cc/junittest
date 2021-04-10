public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public double divide(double a, double b) {
        return a / b;
    }

    public double divideUnsupportingInfinity(double a, double b) throws IllegalArgumentException{
        if(b==0 ) throw new IllegalArgumentException("don't devide by 0");
        return a / b;
    }

    public boolean isNegative(int a){
        return a < 0;
    }
}
