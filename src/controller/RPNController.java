package controller;

import com.felix.utils.pilha.integer.Pilha;

public class RPNController {

	public RPNController() {
	}

	public void insereValor(Pilha pilha, int valor) {
		pilha.push(valor);	
	}
	
	public int rpn(Pilha pilha, int op) throws Exception {
		int valor1, valor2, resultado = 0;
		
		if (pilha.isEmpty() || pilha.size() < 2) {
			throw new Exception("valores faltantes");
		}
		
		valor1 = pilha.pop();
		valor2 = pilha.pop();
		
		switch (op) {
			case 0:
				resultado = valor1 + valor2;
				break;
			case 1:
				resultado = valor1 * valor2;
				break;
			case 2:
				resultado = valor1 - valor2;
				break;
			case 3:
				resultado = valor1 / valor2;
				break;
		}
		
		
		return resultado;
	}
}
