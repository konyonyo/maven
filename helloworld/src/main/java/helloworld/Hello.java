package helloworld;

public class Hello {
    public static void main(String args[]){
    	System.out.println("Hello Maven and JUnit World!");
    	int x = 10;
    	int y = 5;
    	Calculator cal = new Calculator();
    	System.out.println(x + "掛ける" + y + "は" + cal.multiply(x, y) + "です。");
    }
}
