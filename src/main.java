/*
 * Criar uma aplica��o em Java que tenha uma fun��o recursiva que,
recebendo um numero inteiro de 10 a 999999 e recebendo um 2�
n�mero inteiro (de 0 a 9), tenha uma fun��o recursiva que apresente
quantas vezes o 2� n�mero aparece no primeiro.
Exemplo1: 1�. N�mero = 523578; 2�. N�mero = 5; retorno aparece 2 vezes
Exemplo2: 1�. N�mero = 836363; 2�. N�mero = 3; retorno aparece 3 vezes
A valida��o da entrada e do d�gito deve ser feito na main da aplica��o e n�o
na fun��o recursiva;
O C�digo deve apresentar, em formato de coment�rio, como foi definida a
condi��o de parada;
O C�digo deve apresentar, em formato de coment�rio, como foi definida a
rela��o de chamada dos passos
 * */
public class main {

	public static void main(String[] args) {
		
	int n = 836363;
	int k = 3;
	
	String total = funcaoRecursiva(n, k); // vai retornar TRUE ou FALSE e guardar� dentro de String
	
	String aux = total;  //GAMBIARRA DE ALT�SSIMA QUALIDADE
	aux = aux .replace("f","");
	aux = aux .replace("a","");
	aux = aux .replace("l","");
	aux = aux .replace("s","");
	aux = aux .replace("e","");
	aux = aux .replace("r","");
	aux = aux .replace("u","");// apagar da String o que for diferente de T
	System.out.println("Quantidade de d�gitos: " + aux.length()); //Mostrar� a quantidade de T que tem em uma String
	
	}

	static String funcaoRecursiva(int n, int k) {
		if (n == 0) { // Condi��o de parada
			return "";
		} else {
			return funcaoRecursiva( n / 10 , k) + ( n % 10 == k ); //Resolu��o 
		}
	}
	

}
