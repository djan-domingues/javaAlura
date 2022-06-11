package byteBankPolimorfismoConta;

/*
 * interface é uma "classe" abstrata que só pode conter métodos abstratos
 * 
 * servindo assim de "escopo" para classes, nesse caso, escopo para classes que necessitem de tributação
 * 
 * 
 */

public interface Tributavel { 
	
	double getValorImposto(); // não é necessário declarar que é public abstract ja que seria redundante.

}
