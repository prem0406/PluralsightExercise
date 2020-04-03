package com.pluralsight.abstractfactory;

public class AbstractFactoryDemo {
	public static void main(String... strings ) {
/*		CreditCardFactory factory = CreditCardFactory.getCreditCardFactory(701);
		CreditCard creditCard = factory.getCreditCard(CardType.GOLD);
		System.out.println(creditCard.getClass());*/
		
		CreditCardFactory factory2 = CreditCardFactory.getCreditCardFactory(700);
		CreditCard creditCard2 = factory2.getCreditCard(CardType.GOLD);
		System.out.println(creditCard2.getClass());
		
	}
}
