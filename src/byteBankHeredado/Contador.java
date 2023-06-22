package byteBankHeredado;

public class Contador extends Funcionario{


    //Sobreescribir(escribir el mismo metodo de la clase madre en la clase hija)
    // el metodo getBonificacion de Funcionario(clase madre)
    @Override
    public double getBonificacion() {
        System.out.println("Ejecutando desde contador");
        return 200; //retorne 200 debido a que el bono del contador es fijo.
    }
}
