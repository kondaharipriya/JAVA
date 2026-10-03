class Animal{
	public void sound(){
		System.out.println("Animal eats");
	}
}
class Dog extends Animal{
	sound(){
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	sound(){
		System.out.println("Cat");
	}
}
class main{
	public static void main(String args[]){
		Dog d=new Dog();
		d.sound();
		Cat c=new Cat();
		c.sound();
	}
}