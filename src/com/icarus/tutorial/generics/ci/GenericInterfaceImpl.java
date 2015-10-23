package com.icarus.tutorial.generics.ci;

public class GenericInterfaceImpl<G> implements GenericInterface<G> {
	
	private G something;

	@Override
	public G doSomething() {
		return something;
	}

}
