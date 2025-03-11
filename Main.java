public class Main {
    public static void main(String[] args) {
        GeometricFigure[] figures = {
                new Circle(5, "Красный", "Чёрный"),
                new Rectangle(4, 6, "Синий", "Белый"),
                new Triangle(3, 4, 5, "Зелёный", "Жёлтый")
        };

        for (GeometricFigure figure : figures) {
            System.out.println("Фигура: " + figure.getClass().getSimpleName());
            System.out.println("Периметр: " + figure.getPerimeter());
            System.out.println("Площадь: " + figure.getArea());
            System.out.println("Цвет фона: " + figure.getFillColor());
            System.out.println("Цвет границ: " + figure.getBorderColor());
            System.out.println("---------------------");
        }
    }
}