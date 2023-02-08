class Unaryoperator_sum{
public static void main(String []args){

int a=5;
int b=6;
// postfix & prefix for increment
System.out.println(a++);
System.out.println(++a);

// postfix and prerix for decrement
System.out.println(a--);
System.out.println(--a);

System.out.println(a++ + ++b);
System.out.println(b++ + ++a);

System.out.println(++b + b++);
System.out.println(a++ + ++a);
}
}