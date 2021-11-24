package javalearn;

import java.util.ArrayList;

class Fruit1  {
	public String toString() { return "Fruit";}
}
class Juice	 { 
		String name;
		Juice(String name) {this.name = name +"Juice";}
		public String toString() { return name;}
}
class Apple1 extends Fruit1 			 { public String toString() { return "Apple";}}
class Grape1 extends Fruit1 			 { public String toString() { return "Grape";}}



class Box1<T > {
	ArrayList<T> list = new ArrayList<>();
	void add(T item)		 {list.add(item);}		
	T get(int i) 			 {return list.get(i);}	
	ArrayList<T> getList() 	 {return list;}
	int size()				 {return list.size();}
	public String toString() {return list.toString();}
}

class FruitBox1<T extends Fruit1 > extends Box1<T>{}	
														
class Jucier {
	static Juice makeJuice(FruitBox1<? extends Fruit1> box) {
		String tmp = "";
		
		for(Fruit1 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}


public class genericswildcard {

	public static void main(String[] args) {
		
		FruitBox1<? extends Fruit1> fruitBox = new FruitBox1<Apple1>();
		fruitBox = new FruitBox1<Fruit1>();
		fruitBox = new FruitBox1<Apple1>();
		fruitBox = new FruitBox1<Grape1>();
		
		
		System.out.println(fruitBox);
		
		// 와일드 카드 (? extends Fruit1)를 적용하면 Fruit1 및 그에 딸린 자손들의 이름으로는
		// 객체를 만들 수 있다.
		// 하나의 참조변수로 서로 다른 타입이 대입된 여러 지네릭 객체를 다루기 위한 것.
		
		// 지네릭 메서드는 메서드를 호출할 때 마다 다른 지네릭 타입을 대입할 수 있게 한것.
		
		
	}

}
