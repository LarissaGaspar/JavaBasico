import java.util.ArrayList;
import java.util.Scanner;

import dao.AnimalDAO;
import models.Animal;
import models.Cachorro;
import models.Galinha;
import models.Gato;
import util.Leitor;

public class ExercicioHeranca {


    public static void main(String[] args) {
		
		AnimalDAO dao = new AnimalDAO();//ERA:<Animal> arrayListAnimais = new ArrayList<>();
		menu(dao);//ERA:menu(arrayListAnimais);

	}

	public static void menu(AnimalDAO dao){
		Scanner sc = new Scanner(System.in);
		Integer opcao=0;
		Integer qtdCachorros=0;
		Integer qtdGatos=0;
		Integer qtdGalinhas=0;

		do{
			System.out.print("--------------------------------\n");
			opcao=Leitor.lerValor("0)Sair\n1)Cadastrar Animal\n2)Listar Animais\n"+
			"3)Deletar animall por identificador", sc, opcao);
			switch (opcao.intValue()){
				case 0:
					System.out.println("Saindo...");
					for(Animal a: dao.consultarAnimais()){
						if(a instanceof Gato){
							qtdGatos++;
						}else if (a instanceof Cachorro){
							qtdCachorros++;
						}else if (a instanceof Galinha){
							qtdGalinhas++;
						}
					}

					System.out.printf("Quantidade de Galinha foi: %d\n",qtdGalinhas);
					System.out.printf("Quantidade de Galinha foi: %d\n",qtdGalinhas);
					System.out.printf("Quantidade de Galinha foi: %d\n",qtdGalinhas);

					break;

				case 1://cadastrar array de animais
					int i=dao.cadastrarAnimal(cadastrarAnimal(sc));
					if(i>0){
						System.out.println("Cadastrado com sucesso!");
					}
					break;
				
				case 2:
					listarAnimais(dao.consultarAnimais());
					break;

				case 3:
					int testeDeletou = deletarAnimalPorIdentificador(dao, sc);
					if (testeDeletou > 0) {
						System.out.println("Deletado com sucesso!");
					}
					break;

				default:
					break;
			}
		}while(opcao!=0);
	}

	private static void listarAnimais(ArrayList<Animal> animais){
		for(Animal a: animais){
			if(a instanceof Gato){//verificar tipo do dado
				Gato gato= (Gato) a;
				imprimir(gato);
			}else if(a instanceof Cachorro){
				Cachorro cachorro= (Cachorro) a;
				imprimir(cachorro);
			}else if(a instanceof Galinha){
				Galinha galinha= (Galinha) a;
				imprimir(galinha);
			}
		}
	}

	private static void imprimir(Gato gato) {//precisa tratamento caso não tenha
		
		System.out.printf("Identificador: %d\nNome: %s\nIdade: %d\nTamanho: %.2f\nPeso: %.2f\n"+
		"Possui caixa de areia?\n",gato.getIdentificador(),gato.getNome(),gato.getIdade(),
		gato.getTamanho(),gato.getPeso(),gato.getTraducaoPossuiCaixaDeAreia());
	}

	private static void imprimir(Cachorro cachorro) {
		
		System.out.printf("Identificador: %d\nNome: %s\nIdade: %d\nTamanho: %.2f\nPeso: %.2f\n"+
		"Possui cama?\n",cachorro.getIdentificador(),cachorro.getNome(),cachorro.getIdade(),
		cachorro.getTamanho(),cachorro.getPeso(),cachorro.getTraducaoPossuiCama());
	}

	private static void imprimir(Galinha galinha) {
		
		System.out.printf("Identificador: %d\nNome: %s\nIdade: %d\nTamanho: %.2f\nPeso: %.2f\n"+
		"Qual tamanho do puleiro?\n",galinha.getIdentificador(),galinha.getNome(),galinha.getIdade(),
		galinha.getTamanho(),galinha.getPeso(),galinha.getTamanhoDoPoleiro());
	}

	

	private static int deletarAnimalPorIdentificador(AnimalDAO dao, Scanner sc){

		Long identificador=Leitor.lerValor("Qual o registro deseja deletar", sc, 0L);

		if(identificador>1){
			Animal a = dao.buscarAnimal(identificador);
			return dao.deletarAnimal(a);
		}
		return 0;
	}

	private static ArrayList<Animal> cadastrarAnimal(Scanner sc){
		ArrayList<Animal> animaisParaCadastro = new ArrayList<>();
		Integer opcao;

		do{
			System.out.print("---------------------------------------\n");
			opcao=Leitor.lerValor("Qual animal você quer cadastrar\n0)Sair do Cadastramento\n"
		+"1)Cadastrar GATO\n2)Cadastrar Cachorro\n3)Cadastrar Galinha", sc, 0);
			
			switch (opcao.intValue()){
				case 0:
					System.out.print("Saindo do Cadastro...");
					break;

				case 1:
					animaisParaCadastro.add(cadastrarGato(sc));
					break;
				case 2:
					animaisParaCadastro.add(cadastrarCachorro(sc));
					break;

				case 3:
					animaisParaCadastro.add(cadastrarGalinha(sc));
					break;

				default:
					break;
			}

		}while(opcao!=0);

		return animaisParaCadastro;
	}

	private static Animal cadastrarGato(Scanner sc){
		
		Gato g = new Gato();
		g.setIdade(Leitor.lerValor("Qual a idade?", sc, g.getIdade()));
		g.setNome(Leitor.lerValor("Qual nome?", sc));
		g.setPeso(Leitor.lerValor("Qual o peso?", sc, g.getPeso()));
		g.setTamanho(Leitor.lerValor("Qual o tamanho?", sc, g.getTamanho()));
		g.setPossuiCaixaDeAreia(Leitor.lerValor("Possui caixa de areia ? ", sc, g.getPossuiCaixaDeAreia()));

		return g;
	}

	private static Animal cadastrarCachorro(Scanner sc){
		
		Cachorro c = new Cachorro();
		c.setIdade(Leitor.lerValor("Qual a idade?", sc, c.getIdade()));
		c.setNome(Leitor.lerValor("Qual nome?", sc));
		c.setPeso(Leitor.lerValor("Qual o peso?", sc, c.getPeso()));
		c.setTamanho(Leitor.lerValor("Qual o tamanho?", sc, c.getTamanho()));
		c.setPossuiCama(Leitor.lerValor("Possui cama?", sc, c.getPossuiCama()));

		return c;
	}

	private static Animal cadastrarGalinha(Scanner sc){

		Galinha g = new Galinha();
		g.setIdade(Leitor.lerValor("Qual a idade?", sc, g.getIdade()));
		g.setNome(Leitor.lerValor("Qual nome?", sc));
		g.setPeso(Leitor.lerValor("Qual o peso?", sc, g.getPeso()));
		g.setTamanho(Leitor.lerValor("Qual o tamanho?", sc, g.getTamanho()));
		g.setTamanhoDoPoleiro(Leitor.lerValor("Qual do tamanho do puleiro?", sc, g.getTamanhoDoPoleiro()));

		return g;
	}
}