
public class TestaPessoa {

    public static void main(String[] args) {
        
        Pessoa d = new Pessoa();
        d.idade = 20;
        d.nome = "Lucas";
        d.CPF = "00000000101";
        
        //criar pessoa
        Pessoa a1 = new Pessoa();
        a1.altura = 1.90;
        a1.peso = 80.50;
        // chamar metodo
        double i = a1.imc();
        
        System.out.println("IMC: "+i);
    }

}
