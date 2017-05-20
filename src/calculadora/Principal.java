/**
 * 
 */
package calculadora;

import javax.swing.JOptionPane;

import GwMarket.UnidadeDeMedida;

/**
 * @author diego
 *
 */
public class Principal {

	/**
	 * 
	 */
	public Principal() {
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] options = {"OK", "Cancel"};
		Calculadora c = new Calculadora( );
		double resultado = 0;
				
	    c.setValorA( Double.parseDouble(JOptionPane.showInputDialog("Valor A : ") ) );
	    c.setValorB( Double.parseDouble(JOptionPane.showInputDialog("Valor B : ") ) );
		
	     JOptionPane.showOptionDialog(null, c.comboOperador, "Operação:",
	             JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
	             options, options[0]);
	     Character operador = c.comboOperador.getSelectedItem().toString().charAt(1);
	 
	     switch (operador) {
		     case '+':
		    	 resultado = c.soma( );
		    	 break;
		     case '-':
		    	 resultado = c.subtrai( );
		    	 break;
		     case '*':
		    	 resultado = c.multiplica( );
		    	 break;
		     case '/':
		     {
		 //   	 try {
		    		 resultado = c.divide( );	 
		  //  	 }
		    //	 catch ( DivisaoPorZeroExecption e ) {
		   // 		 JOptionPane.showMessageDialog(null, "Não pode-se dividir por zero!",  "Valor B" , JOptionPane.PLAIN_MESSAGE  );	    		 
		 //   	 }
		    		 

		    		 /***
		    		  
		    		  	Exception in thread "main" calculadora.DivisaoPorZeroExecption: Não pode dividir por zero!
							at calculadora.Calculadora.divide(Calculadora.java:50)
							at calculadora.Principal.main(Principal.java:52)

		    		  
		    		  */
		    		 
		    		 
		    		 
		     } 
		}

	 	  
	     
	     
		JOptionPane.showMessageDialog(null, "Resultado = " + resultado,  "Resultado" , JOptionPane.PLAIN_MESSAGE  );	    		 
	     
	}
}
