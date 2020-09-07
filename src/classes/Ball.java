package classes;

import java.util.Arrays;

public class Ball {
    //Свойства
    int size;
    String color;
    int weight;
    int[] coordinates = new int[]{0,0,0};
    //Конструкторы
    public Ball(int size , String color , int weight , int[] coordinates)
    {
        this.size=size;
        this.color=color;
        this.weight=weight;
        this.coordinates=coordinates;
    }
    public Ball(){}
    //Методы геттеры
    public int[] getCoordinates() {
        return coordinates;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor(){
        return color;
    }
    //Методы сеттеры
    public void setSize(int size) {
        this.size=size;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
    public void setCoordinates(int[] coordinates){
        this.coordinates=coordinates;
    }

    @Override
    public String toString() {
        return "Параметры Мяча:\n" +
                "Размер:" + size + "\n" +
                "Цвет:" + color + "\n" +
                "Вес:" + weight + "\n" +
                "Координаты(X,Y,Z):" + Arrays.toString(coordinates);
    }
}
