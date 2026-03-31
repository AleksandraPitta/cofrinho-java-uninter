package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*comecei a fazer observações aqui no "Principal"
		porque eu tava cometendo muito erro
		*/
		Cofrinho c = new Cofrinho ();
		Scanner teclado = new Scanner (System.in);
		
		
		
		while (true) {
	    /*coloquei loop infinito, pra adicionar 
	     *moedas e após isso ser possível de voltar
	     *ao "menu"
		*/
			System.out.println("\nMeu Cofrinho\n");
			System.out.println("0: Sair");
			System.out.println("1: Adiciona moedas");
			System.out.println("2: Remover moedas");
			System.out.println("3: Veja quantas moedas você tem");
			System.out.println("4: Total de moedas convertidas em real");
			System.out.println("Qual opção você deseja escolher?");
			
			
			int opcao = teclado.nextInt();
			
			if (opcao == 0) {
				System.out.println("Tchau, até a próxima!");
				break; //aqui o programa para
			}
			
			switch (opcao) {
			//aqui as pessoas vão ter as opções
			
			case 1:
				//vão ter as opções das moedas
				System.out.println("Qual opção de moeda você deseja escolher?\n");
				System.out.println("1: Real");
				System.out.println("2: Dólar");
				System.out.println("3: Euro");
				
				int tipo = teclado.nextInt();
				
				System.out.println("\nDigite um valor:");
				
				double valor = teclado.nextDouble();
				
				//aqui vou usar if e else para fazer as condições
				//e adicionar em real, dolar ou euro
				
				if (tipo == 1) {
					c.add(new Real(valor));
				} else if (tipo == 2) {
					c.add(new Dolar(valor));
				} else if (tipo == 3) {
					c.add(new Euro (valor));
				} 
				
				else { //se escreverem algo errado
					System.out.println("Essa opção não existe.");
					
				}
				
				break;
				
			
			case 2://aqui é pra remover as moedas
				System.out.println("Qual o tipo de moeda que você deseja remover:");
			    System.out.println("1: Real");
			    System.out.println("2: Dólar");
			    System.out.println("3: Euro");

			    int tipo1 = teclado.nextInt();

			    System.out.println("Valor da moeda:");
			    double valor1 = teclado.nextDouble();

			    if (tipo1 == 1) c.remove(new Real(valor1));
			    if (tipo1 == 2) c.remove(new Dolar(valor1));
			    if (tipo1 == 3) c.remove(new Euro(valor1));

			    break;

						
			case 3:
                // Aqui mostra tudo que tem no cofrinho
                c.listar(); //a lista dass moedas sai por aqui
                break;
                
                
            case 4:
                // soma tudo já convertido para real
                System.out.println("Total de moedas em reais: R$ " + c.totalConvertido());
                break;

            default: //aqui é quando a opção for inválida
                System.out.println("Opção inválida!");
			
			
			}
			
		}
		teclado.close();//scanner fechado

	}

}
