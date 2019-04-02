public class Pessoa {
   
    String nome;
    String CPF;
    int idade;
    
    double peso;
    double altura;
    
    double imc(){
        return peso / (altura*altura);
    }
}
