public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public double divide(double a, double b) throws IllegalArgumentException{
        if(b==0) throw new IllegalArgumentException("don't divide by 0");
        return a / b;
    }
}
