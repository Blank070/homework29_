package kz.attractor.java;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        //Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        System.out.println("по возрасту");
        cats.sort(Cat::catAge);
        Printer.print(cats);
        System.out.println("по алфавиту");
        cats.sort(Cat::byName);
        Printer.print(cats);
        System.out.println("по попроде");
        cats.sort(Cat::porod);
        Printer.print(cats);
        System.out.println("удаление котов 5 лет");
        cats.removeIf(Cat::bto);
        Printer.print(cats);
        System.out.println("удаление определенного цвета");
        cats.removeIf(Cat::colorX);
        Printer.print(cats);

    }


}
