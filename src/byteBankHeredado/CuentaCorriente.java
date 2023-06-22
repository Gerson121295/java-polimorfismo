package byteBankHeredado;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(int agencia, int numero){
        //super llama al constructor que usa estos 2 parametros(agencia, numero)
        super(agencia, numero); //super llama o accede a cualquier atributo o metodos de la clase padre
    }

}
