package com.headcrest.generics.printing;

public class Printer<T>
{
	private T cartridge;

	public Printer(){
		//this.cartridge = new ColorCartridge(); //Set default cartridge type
	}

	public Printer(T cartridge)
	{
		this.cartridge = cartridge;
	}

	public <U extends ICartridge> void printUsingCartridge(U cartridge, String message)
	{
		System.out.println(cartridge.toString());
		System.out.println(message);
	}

	public void print(int copies)
	{
		//System.out.println(cartridge.getFillPercentage());
		System.out.println(cartridge.toString());
		System.out.printf("Printing %s copies", copies);
		System.out.println();
	}
	
	public T getCartridge()
	{
		return cartridge;
	}
}
