package ua.gostart.goit.Module6;

// МОДУЛЬ 4 ЗАДАНИЕ 3:Создать класс вычисляющий расстояние между двумя точками, представленными координатами
// в двумерном пространстве (x1, y1), (x2, y2).

//http://oldskola1.narod.ru/trigF28.htm

public class DistanceBetweenTwoPoint {

    DistanceBetweenTwoPoint() {
        System.out.println("1");

        MyClass obj1 = new MyClass(50.0);
        MyClass obj2 = new MyClass(-10.0);
        MyClass obj3 = new MyClass(4.0);
        MyClass obj4 = new MyClass(20);

        try {
            obj4.set(100);
        } catch (MyOwnException e) { // Обработка ошибки
            System.out.println(e);
            obj4.show();
        }

        double a = obj1.number*2;
        double b = obj2.number/6;
        double c = obj3.number+5;
        double d = obj4.number*8;

        System.out.println("Найти расстояние между двумя точками в двумерном декартовом пространстве. Даны точки: ");
        System.out.println("A(x1,y1)=" + a + "," + b);
        System.out.println("B(x2,y2)=" + c + "," + d);


        double tmp = ss(a, b, c, d);

        System.out.println("Ответ:расстояние между двумя точками = " + tmp);
        //   System.out.println(Math.sqrt(29)); //proverka

    }

    private double ss(double x1, double y1, double x2, double y2) {
        double b = 0;
        double b1 = Math.abs(x2 - x1);//System.out.println("b1="+b1  );
        double b2 = Math.abs(y2 - y1);//System.out.println("b2="+b2  );
        double b12 = Math.pow(b1, 2);//System.out.println("b12="+b12  );
        double b22 = Math.pow(b2, 2);//System.out.println("b22="+b22  );
        b = Math.sqrt(b12 + b22);
        return b;
    }
}

//    public static void main(String[] args)
//    {
class MyClass {

    // Числовое поле:
    double number;

    // Метод для отображения значения поля:
    void show() {
        System.out.println("Значение поля: " + number);

    }

    // Конструктор класса:
    MyClass(double number) {
        try {
            if (number > 10) {
                number = 10;
                // Генерирование ошибки:
                throw new MyOwnException("Слишком большое число!");
            }
            if (number < 0) {
                number = 0;
                // Генерирование ошибки:
                throw new MyOwnException("Отрицательное число!");
            }
        } catch (MyOwnException obj) { // Обработка ошибки          ////  обж как понять и почему срабатывет тустринг
            System.out.println(obj);
        }
        this.number = number;
        show();
    }

    void set(int number) throws MyOwnException {
        // Генерирование ошибки:
        if (number > 10 || number < 0) throw new MyOwnException("Неверный аргумент!");
        this.number = number;
        System.out.println("Все в порядке!");
        show();
    }


}



