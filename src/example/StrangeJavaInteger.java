package example;

public class StrangeJavaInteger {

	public static void main(String[] args) {
        
        Integer i = 100; // z zakresu -128 do 127
        Integer p = 100;
        if (i == p)   //true
            System.out.println("i i p są takie same. Mają ten sam obiekt");
        if (i != p)
            System.out.println("i i p są różne. Mają różne obiekty.");   
        if(i.equals(p)) //true
            System.out.println("i i p zawierają tą samą wartość.");
    }
}
