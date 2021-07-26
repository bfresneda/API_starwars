package br.com.starwars.resistenciarebelde.enums;

import lombok.Getter;

@Getter
public enum TipoItem {

	ARMA(4), MUNICAO(3), AGUA(2), COMIDA(1);

	private int valor;

	private TipoItem(int valor) {
		this.valor = valor;
	}

}
