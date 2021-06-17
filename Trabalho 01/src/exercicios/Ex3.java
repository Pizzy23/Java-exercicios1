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
	private static String entradaI2,entradaI,entradaI1,entradaP,entradaI3,entradaI4;
	static String s,s1,s2,s3;
	static char c,c1,c2,c3;
	
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

				+"\n\n\n"
				+ "95) Pagina 02\r\n"
				+ "99) Saida ", "Seleção Pg 01",JOptionPane.INFORMATION_MESSAGE);
		nump = Integer.parseInt(entradaP);
		System.out.println(nump);
		if(nump == 95) {
			um.put("OptionPane.messageForeground", Color.black);
			entradaP = JOptionPane.showInputDialog(null, 
					"Digite qual de nosso serviços deseja consultar:\n"
					+ "16) Trabalho mensal\r\n" //22
					+ "17) Massa corporia \r\n"
					+ "18) Comissao Salario \r\n" 
					+ "19) Consultar Saldo\r\n"
					+ "20) Estoque \r\n" //26
					+ "21) Maior entre 3 \r\n"
					+ "22) Soma dos 3 maiores \r\n"
					+ "23) Ordem 3  \r\n"
					+ "24) Triangulo \r\n"
					+ "25) Gols de time\r\n"
					+ "26) Maior, igual ou menor\r\n"
					+ "27) \r\n"
					+ "28) \r\n"
					+ "29) \r\n"
					+ "30) \r\n"
					+"\n\n\n"
					+ "0) Pagina principal \r\n"
					+ "96) Pagina 03\r\n"
					+ "99) Saida","Seleção Pg 02",JOptionPane.INFORMATION_MESSAGE);
			nump = Integer.parseInt(entradaP);
			System.out.println(nump);
			
			if(nump == 0) {
				main(null);
			}else if(nump == 99) {
				System.exit(0);
			}else {
				funcao();
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
				JOptionPane.showMessageDialog(null, i1 + " Você não podera votar");
			}else if(i1 >= 18) {
				JOptionPane.showMessageDialog(null, i1 + " Você  podera votar");

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
			}else {
				JOptionPane.showMessageDialog(null, i1 + " é menor");

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
		
		case 17:
		entradaI = JOptionPane.showInputDialog("Digite o seu nome:  ");
		s1 = entradaI;
		entradaI1 = JOptionPane.showInputDialog("Sexo M ou F?"); 
		 c = entradaI1.charAt(0);
		entradaI2 = JOptionPane.showInputDialog("Digite sua altura : EX 1.90 ");
		i1 = Double.parseDouble(entradaI2);
		entradaI3 = JOptionPane.showInputDialog("Digite seu peso: ");
		i2 = Integer.parseInt(entradaI3);
		System.out.println(c);
		if(c == 'M') {
			r = i2/(i1*i1);
			System.out.println(r + " / " + r1);
			JOptionPane.showMessageDialog(null, "Peso ideal " + df.format(r) + " " + s1);
		}else if (c == 'F') {
			r = i2 / (i1*i1);
			System.out.println(r + " / " + r1);
			JOptionPane.showMessageDialog(null, "Peso ideal " + df.format(r) + " " + s1);
		}else {
			JOptionPane.showMessageDialog(null, "Digite um sexo valido...");
			main(null);
		}
		main(null);
		break;
		
		case 18:
			//i1 = i - 40; r1 = i1 * 1.50; r2 = r1 + salario;
		entradaI = JOptionPane.showInputDialog("Digite a Salario fixo:  ");
		i = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite a valor de vendas:  ");
		i1 = Integer.parseInt(entradaI1);
		if(i1 <= 1500) {
			i3 = 1.03; r = i1 * i3;	r1 = r + i;
			System.out.println(i1 + "\n" + r +"\n" + r1 + " <");
			JOptionPane.showMessageDialog(null, r1 + " Seu salario com o valor das vendas");
		}else if(i1 >= 1500) {
			i3 = 1.05; r = i1 * i3;	r1 = r + i;
			System.out.println(i1 + "\n" + r + "\n" + r1 + " >");
			JOptionPane.showMessageDialog(null, r1 + " Seu salario com o valor das vendas");
		}
		main(null);
		break;

		case 19: //25
		entradaI = JOptionPane.showInputDialog("Digite sua conta:  ");
		s = entradaI;
		entradaI1 = JOptionPane.showInputDialog("Digite seu saldo:  ");
		i1 = Integer.parseInt(entradaI1);
		entradaI2 = JOptionPane.showInputDialog("Digite seu debito:  ");
		i2 = Integer.parseInt(entradaI2);
		entradaI3 = JOptionPane.showInputDialog("Digite seu credito:  ");
		i3 = Integer.parseInt(entradaI3);
		r = i1 - i2 + i3;
		if(r >= 0) {
			JOptionPane.showMessageDialog(null, s + " Seu saldo é positivo " + "R$"+ r);
		}else {
			JOptionPane.showMessageDialog(null, s + "Seu saldo negativo" + "R$"+ r);
		}
		
		main(null);
		break;
		
		case 20:
			entradaI = JOptionPane.showInputDialog("Digite quantidade Atual:  ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite quantidade Maxima:  ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite quantidade Mínima:  ");
			i2 = Integer.parseInt(entradaI2);
			r = (i1 - i2)/2;
			if(r >= i) {
				JOptionPane.showMessageDialog(null, "Estoque atual esta suficiente, não devera comprar mais.");
			}else {
				JOptionPane.showMessageDialog(null, "Estoque esta insufieciente efetuar compra.");
			}
		main(null);
		break;
		
		case 21:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 1: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 1:  ");
			i2 = Integer.parseInt(entradaI2);
			r = Math.max(i,i1); r1 = Math.max(r,i2);
			JOptionPane.showMessageDialog(null, r1 +" Esse é o maior valor");
		main(null);
		
		break;
		
		case 22:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 1: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 1:  ");
			i2 = Integer.parseInt(entradaI2);
			r = Math.max(i,i1); r1 = Math.max(r,i2); r2 = r1 + r;
			JOptionPane.showMessageDialog(null, r2 +" Esse é a soma dos maiores valores");
		main(null);
		break;
		
		case 23://30
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 3:  ");
			i2 = Integer.parseInt(entradaI2);
			
			if(i > i1 && i > i2) {
				//System.out.println("a");
			r = Math.max(i,i1); r1 = Math.max(i1,i2); r2 = Math.min(i,i2);
			JOptionPane.showMessageDialog(null, r2 +" , " + r1 + " , " + r);
			}else if(i1 > i && i1 > i2) {
				//System.out.println("b");
				r = Math.min(i,i1); r1 = Math.max(i1,i2); r2 = Math.max(i,i2);
			JOptionPane.showMessageDialog(null, r +" , " + r2 +" , " + r1);
			}else if(i2 > i && i2 > i1) {
				//System.out.println("c");
				r = Math.min(i,i1); r1 = Math.min(i1,i2); r2 = Math.max(i,i2);
			JOptionPane.showMessageDialog(null, r +" , " + r1 + " , " + r2);
			}
		main(null);
		break;
		
		case 24:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 3:  ");
			i2 = Integer.parseInt(entradaI2);
			/*
			if() {
				
			}else if{
				
			}else if{
				
			}*/
		main(null);
		break;
		
		case 25:
			entradaI = JOptionPane.showInputDialog("Digite o nome da equipe 1: ");
			s = entradaI;
			entradaI1 = JOptionPane.showInputDialog("Digite o nome da equipe 2: ");
			s1 = entradaI1;
			entradaI2 = JOptionPane.showInputDialog("Digite o tanto de gols da " + s + ":");
			i = Integer.parseInt(entradaI2);
			entradaI3 = JOptionPane.showInputDialog("Digite o tanto de gols da " + s1 + ":");
			i1 = Integer.parseInt(entradaI3);
			r = Math.max(i,i1); r1 = Math.min(i1, i);
			if(r > r1) {
				JOptionPane.showMessageDialog(null, s + " Foi o vencedor com " + r + " Gols");
			}else if(r1 > r) {
				JOptionPane.showMessageDialog(null, s1 + " Foi o vencedor com " + r1 + " Gols");
			}
		main(null);
		break;
		
		case 26:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			i1 = Integer.parseInt(entradaI1);
			if(i == i1) {
				JOptionPane.showMessageDialog(null, "Ambos são valores iguais");
			}else if(i > i1) {
				JOptionPane.showMessageDialog(null, "Primeiro valor é maior");	
			}else if (i < i1) {
				JOptionPane.showMessageDialog(null, "Segundo valor é maior");	
			}
		main(null);
		break;
		
		case 27:
			entradaI = JOptionPane.showInputDialog("Digite valor X: ");
			i = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor Y: ");
			i1 = Integer.parseInt(entradaI1);
			i2 = (i*i1) + 5;
			if(i2 <= 0) {
				c = 'A';	
			}else if(i2 <= 100) {
				c = 'B';
			}else{
				c = 'C';
			}
			JOptionPane.showMessageDialog(null, i2 + " " + c);
		main(null);
		break;
		
		case 28:

		main(null);
		break;
		
		case 29:

		main(null);
		break;
		
		case 30:

		main(null);
		break;
		default:
			run();
	}
	}

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
