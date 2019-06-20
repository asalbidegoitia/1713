package com.ipartek.formacion;

import java.util.Comparator;

public class ComparatorCerdoDiamantes implements Comparator<IOrdenable> {

	@Override
	public int compare(IOrdenable o1, IOrdenable o2) {
		return o2.getValor() - o1.getValor();
	}

}
