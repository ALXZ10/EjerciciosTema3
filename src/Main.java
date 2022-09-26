public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.IncrementaPuertas();

        System.out.println(miCoche.numPuertas);

        Sumar(2,4,6);
    }

    public static void Sumar(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;

        System.out.println(result);
    }

    static class Coche {
        public int numPuertas = 0;

        public void IncrementaPuertas() {
            this.numPuertas ++;
        }
    }
}