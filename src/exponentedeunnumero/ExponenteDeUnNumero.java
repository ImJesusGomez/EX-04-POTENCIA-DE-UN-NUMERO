package exponentedeunnumero;

import java.io.*;

public class ExponenteDeUnNumero {

    public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //Pedimos los datos necesarios al usuario para calcular la potencia de cualquier numero
        System.out.println("Dame un numero");
        int base = Integer.parseInt(teclado.readLine());

        System.out.println("Dame el exponente");
        int exponente = Integer.parseInt(teclado.readLine());

        System.out.println("El numero: " + base + " con exponente: " + exponente + " da como resultado: " + exponenteNumero(base, exponente));

    }

    //Creamos el metodo para calcular la potencia de cualquier numero
    public static double exponenteNumero(int base, int exponente) {

        //Se declara e inicializa la variable que almacenara el resultado de nuestra potencia
        int resultado = 1;

        //Declaramos el ciclo for, inicializando i en i, que se repita hasta que i sea menor o igual al exponente del numero al cual queremos calcular su potencia
        //Porque la potencia nos dice cuantas veces se multiplica un numero
        //Se incrementara de uno en uno
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

}
