package com.ruoxu.pattern.decorator;
/**
 * 装饰器模式（结构型设计模式）
 * 动态地扩展类的功能。装饰器模式相对于生成子类更灵活，可以替代子类继承或实现接口的方式来扩展类的功能。
 * 易混淆点:
 * 装饰器模式与代理模式很像，有时候甚至混淆，常常会是把装饰器模式看作是代理模式。
 * 1.装饰器模式是以 对客户端透明的方式扩展对象的功能，是继承关系的一个替代方法。
 * 2.代理模式则是给一个对象提供一个代理对象，并由代理对象来控制对原有对象的引用。装饰器模式应该为所装饰的对象增强功能；代理模式对代理对象施加控制，但不对对象本身的功能进行增强。
 *
 */
public class Demo {
	public static void main(String[] args) {
		Person boy = new Boy();
		ClothDecorator boyDecorator1 = new ExpensiveClothDecorator(boy);
		boyDecorator1.dressed();
		
		System.out.println();
		
		ClothDecorator boyDecorator2 = new CheapClothDecorator(boy);
		boyDecorator2.dressed();
		
		System.out.println();
		
//		Person girl = new Girl();
//		ClothDecorator girlDecorator = new ExpensiveClothDecorator(girl);
//		girlDecorator.dressed();
		
	}
}
