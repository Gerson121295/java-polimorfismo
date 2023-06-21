package byteBankHeredado;


//Gerente hereda los atributos de Funcionario por lo cual no es necesario
//definir los atributos.

public class Gerente extends Funcionario{ //Gerente Extiende de funcionario

    private String clave;

public void setClave(String clave){
    this.clave = clave;
}

public boolean iniciarSesion(String clave){
    return clave == "CursosOnLine";
}


}
