package Section7.ClassesPart1.src;

public class Main {
    public static void main(String[] args) {
        Car carrera2017 = new Car();
        carrera2017.setMake("Porsche");
        carrera2017.setModel("Carrera");
        carrera2017.setDoors(2);
        carrera2017.setConvertible(true);
        carrera2017.setColor("black");

        System.out.println("make = " + carrera2017.getMake());
        System.out.println("model = " + carrera2017.getModel());
        carrera2017.describeCar();

        System.out.println("=====================================");

        Car Player2 = new Car();
        Player2.setMake("Ford");
        Player2.setModel("Mustang");
        Player2.setDoors(2);
        Player2.setConvertible(true);
        Player2.setColor("red");

        System.out.println("make = " + Player2.getMake());
        System.out.println("model = " + Player2.getModel());
        Player2.describeCar();




    }
}
