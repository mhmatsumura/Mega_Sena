package View;

import java.io.IOException;
import java.io.LineNumberInputStream;
import java.math.BigInteger;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;

import Model.Cartela;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainOverviewController {
	
	 @FXML
	 private TextField tfSequencia;
	 @FXML
	 private TextField tfCartela;
	 @FXML
	 private TextField tfSorteio;
	 
	 @FXML
	 private TextField tfCombinacaoN;
	 
	 @FXML
	 private TextField tfCombinacaoP;
	 
	 @FXML
	 private TextField tfCombinacaoR;
	 
	 @FXML
	 private TextField tfLinearidadeA1;
	 @FXML
	 private TextField tfLinearidadeA2;
	 @FXML
	 private TextField tfLinearidadeA3;
	 @FXML
	 private TextField tfLinearidadeAx;
	 @FXML
	 private TextField tfLinearidadeB1;
	 @FXML
	 private TextField tfLinearidadeB2;
	 @FXML
	 private TextField tfLinearidadeB3;
	 @FXML
	 private TextField tfLinearidadeB4;
	 @FXML
	 private TextField tfLinearidadeC1;
	 @FXML
	 private TextField tfLinearidadeC2;
	 @FXML
	 private TextField tfLinearidadeC3;
	 @FXML
	 private TextField tfLinearidadeC4;
	
	
	 @FXML
	 private TextArea textarea;
	 
	 @FXML
	 private TextArea textarea2;

	private static ArrayList<String> cartelasMagicasHelper;

	private static String primeiraCartelaIdeal;

	private static String s;

	private static List<String> toRemove;
	
	

	private static String primeiraCartela;

	private static ArrayList<String> sorteiosEncontrados;
	private static ArrayList<Integer> qualificadoresCartelas;
	private static ArrayList<Integer> qualificadoresCartelasHelper;

	private static ArrayList<Integer> totais;

	private static int maxCount;

	private static String cartelaBoa;

	private static List<String> arraysStringHelper;
	
	private final Pattern pat = Pattern.compile(" ");
	private final Pattern patColcheteAbre = Pattern.compile("\\[");
	private final Pattern patColcheteFecha = Pattern.compile("\\]");
	private final Pattern patEspaco = Pattern.compile(" ");
	private static double initialTime;
	private static double temporaryTime;
	private static int quantidadeMaximaSorteioPorTop;
	
	private static Integer integer;

	private static int quantidadeTops;
	private static int quantidadeSorteioPorTop;

	private static int quantidadeSorteios;
	private static int removedInteger;
	private static int index;
	
	private static int ciclo;
	private static int ciclo2;
	
	private static int maximoSorteioPorCartela;

	private static int quantidadeTopsMax;

	private static int quantidadeSorteiosMax;
	
	private static int i;

	private static int count3;

	private static String cartelaTopIdealHelper;

	private static String cartelaTopIdeal;

	private static boolean primeiraVez;
	
	private static Iterator<String> it;
	private static Iterator<Integer> itInteger;

	private static String ultimaCartela;

	private static int numeroDeDesigualdades;

	private static int numeroMaximoDeDesigualdades;

	private static int qtdNumerosSorteados;

	private static int fim;

	private static int inicio;

	private static int qtdNumerosDaCartela;

	private static int secondCount;

	private static int count2;

	private static int minCount;

	private static char[] arrayCharHelper;

	private static ArrayList<Character> listCharHelper;

	

	private static String helperIter0;

	private static String helperIter;

	private static String helperIter2;

	private static String[] arrayHelper;
	

	
	 private static StringBuffer texto;
	 
	 //private static FileBasedCollection<String> combinacoesGeradas;
	 private static ArrayList<String> combinacoesGeradas;
	 private static ArrayList<String> cartelas;
	 private static ArrayList<String> sorteios;
	 private static ArrayList<String> sorteiosExcluidos;
	 
	 private static Set<String> todosSorteiosExcluidos; 
	 private static Set<String> todosSorteiosExcluidosHelper;
	 
	 private static ArrayList<String> cartelasImutavel;
	 private static ArrayList<String> sorteiosImutavel;
	 private static ArrayList<String> cartelasHelper;
	 private static ArrayList<String> sorteiosHelper;
	 private static ArrayList<String> sorteiosHelper2;
	 private static ArrayList<Integer[]> combinacoesAcertadas;
	 private static ArrayList<String> cartelasMagicas;
	 private static ArrayList<ArrayList<String>> combinacoesCartelas;
	 private static ArrayList<ArrayList<String>> conjuntoMinimoCartelas;
	 private static int[] equacao1,equacao2,equacao3;
	 private static String helper;
	 private static String metodo;
	 private static int count;
	 private static int minimaQtdCartelas;
	 private static int maximaQtdCartelasSimilares;
	 private static int qtdCartelasSimilares;
	 private static int minimaQtdCartelasSimilares;
	 private static ArrayList<String> cartelasAdelan;
	 
	 private static ArrayList<String> cartelasBruteForce;
	 
	 private static ArrayList<String> cartelasMauricio;
	 private static ArrayList<String> cartelasAdelanEquidistante;
	 
	 private static ArrayList<String> cartelasTops,cartelasTopHelper;

	private static char[] combinacaoCopia;
	
	@FXML
	private void handleCombinacaoButton() {
		
		tfCombinacaoR.setText(""+numeroCombinacoes(Integer.parseInt(tfCombinacaoN.getText()),
				          Integer.parseInt(tfCombinacaoP.getText())));
		
	}
	
	
	@FXML
	private void handleEncontrarXButton() {
		
		equacao1 = new int[] {Integer.parseInt(tfLinearidadeA1.getText()),
							  Integer.parseInt(tfLinearidadeA2.getText()),
							  Integer.parseInt(tfLinearidadeA3.getText())};
		equacao2 = new int[] {Integer.parseInt(tfLinearidadeB1.getText()),
				  			  Integer.parseInt(tfLinearidadeB2.getText()),
				  			  Integer.parseInt(tfLinearidadeB3.getText()),
				              Integer.parseInt(tfLinearidadeB4.getText())};
		equacao3 = new int[] {Integer.parseInt(tfLinearidadeC1.getText()),
				  			  Integer.parseInt(tfLinearidadeC2.getText()),
				  			  Integer.parseInt(tfLinearidadeC3.getText()),
				              Integer.parseInt(tfLinearidadeC4.getText())};
		
		tfLinearidadeAx.setText(calculaXDeterminanteDX(equacao1,equacao2,equacao3)+"");
	
	}
	 
	
	@FXML
	private void handleVerificarButton() {
		
		inicio = 1;
		fim = Integer.parseInt(tfSequencia.getText());

		qtdNumerosDaCartela = Integer.parseInt(tfCartela.getText());
		qtdNumerosSorteados = Integer.parseInt(tfSorteio.getText());
		
		metodo = ("");
		
		equacao1 = new int[] {18,15,14,80};
		equacao2 = new int[] {7,4,3,7};
		equacao3 = new int[] {6,3,2,6};
		
		System.out.println("determinanteD: "+calculaDeterminanteD(equacao1,equacao2,equacao3));
		System.out.println("determinanteDX: "+calculaDeterminanteDX(equacao1,equacao2,equacao3));
		System.out.println("determinanteDY: "+calculaDeterminanteDY(equacao1,equacao2,equacao3));
		System.out.println("determinanteDZ: "+calculaDeterminanteDZ(equacao1,equacao2,equacao3));
		System.out.println("Valor de X: "+calculaXDeterminanteDX(equacao1,equacao2,equacao3));
		System.out.println("X = "+calculaDeterminanteDX(equacao1,equacao2,equacao3)
								 /calculaDeterminanteD(equacao1,equacao2,equacao3));
		System.out.println("Y = "+calculaDeterminanteDY(equacao1,equacao2,equacao3)
		 						 /calculaDeterminanteD(equacao1,equacao2,equacao3));
		System.out.println("Z = "+calculaDeterminanteDZ(equacao1,equacao2,equacao3)
		 						 /calculaDeterminanteD(equacao1,equacao2,equacao3));
		
		 cartelasTops = new ArrayList<String>();
		 cartelasTopHelper = new ArrayList<String>();
		 cartelasHelper = new ArrayList<String>();
		 sorteiosHelper = new ArrayList<String>();
		 sorteiosHelper2 = new ArrayList<String>();
		 sorteiosExcluidos = new ArrayList<String>();
		 
		 todosSorteiosExcluidos = new HashSet();
		 todosSorteiosExcluidosHelper = new HashSet();
		 //combinacoesGeradas = new FileBasedCollection<String>();
		 combinacoesGeradas = new ArrayList<String>();
		 
		 sorteiosEncontrados = new ArrayList<String>();
		 totais = new ArrayList<Integer>();
		 
		 cartelasMagicas = new ArrayList();
		 cartelasMagicasHelper = new ArrayList();
		 listCharHelper = new ArrayList();
		 qualificadoresCartelas = new ArrayList();
		 qualificadoresCartelasHelper = new ArrayList();
		 
		 combinacoesCartelas = new  ArrayList<ArrayList<String>>();
	 
	   	
	   	/*cartelasBruteForce = new ArrayList<String>(){{
			   add("1 2 3 4");
			   add("1 2 3 5");
			   add("1 2 3 6");
			   add("1 4 5 6");
			   add("2 4 5 6 ");
			   add("3 4 5 6");
			   }};*/
		 
		 
		 /*cartelasAdelan = new ArrayList<String>(){{
			   add("1 2 3 4 5 8");
			   add("1 2 3 4 6 9");
			   add("1 2 3 4 7 10");
			   add("1 2 3 5 6 7");
			   add("1 2 4 7 8 9");
			   add("1 2 5 7 9 10");
			   add("1 2 6 7 8 10");
			   add("1 3 4 5 9 10");
			   add("1 3 5 6 8 10");
			   add("1 3 5 7 8 9");
			   add("1 4 5 6 7 9");
			   add("1 4 6 8 9 10");
			   add("2 3 4 6 8 10");
			   add("2 3 5 6 9 10");
			   add("2 3 6 7 8 9");
			   add("2 4 5 6 7 8");
			   add("2 4 5 8 9 10");
			   add("3 4 5 6 7 10");
			   add("3 4 7 8 9 10");
			   add("5 6 7 8 9 10");
			   }};*/
			   
	   /*cartelasMauricio = new ArrayList<String>(){{
		   add("1 2 3 5 8 10"); 
		   add("1 2 3 6 7 9");
		   add("1 4 5 6 7 8");
		   add("2 4 5 6 9 10");
		   add("3 4 7 8 9 10");
		   add("1 2 4 5 7 9");
		   add("1 3 4 5 7 10");
		   add("1 3 4 6 8 9");
		   add("1 3 5 6 9 10");
		   add("2 3 4 5 8 9");
		   add("5 6 7 8 9 10");
		   add("1 2 4 6 8 10");
		   add("1 2 7 8 9 10");
		   add("2 3 4 6 7 10");
		   add("2 3 5 6 7 8");
		   add("2 4 5 7 8 10");
		   add("3 4 5 6 7 9");
		   add("1 2 3 4 9 10");
		   add("1 2 5 6 8 9");
		   add("1 3 6 7 8 10");
		   }};
		 */
		 
		/* 1  2  3  4  5  6  
		 1  2  3  4  5  7  
		 1  2  3  4  5  8
		 1  2  3  4  5  9  
		 1  2  3  4  5  10  
		 1  2  3  4  6  7  
		 1  2  3  4  6  8  
		 1  2  3  4  6  9  
		 1  2  3  4  6  10  
		 1  2  3  4  7  10  
		 3  4  7  8  9  10  
		 1  5  7  8  9  10  
		 2  5  7  8  9  10  
		 3  5  7  8  9  10  
		 4  5  7  8  9  10  
		 1  6  7  8  9  10  
		 2  6  7  8  9  10  
		 3  6  7  8  9  10  
		 4  6  7  8  9  10  
		 5  6  7  8  9  10  */

		 
		    
		
		
		//texto.append("Menor numero de cartelas de 6 numeros que contem um grupo de 4 numeros:\n\n");
		
		/*combinacoesGeradas = new ArrayList<Integer[]>();
		combinacoes(gerarSequencia(1,10), 6, 0, new Integer[6]);
		cartelas = new ArrayList<Integer[]>(combinacoesGeradas);
		
		
		
		combinacoesGeradas = new ArrayList<Integer[]>();
		combinacoes(gerarSequencia(1,10), 4, 0, new Integer[4]);
		sorteios = new ArrayList<Integer[]>(combinacoesGeradas);*/
		
		//combinacoesGeradas = new ArrayList<Integer[]>();
		//cartelasQueNaoContemplamNenhumaQuadra(cartelas, sorteios);
		//texto.append("Encontradas "+combinacoesGeradas.size()+" cartelas que não contemplam nenhuma quadra: \n\n");
		   
		/* textarea.setText(" C210x2: "+numeroCombinacoes(210,2)+
				         "\n C210x3: "+numeroCombinacoes(210,3)+
				         "\n C210x4: "+numeroCombinacoes(210,4)+
				         "\n C210x5: "+numeroCombinacoes(210,5)+
				         "\n C210x6: "+numeroCombinacoes(210,6)+
				         "\n C210x7: "+numeroCombinacoes(210,7)+
				         "\n C210x8: "+numeroCombinacoes(210,8)+
				         "\n C210x9: "+numeroCombinacoes(210,9)+
				         "\n C210x10: "+numeroCombinacoes(210,10)+
				         "\n C210x11: "+numeroCombinacoes(210,11)+
				         "\n C210x12: "+numeroCombinacoes(210,12)+
				         "\n C210x13: "+numeroCombinacoes(210,13)+
				         "\n C210x14: "+numeroCombinacoes(210,14)+
				         "\n C210x15: "+numeroCombinacoes(210,15)+
				         "\n C210x16: "+numeroCombinacoes(210,16)+
				         "\n C210x17: "+numeroCombinacoes(210,17)+
				         "\n C210x18: "+numeroCombinacoes(210,18)+
				         "\n C210x19: "+numeroCombinacoes(210,19)+
				         "\n C210x20: "+numeroCombinacoes(210,20));  */
		   
		   /*textarea.setText(" C8x4: "+numeroCombinacoes(9,5)+
			         	    "\n C8x3: "+numeroCombinacoes(9,4)+
			         	    "\n C126x2: "+numeroCombinacoes(126,2)+
			         	    "\n C126x3: "+numeroCombinacoes(126,3)+
				         	"\n C126x4: "+numeroCombinacoes(126,4)+
				         	"\n C126x5: "+numeroCombinacoes(126,5)+
				         	"\n C126x6: "+numeroCombinacoes(126,6)+
				         	"\n C126x7: "+numeroCombinacoes(126,7)+
				         	"\n C126x8: "+numeroCombinacoes(126,8)+
				         	"\n C126x9: "+numeroCombinacoes(126,9)+
				         	"\n C126x10: "+numeroCombinacoes(126,10)+
				         	"\n C126x11: "+numeroCombinacoes(126,11)+
				         	"\n C126x12: "+numeroCombinacoes(126,12)+
				         	"\n C126x13: "+numeroCombinacoes(126,13)+
				         	"\n C126x14: "+numeroCombinacoes(126,14)+
  			                "\n C126x15: "+numeroCombinacoes(126,15)); */
	
 
		combinacoes(gerarSequencia(inicio,fim), qtdNumerosSorteados, 0, new char[qtdNumerosSorteados]);
		sorteios = new ArrayList<String>();
		
		sorteios.addAll(combinacoesGeradas);
		
		sorteiosImutavel = new ArrayList<String>();
		sorteiosImutavel.addAll(combinacoesGeradas);
		
		/*try(FileBasedIterator<String> iter = combinacoesGeradas.iterator()) {
		
			while (iter.hasNext()) {
				sorteios.add(iter.next());
			}
		
		
		
		  } catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		  }*/
		
		
		System.out.println("Gerados "+sorteios.size()+" sorteios possíveis: \n");
		
		
		for (String s:sorteios) {
			System.out.println(converteCaracterInteiro(s));
		}
		System.out.println("");
		
		
		

		combinacoesGeradas.clear();  
	
		combinacoes(gerarSequencia(inicio,fim), qtdNumerosDaCartela, 0, new char[qtdNumerosDaCartela]);
		cartelas = new ArrayList<String>();
		
		cartelas.addAll(combinacoesGeradas);
		
		cartelasImutavel = new ArrayList<String>();
		cartelasImutavel.addAll(combinacoesGeradas);
		
		
		/*try(FileBasedIterator<String> iter = combinacoesGeradas.iterator()) {
			
			while (iter.hasNext()) {
				cartelas.add(iter.next());
			}
		
		
		
		  } catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		  }*/
		
		System.out.println("Gerados "+cartelas.size()+" cartelas possíveis: \n");
		
		
		for (String s:cartelas) {
			System.out.println(converteCaracterInteiro(s));
		}
		System.out.println("");
		
		

		int counter = 0;
		
			System.out.println("****************************************************************");
			System.out.println("Considerando números de "+inicio+" à "+fim);
			System.out.println("Quantidade de números da Cartela: "+qtdNumerosDaCartela+".");
			System.out.println("Quantidade de números do sorteio: "+qtdNumerosSorteados+".\n");
			
			System.out.println("****************************************************************\n");
			
			initialTime = new Date().getTime();
			
			System.out.println("inicio!!!  "+new Date()+"\n");
		 
		 	texto = new StringBuffer();
		 
		 	texto.append("****************************************************************\n");
			texto.append("Considerando números de "+inicio+" à "+fim+"\n");
			texto.append("Quantidade de números da Cartela: "+qtdNumerosDaCartela+".\n");
			texto.append("Quantidade de números do sorteio: "+qtdNumerosSorteados+".\n\n");
			
			texto.append("****************************************************************\n\n");

			texto.append("inicio!!!  "+new Date()+"\n\n");
		
				 //encontraCartelasMagicasBruteForce();
				    encontraCartelasMagicasComplexo();
			 			//encontraCartelasMagicasComplexoOtimizado();
		
		
			/*for(String s: cartelasMagicas) {
				System.out.println(converteCaracterInteiro(s));
			}*/
			
			System.out.println(" ");
			
			System.out.println("Fim!!! (Tarefa concluída em: "+ (new Date().getTime()- initialTime)/1000+" segundos).");
			System.out.println("****************************************************************\n");
		 
		
			
			for(String s: cartelasMagicas) {
				texto.append(converteCaracterInteiro(s)+"\n");
			}
			
			texto.append("\n");
			texto.append("Método utilizado: "+metodo+"\n\n");
			texto.append("Número mínimo de cartelas encontrado: "+cartelasMagicas.size()+".\n\n");
			
			texto.append("Fim!!!  "+new Date()+"\n");
			texto.append("****************************************************************\n\n");
			 
			//textarea2.setText(texto.toString());
		 
//		 verificarCartelas(cartelasBruteForce,sorteios);  
		
		
		
		/*System.out.println("Quadras possíveis: \n");
		imprimeCollection(sorteios);
		System.out.println("-------------------------------------------- ");
		
		System.out.println("20 cartelas Mauricio: \n");
		
		verificarCartelas(cartelasMauricio,sorteios);  
		
		System.out.println("20 cartelas Adelan: \n");
		
		verificarCartelas(cartelasAdelan,sorteios);  */
			
			cartelasAdelanEquidistante = new ArrayList<String>();
			 
			
			 String str[]=textarea.getText().split("\n");
			 
			 for(String linha:str){
				 cartelasAdelanEquidistante.add(linha);
			 }
			
			
			 verificarCartelas(converteInteiroCaracter(cartelasAdelanEquidistante),sorteios);  
			
			    
			
			/*verificarCartelas(cartelasMauricio,sorteios);  
			verificarCartelas(cartelasAdelanEquidistante,sorteios);  
		*/
		
		
		
		
		
		
		
		
		
		/*texto = new StringBuffer();
		
		texto.append(cartelasMagicas.size()+" cartelas são necessárias para contempar todos os sorteios possíveis: \n\n");
		
		
		
		for (String s: cartelasMagicas) {
			texto.append(s+"\n");
		}
		
		textarea.setText(texto.toString());*/
		
		/*try(FileBasedIterator<String> iter = cartelas.iterator()) {
			
			
		
			
	
		  } catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		  }*/
		
		
		/*int count=0;
		for (String c:sorteios) {
			
			List<String> cart = myStringToList(c);
			for(String s:cart) {
				System.out.print(s);
			}
			count++;
			System.out.println(" ");
			
		}
		System.out.println(count);*/
		
		
		
		//textarea.setText(sorteiosContemplaveisPorCartela(cartelas,sorteios));
		
		/*carregaTextoCartela();
		
		textarea.setText(texto.toString());
		
		carregaTextoSorteio();
		
		textarea2.setText(texto.toString());*/
		
		//combinacoes(gerarSequencia(1,210), 20, 0, new Integer[20]);
		
		//texto.append("Ate que enfim!! "+new Date());
		//cartelas = new ArrayList<Integer[]>(combinacoesGeradas);
		
		
		
		
		//menorNumeroDeCartelas(cartelas,sorteios);
		
		
		
		//-------------------------------------------------------------------
		
		
		//------------------------------------
	
		
	}
	




	
	private void encontraCartelasMagicasComplexo() {
		
		metodo = ("encontraCartelasMagicasComplexo");
		
		count3 = 0;
		
		maximoSorteioPorCartela = numeroCombinacoes(qtdNumerosDaCartela,qtdNumerosSorteados).intValue();
		
		for (String s:cartelas) {
			qualificadoresCartelas.add(maximoSorteioPorCartela);
		}
		
		int count4 = 0;
		
		ultimaCartela = "";
		
		temporaryTime = initialTime;
		
		double helperTime = 0;
		
		ciclo = 1;
		int count5 = 0;
		
		while(sorteios.size()>0) {
			
			 minimaQtdCartelas = 1000000000;
			 minimaQtdCartelasSimilares = 1000000000;
			 maximaQtdCartelasSimilares = 0;
			 primeiraCartelaIdeal = "";
			 qtdCartelasSimilares = 0;
			
			 cartelasMagicasHelper.clear();
			 
			 /*count=0;
				System.out.println("--------------------------------------------------");
				for (Integer q:qualificadoresCartelas) {
					System.out.println(converteCaracterInteiro(cartelas.get(count))+" - "+q+" count: "+(count+1));
					count++;
				}*/
			 
			 
			 /*System.out.println("CICLO "+ciclo);
			 System.out.println("");
			 System.out.println("CARTELAS");
			 
			 count5 = 1;
			 for (String s:cartelas) {
				 System.out.println(count5+++" - "+converteCaracterInteiro(s)+" - "+sorteiosContemplaveisPorCartela(s,sorteios).size());
			 }
			 System.out.println("");
			 
			 count5 = 1;
			 System.out.println("SORTEIOS");
			 for (String s:sorteios) {
				 System.out.println(count5+++" - "+converteCaracterInteiro(s)+" - "+sorteiosContempladosNasCartelas(s,cartelas).size());
			 }
			 
			 System.out.println("");*/
			 
			 //encontraPrimeiraCartelaIdealCartelaMaisDesigual(ultimaCartela);
			
			//encontraPrimeiraCartelaIdealCartelasSimilares();
			 
				 encontraPrimeiraCartelaIdealQtdTopsGerada();
				 
			 
			ciclo++;
			  
			//encontraPrimeiraCartelaIdeal();
			 
			 
			 
			
			//System.out.println("Número mínimo de cartelas provisório: "+cartelasMagicasHelper.size());
			/*for(String s: cartelasMagicasHelper) {
				System.out.println(converteCaracterInteiro(s));
			}*/
			
			/*System.out.println("Cartela escolhida: "+converteCaracterInteiro(primeiraCartelaIdeal)+" - "+sorteiosContemplaveisPorCartela(primeiraCartelaIdeal,sorteios).size());
			System.out.println("");
			ultimaCartela = primeiraCartelaIdeal;
			cartelasMagicas.add(primeiraCartelaIdeal);
			
			System.out.println("CARTELAS ESCOLHIDAS");
			count5 = 1;
			for (String s:cartelasMagicas) {
				System.out.println(count5+++" - "+converteCaracterInteiro(s));
			}
			System.out.println("");*/
			
			count4++;
			
			
			helperTime = new Date().getTime();
			System.out.println("A "+count4+" - "+(helperTime-temporaryTime)/1000);
			temporaryTime = helperTime;
			
			System.out.println(converteCaracterInteiro(primeiraCartelaIdeal));
			
			//giraCartelas(primeiraCartelaIdeal);
			
			index = cartelas.indexOf(primeiraCartelaIdeal);
			
			
		
			cartelas.remove(primeiraCartelaIdeal);	
			
			sorteiosExcluidos = removeSorteiosContemplaveisPorCartela(primeiraCartelaIdeal, sorteios);
			
			

			//Set<String> hs = new HashSet<>();
			
			//todosSorteiosExcluidos.addAll(sorteiosExcluidos);
			
			/*count5 = 1;
			System.out.println("SORTEIOS EXCLUIDOS");
			for (String s:todosSorteiosExcluidos) {
				System.out.println(count5+++" - "+converteCaracterInteiro(s)+" - "+sorteiosContempladosNasCartelas(s,cartelas).size());
			}
			System.out.println("");*/
			
			
			
			atualizaQualificadores(qualificadoresCartelas,cartelas,index,sorteiosExcluidos);
			
			
			
			
			
			
			
		}
		
		//System.out.println("Foram necessárias: "+count3+" iterações dentro do método encontraCartelasMagicasSimples.\n");
	
	}
	
	
	
	
	
	private String encontraPrimeiraCartelaIdealQtdTopsGerada() {
		
		quantidadeTopsMax = 0;
		quantidadeMaximaSorteioPorTop = 0;
		
		
		if (ciclo == 1) {
			
			cartelasTops.clear();
			cartelasTops.addAll(cartelas);
		
		}else {
			
			cartelasQueContemplamMaxSorteios(cartelas,qualificadoresCartelas,cartelasTops);
			
		}
		
		
		cartelasHelper.clear();
		cartelasHelper.addAll(cartelas);
		
/*		todosSorteiosExcluidosHelper.clear();
		todosSorteiosExcluidosHelper.addAll(todosSorteiosExcluidos);*/
		
		sorteiosHelper.clear();
		sorteiosHelper.addAll(sorteios);
		
		
		
		for (int i=0;i<cartelasTops.size();i++) {
			
			qualificadoresCartelasHelper.clear();
			qualificadoresCartelasHelper.addAll(qualificadoresCartelas);
			
			index = cartelasHelper.indexOf(cartelasTops.get(i));
			
			
			
			cartelasHelper.remove(index);	
			
			
			
			sorteiosHelper2 = removeSorteiosContemplaveisPorCartela(cartelasTops.get(i),sorteiosHelper);
			
			
			
			atualizaQualificadores(qualificadoresCartelasHelper,cartelasHelper,index,sorteiosHelper2);
			
			/*count=1;
			System.out.println("--------------------------------------------------");
			for (Integer q:qualificadoresCartelasHelper) {
				System.out.println("qualificadoe: "+q+" count: "+count++);
			}*/
			
		
			//todosSorteiosExcluidosHelper.addAll(sorteiosHelper2);
			
		
			//--------------------------------------
			
			cartelasQueContemplamMaxSorteios(cartelasHelper,qualificadoresCartelasHelper,cartelasTopHelper);
			
			//todosSorteiosExcluidosHelper.removeAll(sorteiosHelper2);
			
			
			
			//System.out.println("tamanho do sorteios exculidos depois: "+todosSorteiosExcluidosHelper.size());
			
			//System.out.println("cartelasTopHelper.size(): "+cartelasTopHelper.size()+" quantidadeSorteioPorTop: "+maxCount);
			
			quantidadeTops = cartelasTopHelper.size();
			
			quantidadeSorteioPorTop = maxCount;
			
			cartelasHelper.add(index,cartelasTops.get(i));
			
			
			
			sorteiosHelper.addAll(sorteiosHelper2);
			
			
			sorteiosHelper2.clear();
			
			//System.out.println(converteCaracterInteiro(cartelasTops.get(i))+" - "+quantidadeTops+" - "+quantidadeSorteioPorTop);
		
			if (quantidadeSorteioPorTop > quantidadeMaximaSorteioPorTop) {
				
				quantidadeMaximaSorteioPorTop = quantidadeSorteioPorTop;
				primeiraCartelaIdeal = cartelasTops.get(i);
				
				//quantidadeTopsMax = quantidadeTops;
				
				
			}else  if (quantidadeSorteioPorTop == quantidadeMaximaSorteioPorTop){
				
				if (quantidadeTops > quantidadeTopsMax) {
					
					quantidadeTopsMax = quantidadeTops;
					
					
					primeiraCartelaIdeal = cartelasTops.get(i);
					
				}
				
			}
		
		}
		
		
		return primeiraCartelaIdeal;
	}

	private void atualizaQualificadores(ArrayList<Integer> qualificadores, ArrayList<String> cartelasHelper, int index,
			ArrayList<String> sorteiosExcluidos) {
		
		count = 0;
		
		
		qualificadores.remove(index);
		
		itInteger = qualificadores.iterator();
		
		   while (itInteger.hasNext()) {
			 
		      i = itInteger.next().intValue();
		      
		      for (String s:sorteiosExcluidos) {
					
					if(contem(cartelasHelper.get(count),s)) {
						i = i-1;
						qualificadores.set(count, i);
						
					}
					
				}
		      
		     count++;
		       
		   }
	
		
	}


	private ArrayList<String> cartelasQueContemplamMaxSorteios(ArrayList<String> cartelasHelper,
			ArrayList<Integer> qualificadores,ArrayList<String> helper) {
		
		helper.clear();
		
		
		
	//	totais.clear();
		count= 0;
		maxCount = 0;
		
		
			for (Integer q:qualificadores) {
							
				if (q.intValue()>maxCount) {

					maxCount = q.intValue();
					helper.clear();
					helper.add(cartelasHelper.get(count));
					
				}else if (q.intValue() == maxCount) {
					helper.add(cartelasHelper.get(count));
				}
				
				count++;
	
			}
		
			//System.out.println("maxCount: "+maxCount);
		
			
		return helper;
	}
	
	private ArrayList<String> cartelasQueContemplamMaxSorteios(ArrayList<String> cartelasHelper,
			ArrayList<String> sorteiosHelper,ArrayList<String> helper,int i) {
		
		helper.clear();
		
	//	totais.clear();
		count= 0;
		maxCount = 0;
		
		
			for (String cartela:cartelasHelper) {
			
				count = 0;
	
					for (String sorteio:sorteiosHelper) {
	
						if (contem(cartela,sorteio)) {
							
							count++;
							
						}
						
					}
	
				//System.out.println("---------------count: "+count);
	
				if (count>maxCount) {
					
					maxCount = count;
					helper.clear();
					helper.add(cartela);
					
				}else if (count == maxCount) {
					helper.add(cartela);
				}
	
			}
		
			//System.out.println("maxCount: "+maxCount);
		
			
		return helper;
	}
	
	private ArrayList<String> cartelasQueContemplamMaxSorteios(ArrayList<String> cartelasHelper,
			ArrayList<String> sorteiosHelper,Set<String> todosSorteiosExcluidosHelper,ArrayList<String> helper) {
		
		helper.clear();
		
	//	totais.clear();
		count= 0;
		maxCount = 0;
		
		
			for (String cartela:cartelasHelper) {
			
				
				
				if (sorteiosHelper.size()<=todosSorteiosExcluidosHelper.size()) {
					
					//System.out.println("entrei no sorteio");
					count = 0;
					
					for (String sorteio:sorteiosHelper) {
	
						if (contem(cartela,sorteio)) {
							
							count++;
							
						}
						
					}
					
				}else {
					
					int i = 0;
					count = maximoSorteioPorCartela;
					
					for (String sorteioEx:todosSorteiosExcluidosHelper) {
					
						if (contem(cartela,sorteioEx)) {
							
							count--;
							
							//System.out.println("qtsvezes: "+i++);
							
							
						}
					}
					
				}
	
				//System.out.println("------------------------------------------count: "+count);
				
				if (count>maxCount) {
					
					maxCount = count;
					helper.clear();
					helper.add(cartela);
					
				}else if (count == maxCount) {
					helper.add(cartela);
				}
				
			}
		
			
		//System.out.println("maxCount: "+maxCount);
			
		return helper;
	}
	
	private String cartelaQueContemplaMaxSorteios(ArrayList<String> cartelasHelper,
			ArrayList<String> sorteiosHelper) {
		
		
	//	totais.clear();
		count= 0;
		maxCount = 0;
		cartelaBoa = "";
		
		
		
		
			for (String cartela:cartelasHelper) {
			
				count = 0;
	
					for (String sorteio:sorteiosHelper) {
	
						if (contem(cartela,sorteio)) {
							
							count++;
							
							
						}
						
					}
	
	//			totais.add(count);
	
				if (count>maxCount) {
					/*System.out.println(count);
					System.out.println(cartela);*/
					maxCount = count;
					cartelaBoa = cartela;
					
				}
				
				
				
				
	
			}
		
		
			/*int count3 = 0;
			
			for (int i: totais) {
				if(i==maxCount) {
					count3++;
				}
				
				
			}*/
	//		System.out.print("maxcount: "+maxCount+" qtd: "+count3);
			
	//		System.out.println(" ");
			
			
		return cartelaBoa;
	}
	
	private ArrayList<String> converteInteiroCaracter(ArrayList<String> cartelasInteiro) {
		
		ArrayList<String> cartelasCaracter = new ArrayList<String>();
		
		String cartelaCarac = "";
		
		
			
			for(String cartelaInt:cartelasInteiro) {
				
				if (!cartelaInt.equals("")) {
					
					String numeros[] = cartelaInt.split(" ");
					for(String numero:numeros) {
						System.out.println("numero: "+numero);
						cartelaCarac += getCharForNumber(Integer.parseInt(numero))+" ";
					}
					
					cartelasCaracter.add(cartelaCarac);
					
					cartelaCarac = "";
					
				}
				
			}
		
		
		return cartelasCaracter;
	}
	
	private String encontraPrimeiraCartelaIdeal() {
		
		cartelasQueContemplamMaxSorteios(cartelas,sorteios,cartelasTops,count);
		
		for (int i=0;i<cartelasTops.size();i++) {
			
			giraCartelas(cartelasTops.get(i));
		
			encontraCartelasMagicasSimples();
		
			/*System.out.println(cartelas.indexOf(cartelasMagicasHelper.get(0))+"--"
					+sorteiosContemplaveisPorCartela(cartelasMagicasHelper.get(0), sorteios).size()+"----- "+i);
*/
			if (cartelasMagicasHelper.size()<minimaQtdCartelas) {
				minimaQtdCartelas = cartelasMagicasHelper.size();
				
				
				primeiraCartelaIdeal = cartelasMagicasHelper.get(0);
				
			}
			
			
			
			//System.out.println(cartelas.size()+" "+new Date());
			
		}
		
		System.out.println(" ");
		for (String s:cartelasTops) {
			System.out.println(converteCaracterInteiro(s)+" - "+sorteiosContemplaveisPorCartela(s, sorteios).size());

		}
		System.out.println("primeiraCartelaIdeal: "+converteCaracterInteiro(primeiraCartelaIdeal));
		System.out.println("");
		
		System.out.println(" ");
		return primeiraCartelaIdeal;
	}
	
private String encontraPrimeiraCartelaIdealCartelaMaisDesigual(String ultima) {
		
		cartelasQueContemplamMaxSorteios(cartelas,sorteios,cartelasTops,count);
		
		numeroMaximoDeDesigualdades = 0;
		
		for (int i=0;i<cartelasTops.size();i++) {
			
			numeroDeDesigualdades = numeroDeDesigualdades(cartelasTops.get(i), ultima);
			
			System.out.println("numeroDeDesigualdades: "+numeroDeDesigualdades);
		
			if (numeroDeDesigualdades > numeroMaximoDeDesigualdades) {
				
				numeroMaximoDeDesigualdades = numeroDeDesigualdades;
				
				primeiraCartelaIdeal = cartelasTops.get(i);
				
			}
			
		
		}
		
		
		return primeiraCartelaIdeal;
	}
	
	private String encontraPrimeiraCartelaIdealCartelasSimilares() {
		
		cartelasQueContemplamMaxSorteios(cartelas,sorteios,cartelasTops,count);
		
		
		for (int i=0;i<cartelasTops.size();i++) {
			
			qtdCartelasSimilares = 0;
			
			for (String sorteio:sorteiosContemplaveisPorCartela(cartelasTops.get(i),sorteios)) {
				
					for (String cartela: cartelas) {
						if (contem(cartela,sorteio)) {
							qtdCartelasSimilares++;
						}
					}
					
					//System.out.println("qtdCartelasSimilares por sorteio: "+qtdCartelasSimilares);
			
			};
			
			System.out.println(i+" - qtdCartelasSimilares: "+qtdCartelasSimilares);
		
			if (qtdCartelasSimilares>maximaQtdCartelasSimilares) {
				
				maximaQtdCartelasSimilares = qtdCartelasSimilares;
				
				primeiraCartelaIdeal = cartelasTops.get(i);
				
			}
			
			
			
		}
		System.out.println("maximaQtdCartelasSimilares: "+maximaQtdCartelasSimilares);
		
		return primeiraCartelaIdeal;
	}
	

	private ArrayList<String> encontraCartelasMagicasSimples() {
		
		cartelasHelper.addAll(cartelas);
		
		sorteiosHelper.addAll(sorteios);
		
		cartelasMagicasHelper.clear();
		/*ultimaCartela = "";*/
		
//		count2=0;

		while(sorteiosHelper.size()>0) {	
			
			count3++;
			
			s = cartelaQueContemplaMaxSorteios(cartelasHelper,sorteiosHelper);
		
			/*System.out.println(cartelasHelper.indexOf(s)+"--"
			+sorteiosContemplaveisPorCartela(s, sorteiosHelper).size()+"----- "+count2++);
*/
			cartelasMagicasHelper.add(s);
			
			cartelasHelper.remove(s);	
			
			sorteiosHelper.removeAll(sorteiosContemplaveisPorCartela(s,sorteiosHelper));
		
			/*System.out.println(maxCount+" "+numeroDeDesigualdades(s,ultimaCartela)+" "+s+" "+ultimaCartela);
			ultimaCartela = s;*/
			
		}
		
		cartelasHelper.clear();
		sorteiosHelper.clear();
		
		return cartelasMagicasHelper;
		
	}


	private float calculaXDeterminanteDX(int[] linha1, int[] linha2, int[] linha3) {
	
		return (((linha1[1]*linha2[2]*linha3[3])+(linha1[2]*linha2[3]*linha3[1]))-
				   ((linha3[3]*linha2[1]*linha1[2])+(linha3[2]*linha2[3]*linha1[1])))/((linha3[1]*linha2[2])-(linha2[1]*linha3[2]));
	}

	


	private float calculaDeterminanteDX(int[] linha1, int[] linha2, int[] linha3) {
		
		return ((linha1[3]*linha2[1]*linha3[2])+(linha1[1]*linha2[2]*linha3[3])+(linha1[2]*linha2[3]*linha3[1]))-
				   ((linha3[3]*linha2[1]*linha1[2])+(linha3[1]*linha2[2]*linha1[3])+(linha3[2]*linha2[3]*linha1[1]));
	}
	
	private float calculaDeterminanteDY(int[] linha1, int[] linha2, int[] linha3) {
		
		return ((linha1[0]*linha2[3]*linha3[2])+(linha1[3]*linha2[2]*linha3[0])+(linha1[2]*linha2[0]*linha3[3]))-
				   ((linha3[0]*linha2[3]*linha1[2])+(linha3[3]*linha2[2]*linha1[0])+(linha3[2]*linha2[0]*linha1[3]));
	}
	
	private float calculaDeterminanteDZ(int[] linha1, int[] linha2, int[] linha3) {
		
		return ((linha1[0]*linha2[1]*linha3[3])+(linha1[1]*linha2[3]*linha3[0])+(linha1[3]*linha2[0]*linha3[1]))-
				   ((linha3[0]*linha2[1]*linha1[3])+(linha3[1]*linha2[3]*linha1[0])+(linha3[3]*linha2[0]*linha1[1]));
	}





	private float calculaDeterminanteD(int[] linha1, int[] linha2, int[] linha3) {

		return ((linha1[0]*linha2[1]*linha3[2])+(linha1[1]*linha2[2]*linha3[0])+(linha1[2]*linha2[0]*linha3[1]))-
				   ((linha3[0]*linha2[1]*linha1[2])+(linha3[1]*linha2[2]*linha1[0])+(linha3[2]*linha2[0]*linha1[1]));
	}




	private void verificarCartelas(ArrayList<String> cartelas, ArrayList<String> sorteios) {
		
		ArrayList<String> sorteiosNaoEncontrados = new ArrayList();
		boolean encontrado;
		
		
		for (String sorteio:sorteios) {
			
			encontrado = false;
			for(String helper: cartelas) {
				
				if (contem(helper,sorteio)) {
					//System.out.println(helper+" contem "+converteCaracterInteiro(sorteio));
					encontrado = true;
				
				}else {
					
				}
			}
			
			if (!encontrado) {
				
				sorteiosNaoEncontrados.add(sorteio);
				
				
			}
			
		}
		
		imprimeArrayList(cartelas);
		
		texto = new StringBuffer();
		texto.append(sorteiosNaoEncontrados.size()+ " sorteios não foram contempladas: \n\n");
		
		for (String s:sorteiosNaoEncontrados) {
			System.out.println(converteCaracterInteiro(s));
			texto.append(converteCaracterInteiro(s)+"\n");
			
		}
		System.out.println("\n----------------------------------------------");
		texto.append("\n----------------------------------------------");
		textarea2.setText(texto.toString());
		
	}

	
	
	

	
	
	private void testaCartelasTop(ArrayList<String> cartelasR, ArrayList<String> sorteiosR, ArrayList<String> cartelasMagicasR){
		
		System.out.println("sorteiosHelper.size(): "+sorteiosHelper.size());
				cartelasR.addAll(cartelas);
				sorteiosR.addAll(sorteios);
	
	
				if (sorteiosR.size()>0) {
					
					for(String c:cartelasQueContemplamMaxSorteios(cartelasR,sorteiosR,cartelasTops,count)) {
						   
						System.out.println("Entrei no for do cartelasQueContemplamMaxSorteios.");
						
						    	
							   cartelasMagicasR.add(c);
	
								
							   cartelasR.removeAll( Collections.singletonList(c));
							   
							 
							   sorteiosR.removeAll(sorteiosContemplaveisPorCartela(c,sorteiosR));
						
							   
							   testaCartelasTop(cartelasR,sorteiosR,cartelasMagicasR);
						
					}
					
				
				}else {
					
					if (cartelasMagicasR.size()<minimaQtdCartelas) {
						minimaQtdCartelas = cartelasMagicasR.size();
						
						
						cartelaTopIdeal = cartelasMagicasR.get(0);
						
					}
				 
					return;
					
				}
		
	}
	
	private ArrayList<String> encontraCartelasMagicasSimplesMultiThreading() {
		
		
		
		cartelasHelper.addAll(cartelas);
		
		sorteiosHelper.addAll(sorteios);
		
		cartelasMagicasHelper.clear();
		/*ultimaCartela = "";*/
		
//		count2=0;

		while(sorteiosHelper.size()>0) {	
			
			count3++;
			
		
			s = cartelaQueContemplaMaxSorteios(cartelasHelper,sorteiosHelper);
			
		
			
			/*System.out.println(cartelasHelper.indexOf(s)+"--"
			+sorteiosContemplaveisPorCartela(s, sorteiosHelper).size()+"----- "+count2++);
*/
			
			
			cartelasMagicasHelper.add(s);
			
			cartelasHelper.removeAll( Collections.singletonList(s));	
			
			
			sorteiosHelper.removeAll(sorteiosContemplaveisPorCartela(s,sorteiosHelper));
			
			
			
			/*System.out.println(maxCount+" "+numeroDeDesigualdades(s,ultimaCartela)+" "+s+" "+ultimaCartela);
			ultimaCartela = s;*/
			
		}
		
		cartelasHelper.clear();
		sorteiosHelper.clear();
		
		return cartelasMagicasHelper;
		
	}
	
	
	private ArrayList<String> encontraCartelasMagicasGenético() {
		
		cartelasHelper.addAll(cartelas);
		
		sorteiosHelper.addAll(sorteios);
		
		cartelasMagicasHelper.clear();
		ultimaCartela = "";

		while(sorteiosHelper.size()>0) {	
			
			
			s = cartelaContemplaMaisMaisDistante(cartelasHelper,sorteiosHelper);
			
			
			cartelasMagicasHelper.add(s);
			
			ultimaCartela = s;
			
			cartelasHelper.removeAll( Collections.singletonList(s));	
			
			
			sorteiosHelper.removeAll(sorteiosContemplaveisPorCartela(s,sorteiosHelper));

			
			
		
		}
		
		cartelasHelper.clear();
		sorteiosHelper.clear();
		
		return cartelasMagicasHelper;
		
	}
	
	

	
	private String cartelaMaisDistante(ArrayList<String> cartelas) {

		
		cartelaBoa = "";
		numeroMaximoDeDesigualdades = 0;
		numeroDeDesigualdades = 0;
		
			for (String cartela:cartelas) {
				
						if (ultimaCartela.equals("")) {
							cartelaBoa = cartela;
							break;
						}else {
			
							numeroDeDesigualdades = numeroDeDesigualdades(cartela,ultimaCartela);
							
							if (numeroDeDesigualdades>numeroMaximoDeDesigualdades) {
								numeroMaximoDeDesigualdades = numeroDeDesigualdades;
								cartelaBoa = cartela;
							}
						}
						
						
				
			}
			
			System.out.println(numeroMaximoDeDesigualdades+" "+cartelaBoa+" "+ultimaCartela);
	
			
		return cartelaBoa;
}
	
	private void encontraCartelasMagicasComplexoOtimizado() {
		
		metodo = ("encontraCartelasMagicasComplexoOtimizado");
		
		primeiraVez = true;
		
		while(sorteios.size()>0) {
		
			 minimaQtdCartelas = 1000;
			 cartelaTopIdeal = "";
			 
			
			 cartelasMagicasHelper.clear();
			 
			if (primeiraVez) {
				primeiraVez = false;
			
			    cartelaTopIdeal = cartelas.get(0);
				
			}else {
				
				encontraCartelaTopIdealSimples();
				
				//System.out.println("sorteios.size(): "+sorteios.size());
				
				
				
			}
			
			cartelasMagicas.add(cartelaTopIdeal);
	
			cartelas.removeAll(Collections.singletonList(cartelaTopIdeal));	
			
			sorteios.removeAll(sorteiosContemplaveisPorCartela(cartelaTopIdeal,sorteios));
			
		}
		
	
		
	}
	
	private String encontraCartelaTopIdealSimples() {
		
		cartelaTopIdeal = "";
		quantidadeTops = 0;
		quantidadeSorteios = 0;
		quantidadeTopsMax = 0;
		quantidadeSorteiosMax = 0;
		cartelasTopHelper.clear();
		cartelasTopHelper.addAll(cartelasQueContemplamMaxSorteios(cartelas,sorteios,cartelasTops,count));
		
		for (String c:cartelasTopHelper) {
		
			cartelasHelper.clear();
			sorteiosHelper.clear();
			
			cartelasHelper.addAll(cartelas);
			sorteiosHelper.addAll(sorteios);
			
			cartelasHelper.removeAll( Collections.singletonList(c));	
		
			sorteiosHelper.removeAll(sorteiosContemplaveisPorCartela(c,sorteiosHelper));
			
			quantidadeTops = cartelasQueContemplamMaxSorteios(cartelasHelper, sorteiosHelper,cartelasTops,count).size();
			quantidadeSorteios = numeroMaximoSorteiosContemplados(cartelasHelper, sorteiosHelper);
			
			if (quantidadeSorteios>quantidadeSorteiosMax) {
				quantidadeSorteiosMax = quantidadeSorteios;
				quantidadeTopsMax = quantidadeTops;
				cartelaTopIdeal = c;
			}else if (quantidadeSorteios==quantidadeSorteiosMax) {
				if (quantidadeTops>quantidadeTopsMax) {
					quantidadeTopsMax = quantidadeTops;
					cartelaTopIdeal = c;
				}
			}
		
				
		}
		
		return cartelaTopIdeal;
	}
	
	private String encontraCartelaTopIdealRecursivo() {
		
			cartelaTopIdeal = "";
			cartelasHelper.clear();
			sorteiosHelper.clear();
			cartelasMagicasHelper.clear();
			cartelasHelper.addAll(cartelas);
			sorteiosHelper.addAll(sorteios);
			
			testaCartelasTop(new ArrayList<String>(),new ArrayList<String>(),new ArrayList<String>());
			
			
		
		return cartelaTopIdeal;
	}
	
	
	private String encontraCartelaTopIdeal() {
		
		cartelaTopIdeal = "";
		
		
		
		for (String c:cartelasQueContemplamMaxSorteios(cartelas,sorteios,cartelasTops,count)) {
			
			
			cartelasHelper.clear();
			sorteiosHelper.clear();
			cartelasMagicasHelper.clear();
			cartelasHelper.addAll(cartelas);
			sorteiosHelper.addAll(sorteios);
			
			
						
				cartelasHelper.removeAll( Collections.singletonList(c));	
			
				sorteiosHelper.removeAll(sorteiosContemplaveisPorCartela(c,sorteiosHelper));
				
				if (sorteiosHelper.size()==0) {
					cartelaTopIdeal = c;
				}else {
				
					while(sorteiosHelper.size()>0) {	
						
						
						s = cartelaQueContemplaMaxSorteios(cartelasHelper,sorteiosHelper);
						
					
						
						cartelasMagicasHelper.add(s);
						
						cartelasHelper.removeAll( Collections.singletonList(s));	
						
						
						sorteiosHelper.removeAll(sorteiosContemplaveisPorCartela(s,sorteiosHelper));
					
						
					}
					
						
					if (cartelasMagicasHelper.size()<minimaQtdCartelas) {
						minimaQtdCartelas = cartelasMagicasHelper.size();
						
						
						cartelaTopIdeal = cartelasMagicasHelper.get(0);
						
					}
				}
		
		}
		
		
		return cartelaTopIdeal;
	}
	
	
	
	

	private String cartelaContemplaMaisMaisDistante(ArrayList<String> cartelasHelper, ArrayList<String> sorteiosHelper) {

			count= 0;
			maxCount = 0;
			cartelaBoa = "";
			numeroMaximoDeDesigualdades = 0;
			numeroDeDesigualdades = 0;
			
				for (String cartela:cartelasHelper) {
				
					count = 0;
		
						for (String sorteio:sorteiosHelper) {
		
							if (contem(cartela,sorteio)) {
								
								count++;
								
							}
							
						}
	
		
					if (count>=maxCount) {
					
						if (count>maxCount) {
							
							maxCount = count;
							
							cartelaBoa = cartela;
							
							numeroMaximoDeDesigualdades = 0;
							
							
						}else {
							
							if (!ultimaCartela.equals("")) {
								numeroDeDesigualdades = numeroDeDesigualdades(cartela,ultimaCartela);
							}
							
							if (numeroDeDesigualdades>numeroMaximoDeDesigualdades) {
								numeroMaximoDeDesigualdades = numeroDeDesigualdades;
								cartelaBoa = cartela;
							}
							
						}
			
					}
		
				}
				
				System.out.println(maxCount+" "+numeroMaximoDeDesigualdades+" "+cartelaBoa+" "+ultimaCartela);
				
			
			
			return cartelaBoa;
	}

	private int numeroDeDesigualdades(String cartela, String cartelaBoa) {
		
		count = 0;
		
		for (char c:cartela.toCharArray()) {
		
			if (cartelaBoa.indexOf(c)<0) {
				count++;
			}

			

		}
		return count;
	}
	
private ArrayList<String> removeSorteiosContemplaveisPorCartela(String cartela, ArrayList<String> sorteios) {
		
		sorteiosEncontrados.clear();
		
		it = sorteios.iterator();
		
		   while (it.hasNext()) {
			   
		      s = it.next();
		      
		      if (contem(cartela,s)) {
		    	  
		    	  sorteiosEncontrados.add(s);
		    	  it.remove();
		    	  
		      }
		       
		   }
	
		

		return sorteiosEncontrados;
	
	}

	private ArrayList<String> sorteiosContempladosNasCartelas(String sorteio, ArrayList<String> cartelas) {
	
		sorteiosEncontrados.clear();
	
		for (String cartela:cartelas) {
			
			if (contem(cartela,sorteio)) {
								
				sorteiosEncontrados.add(cartela);
				
			}
		}
	
		return sorteiosEncontrados;

	}


	private ArrayList<String> sorteiosContemplaveisPorCartela(String cartela, ArrayList<String> sorteios) {
		
		sorteiosEncontrados.clear();
	
		for (String sorteio:sorteios) {
			
			if (contem(cartela,sorteio)) {
								
				sorteiosEncontrados.add(sorteio);
				
			}
		}

		return sorteiosEncontrados;
	
	}
	
	private ArrayList<String> sorteiosContemplaveisPorCartela(String cartela) {
		
		combinacoesGeradas.clear();
		
		combinacoes(cartela.toCharArray(), qtdNumerosSorteados, 0, new char[qtdNumerosSorteados]);
		
		

		return combinacoesGeradas;
	
	}
	
	private int numeroMaximoSorteiosContemplados(ArrayList<String> cartelasHelper,
			ArrayList<String> sorteiosHelper) {
	
		count= 0;
		maxCount = 0;
		
		
			for (String cartela:cartelasHelper) {
			
				count = 0;
	
					for (String sorteio:sorteiosHelper) {
	
						if (contem(cartela,sorteio)) {
							
							count++;
							
						}
						
					}
	
				if (count>maxCount) {
					
					maxCount = count;
					
					
				}
	
			}
		
		
		return maxCount;
	}



	
	
	
	



	private boolean contem(String cartela, String sorteio) {
			
			for (char dezenaSorteio:sorteio.toCharArray()) {
				
				/*System.out.println("indice de "+dezenaSorteio+
						" no "+s+" eh: "+cartela.indexOf(dezenaSorteio));*/
				
				if (cartela.indexOf(dezenaSorteio)<0) {
					
					return false;
				}
			}
		
		return true;
	}





	



	private String converteCaracterInteiro(String cartela) {
		
			s = "";
			
			

		    for (char c : cartela.toCharArray()) {
		    	
		    	s += (c - 'a' + 1)+" ";  
		    	
		    }
		        
		
		return s;
	}




	private List<Character> myStringToList(String cartela) {
		
		
		
		/*arrayHelper = pat.split(cartela);
		
		arraysStringHelper = Arrays.asList(arrayHelper);
		
		return arraysStringHelper;*/
		
		listCharHelper.clear();
		
		arrayCharHelper = cartela.toCharArray();
		
		for (char c:arrayCharHelper) {
			listCharHelper.add(c);
		}
		
		return listCharHelper;
	}
	
	

	/*private static String converteArrayIntegerString(Integer[] array) {
		
		helper = "";
		for (int i: array) {
			helper+=i+" ";
		}
		
		return helper;
	} */
	
	private static String converteArrayCharString(char[] array) {
		
		helper = "";
		for (char c: array) {
			helper+=c;
		}
		
		return helper;
	} 

	private char[] gerarSequencia(int start,int end) {
		int quantidade = end-start+1;
		char[] seq = new char[quantidade];
		for (int i=0 ; i<quantidade; i++) {
			seq[i] = getCharForNumber(start);
			
			start++;
		}
		return seq;
	}


	

	private void imprimeArrayList(List<Character> array) {
		
		for(Character c: array) {
			System.out.println(c.charValue());
		}
		
	}

	private void imprimeArrayList(ArrayList<String> array) {
		for(String s: array) {
			System.out.println(s);
		}
	}
	private void imprimeArray(String[] array) {
		for(String s: array) {
			System.out.println(s);
		}
	}

/*


	private void imprimeCollection(FileBasedCollection<String> cartelas) {
		for(String s: cartelas) {
			System.out.println(myStringToList(s));
			
			//System.out.println(s);
		}
		
	}*/

	private char getCharForNumber(int i) {
	    return i > 0 && i < 254 ? (char)(i + 96) : null;
	}


	private void giraCartelas() {
		
		 	s = cartelas.get(0);
  	
    		
    		cartelas.remove(s);
			cartelas.add(s);
		
	}
	
	private void giraCartelas(String primeiraCartelaIdeal) {
		
		while(!cartelas.get(0).equals(primeiraCartelaIdeal)) {
			
			giraCartelas();
			
			
		}
		
		
	}


	
	
	private String cartelaQueContemplaMediaSorteios(ArrayList<String> cartelas,
			ArrayList<String> sorteios) {
		
		
//    	totais.clear();
    	count= 0;
    	secondCount = 0;
    	
    	maxCount = 0;
    	cartelaBoa = "";
    	
    		for (String cartela:cartelas) {
			
				count = 0;

					for (String sorteio:sorteios) {
	
						if (contem(cartela,sorteio)) {
							
							count++;
							
						}
						
					}

//				totais.add(count);

				
				if (count>maxCount) {
					
					secondCount = maxCount;
					maxCount = count;
//					cartelaBoa = cartela;
					
				}else if (count>secondCount) {
					secondCount = count;
				}
				
				if ((secondCount==0)||(count==secondCount)&&(secondCount > maxCount/3)) {
					
					cartelaBoa = cartela;
				}
				

			}
		
		
			/*int count3 = 0;
			
			for (int i: totais) {
				if(i==maxCount) {
					count3++;
				}
				
				
			}*/
//			System.out.print("maxcount: "+maxCount+" qtd: "+count3);
			
//			System.out.println(" ");
			
			
		return cartelaBoa;
	}


	


	/*private void cartelasQueNaoContemplamNenhumaQuadra(ArrayList<Integer[]> cartelas, ArrayList<Integer[]> sorteios) {

    	boolean encontrou = false;
    	int totalEncontrado = 0;
    	int compara = 7;
    	
    	
			
			totalEncontrado = 0;
			for(Integer[] c: cartelas) {
				encontrou = false;
				for(Integer[] s: sorteios) {
					System.out.println(("verdade?"));
					
					if (Arrays.asList(c).containsAll(Arrays.asList(s))) {
						System.out.println(("verdade"));
						encontrou = true;
					}else {
						System.out.println("não contains");
					}
					 
				}
				
				if (!encontrou) {
					
					Integer[] helper = Arrays.copyOf(c,c.length);
					//combinacoesGeradas.add(helper);
				}
			}
			
			
	}*/


	


	


	/*private void combinacoesAcertos(ArrayList<Integer[]> ca, Integer[] sorteio) {
		for (Integer[] h: ca){
			
			if (Arrays.asList(h).contains(sorteio)) {
				
				//Integer[] helper = Arrays.copyOf(result,result.length);
				
				combinacoesAcertadas.add(h);
				
			}
			
		}
		
	}*/


	/*private Integer[] numeroSorteado(int n) {

		Random gerador = new Random();
		int repetido;
		
		Integer[] helper = new Integer[n];
	
		
			for (int i=0;i<helper.length;i++) {
				
				repetido = 2;
				
				while(repetido > 1) {
					repetido = 0;
					helper[i] = gerador.nextInt(10);
					
					
					for (int j=0;j<helper.length;j++) {
						
						if (helper[i] == helper[j]){
							repetido++;
							
						}
					}
					
					
					
				}
				
				
			}
			
		return helper;
	}*/


	/*private void carregaTexto() {
		
		
    	
		for (ArrayList<Integer[]> h:conjuntoMinimoCartelas) {
			texto.append("Este é um conjunto de cartelas infalível: \n\n");
			
			for (Integer[] y: h) {
				texto.append(Arrays.toString(y)+"\n");
			}
			
			
			
		}
		
	}*/
	
	/* private void carregaTextoCartela() {
	    	
	    	texto = new StringBuffer();
	    	
	    	texto.append("Foram geradas "+cartelas.size()+" combinações:\n\n");
	    	
			for (String s:cartelas) {
				
				texto.append(s+"\n");
				System.out.println(s);
			}
			
		}*/
    
   /* private void carregaTextoSorteio() {
    	
    	texto = new StringBuffer();
    	
    	texto.append("Foram geradas "+sorteios.size()+" combinações:\n\n");
    	
		for (String s:sorteios) {
			
			texto.append(s+"\n");
			
		}
		
	}*/


	private BigInteger numeroCombinacoes(int n, int p) {
		
    
		return (factorial(n).divide((factorial(n-p).multiply(factorial(p)))));
	}
    
    public static BigInteger factorial(int n) {
    	
    	if (n == 0) {
    		return BigInteger.valueOf(1);
    	}else{
    		return factorial(n-1).multiply(BigInteger.valueOf(n)) ;
    	}
    	
    	
    }
    
    private void encontraCartelasMagicasBruteForce() {
    	
    	metodo = ("BRUTE FORCE");
 
	   	boolean encontrou = false;
	   	boolean encontrouCartelasMagicas = false;
	   	int totalEncontrado = 0;
	   	
	   		int tamanhoMaximoGrupo = cartelas.size();
	   		int tamanhoGrupo = sorteios.size()/numeroCombinacoes(qtdNumerosDaCartela, qtdNumerosSorteados).intValue();
	   		
	   		System.out.println("tamanhoGrupo: "+tamanhoGrupo);
	   		
	   		
	   		
	   		while ((tamanhoGrupo < tamanhoMaximoGrupo)&&(!encontrouCartelasMagicas)) {
	   			
	   			
	   			int count4 = 0;
	   			count2 = 0;
	   			
	   			combinacoesGeradas.clear();  
	   			
	   			combinacoes(gerarSequencia(1,cartelas.size()), tamanhoGrupo, 0, new char[tamanhoGrupo]);
	   			
	   			System.out.println(("gerei "+combinacoesGeradas.size()+" combinacoes."));
	   		
	   			
				for (String grupoCartelas:combinacoesGeradas) {
					
					/*if (encontrouCartelasMagicas) {
						break;
					}*/
					
					count2++;
					
					totalEncontrado = 0;
					for(String sorteio: sorteios) {
						
						for(char c: grupoCartelas.toCharArray()) {
							
							if (contem(cartelas.get(c - 'a'), sorteio)) {
								totalEncontrado++;
								break;
							}
							
							 
						}
						
						/*if (totalEncontrado == sorteios.size()) {
							
							cartelasMagicas.clear();
							
							for(char c: grupoCartelas.toCharArray()) {
								
								cartelasMagicas.add(cartelas.get(c - 'a'));
							
							}
							
							encontrouCartelasMagicas = true;
							
						}*/
						
											}
					//código para imprimir todos os grupos possiveis de cartelas magicas.
					
					if (totalEncontrado == sorteios.size()) {
						
						
						System.out.println("");
						System.out.println("Cartelas Mágicas "+count4+++":");
						System.out.println("");
						
						for(char c: grupoCartelas.toCharArray()) {
							
							cartelasMagicas.add(cartelas.get(c - 'a'));
							
							System.out.println(converteCaracterInteiro(cartelas.get(c - 'a')));
								
							
						}
						
						System.out.println(" ");
						
						
						encontrouCartelasMagicas = true;
						
					}
					 
				}
				
				System.out.println("Foram comparadas "+count2+" grupos de cartelas de "+tamanhoGrupo+" cartelas cada.");
				
				tamanhoGrupo++;
				
				
	   		}
	   		
	   		System.out.println(" ");
	   		
	   		
	   	
	}
    
    private ArrayList<String> createAndInitializeArrayList(int tamanhoGrupo) {
		 
		ArrayList<String> helper = new ArrayList<String>();
		
		 for (int i=0;i<tamanhoGrupo;i++) {
			 helper.add("");
		 }
		 
		return helper;
	}


	
	
	
	static void combinacoes(char[] sequencia, int tamanhoGrupo, int posicaoInicial, char[] combinacao){
		
		
        if (tamanhoGrupo == 0){
    
        	combinacaoCopia = Arrays.copyOf(combinacao,combinacao.length);
        	
        	
            combinacoesGeradas.add(converteArrayCharString(combinacaoCopia));
           
             
            return;
            
        } 
        
        for (int i = posicaoInicial; i <= sequencia.length-tamanhoGrupo; i++){
        	
        	combinacao[combinacao.length - tamanhoGrupo] = sequencia[i];
            combinacoes(sequencia, tamanhoGrupo-1, i+1, combinacao);
            
        }
    }
    
	
}
