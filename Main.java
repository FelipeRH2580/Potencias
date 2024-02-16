public class Main {
    public int potencia(int b, int e) {
        if(e == 0) {
            return 1;
        }
        return suma(b, potencia(b, e - 1));
    }
    
    public int suma(int b, int e) {
        if(e == 1) {
            return b;
        }
        return b + suma(b , e - 1);
    }
}