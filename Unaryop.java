class Unaryop{
public static void main(String...args){
int a = 5;
int b = 6;
// postfix & prefix for increment
System.out.println(a++);
System.out.println(++a);

// postfix & prefix for decrement
System.out.println(a--);
System.out.println(--a);

System.out.println(a++ + ++b);
System.out.println(b++ + ++a);

}}