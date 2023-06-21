package byteBankHeredado;

public class TestFuncionario {
    public static void main(String[] args) {

        Funcionario gerson = new Funcionario();
        gerson.setDocumento("Gerson");
        gerson.setDocumento("444556665");
        gerson.setSalario(2000);
        gerson.setTipo(0);

        System.out.println(gerson.getSalario());

        System.out.println(gerson.getBonificacion());
    }
}
