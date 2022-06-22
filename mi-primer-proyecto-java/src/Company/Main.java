package Company;

public class Main {
    public static void main (String[] args){
        //PRIMERA PARTE

        int resultado1;
        resultado1= suma(10,20,30);
        System.out.println("Suma de 3 numeros:");
        System.out.println(resultado1);

        //SEGUNDA PARTE
       Coche miCoche = new Coche();
        miCoche.aumertaNumeroPuertas();
        System.out.println("Numero de puertas: ");
        System.out.println(miCoche.puertas);
    }

    public static int suma (int a, int b, int c){
        return a + b + c;
    }

}
class Coche {
    public int puertas = 0;

    public void aumertaNumeroPuertas(){
        this.puertas++;
    }
}

