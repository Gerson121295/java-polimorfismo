package byteBankHeredado;

public class TestControlBonificacion {
    public static void main(String[] args) {

        Funcionario gerson = new Funcionario();
        gerson.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(gerson);

        controlBonificacion.registrarSalario(jimena);

        System.out.println();
    }
}
