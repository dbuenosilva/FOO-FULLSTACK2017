package AnimaisInterface;

public class TestaAnimais {

	public TestaAnimais() {
		// TODO Stub de construtor gerado automaticamente
	}

	public static void main(String[] args) {
		
		
		Animal[] animais = new Animal[15];
		
		for( int i = 0; i < animais.length; i++) {
			if(i < 5) 
				animais[i] = new Sapo();
			if(i >=5 && i < 10)
				animais[i] = new Cachorro();
			if(i >= 10 && i < 15)
				animais[i] = new Boi();
		}
		
		
		for( int i = 0; i < animais.length; i++) {
			System.out.println( animais[i].som() );
		}
		
	}

}
