package controller;

public class QtdDigitos {

	public QtdDigitos() {
		super();
	}
	public int Qtddigi(int a, int digitos) {
		if (a == 0) {
			return digitos;
//quando "a" chega a zero, é chamada da próxima função é interrompida para evitar uma divisão por zero
		}
		else {
			digitos ++;
			return Qtddigi(a / 10, digitos);
//cada vez que é feita uma chamada de recursiva, é somado +1 em "digitos" e "a" é dividido por 10
		}
	}
}
