public class Conta {
    
    //Criando os atributos
    double saldo;
    String numero;
    String titular;
    String agencia;
    
        void depositar(double valor){
            this.saldo += valor; //this >> atributo da propria classe/ñ é obrigatorio colocar o this->apenas qnd o parametro tem msm nome do tributo
            
        }
    
}
