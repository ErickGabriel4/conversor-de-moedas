import Conversor.Conversor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner entrada =new Scanner(System.in);
         Conversor conversor = new Conversor();
         int opcao = 0;
         double resultado = 0;
         double valor = 0;

        while (opcao!=7){
            System.out.print("""     
              **************************************************
                          
              1) Dólar =>> Peso argentino
              2) Peso argentino =>> Dólar
              3) Dólar =>> Real brasileiro
              4) Real brasileiro =>> Dólar
              5) Dólar =>> Peso colombiano
              6) Peso colombiano =>> Dólar 
              7) Sair
              Escolha uma opção válida:         
              **************************************************                               
              """);
            opcao = entrada.nextInt();

            if (opcao == 7){
                break;
            }else if (opcao < 1 || opcao > 7){
                System.out.println("Opção inválida");
            }else {
                System.out.println("Digite o valor que deseja converter: ");
                valor = entrada.nextDouble();
            }

            if (opcao == 1){
                resultado = conversor.dolarPraPesoArgentino(valor);
                System.out.printf("Valor %.2f [USD] corresponde ao valor final de %.2f [ARS]\n", valor, resultado);

            }else if (opcao  == 2){
                resultado = conversor.pesoArgentinoPraDolar(valor);
                System.out.printf("Valor %.2f [ARS] corresponde ao valor final de %.2f [USD]\n", valor, resultado);

            }else if (opcao == 3){
                resultado = conversor.dolarPraReal(valor);
                System.out.printf("Valor %.2f [USD] corresponde ao valor final de %.2f [BRL]\n", valor, resultado);

            }else if (opcao == 4){
                resultado = conversor.realPraDolar(valor);
                System.out.printf("Valor %.2f [BRL] corresponde ao valor final de %.2f [USD]\n", valor, resultado);

            } else if (opcao == 5) {
                resultado = conversor.dolarPraPesoColombiano(valor);
                System.out.printf("Valor %.2f [USD] corresponde ao valor final de %.2f [COP]\n", valor, resultado);

            } else if (opcao == 6) {
                resultado = conversor.pesoColombianoPraDolar(valor);
                System.out.printf("Valor %.2f [COP] corresponde ao valor final de %.2f [USD]\n", valor, resultado);
            }
        }
        System.out.println("Obrigado por usar o conversor de moeda! :)");
        entrada.close();
    }

}