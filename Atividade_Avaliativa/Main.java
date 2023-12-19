package Atividade_Avaliativa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public enum Cor {
	    PRETO("\u001B[0;30m"),VERMELHO("\u001B[0;31m"),VERDE("\u001B[0;32m"),
	    AMARELO("\u001B[0;33m"),AZUL("\u001B[0;34m"),ROXO("\u001B[0;35m"),
	    CIANO("\u001B[0;36m"),BRANCO("\u001B[0;37m"),PRETO_SUBLINHADO("\u001B[4;30m"),
		VERMELHO_SUBLINHADO("\u001B[4;31m"),VERDE_SUBLINHADO("\u001B[4;32m"),
	    AMARELO_SUBLINHADO("\u001B[4;33m"),AZUL_SUBLINHADO("\u001B[4;34m"),ROXO_SUBLINHADO("\u001B[4;35m"),
	    CIANO_SUBLINHADO("\u001B[4;36m"),BRANCO_SUBLINHADO("\u001B[4;37m"),PRETO_BACKGORUND("\u001B[40m"),
		VERMELHO_BACKGORUND("\u001B[41m"),VERDE_BACKGROUND("\u001B[42m"),AMARELO_BACKGROUND("\u001B[43m"),
	    AZUL_BACKGROUND("\u001B[44m"),ROXO_BACKGROUND("\u001B[45m"),CIANO_BACKGROUND("\u001B[46m"),
	    BRANCO_BACKGROUND("\u001B[47m");

	    private String codigo;

	    Cor(String codigo) {
	        this.codigo = codigo;
	    }

	    public String getCodigo() {
	        return codigo;
	    }
	}
	
	public static Personagem criacaoPersonagem() {
		// Informações do personagem
		Raca raca_escolhida = new Raca();
		Classes classe_escolhida = new Classes();
		ArrayList<Arma> armas_escolhidas = new ArrayList<Arma>();
		String nome_do_personagem;
		int vida = 0;
		Personagem personagem = new Personagem();
		
		//itens
		Itens itens = new Itens();
		ArrayList<Arma> armas = itens.getItens();
		
		//criando classes
		Clerigo clerigo = new Clerigo();
		Guerreiro guerreiro = new Guerreiro();
		Bardo bardo = new Bardo();
		Bruxo bruxo = new Bruxo();
		Arqueiro arqueiro = new Arqueiro();
		Escudeiro escudeiro = new Escudeiro();
		Classes classes = new Classes();
		classes.setClasses(guerreiro);
		classes.setClasses(clerigo);
		classes.setClasses(escudeiro);
		classes.setClasses(arqueiro);
		classes.setClasses(bardo);
		classes.setClasses(bruxo);
		ArrayList<Classes> lista_de_classes = classes.getClasses();
		
		//criando raças
		Humano humano = new Humano(clerigo);
		Elfo elfo = new Elfo(guerreiro);
		Anaoo anao = new Anaoo();
		Vastaya vastaya = new Vastaya();
		Raca racas = new Raca();
		racas.setRacas(humano);
		racas.setRacas(elfo);
		racas.setRacas(vastaya);
		racas.setRacas(anao);
		ArrayList<Raca> lista_de_racas = racas.getRacas();
		Scanner leitura = new Scanner(System.in);
		
		//Racaças de Personagens
		System.out.println("\nEscolha a Raça do seu Personagem: ");
		for(int i = 0;i<lista_de_racas.size();i++) {
			System.out.printf("%d - "+lista_de_racas.get(i).getNome_da_raca()+"\n",i);
		}
		
		int opcao=0;
		
		do {
			System.out.print("\nDigite a sua opção: ");
			opcao = leitura.nextInt();
			//leitura.next();
			if (opcao<lista_de_racas.size()&&opcao>-1) raca_escolhida=lista_de_racas.get(opcao);
			else System.out.println("\nOpção inválida!");
			
		}while(opcao>=lista_de_racas.size()||opcao<0);
		
		//Classes das Raças
		System.out.println("\nEscolha a Classe do seu Personagem: ");
		for(int i = 0;i<lista_de_classes.size();i++) {
			System.out.printf("%d - "+lista_de_classes.get(i).getNome()+"\n",i);
		}
		
		do {
			System.out.print("\nDigite a sua opção: ");
			opcao = leitura.nextInt();
			//leitura.next();
			if (opcao<lista_de_classes.size()&&opcao>-1) classe_escolhida=lista_de_classes.get(opcao);
			else System.out.println("\nOpção inválida!");
			
		}while(opcao>=lista_de_classes.size()||opcao<0);
		
		int[] ind_armas = new int[3];
		int count = 0;
		
		//Armas das Classes
		System.out.println("\nEscolha duas Armas para o seu Personagem: ");
		for(int i = 0;i<armas.size();i++) {
			if (classe_escolhida.getNome().equals("Guerreiro")) {
				if (armas.get(i).getNome().contains("Espada")) {
					System.out.printf("%d - "+armas.get(i).getNome()+"\n",i);
					ind_armas[count]=i;
					count++;
				}
			
			}
			
			else if (classe_escolhida.getNome().equals("Clerigo")) {
				if (armas.get(i).getNome().contains("Livro")) {
					System.out.printf("%d - "+armas.get(i).getNome()+"\n",i);
					ind_armas[count]=i;
					count++;
				}
			}
			
			else if (classe_escolhida.getNome().equals("Escudeiro")) {
				if (armas.get(i).getNome().contains("Escudo")) {
					System.out.printf("%d - "+armas.get(i).getNome()+"\n",i);
					ind_armas[count]=i;
					count++;
				}
			}
			
			else if (classe_escolhida.getNome().equals("Arqueiro")) {
				if (armas.get(i).getNome().contains("Arco")) {
					System.out.printf("%d - "+armas.get(i).getNome()+"\n",i);
					ind_armas[count]=i;
					count++;
				}
			}
			
			else if (classe_escolhida.getNome().equals("Bruxo")) {
				if (armas.get(i).getNome().contains("Varinha")) {
					System.out.printf("%d - "+armas.get(i).getNome()+"\n",i);
					ind_armas[count]=i;
					count++;
				}
			}
			
			else if (classe_escolhida.getNome().equals("Bardo")) {
				if (armas.get(i).getNome().contains("Flauta")) {
					System.out.printf("%d - "+armas.get(i).getNome()+"\n",i);
					ind_armas[count]=i;
					count++;
				}
			}
					
		}
		
		count=0;
		
		do {
			if (count==2) break;
			System.out.print("\nDigite a sua opção em 0, 1 e 2: ");
			opcao = leitura.nextInt();
			leitura.nextLine();
			if (opcao==0) {
				armas_escolhidas.add(armas.get(ind_armas[0]));
				count++;
			}
			else if (opcao==1) {
				armas_escolhidas.add(armas.get(ind_armas[1]));
				count++;
			}
			else if (opcao==2) {
				armas_escolhidas.add(armas.get(ind_armas[2]));
				count++;
			}
			else System.out.println("\nOpção inválida!");
			
		}while(true);

		//Nome e vida do personagem
		System.out.print("\nDigite o Nome do seu persongaem: ");
		nome_do_personagem=leitura.nextLine();
		System.out.print("\nDigite a quantidade de Vida do seu personagem: ");
		vida = leitura.nextInt();

		//Construção do persongagem
		classe_escolhida.setArma(armas_escolhidas);
		personagem.setClasse(classe_escolhida);
		personagem.setNome(nome_do_personagem);
		personagem.setRaca(raca_escolhida);
		personagem.setVida(vida);
		
		
		return personagem;
	}
	
	public static void verPersonagens(ArrayList<Personagem> personagens) {
		if (personagens.size()==0) System.out.println("\nNão há personagens criados!");
		else {
			for (Personagem personagem : personagens) {
				personagem.mostrarPersonagem();
			}
		}
	}
	
	public static void determinarVencedor(Arma arma_atacante,Arma arma_oponente,ArrayList<Personagem> personagens,int vida1,int vida2){
		double chanceDeAcertoAtacante = (arma_atacante.getPrecisao()*0.6)+(arma_atacante.getForca()*0.4);
		double chanceDeAcertoOponente = (arma_oponente.getPrecisao()*0.6)+(arma_oponente.getForca()*0.4);
		
		if (chanceDeAcertoAtacante>chanceDeAcertoOponente) {
			
			if(personagens.get(0).getClasse().getArma().get(0).getNome().equals(arma_atacante.getNome())||personagens.get(0).getClasse().getArma().get(1).getNome().equals(arma_atacante.getNome())) {
				System.out.println("\nO ataque com a arma "+arma_atacante.getNome()+" é bem sucedido!");
				System.out.println(Cor.AZUL_BACKGROUND.getCodigo()+personagens.get(0).getNome()+Cor.BRANCO.getCodigo()+Cor.AMARELO.getCodigo()+" ganhou a rodada!"+Cor.BRANCO.getCodigo());
				personagens.get(1).setVida(personagens.get(1).getVida()-arma_atacante.getForca());
				
				System.out.println("\nVida restante dos persongagens: ");
				System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+personagens.get(0).getNome()+": "+Cor.BRANCO.getCodigo()+Cor.VERDE_BACKGROUND.getCodigo()+personagens.get(0).getVida()+Cor.BRANCO.getCodigo());
				System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+personagens.get(1).getNome()+": "+Cor.BRANCO.getCodigo()+Cor.VERDE_BACKGROUND.getCodigo()+personagens.get(1).getVida()+Cor.BRANCO.getCodigo());
					
				if(personagens.get(1).getVida()<=0) {
					System.out.println(Cor.AMARELO.getCodigo()+personagens.get(0).getNome()+Cor.CIANO.getCodigo()+" ganhou o jogo!"+Cor.BRANCO.getCodigo());
					try {
			            Thread.sleep(1000); // Espera por 1 segundo
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					int opcao;
					
					Scanner leitura = new Scanner(System.in);
					System.out.println("\nDeseja uma revanche?\n\n1 - Sim\n2 - Voltar para o menu principal\n3 - Sair do jogo");
					opcao=leitura.nextInt();
					leitura.nextLine();
					if (opcao==1) {
						personagens.get(0).setVida(vida1);
						personagens.get(1).setVida(vida2);
						batalhar(personagens,vida1,vida2);
					}
					else if(opcao==2) menu();
					else if (opcao==3) {
						System.out.println("Até Breve!");
						System.exit(0);
					}
					
				}
			}
			else {
				System.out.println("\nO ataque com a arma "+arma_atacante.getNome()+" é bem sucedido!");
				
				System.out.println(Cor.AZUL_BACKGROUND.getCodigo()+personagens.get(1).getNome()+Cor.BRANCO.getCodigo()+Cor.AMARELO.getCodigo()+" ganhou a rodada!"+Cor.BRANCO.getCodigo());
				personagens.get(0).setVida(personagens.get(0).getVida()-arma_atacante.getForca());
				
				System.out.println("\nVida restante dos persongagens: ");
				System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+personagens.get(0).getNome()+": "+Cor.BRANCO.getCodigo()+Cor.VERDE_BACKGROUND.getCodigo()+personagens.get(0).getVida()+Cor.BRANCO.getCodigo());
				System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+personagens.get(1).getNome()+": "+Cor.BRANCO.getCodigo()+Cor.VERDE_BACKGROUND.getCodigo()+personagens.get(1).getVida()+Cor.BRANCO.getCodigo());
				
				if(personagens.get(0).getVida()<=0) {
					System.out.println(Cor.AMARELO.getCodigo()+personagens.get(1).getNome()+Cor.CIANO.getCodigo()+" ganhou o jogo!"+Cor.BRANCO.getCodigo());
					try {
			            Thread.sleep(1000); // Espera por 1 segundo
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					int opcao;
					
					Scanner leitura = new Scanner(System.in);
					System.out.println("\nDeseja uma revanche?\n\n1 - Sim\n2 - Voltar para o menu principal\n3 - Sair do jogo");
					opcao=leitura.nextInt();
					leitura.nextLine();
					if (opcao==1) {
						personagens.get(0).setVida(vida1);
						personagens.get(1).setVida(vida2);
						batalhar(personagens,vida1,vida2);
					}
					else if(opcao==2) menu();
					else if (opcao==3) {
						System.out.println("Até Breve!");
						System.exit(0);
					}
				}
			}
		}
		else if (chanceDeAcertoAtacante<chanceDeAcertoOponente) {
			if(personagens.get(0).getClasse().getArma().get(0).getNome().equals(arma_oponente.getNome())||personagens.get(0).getClasse().getArma().get(1).getNome().equals(arma_oponente.getNome())) {
				System.out.println("\nO ataque com a arma "+arma_oponente.getNome()+" é bem sucedido!\n");
				
				System.out.println(Cor.AZUL_BACKGROUND.getCodigo()+personagens.get(0).getNome()+Cor.BRANCO.getCodigo()+Cor.AMARELO.getCodigo()+" ganhou a rodada!"+Cor.BRANCO.getCodigo());
				personagens.get(1).setVida(personagens.get(1).getVida()-arma_oponente.getForca());
				
				System.out.println("\nVida restante dos persongagens: ");
				System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+personagens.get(0).getNome()+": "+Cor.BRANCO.getCodigo()+Cor.VERDE_BACKGROUND.getCodigo()+personagens.get(0).getVida()+Cor.BRANCO.getCodigo());
				System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+personagens.get(1).getNome()+": "+Cor.BRANCO.getCodigo()+Cor.VERDE_BACKGROUND.getCodigo()+personagens.get(1).getVida()+Cor.BRANCO.getCodigo());
				
				if(personagens.get(1).getVida()<=0) {
					System.out.println(Cor.AMARELO.getCodigo()+personagens.get(0).getNome()+Cor.CIANO.getCodigo()+" ganhou o jogo!"+Cor.BRANCO.getCodigo());
					try {
			            Thread.sleep(1000); // Espera por 1 segundo
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					int opcao;
					
					Scanner leitura = new Scanner(System.in);
					System.out.println("\nDeseja uma revanche?\n\n1 - Sim\n2 - Voltar para o menu principal\n3 - Sair do jogo");
					opcao=leitura.nextInt();
					leitura.nextLine();
					if (opcao==1) {
						personagens.get(0).setVida(vida1);
						personagens.get(1).setVida(vida2);
						batalhar(personagens,vida1,vida2);
					}
					else if(opcao==2) menu();
					else if (opcao==3) {
						System.out.println("Até Breve!");
						System.exit(0);
					}
				}
			}
			else {
				System.out.println("\nO ataque com a arma "+arma_oponente.getNome()+" é bem sucedido!");
				System.out.println(Cor.AZUL_BACKGROUND.getCodigo()+personagens.get(1).getNome()+Cor.BRANCO.getCodigo()+Cor.AMARELO.getCodigo()+" ganhou a rodada!"+Cor.BRANCO.getCodigo());
				personagens.get(0).setVida(personagens.get(0).getVida()-arma_oponente.getForca());
				
				System.out.println("\nVida restante dos persongagens: ");
				System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+personagens.get(0).getNome()+": "+Cor.BRANCO.getCodigo()+Cor.VERDE_BACKGROUND.getCodigo()+personagens.get(0).getVida()+Cor.BRANCO.getCodigo());
				System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+personagens.get(1).getNome()+": "+Cor.BRANCO.getCodigo()+Cor.VERDE_BACKGROUND.getCodigo()+personagens.get(1).getVida()+Cor.BRANCO.getCodigo());
				
				if(personagens.get(0).getVida()<=0) {
					System.out.println(Cor.AMARELO.getCodigo()+personagens.get(1).getNome()+Cor.CIANO.getCodigo()+" ganhou o jogo!"+Cor.BRANCO.getCodigo());
					try {
			            Thread.sleep(1000); // Espera por 1 segundo
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
					int opcao;
					
					Scanner leitura = new Scanner(System.in);
					System.out.println("\nDeseja uma revanche?\n\n1 - Sim\n2 - Voltar para o menu principal\n3 - Sair do jogo");
					opcao=leitura.nextInt();
					leitura.nextLine();
					if (opcao==1) {
						personagens.get(0).setVida(vida1);
						personagens.get(1).setVida(vida2);
						batalhar(personagens,vida1,vida2);
					}
					else if(opcao==2) menu();
					else if (opcao==3) {
						System.out.println("Até Breve!");
						System.exit(0);
					}
				}
			}
		}
		else if (chanceDeAcertoAtacante==chanceDeAcertoOponente) {
			System.out.println("Ambos os Ataques falharam!");
		}
	}
	
	public static void batalhar(ArrayList<Personagem> personagens,int vida_personagem1,int vida_personagem2) {
		Random rand = new Random();
	
			System.out.println(Cor.ROXO_BACKGROUND.getCodigo()+"\nPara a batalha será lançado dados para saber quem irá iniciar!"+Cor.BRANCO.getCodigo());
			try {
	            Thread.sleep(5000); // Espera por 5 segundo
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			
			System.out.println("\nLançando um Dado D6 para o jogador 1");
			int numero_do_jogador_1 = rand.nextInt(1,7);
			 try {
		            Thread.sleep(1000); // Espera por 1 segundo
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			 
			System.out.println("Número do jogador 1: "+numero_do_jogador_1);
			System.out.println("\nLançando um Dado D6 para o jogador 2");
			int numero_do_jogador_2 = rand.nextInt(1,7);
			 try {
		            Thread.sleep(1000); // Espera por 1 segundo
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			System.out.println("Número do jogador 2: "+numero_do_jogador_2);
			
			if (numero_do_jogador_1>numero_do_jogador_2) {
				System.out.println("\nO jogador 1 inicia atacando!");
				menuBatalha(personagens.get(0),personagens.get(1),personagens,vida_personagem1,vida_personagem2);
			}
			else {
				System.out.println("\nO jogador 2 inicia atacando!");
				menuBatalha(personagens.get(1),personagens.get(0),personagens,vida_personagem1,vida_personagem2);
			}
		}
	
	public static void menu() {
		int opcao = 0;
		ArrayList<Personagem> personagens = new ArrayList<Personagem>();
		Scanner leitura = new Scanner(System.in);
		System.out.println(Cor.VERMELHO_BACKGORUND.getCodigo()+"------- Bem vindo ao Jumanji ------"+Cor.BRANCO.getCodigo());
		System.out.println(Cor.CIANO_SUBLINHADO.getCodigo()+"----------- Menu Inicial -----------"+Cor.BRANCO.getCodigo());
		do {
			System.out.println("0 - Sair do Jogo");
			System.out.println("1 - Criar Personagem");
			System.out.println("2 - Ver Personagens");
			System.out.println("3 - Batalhar!");
			System.out.print("Digite sua opção: ");
			opcao = leitura.nextInt();
			
			if (opcao==0) {
				System.out.println(Cor.VERMELHO_BACKGORUND.getCodigo()+"Até Breve!"+Cor.BRANCO.getCodigo());
				leitura.close();
				break;
			}
			
			else if (opcao==1) {
				personagens.add(criacaoPersonagem());
			}
			else if (opcao==2) verPersonagens(personagens);
			else if (opcao==3) {
				if (personagens.size()==0) {
					System.out.println("\nNão há personagens(jogadores) criados!\n");
				}
				
				else if(personagens.size()==1) {
					System.out.println("\nA batalha só está disponivel quando haver dois jogadores(personagens)!\n");
				}
				
				else {
					batalhar(personagens,personagens.get(0).getVida(),personagens.get(1).getVida());
				}
				
			}
			else System.out.println("Valor inválido!");
		}while(opcao>0 && opcao<4);
		
	}
	
	public static void menuBatalha(Personagem p1,Personagem p2,ArrayList<Personagem> personagens,int vida1,int vida2) {
		int count = 0;
		int opcao;
		Scanner leitura = new Scanner(System.in);
		System.out.println(Cor.ROXO_BACKGROUND.getCodigo()+"\nFase inicial do Turno!"+Cor.BRANCO.getCodigo());
		System.out.println("\nFase de escolha de Arma do primeiro Jogador!");
		
		for (Arma arma : p1.getClasse().getArma()) {
			System.out.printf("%d - %s\n",count,arma.getNome());
			count++;
		}
		
		do {
			System.out.print("\nEscolha sua Arma: ");
			opcao=leitura.nextInt();
			leitura.nextLine();
			if(opcao>1||opcao<0) System.out.println("Opcão inválida!");
			else if(opcao==1||opcao==0) break;
			
		}while(opcao!=1||opcao!=0);
		
		Arma armaAtacante = p1.getClasse().getArma().get(opcao);
		
		try {
            Thread.sleep(1000); // Espera por 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		count=0;
		System.out.println("\nFase de escolha de Arma do segundo Jogador!");
		
		for (Arma arma : p2.getClasse().getArma()) {
			System.out.printf("%d - %s\n",count,arma.getNome());
			count++;
		}
		
		do {
			System.out.print("\nEscolha sua Arma: ");
			opcao=leitura.nextInt();
			leitura.nextLine();
			if(opcao>1||opcao<0) System.out.println("Opcão inválida!");
			else if(opcao==1||opcao==0) break;
			
		}while(opcao!=1||opcao!=0);
		
		
		Arma armaOponente = p2.getClasse().getArma().get(opcao);
		
		determinarVencedor(armaAtacante,armaOponente,personagens,vida1,vida2);
		
		while(p1.getVida()>0||p2.getVida()>0) {
			if(personagens.get(0).getNome().equals(p1.getNome())) {
				menuBatalha(p2, p1, personagens,vida1,vida2);
			}
			else {
				menuBatalha(p1, p2, personagens,vida1,vida2);
			}
		}
		
	}
	
	public static void main(String[] args) {
		menu();		
	}

}
