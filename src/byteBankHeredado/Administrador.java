package byteBankHeredado;

public class Administrador extends Funcionario implements Autenticable{

    private String clave;
    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.clave == clave; //retorna true si cumple, sino false
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }
}
