package classes;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
	Ball ball1 = new Ball(16,"green",250,new int[]{10,15,25});//инициализация мяча
	System.out.println(Arrays.toString(ball1.getCoordinates()));
	ball1.setCoordinates(new int[]{10,20,144});
	System.out.println(ball1.toString());
    }
}
