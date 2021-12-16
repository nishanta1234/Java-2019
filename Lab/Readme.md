1.Write a program to demonstrate all three types of constructor in java.
class Animal{
    String name;
    String food;
    Animal(){ //Default Constructor
    name = "Dog"; 
}
    Animal(String food){//parameterized constroctor
        this.food = food;
    }
    
}
class Domestic{
    public static void main(String[] args){
        Animal Dog = new Animal("meat");
        System.out.println("Domestic animal we are talking about is" + Dog.name);
        System.out.println("Dog eats " + Dog.food );
    }
}
2.Write a program to implement stack using array
class Stack {
    static final int SIZE = 10;
    int top;
    int a[] = new int[SIZE]; 
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= (SIZE - 1)) {
            System.out.println("Already Full");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " is sucessfully added");
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0) {
            System.out.println("It is empty ");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
 
    int peek()
    {
        if (top < 0) {
            System.out.println("It is empty");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    
    void print(){
    for(int i = top;i>-1;i--){
      System.out.print(" "+ a[i]);
    }
  }
}
 
// Driver code
class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
3.Write a program to implement uses of Abstract Class.
AbstractClass.java
abstract class AbstractClass{
	abstract void help();
}

AbsDemo.java
class AbsDemo extends AbstractClass{
	public void help(){
	System.out.println("Abclass methode overide....");
	}
	public static void main(String[] args) {
		AbstractClass abClass = new AbsDemo();
		abClass.help();
	}
}
#Write a program to achieve multiple inheritance in java.

package Inheritance;

interface ChildA {

    default void show()
    {
        System.out.println("Child A");
    }
}
 
interface ChildB {

    default void show()
    {
        System.out.println("Child B");
    }
}
 
class MultipleInheritance implements ChildA, ChildB {
 
    public void show()
    {
        ChildA.super.show();
        ChildB.super.show();
    }
 
    public static void main(String args[])
    {
        MultipleInheritance childern = new MultipleInheritance();
        childern.show();
    }
}
#Write a program to find sum and difference of two numbers using command line arguments

class SumDiff{
	public static void main(String[] args){
	int x,y;
	x = Integer.parseInt(args[0]);
	y = Integer.parseInt(args[1]);
	int sum = x+y;
	int diff = x-y;
	System.out.println("Sum of x and y is :"+sum);
	System.out.println("The difference of x and y is :"+diff);
	}
}
3Write a program to demonstrate use of this, super and final

class Super {
    int value = 20;
   }
   
   class Example extends Super {
    int value = 10;
    void display() {
     System.out.println(super.value);// prints super value 
    }
    void display2(int value){
     this.value = value;//changes to new value 
     System.out.println(this.value);// prints new value
    }
   
    public static void main(String args[]) {
     Example e = new Example();
     e.display();//this returns value from the super class that is parent class Super.
     e.display2(45);//new value is displayed
    }
   }

final class Final{  
 public static void main(String[] args) {
     final double PI = 3.1415;
     int radius = 8;
     double area = PI*radius*radius;
     System.out.println("The area of circle is:"+area);
 }
}
#Write a program to demonstrate the use of default method in the interface.


interface Example{

    default void display()
    {
        System.out.println("Default Method");
    }
}

 
class Interface implements Example{
 
    public static void main(String args[])
    {
        Interface i1 = new Interface();
        i1.display();
    }
}
#Write a program to demonstrate the use of static methos and static variable

class Static
{
	static int counter;
	static int count;
	public void increment()
	{
		counter++;
	}
	public static int getCounter()
	{
		count++;
		return counter;
	}
    public static void main(String[] args)
	{
		Static count1 = new Static();
		Static count2 = new Static();
		count1.increment();
		System.out.println(Static.getCounter());//we can use the classname directly when the method and variables are static
		count2.increment();
		System.out.println(Static.getCounter());
	}
}
