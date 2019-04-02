public class Pessoa {
   
    String nome;
    String CPF;
    int idade;
    
    double peso;
    double altura;
    //cria metodo
    double imc(){ 
        return peso / (altura*altura);
    }
}
