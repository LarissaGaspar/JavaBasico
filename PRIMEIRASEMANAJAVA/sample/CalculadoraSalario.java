package sample;

public class CalculadoraSalario {
    
    public static void main(String[] args) {
        //informe 2 valores do tipo float
        //1 valor é o salario base
        //2 valor é o total de vendas
        //valor do salario final + comissao que representa 10% do valor das vendas
        
        float salInicial= 2000f;
        float valorVenda= 450f;
        float comissao = valorVenda * 0.10f;
        float salFinal=salInicial+comissao;
        
        System.out.print(salFinal);

    }
}