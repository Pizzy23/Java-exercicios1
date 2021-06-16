package exercicios;

import java.util.Scanner;
import java.awt.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class Ex3 {

	static int nump = 99;
	static int mes, ano, dias;
	static double r, r1,r2,r3, total;
	static double i,i1,i2,i3, salario, valor;
	static double brancos, nulos, validos;
	static double brancosR,nulosR, validosR;
	static int horas, minutos, segundos;
    static int nConver;
	private static String entradaI2,entradaI,entradaI1,entradaP;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		UIManager um = new UIManager();
		um.put("OptionPane.messageForeground", Color.black);
		entradaP = JOptionPane.showInputDialog(null, 
				"Digite qual de nosso serviços deseja consultar:\n"
				+ "1) Ano\n"
				+ "2) Salario\n"
				+ "3) Votos\r\n"
				+ "4) Custo de fabrica\r\n"
				+ "5) Revendendor\r\n"
				+ "6) Celsius\r\n"
				+ "7) Media Ponderada\r\n"
				+ "8) Maior 10\r\n"
				+ "9) Positivo ou negativo\r\n"
				+ "10) Maças\r\n"
				+ "11) Media aritmética\r\n"
				+ "12) Votar no ano\r\n"
				+ "13) Maior\r\n"
				+ "14) Ordem crescente\r\n"
				+ "15) Xadrez\r\n"
				+ "16) Trabalho mensal\r\n"
				+"\n\n\n"
				+ "95) Pagina 02\r\n"
				+ "99) Saida ", "Seleção Pg 01",JOptionPane.INFORMATION_MESSAGE);
		nump = Integer.parseInt(entradaP);
		System.out.println(nump);
		if(nump == 98) {
			um.put("OptionPane.messageForeground", Color.black);
			entradaP = JOptionPane.showInputDialog(null, 
					"Digite qual de nosso serviços deseja consultar:\n"
					+ "17) \r\n"
					+ "18) \r\n" 
					+ "19) \r\n"
					+ "20) \r\n"
					+ "21) \r\n"
					+ "22) \r\n"
					+ "23) \r\n"
					+ "24) \r\n"
					+ "25) \r\n"
					+ "0) Pagina anterior \r\n"
					+ "96) Pagina 03\r\n"
					+ "99) Saida","Seleção Pg 02",JOptionPane.INFORMATION_MESSAGE);
			nump = Integer.parseInt(entradaP);
			System.out.println(nump);
			if(nump == 0) {
				main(null);
			}else if(nump == 99) {
				System.exit(0);
			}
		}else if(nump == 99) {
			System.exit(0);
		}else {
			funcao();
		}
	}
		public static void funcao() {
			
		UIManager um = new UIManager();
		um.put("OptionPane.messageForeground", Color.black);
		DecimalFormat df = new DecimalFormat("#.#");
		
		switch(nump){
	    case 1:
		entradaI = JOptionPane.showInputDialog("Digite quantos anos voce tem? ");
		ano = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite quantos meses na sua idade você tem?? ");
		mes = Integer.parseInt(entradaI1);
		entradaI2 = JOptionPane.showInputDialog("Digite quantos dias na sua idade você tem? ");
		dias = Integer.parseInt(entradaI2);
		r = ano * 365;
		r1 = mes * 30;
		r2 = dias + r + r1;
		JOptionPane.showMessageDialog(null,"Você tem "+ r2 + " Dias vivos");
		main(null);
		break;
		
		case 2:
			entradaI = JOptionPane.showInputDialog("Digite seu salario atual: ");
			salario = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite seu reajuste: ");
			i = Integer.parseInt(entradaI1);
			r = salario * (i / 100);
			r1 = salario + r;
			JOptionPane.showMessageDialog(null, r1 + " Esse é seu novo salario");
			main(null);
		break;
		case 3:
			entradaI = JOptionPane.showInputDialog("Digite numero de votos brancos: ");
			brancos  = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite numero de votos nulos: ");
			nulos = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite numero de votos válidos: ");
			validos = Integer.parseInt(entradaI2);
			
			total = brancos + nulos + (validos);
			brancosR = brancos / total * (100);
			nulosR = nulos / total * (100);
			validosR = validos / total * (100);
			JOptionPane.showMessageDialog(null, total + " Numero total de eleitores\n"
					+df.format(brancosR) +"%"+ " Numero de eleitores nulos\n"
					+df.format(nulosR) +"%"+ " Numero de eleitores brancos\n"
					+df.format(validosR) +"%"+ " Numero de eleitores validos\n"
					);
			main(null);
			break;
		case 4:
			i = 28; i2 = 45;
			r1 = 1+(i/100);	
			r2 = 1+(i2/100);
			entradaI = JOptionPane.showInputDialog("Digite o valor do carro: ");
			valor  = Integer.parseInt(entradaI);
			r = r2 * (valor * r1);
			JOptionPane.showMessageDialog(null, r + " Valor total do carro");
			main(null);
			break;
		case 5:
		i3 = 400; // valor fixo carro
		entradaI = JOptionPane.showInputDialog("Digite o valor do salario: ");
		i = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite quantos carros vendeu: ");
		i1 = Integer.parseInt(entradaI1);
		r = i1 * i3; r1 = i + r;
		JOptionPane.showMessageDialog(null, r1 + " Seu salario final");
		main(null);
		break;
		case 6:
			entradaI = JOptionPane.showInputDialog("Digite a temperatura em F: ");
			i = Integer.parseInt(entradaI);
			i1 = (i - 32) / 1.8 ;
			JOptionPane.showMessageDialog(null, i1 + "C° Temperatura em Celsius");
			main(null);
			break;
		case 7:
			entradaI = JOptionPane.showInputDialog("Digite a Nota 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a Nota 2: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite a Nota 3: ");
			i2 = Integer.parseInt(entradaI2);
			r = 2; r1 = 3; r2 = 5; r3 = 10;
			i3 = (i*r)+(i1*r1)+(i1*r2); total = i3 / r3;
			JOptionPane.showMessageDialog(null, total + " Sua media.");
			main(null);
			break;
			
		case 8:
			entradaI = JOptionPane.showInputDialog("Digite seu valor: ");
			i = Integer.parseInt(entradaI);
			if(i > 10) {
				JOptionPane.showMessageDialog(null, "Esse numero é maior que 10.");
				
			}else if(i == 10) {
				JOptionPane.showMessageDialog(null, "Seu numero é 10.");
				
			}else {
				JOptionPane.showMessageDialog(null, "Seu numero é menor que 10.");
	  			}
			main(null);
			break; 
		
		case 9:
			entradaI = JOptionPane.showInputDialog("Digite seu valor: ");
			i = Integer.parseInt(entradaI);
			if(i > 0) {
				JOptionPane.showMessageDialog(null, "Esse numero é positivo.");
			}else if(i < 0) {
				JOptionPane.showMessageDialog(null, "Seu numero é negativo.");
			}else if(i == 0){
				JOptionPane.showMessageDialog(null, "Seu numero é 0.");
			}
			main(null);
		break;
		case 10://16
			entradaI = JOptionPane.showInputDialog("Digite Quantas maçâs: ");
			i = Integer.parseInt(entradaI);
			if(i >= 12) {
				i2 = i * 1;
				JOptionPane.showMessageDialog(null, "O tanto de maças foi "+ i 
						+ " Seu total foi R$"+i2);
			}else if(i < 12) {
				i1 = i * 1.3;
				JOptionPane.showMessageDialog(null, "O tanto de maças foi "+ 
				i+ " Seu total foi R$"+i1);
			}
			main(null);
		break;
		case 11: //media
			entradaI = JOptionPane.showInputDialog("Digite a Nota 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a Nota 2: ");
			i1 = Integer.parseInt(entradaI1);
			i2 = (i + i1);i3 = i2/2;
			JOptionPane.showMessageDialog(null,i3 + " Sua nota");
		main(null);
		break;
		case 12:
			ano = 2021;
			entradaI = JOptionPane.showInputDialog("Digite ano de nascimento: ");
			i = Integer.parseInt(entradaI);
			i1 = 2021 - i; 
			if(i1 <= 18) {
				JOptionPane.showMessageDialog(null, i1 + "Você não podera votar");
			}else if(i1 >= 18) {
				JOptionPane.showMessageDialog(null, i1 + "Você  podera votar");

			}
		main(null);
		break;
		case 13:
			entradaI = JOptionPane.showInputDialog("Digite o primeiro valor:  ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o segundo valor: ");
			i1 = Integer.parseInt(entradaI1);
			if(i > i1) {
				JOptionPane.showMessageDialog(null, i + " é maior que o segundo");
			}
		main(null);
		break;
		case 14:
			entradaI = JOptionPane.showInputDialog("Digite o primeiro valor:  ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o segundo valor: ");
			i1 = Integer.parseInt(entradaI1);
			if(i > i1) {
				JOptionPane.showMessageDialog(null, i1 + " / " + i);
			}else if(i1 > i) {
				JOptionPane.showMessageDialog(null, i + " / " + i1);
			}
		main(null);
		break;		
		case 15:
			entradaI = JOptionPane.showInputDialog("Digite a hora inicial:  ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a hora finalizada: ");
			i1 = Integer.parseInt(entradaI1);
			i2 = i1 - i;
			JOptionPane.showMessageDialog(null, i2 + " foi o tempo decorrido");
		main(null);
		break;
	
		case 16:
			horas = 40;
			entradaI = JOptionPane.showInputDialog("Digite o salario:  ");
			salario = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o tempo de trabalho:  ");
			i = Integer.parseInt(entradaI1);
			//System.out.println(salario + " / "+ i);
			i1 = i - 40; r1 = i1 * 1.50; r2 = r1 + salario;
			//System.out.println(r1 +" / "+ i1);
			if(i > 40) {
			JOptionPane.showMessageDialog(null, r2 + " Esse sera seu salario com horas extras");
			}else {
			JOptionPane.showMessageDialog(null, "Horas extras insufiencientes ");
			}
		main(null);
		break;
		default:
			run();
	}
	}
//r1 = 1+(i/100);



	
	public static void run(){

		
		UIManager um = new UIManager();
		um.put("OptionPane.messageForeground", Color.red);
		Font serifFont = new Font("Serif", Font.BOLD, 12);
			JOptionPane.showMessageDialog(null , "Error\n"
			+ "Coloque um numero valido. . . .",  "Error", JOptionPane.INFORMATION_MESSAGE);
			main(null);
		}
	}


/*
		case :

		main(null);
		break;
 */
