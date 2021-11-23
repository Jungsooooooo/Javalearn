package javalearn;

import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit";}
}

class Apple extends Fruit 			 { public String toString() { return "Apple";}}
class Grape extends Fruit 			 { public String toString() { return "Grape";}}
class Dog { public String toString() { return "Dog";}}

interface Eatable {}

class Box<T> {
		ArrayList<T> list = new ArrayList<>();
		void add(T item)		 {list.add(item);}		// 박스에 과일 추가
		T get(int i) 			 {return list.get(i);}	// 박스에 있는 과일 꺼낼 때
		int size()				 {return list.size();}
		public String toString() {return list.toString();}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}	// 과일상자에는 Fruit 와 Eatable 만이 들어올 수 있음. 
															//지네릭스에 넣을 객체를 제한 할 때 이렇게 코드를 입력한다

public class generics3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		//FruitBox<Dog> Dog		 = new FruitBox<>(); Dog는 FruitBox 클래스의 자손객체가 아니기 때문에
		// 집어넣을 수가 없다. .
	} 

}
