package application;

import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//chamada para o usuário definir o ano desejado 
		System.out.println("Você deseja visualizar os calendários de qual ano?");
		int ano_user = sc.nextInt();
		
		System.out.println("Você visualizar o calendário de qual mês? Digite entre 1 e 12");
		int mes_user = sc.nextInt();
		
		if(mes_user > 12 || mes_user < 1 ) {
			System.out.println("Mês invalido");
			System.exit(0);;
		}
		
		
		//Juntar informações
		DateTimeFormatter separar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dt_user;
		if(mes_user<=9) {
			dt_user = "01/0" + mes_user + "/" + ano_user;
		}
		else {
			dt_user = "01/"+mes_user+"/"+ano_user;
		}
		
		//Definição de quantidade de dias em cada mÊs;
		int dia_mes = 0;
		switch(mes_user) {
		case 1:
			dia_mes = 31;
			break;
			
		case 2:
			dia_mes = 28;
			break;	
			
		case 3:
			dia_mes = 31;
			break;
		
		case 4:
			dia_mes = 30;
			break;	
		
		case 5:
			dia_mes = 31;
			break;	
			
		case 6:
			dia_mes = 30;
			break;	
			
		case 7:
			dia_mes = 31;
			break;	
			
		case 8:
			dia_mes = 31;
			break;	
		
		case 9:
			dia_mes = 30;
			break;
		
		case 10:
			dia_mes = 31;
			break;	
		
		case 11:
			dia_mes = 30;
			break;
		
		case 12:
			dia_mes = 31;
			break;	
		}
		
		//cabeçalho do calendário
		System.out.println("D   S   T   Q   Q   S   S ");
		
		// qual dia da semana cai o primeiro dia do mê
		DayOfWeek dia_semana = DayOfWeek.from(separar.parse(dt_user));
		
		//definição de espaço para dia da semana
		String semana = dia_semana.name();
		
		System.out.println(semana);
		
	}

}
