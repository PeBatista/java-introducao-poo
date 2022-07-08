package aula01;

public class Metodos {

	public static void main(String[] args) {
		String nome = "Pedro";
		String sobrenome = "Batista ";
		int idade = 17;
		System.out.println(nome.charAt(3)); // devolve ao caracter correspondente ao ind�ce
		System.out.println(nome.concat(sobrenome)); // devolve uma string com caracteres concatenados
		System.out.println(nome.contains("a")); // se a condi��o () existir = true se n�o = else
		System.out.println(nome.equals(sobrenome));	// se a condi��o() for = ao mesmo variavel chamada, dar� true se n�o dar� false
		System.out.println(nome.equalsIgnoreCase("pedro")); //ignore o caso se for maiusculo ou minusculo = true
		System.out.println(nome.indexOf("dro")); //retorno -1 caso n�o existe ocorr�ncia, 0 se ocorrer
		System.out.println(nome.length()); //quantas letras tem dentro da variavel
		System.out.println(nome.toLowerCase()); //se maiuscula = minuscula
		System.out.println(nome.toUpperCase());//se minuscula = maiuscula
		System.out.println(nome.trim());
		System.out.println(nome.replace('o', 'j')); // trocando o por j, ou n�mero por n�mero
		
	}
}
