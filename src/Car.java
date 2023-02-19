import java.util.Arrays;


public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {
        Car c = (Car) o;
        int result = this.speed - c.speed;
        if (result == 0) {
            result = this.price - c.price;
            if (result == 0) {
                result = this.model.compareTo(c.model);
                if (result == 0) {
                    result = this.color.compareTo(c.color);
                }
            }
        }
        return result;
    }


    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);



        public static void main(String[] args) {
            Car c1 = new Car(185, 8000, "BMW", "Red");
            Car c2 = new Car(185, 8000, "Opel", "Black");
            Car c3 = new Car(185, 8000, "Mercedes", "White");
            Car[] c = {c1, c2, c3};

            Arrays.sort(c);   // ClassCastException
            for (Car temp : c) {
                System.out.println(temp);
            }
        }
    }

