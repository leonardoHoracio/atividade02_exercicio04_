/*
 * Criar uma aplicação em Java que tenha uma função recursiva que,
recebendo um numero inteiro de 10 a 999999 e recebendo um 2º
número inteiro (de 0 a 9), tenha uma função recursiva que apresente
quantas vezes o 2º número aparece no primeiro.
Exemplo1: 1º. Número = 523578; 2º. Número = 5; retorno aparece 2 vezes
Exemplo2: 1º. Número = 836363; 2º. Número = 3; retorno aparece 3 vezes
A validação da entrada e do dígito deve ser feito na main da aplicação e não
na função recursiva;
O Código deve apresentar, em formato de comentário, como foi definida a
condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a
relação de chamada dos passos
 * */
public class main {

	public static void main(String[] args) {
		
	int n = 836363;
	int k = 3;
	
	String total = funcaoRecursiva(n, k); // vai retornar TRUE ou FALSE e guardará dentro de String
	
	String aux = total;  //GAMBIARRA DE ALTÍSSIMA QUALIDADE
	aux = aux .replace("f","");
	aux = aux .replace("a","");
	aux = aux .replace("l","");
	aux = aux .replace("s","");
	aux = aux .replace("e","");
	aux = aux .replace("r","");
	aux = aux .replace("u","");// apagar da String o que for diferente de T
	System.out.println("Quantidade de dígitos: " + aux.length()); //Mostrará a quantidade de T que tem em uma String
	
	}

	static String funcaoRecursiva(int n, int k) {
		if (n == 0) { // Condição de parada
			return "";
		} else {
			return funcaoRecursiva( n / 10 , k) + ( n % 10 == k ); //Resolução 
		}
	}
	

}
