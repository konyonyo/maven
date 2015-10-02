package helloworld;

public class Calculator {
	/**
	 * 引数で与えられた2つの値を掛け合わせた値を返す
	 * @param x 1つ目の引数
	 * @param y 2つ目の引数
	 * @return xとyを掛け合わせた値
	 */
    public int multiply(int x, int y){
    	return x * y;
    }
    
    /**
     * 引数で与えられた2つの数の除算結果を返す
     * @param x 被除数
     * @param y 除数
     * @return xをyで割った値
     */
    public float divide(int x, int y){
    	return (float)x / (float)y;
    }
}
