package byteBankPolimorfismoConta;

/*
 * interface � uma "classe" abstrata que s� pode conter m�todos abstratos
 * 
 * servindo assim de "escopo" para classes, nesse caso, escopo para classes que necessitem de tributa��o
 * 
 * 
 */

public interface Tributavel { 
	
	double getValorImposto(); // n�o � necess�rio declarar que � public abstract ja que seria redundante.

}
