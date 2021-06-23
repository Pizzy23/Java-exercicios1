package exercicios;

import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;
import java.text.DecimalFormat;

import javax.swing.*;


public class Ex3 {

	static int nump = 99;
	static int mes, ano, dias;
	static double r, r1,r2,r3,r4,r5,r6, total;
	static double d,d1,d2,d3, salario, valor;
	static int i,i1,i2,i3, o,o1,o2,o3;
	static double brancos, nulos, validos;
	static double brancosR,nulosR, validosR;
	static int horas, minutos, segundos;
    static int nConver;
	private static String entradaI2,entradaI,entradaI1,entradaP,entradaI3,entradaI4;
	static String s,s1,s2,s3;
	static char c,c1,c2,c3;
	static boolean timer = false;
	static int a[],a1[];
	


	public static void main(String[] args) throws InterruptedException {
		Scanner in = new Scanner(System.in);
		UIManager um = new UIManager();
		UIManager.put("OptionPane.messageForeground", Color.black);
		
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
			UIManager.put("OptionPane.messageForeground", Color.black);
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
					+ "25) Gols de time \r\n"
					+ "26) Maior, igual ou menor \r\n"
					+ "27) A, B, C \r\n"
					+ "28) Posto de gasolina \r\n"
					+ "29) Homem e mulher \r\n"
					+ "30) Kg de frutas \r\n"
					+"\n\n\n"
					+ "0) Pagina principal \r\n"
					+ "96) Pagina 03\r\n"
					+ "99) Saida","Seleção Pg 02",JOptionPane.INFORMATION_MESSAGE);
			nump = Integer.parseInt(entradaP);
			System.out.println(nump);
			}
				
		if(nump == 96) {
				UIManager.put("OptionPane.messageForeground", Color.black);
				entradaP = JOptionPane.showInputDialog(null, 
						"Digite qual de nosso serviços deseja consultar:\n"
						+ "31) Verificação de usuario. \r\n" //38
						+ "32) Preço unitario.\r\n"
						+ "33) Media de aproveitamento \r\n" 
						+ "34) Aposentaria \r\n"
						+ "35) Triangulos... \r\n" 
						+ "36) Divisão For \r\n"
						+ "37) Divisão While \r\n"
						+ "38) Duas Avaliações \r\n"
						+ "39) Crescente 1 a 10 \r\n"
						+ "40) Decrescente 1 a 10 \r\n"//51
						+ "41)  \r\n"
						+ "42)  \r\n"
						+ "43)  \r\n"
						+ "44)  \r\n"
						+ "45)  \r\n"
						+"\n\n\n"
						+ "0) Pagina principal \r\n"
						+ "97) Pagina 04\r\n"
						+ "99) Saida","Seleção Pg 03",JOptionPane.INFORMATION_MESSAGE);
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


	
	public static void funcao() throws InterruptedException {
			

		UIManager.put("OptionPane.messageForeground", Color.black);
		DecimalFormat df = new DecimalFormat("#.#");
		int[] a = new int[20];
		
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
			d = Integer.parseInt(entradaI1);
			r = salario * (d / 100);
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
			d = 28; d2 = 45;
			r1 = 1+(d/100);	
			r2 = 1+(d2/100);
			entradaI = JOptionPane.showInputDialog("Digite o valor do carro: ");
			valor  = Integer.parseInt(entradaI);
			r = r2 * (valor * r1);
			JOptionPane.showMessageDialog(null, r + " Valor total do carro");
			main(null);
			break;
		case 5:
		d3 = 400; // valor fixo carro
		entradaI = JOptionPane.showInputDialog("Digite o valor do salario: ");
		d = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite quantos carros vendeu: ");
		d1 = Integer.parseInt(entradaI1);
		r = d1 * d3; r1 = d + r;
		JOptionPane.showMessageDialog(null, r1 + " Seu salario final");
		main(null);
		break;
		case 6:
			entradaI = JOptionPane.showInputDialog("Digite a temperatura em F: ");
			d = Integer.parseInt(entradaI);
			d1 = (d - 32) / 1.8 ;
			JOptionPane.showMessageDialog(null, d1 + "C° Temperatura em Celsius");
			main(null);
			break;
		case 7:
			entradaI = JOptionPane.showInputDialog("Digite a Nota 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a Nota 2: ");
			d1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite a Nota 3: ");
			d2 = Integer.parseInt(entradaI2);
			r = 2; r1 = 3; r2 = 5; r3 = 10;
			d3 = (d*r)+(d1*r1)+(d1*r2); total = d3 / r3;
			JOptionPane.showMessageDialog(null, total + " Sua media.");
			main(null);
			break;
			
		case 8:
			entradaI = JOptionPane.showInputDialog("Digite seu valor: ");
			d = Integer.parseInt(entradaI);
			if(d > 10) {
				JOptionPane.showMessageDialog(null, "Esse numero é maior que 10.");
				
			}else if(d == 10) {
				JOptionPane.showMessageDialog(null, "Seu numero é 10.");
				
			}else {
				JOptionPane.showMessageDialog(null, "Seu numero é menor que 10.");
	  			}
			main(null);
			break; 
		
		case 9:
			entradaI = JOptionPane.showInputDialog("Digite seu valor: ");
			d = Integer.parseInt(entradaI);
			if(d > 0) {
				JOptionPane.showMessageDialog(null, "Esse numero é positivo.");
			}else if(d < 0) {
				JOptionPane.showMessageDialog(null, "Seu numero é negativo.");
			}else if(d == 0){
				JOptionPane.showMessageDialog(null, "Seu numero é 0.");
			}
			main(null);
		break;
		case 10://16
			entradaI = JOptionPane.showInputDialog("Digite Quantas maçâs: ");
			d = Integer.parseInt(entradaI);
			if(d >= 12) {
				d2 = d * 1;
				JOptionPane.showMessageDialog(null, "O tanto de maças foi "+ d 
						+ " Seu total foi R$"+d2);
			}else if(d < 12) {
				d1 = d * 1.3;
				JOptionPane.showMessageDialog(null, "O tanto de maças foi "+ 
				d+ " Seu total foi R$"+d1);
			}
			main(null);
		break;
		case 11: //media
			entradaI = JOptionPane.showInputDialog("Digite a Nota 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a Nota 2: ");
			d1 = Integer.parseInt(entradaI1);
			d2 = (d + d1);d3 = d2/2;
			JOptionPane.showMessageDialog(null,d3 + " Sua nota");
		main(null);
		break;
		case 12:
			ano = 2021;
			entradaI = JOptionPane.showInputDialog("Digite ano de nascimento: ");
			d = Integer.parseInt(entradaI);
			d1 = 2021 - d; 
			if(d1 <= 18) {
				JOptionPane.showMessageDialog(null, d1 + " Você não podera votar");
			}else if(d1 >= 18) {
				JOptionPane.showMessageDialog(null, d1 + " Você  podera votar");

			}
		main(null);
		break;
		case 13:
			entradaI = JOptionPane.showInputDialog("Digite o primeiro valor:  ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o segundo valor: ");
			d1 = Integer.parseInt(entradaI1);
			if(d > d1) {
				JOptionPane.showMessageDialog(null, d + " é maior que o segundo");
			}else {
				JOptionPane.showMessageDialog(null, d1 + " é menor");

			}
		main(null);
		break;
		case 14:
			entradaI = JOptionPane.showInputDialog("Digite o primeiro valor:  ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o segundo valor: ");
			d1 = Integer.parseInt(entradaI1);
			if(d > d1) {
				JOptionPane.showMessageDialog(null, d1 + " / " + d);
			}else if(d1 > d) {
				JOptionPane.showMessageDialog(null, d + " / " + d1);
			}
		main(null);
		break;		
		case 15:
			entradaI = JOptionPane.showInputDialog("Digite a hora inicial:  ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a hora finalizada: ");
			d1 = Integer.parseInt(entradaI1);
			d2 = d1 - d;
			JOptionPane.showMessageDialog(null, d2 + " foi o tempo decorrido");
		main(null);
		break;
	
		case 16:
			horas = 40;
			entradaI = JOptionPane.showInputDialog("Digite o salario:  ");
			salario = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite o tempo de trabalho:  ");
			d = Integer.parseInt(entradaI1);
			//System.out.println(salario + " / "+ i);
			d1 = d - 40; r1 = d1 * 1.50; r2 = r1 + salario;
			//System.out.println(r1 +" / "+ i1);
			if(d > 40) {
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
		d1 = Double.parseDouble(entradaI2);
		entradaI3 = JOptionPane.showInputDialog("Digite seu peso: ");
		d2 = Integer.parseInt(entradaI3);
		System.out.println(c);
		if(c == 'M') {
			r = d2/(d1*d1);
			System.out.println(r + " / " + r1);
			JOptionPane.showMessageDialog(null, "Peso ideal " + df.format(r) + " " + s1);
		}else if (c == 'F') {
			r = d2 / (d1*d1);
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
		d = Integer.parseInt(entradaI);
		entradaI1 = JOptionPane.showInputDialog("Digite a valor de vendas:  ");
		d1 = Integer.parseInt(entradaI1);
		if(d1 <= 1500) {
			d3 = 1.03; r = d1 * d3;	r1 = r + d;
			System.out.println(d1 + "\n" + r +"\n" + r1 + " <");
			JOptionPane.showMessageDialog(null, r1 + " Seu salario com o valor das vendas");
		}else if(d1 >= 1500) {
			d3 = 1.05; r = d1 * d3;	r1 = r + d;
			System.out.println(d1 + "\n" + r + "\n" + r1 + " >");
			JOptionPane.showMessageDialog(null, r1 + " Seu salario com o valor das vendas");
		}
		main(null);
		break;

		case 19: //25
		entradaI = JOptionPane.showInputDialog("Digite sua conta:  ");
		s = entradaI;
		entradaI1 = JOptionPane.showInputDialog("Digite seu saldo:  ");
		d1 = Integer.parseInt(entradaI1);
		entradaI2 = JOptionPane.showInputDialog("Digite seu debito:  ");
		d2 = Integer.parseInt(entradaI2);
		entradaI3 = JOptionPane.showInputDialog("Digite seu credito:  ");
		d3 = Integer.parseInt(entradaI3);
		r = d1 - d2 + d3;
		if(r >= 0) {
			JOptionPane.showMessageDialog(null, s + " Seu saldo é positivo " + "R$"+ r);
		}else {
			JOptionPane.showMessageDialog(null, s + "Seu saldo negativo" + "R$"+ r);
		}
		
		main(null);
		break;
		
		case 20:
			entradaI = JOptionPane.showInputDialog("Digite quantidade Atual:  ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite quantidade Maxima:  ");
			d1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite quantidade Mínima:  ");
			d2 = Integer.parseInt(entradaI2);
			r = (d1 - d2)/2;
			if(r >= d) {
				JOptionPane.showMessageDialog(null, "Estoque atual esta suficiente, não devera comprar mais.");
			}else {
				JOptionPane.showMessageDialog(null, "Estoque esta insufieciente efetuar compra.");
			}
		main(null);
		break;
		
		case 21:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 1: ");
			d1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 1:  ");
			d2 = Integer.parseInt(entradaI2);
			r = Math.max(d,d1); r1 = Math.max(r,d2);
			JOptionPane.showMessageDialog(null, r1 +" Esse é o maior valor");
		main(null);
		
		break;
		
		case 22:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 1: ");
			d1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 1:  ");
			d2 = Integer.parseInt(entradaI2);
			r = Math.max(d,d1); r1 = Math.max(r,d2); r2 = r1 + r;
			JOptionPane.showMessageDialog(null, r2 +" Esse é a soma dos maiores valores");
		main(null);
		break;
		
		case 23://30
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite valor 3:  ");
			d2 = Integer.parseInt(entradaI2);
			
			if(d > d1 && d > d2) {
				//System.out.println("a");
			r = Math.max(d,d1); r1 = Math.max(d1,d2); r2 = Math.min(d,d2);
			JOptionPane.showMessageDialog(null, r2 +" , " + r1 + " , " + r);
			}else if(d1 > d && d1 > d2) {
				//System.out.println("b");
				r = Math.min(d,d1); r1 = Math.max(d1,d2); r2 = Math.max(d,d2);
			JOptionPane.showMessageDialog(null, r +" , " + r2 +" , " + r1);
			}else if(d2 > d && d2 > d1) {
				//System.out.println("c");
				r = Math.min(d,d1); r1 = Math.min(d1,d2); r2 = Math.max(d,d2);
			JOptionPane.showMessageDialog(null, r +" , " + r1 + " , " + r2);
			}
		main(null);
		break;
		
		case 24:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);//A
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);//B
			entradaI2 = JOptionPane.showInputDialog("Digite valor 3:  ");
			d2 = Integer.parseInt(entradaI2);//C
			r = d + d1;	r2 = d1 + d2; r1 = d + d2;
			if(d < r2) {// A > BC
			if(d1 < r1) {// B > AC
			if(d2 < r) {// C > AB
			JOptionPane.showMessageDialog(null, "Pode ser um triangulo");
			}}}else {
				JOptionPane.showMessageDialog(null, "Não pode ser um triangulo");
			}
		main(null);
		break;
		
		case 25:
			entradaI = JOptionPane.showInputDialog("Digite o nome da equipe 1: ");
			s = entradaI;
			entradaI1 = JOptionPane.showInputDialog("Digite o nome da equipe 2: ");
			s1 = entradaI1;
			entradaI2 = JOptionPane.showInputDialog("Digite o tanto de gols da " + s + ":");
			d = Integer.parseInt(entradaI2);
			entradaI3 = JOptionPane.showInputDialog("Digite o tanto de gols da " + s1 + ":");
			d1 = Integer.parseInt(entradaI3);
			r = Math.max(d,d1); r1 = Math.min(d1, d);
			if(r > r1) {
				JOptionPane.showMessageDialog(null, s + " Foi o vencedor com " + r + " Gols");
			}else if(r1 > r) {
				JOptionPane.showMessageDialog(null, s1 + " Foi o vencedor com " + r1 + " Gols");
			}
		main(null);
		break;
		
		case 26:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);
			if(d == d1) {
				JOptionPane.showMessageDialog(null, "Ambos são valores iguais");
			}else if(d > d1) {
				JOptionPane.showMessageDialog(null, "Primeiro valor é maior");	
			}else if (d < d1) {
				JOptionPane.showMessageDialog(null, "Segundo valor é maior");	
			}
		main(null);
		break;
		
		case 27:
			entradaI = JOptionPane.showInputDialog("Digite valor X: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor Y: ");
			d1 = Integer.parseInt(entradaI1);
			d2 = (d*d1) + 5;
			if(d2 <= 0) {
				c = 'A';	
			}else if(d2 <= 100) {
				c = 'B';
			}else{
				c = 'C';
			}
			JOptionPane.showMessageDialog(null, d2 + " " + c);
		main(null);
		break;
		
		case 28://35
			entradaI = JOptionPane.showInputDialog("Digite qual o tipo de combustivel\n"
					+ "Sendo 'A' álcool e 'G' Gasolina:");
			c = entradaI.charAt(0);
			entradaI1 = JOptionPane.showInputDialog("Digite o tanto de litros de "+ c + " :");
			d = Integer.parseInt(entradaI1);
			if(c == 'G') {
				if(d > 20) {
					d2 = 0.06; d3 = 3.30; 
					r = d * d3; r1 = r * d2; r2 = r - r1;
					//System.out.println(i2 + " " + i3 + " "+ r +" " + r1 +" " + i2+" " + r2);
					JOptionPane.showMessageDialog(null, df.format(r2) + " Esse seria o tanto de litros em reias");
				}else if (d <= 20) {
					d2 = 0.04; d3 = 3.30; 
					r = d * d3; r1 = r * d2; r2 = r - r1;
					//System.out.println(i2 + " " + i3 + " "+ r +" "+ r1 +" " + i2+" " + r2);
					JOptionPane.showMessageDialog(null, df.format(r2) + " Esse seria o tanto de litros em reias");
				}
				
			}else if(c == 'A') {
				if(d > 20) {
					d2 = 0.05; d3 = 2.90; 
					r = d * d3; r1 = r * d2; r2 = r - r1;
					JOptionPane.showMessageDialog(null, df.format(r2) + " Esse seria o tanto de litros em reias");
				}else if(d <= 20) {
					d2 = -.03; d3 = 2.90; 
					r = d * d3; r1 = r * d2; r2 = r - r1;
					JOptionPane.showMessageDialog(null, df.format(r2) + " Esse seria o tanto de litros em reias");
				}
			}
		main(null);
		break;
		
		case 29:
			entradaI = JOptionPane.showInputDialog("Digite a idade da homem 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite a idade da homem 2: ");
			d1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite a idade da mulher 1: ");
			d2 = Integer.parseInt(entradaI2);
			entradaI3 = JOptionPane.showInputDialog("Digite a idade da mulher 2: ");
			d3 = Integer.parseInt(entradaI3);
			r = Math.max(d,d1); r1 = Math.min(d2,d3); r2 = r1 + r;
			r3 = Math.min(d,d1); r4 = Math.max(d2, d3); r5 = r3 + r4;
			JOptionPane.showMessageDialog(null, r5 + " Soma das idades Homem mais novo com a mulher mais velha\n" 
			+ r2 + "Soma das idades Homem mais velho com a mulher mais nova\n");		
		main(null);
		break;
		
		case 30://37
			entradaI2 = JOptionPane.showInputDialog("Digite se gostaria de morangos ou maças\n"
					+ "'M' maças, 'O' Morangos ");
			c = entradaI2.charAt(0);
			if(c == 'M') {
				entradaI = JOptionPane.showInputDialog("Digite Kg maças: ");
				d = Integer.parseInt(entradaI);
			if(d <= 5) {
			    d3 = 1.80; r = d * d3;
			    System.out.println("<= maças");
			    JOptionPane.showMessageDialog(null, r + " Total a pagar pelas maças");
			}else if (d > 5) {
				 d3 = 1.50; r = d * d3;
				 System.out.println("> maças " + r);
			} 
			}else if(c == 'O') {
				entradaI = JOptionPane.showInputDialog("Digite Kg morangos: ");
				d1 = Integer.parseInt(entradaI1);
			if(d1 <= 5) {
				d3 = 2.50; r = d * d3;
				JOptionPane.showMessageDialog(null, r + " Total a pagar pelos os morangos");
			}else if (d1 > 5) {
				d3 = 2.20; r = d * d3;

			}
			}	
			if (d > 8 || r >= 25.00) {
				d2 = 0.10; r1 = r * d2; r2 =  d2 - r1 ;
				JOptionPane.showMessageDialog(null, r2 + " Total a pagar pelas maças");
			}else if(d1 > 8 || r >= 25.00) {
				d2 = 0.10;  r1 = r * d2; r2 =  d2 - r1 ;
				JOptionPane.showMessageDialog(null, r2 + " Total a pagar pelas morangos");
			}
		main(null);
		break;
		case 31:
			entradaI = JOptionPane.showInputDialog("Digite a senha do administrador: ");
			d = Integer.parseInt(entradaI);
			if(9999 != d) {
				UIManager.put("OptionPane.messageForeground", Color.red);
				JOptionPane.showMessageDialog(null, "Usuario incorreto"
						,"Alerta", JOptionPane.ERROR_MESSAGE);
			}else if(9999 == d) {
				JOptionPane.showMessageDialog(null, "Bem-vindo Admin");
			}
		main(null);
		break;
		case 32://40
			entradaI = JOptionPane.showInputDialog("Digite o nome do produto: ");
			s = entradaI;
			entradaI1 = JOptionPane.showInputDialog("Digite quantos adquiridos: ");
			d = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite o preço unitario: ");
			d1 = Integer.parseInt(entradaI2);
			r =d*d1;
			if(d <= 5) {
				d2 = 0.02; r1 = d2 * r; r2 =  r - r1 ;
				System.out.println(r1 +" "+ r2 +" "+ d2+" "+ r);
				JOptionPane.showMessageDialog(null, "O preço total é de " + r2 + " De " + s 
						+ " E foi adquiridos " + d);
			}else if(d > 5 && d <= 10) {
				d2 = 0.03; r1 = d2 * r; r2 =  r - r1 ;
				JOptionPane.showMessageDialog(null, "O preço total é de " + r2 + " De " + s 
						+ " E foi adquiridos " + d);
			}else if (d > 10) {
				d2 = 0.05; r1 = d2 * r; r2 =  r - r1;
				JOptionPane.showMessageDialog(null, "O preço total é de " + r2 + " De " + s 
						+ " E foi adquiridos " + d);
			}

			
		main(null);
		break;
		case 33:
			entradaI = JOptionPane.showInputDialog("Digite Nota 1 : ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite Nota 2: ");
			d1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite Nota 3: ");
			d2 = Integer.parseInt(entradaI2);
			r = (d + (d1*2)+(d2*3)); r1 = (d+d1+d2); r3 = r1 / 3;
			r4 = r + r3; r2 = r4/7;
			if(r >= 9.0) {
				JOptionPane.showMessageDialog(null,"Conceito A");
			}else if(r >= 7.5 && r< 9) {
				JOptionPane.showMessageDialog(null,"Conceito B");
			}else if(r >= 6 && r < 7.5) {
				JOptionPane.showMessageDialog(null,"Conceito C");
			}else if(r < 6) {
				JOptionPane.showMessageDialog(null,"Conceito D");
			}
		main(null);
		break;
		case 34:
			entradaI = JOptionPane.showInputDialog("Digite seu id : ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite sua idade: ");
			d1 = Integer.parseInt(entradaI1);
			entradaI2 = JOptionPane.showInputDialog("Digite seu tempo trabalhado: ");
			d2 = Integer.parseInt(entradaI2);
			if(d1 >= 65) {
				JOptionPane.showMessageDialog(null,"Pode se aposentar " + d + " \nIdade 	"
						+d1 +" \nTempo trabalhado " + d2 );
			}else if(d2 >= 30) {
				JOptionPane.showMessageDialog(null,"Pode se aposentar " + d + " \nIdade "
						+d1 +" \nTempo trabalhado " + d2 );
			}else if(d1 >= 60 && d2 >= 25) {
				JOptionPane.showMessageDialog(null,"Pode se aposentar " + d + " \nIdade "
						+d1 +" \nTempo trabalhado " + d2 );
				}else {
				JOptionPane.showMessageDialog(null,"Não pode se aposentar " + d);
			}
		main(null);
		break;
		case 35://43
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);//A
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);//B
			entradaI2 = JOptionPane.showInputDialog("Digite valor 3:  ");
			d2 = Integer.parseInt(entradaI2);//C
			r = d + d1;	r2 = d1 + d2; r1 = d + d2;
			if(d < r2 && d2 < r && d1 < r1) {// A > BC // B > AC // C > AB
			if(d == d1 && d1 == d2) {
			System.out.println("A");
			JOptionPane.showMessageDialog(null, "Pode ser um Triângulo Equilátero");
			}else if(d == d1 || d1 == d2 || d3 == d){
				System.out.println("B");
				JOptionPane.showMessageDialog(null, "Pode ser um Triângulo Isósceles ");
			}else{
				System.out.println("C");
				JOptionPane.showMessageDialog(null, "Pode ser um Triângulo Escaleno ");}
			}else{
			JOptionPane.showMessageDialog(null, "Não pode ser um Triângulo ");
			System.out.println("E");
			}
			
		main(null);
		break;
		case 36:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);
			if(d1 == 0) {
			for(d2 = 0;d2 == 0; d2++) {
			d2--;
			JOptionPane.showMessageDialog(null,"Digite um valor valido",
					"Error",JOptionPane.ERROR_MESSAGE, null );
			System.out.println(d1);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);
			if(d1 != 0) { break;}}}
			if(d1 != 0) {
			r = d/d1;
			JOptionPane.showMessageDialog(null,r + " " + "Sua divisao");
			}
		main(null);
		break;
		case 37:
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);
			if(d1 == 0) {
				d2 = 0;
			while(d2 == 0) {
		    d2++;d2--;
			JOptionPane.showMessageDialog(null,"Digite um valor valido",
					"Error",JOptionPane.ERROR_MESSAGE, null );
			System.out.println(d1);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);
			if(d1 != 0) { break;}}}
			if(d1 != 0) {
			r = d/d1;
			JOptionPane.showMessageDialog(null,r + " " + "Sua divisao");
			}	
		main(null);
		break;
		case 38: //48
			for(i = 1;i > 0; i++) {System.out.println(i);
			if(i > 2) {
			entradaI2 = JOptionPane.showInputDialog("Deseja continuar? S/N");
			c = entradaI2.charAt(0);
			if(c =='S') {
				i = 0;	continue;
			}else if(c == 'N') {break;}}
			JOptionPane.showMessageDialog(null,"Digite as notas da :"+ i +"°");
			entradaI = JOptionPane.showInputDialog("Digite valor 1: ");
			d = Integer.parseInt(entradaI);
			entradaI1 = JOptionPane.showInputDialog("Digite valor 2: ");
			d1 = Integer.parseInt(entradaI1);
			if(d1 < 0 || d1 > 10) {
			i--;
			JOptionPane.showMessageDialog(null, "Digite um valor valido");
			continue;
			}if(d1 >= 0 || d1 <= 11 ) {
				r = (d + d1)/2;	
				JOptionPane.showMessageDialog(null, "Sua media foi " + r);continue;}
			}
		main(null);
		break;
		
		
		case 39:

	      		for(d2= 0;d2 > -1; d2++) {
			    Thread.sleep(1000);
			    System.out.println(d2);
				if(d2 >= 2) {
					break;
				}}
		main(null);
		break;
		case 40: //51	
			for(d2 = 10;d2 >= 0; d2--) {
			    Thread.sleep(1000);
			    System.out.println(d2);
				if(d2 <= 1) {
					break;
					}}
		main(null);
		break;
		case 41:
			for(d2 = 100;d2 >= 0; d2++) {
			    Thread.sleep(1000);
			    System.out.println(d2);
				if(d2 >= 110) {
					break;
					}}
		main(null);
		break;
		case 42:
			for(d2 = 1;d2 >= 0; d2++) {
			    Thread.sleep(1000);
			    System.out.println(d2);
				if(d2 >= 110) {
					break;
					}}

		main(null);
		break;
		case 43:
			entradaI = JOptionPane.showInputDialog("Digite o tempo: ");
			d = Integer.parseInt(entradaI);
			if(d <= 0) {
				for(d2 = 1;d2 >= -1; d2++) {
				entradaI = JOptionPane.showInputDialog("Digite o tempo maior que 0...: ");
				d = Integer.parseInt(entradaI);
					if(d > 0) {break;}}} 
			 if (d > 0 ) {
			for(d2 = 1;d2 >= -1; d2++) {
			    Thread.sleep(10);
			    System.out.println(d2);
				if(d2 >= d) {
					break;
					}}}
		main(null);
		break;
		case 44:
			entradaI = JOptionPane.showInputDialog("Digite o numero da tabuada que deseja consultar: ");
			d = Integer.parseInt(entradaI);
			if(d <= 0 ) {
				for(d2 = 1;d2 >= -1; d2++) {
				entradaI = JOptionPane.showInputDialog("Digite um numero inteiro e positivo...: ");
				d = Integer.parseInt(entradaI);
				if(d > 0) {break;}}} 
			if(d > 0 ) {
			for(d2 = 1;d2 >= -1; d2++) {
			    Thread.sleep(10);
			    r = d2 * d;
			    System.out.println(d2 +" * " + d +" = "+ r);
				if(d2 >= 10) {
					break;
					}}}
		main(null);
		break;
		
		case 45://59
		for(o1 = 0;o1 >= -1; o1++) {
		entradaI = JOptionPane.showInputDialog("Digite os que deseja confirir: ");
		o = Integer.parseInt(entradaI);
		System.out.println(o1);
		if(o < 0) {
		i++;
		a[o1] = o;
		}else if(o > 0) {
			continue;}
		if(o1 >= 10) {
			break;}}
		JOptionPane.showMessageDialog(null,"O tanto de numero negativos foi: "+i );
		System.out.println(Arrays.toString(a));
				
		main(null);
		break;
		case 46://60
			for(o1 = 0;o1 >= -1; o1++) {
				entradaI = JOptionPane.showInputDialog("Digite os que deseja confirir: ");
				o = Integer.parseInt(entradaI);
				//System.out.println(o1);
				if(o >= 10 && o <= 20) {
				i++;
				a[o1] = o;
				}else if(o < 10 && o > 20) {continue;}
				if(o1 >= 10) {break;}}
				JOptionPane.showMessageDialog(null,"O tanto de numero entre 10 e 20 foi: "+i );
				//System.out.println(Arrays.toString(a));
		main(null);
		break;
		case 47://61
			for(o1 = 1;o1 >= -1; o1++) {
			entradaI1 = JOptionPane.showInputDialog("Digite quantos valores que deseja ver a media: ");
			i = Integer.parseInt(entradaI1);
			if(i > 15) {
				entradaI1 = JOptionPane.showInputDialog("Digite um numero menor que 15...: ");
				i = Integer.parseInt(entradaI1);
			}else if(i <= 15) {break;}}
			a[1] = 2; total = 0;
			for(o1 = 1;o1 >= -1; o1++) {
				entradaI = JOptionPane.showInputDialog("Digite os valores que deseja da sua media: ");
				o = Integer.parseInt(entradaI);
				if(o <= 10 && o > -1) {
				a[o1] = o;
				total += o;
				System.out.println(total);}
				else if(o >= 10 && o < -1) {
					o1--;
					continue;}
				if(o1 >= i) {break;}}
			//System.out.println(total + "  " + i);
				r = total/i;
				JOptionPane.showMessageDialog(null,"Sua media foi de " + r);
				//System.out.println(Arrays.toString(a));
		main(null);
		break;
		case 48:
			entradaI = JOptionPane.showInputDialog("Digite o numero de alunos: ");
			i = Integer.parseInt(entradaI);
			entradaI2 = JOptionPane.showInputDialog("Digite o numero de notas: ");
			i2 = Integer.parseInt(entradaI2);
			if(i >= i3) {
			for(o3 = 0;o3 >= -1; o3++) {	
			for(o1 = 1;o1 >= -1; o1++) {
			entradaI1 = JOptionPane.showInputDialog("Digite as notas: ");
			o = Integer.parseInt(entradaI1);
			if(o <= 10 && o > -1) {
			total += o;
			System.out.println(total);}
			else if(o >= 10 && o < -1) {
				o1--;
				continue;}
				if(o1 >= i2) {break;}
				i3++;
			}
			r = total/i2;
			o3++;
			JOptionPane.showMessageDialog(null,"Sua media foi do aluno "+ o3
					+ " a media foi " + r);total = 0;
			if(o3 >= i) {break;}}}
		
		main(null);
		break;
		case 49:
				entradaI1 = JOptionPane.showInputDialog("Digite quantos valores que deseja somar: ");
				i = Integer.parseInt(entradaI1);
				total = 0;
				for(o1 = 1;o1 >= -1; o1++) {
				entradaI = JOptionPane.showInputDialog("Digite os valores que deseja somar: ");
				o = Integer.parseInt(entradaI);
				total += o;
				//System.out.println(total);
				if(o1 >= i) {break;}
				//System.out.println(total + "  " + o);
				}
				JOptionPane.showMessageDialog(null,"Sua soma total foi de  " + total);

		main(null);
		break;
		case 50:
			entradaI1 = JOptionPane.showInputDialog("Digite quantos valores que deseja somar: ");
			i = Integer.parseInt(entradaI1);
			total = 0;
			for(o1 = 1;o1 >= -1; o1++) {
			entradaI = JOptionPane.showInputDialog("Digite os valores que deseja somar: ");
			o = Integer.parseInt(entradaI);
			if(o <= 40) {
			total += o;}
			//System.out.println(total);
			if(o1 >= i) {break;}
			//System.out.println(total + "  " + o);
			}
			JOptionPane.showMessageDialog(null,"Sua soma total foi de  " + total);
		main(null);
		break;
		case 51:
			entradaI1 = JOptionPane.showInputDialog("Digite o primeiro valor : ");
			i = Integer.parseInt(entradaI1);
			total = 0;
			entradaI1 = JOptionPane.showInputDialog("Digite segundo valor: ");
			i1 = Integer.parseInt(entradaI1);total = 0;
			if(i1 < i) {
				System.out.println(i1);
				for(o2 = 0;o2 >= -1; o2++) {
				entradaI1 = JOptionPane.showInputDialog("Digite o segundo valor maior que o primeiro...: ");
				i1 = Integer.parseInt(entradaI1);	
				if(i1 > i) {break;
				}else {continue;}}}
			System.out.println(i1);
			for(o1 = 1 ;o1 >= -1; o1++) {
			o3 = i;
			o3++;
			total += o3;
			System.out.println(total);
			if(o1 >= i1) {break;}
			//System.out.println(total + "  " + o);
			}
			JOptionPane.showMessageDialog(null,"Sua soma total foi de  " + total);
		main(null);
		break;
		case 52:

		main(null);
		break;
		case 53:

		main(null);
		break;
		case 54:

		main(null);
		break;
		case 55:

		main(null);
		break;
		case 56:

		main(null);
		break;
		case 57:

		main(null);
		break;
		case 58:

		main(null);
		break;
		case 59:

		main(null);
		break;
		case 60	:

		main(null);
		break;
		
		default:
			run();
	}
	}

	public static void run() throws InterruptedException{

		
		UIManager um = new UIManager();
		UIManager.put("OptionPane.messageForeground", Color.red);
		Font serifFont = new Font("Serif", Font.BOLD, 12);
			JOptionPane.showMessageDialog(null , "Error\n"
					+ "Error\n"+ "Error\n"+ "Error\n"
			+ "Coloque um numero valido. . . .",  "Error", JOptionPane.ERROR_MESSAGE);
			main(null);
		}
	
}




/*
		case :

		main(null);
		break;
 */