package com.ruoxu.pattern.proxy.static_proxy;

public class WealthMan implements ILawsuit{
	private static final String PREFIX = "wealthMan ";
	
	@Override
	public void submit() {
		System.out.print(PREFIX+"submit");
	}

	@Override
	public void burden() {
		System.out.print(PREFIX+"burden");
	}

	@Override
	public void defend() {
		System.out.print(PREFIX+"defend");
	}

	@Override
	public void finish() {
		System.out.print(PREFIX+"finish");
	}
}
