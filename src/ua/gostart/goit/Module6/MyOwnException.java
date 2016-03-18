package ua.gostart.goit.Module6;


public class MyOwnException extends Exception {
    //in progress
    // Счетчик ошибок:
    static int count = 0;
    // Текст для описания ошибки:
    String name;

    // Конструктор класса:
    MyOwnException(String name) {
        count++;
        this.name = name;
    }

    // Переопределение метода toString():
    public String toString() {
        String text = "Возникла ошибка!\n";
        text += "Описание: " + name + "\n";
        text += "Номер ошибки: " + count;
        return text;
    }
}


