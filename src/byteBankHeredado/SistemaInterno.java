package byteBankHeredado;

public class SistemaInterno {
    private String clave = "CursosOnLine";
    public boolean autentica(FuncionarioAutenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);

        if(puedeIniciarSesion){
            System.out.println("Bienvenido Login Exitoso");
            return true;
        }else {
            System.out.println("Error en Login");
            return false;
        }
    }
}