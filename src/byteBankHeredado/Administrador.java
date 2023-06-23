package byteBankHeredado;

public class Administrador extends Funcionario implements Autenticable{

    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }

    @Override
    public double getBonificacion() {
        return 0;
    }
}
