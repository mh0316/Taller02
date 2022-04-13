import java.util.Scanner;

public class SensorSismologico {
    public static void main(String[] args) {
        cantidadDias();
        fechaSismo();
    }

    public static int cantidadDias() {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese los días a registrar: ");
        n = leer.nextInt();

        if(n<2 || n>31) {
            System.out.println("Error, ingrese los datos nuevamente");
        }
        return cantidadDias();
    }

    public static int fechaSismo() {
        int DD;
        int HH;
        int MAX;

        return fechaSismo();
    }
}
