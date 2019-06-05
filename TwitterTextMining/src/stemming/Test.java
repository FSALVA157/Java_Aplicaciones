package stemming;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stemmer stemmer=new Stemmer();
		String[] palabras=stemmer.test();//test() devuelve cada linea del stemm_test_corpus.txt en un array.
		String[] lineaAux, palabrasConStemming;
		String palabraSinStemming;
		palabrasConStemming = new String[palabras.length];
		int i=0;
		for(String linea:palabras){
			lineaAux = linea.split(" ");//separa la linea al encontrar un espacio en blanco
			palabraSinStemming = lineaAux[0];
			palabrasConStemming[i++] = stemmer.stemm(palabraSinStemming);
		}
		for(String palabra:palabrasConStemming){
			System.out.println(palabra);//coinciden con las que se encuentran en stemm_test_corpus.txt.
		}

	}

}
