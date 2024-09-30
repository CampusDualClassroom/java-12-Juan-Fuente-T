package com.campusdual.classroom;

public class Exercise12 {

    public static void main(String[] args) {
        Car oldCar = new Car("Seat", "127", "Gasoil");

//        Un método booleano que verifique si el valor del tacómetro es cero
        oldCar.isTachometerEqualToZero();
//        Encender el coche comprobando el valor correcto del tacómetro (investigar cuál es el valor correcto)
        oldCar.start();
//        Encender el coche cuando ya está encendido (comprobar que no se puede encender si ya está encendido)
        oldCar.start();
        oldCar.isTachometerEqualToZero();
//        Apagar el coche comprobando que el valor del tacómetro es correcto
        oldCar.stop();
        oldCar.isTachometerEqualToZero();
//        Apagar el coche mientras todavía está en movimiento (y comprobar que no se puede)
        oldCar.start();
        oldCar.accelerate();
        oldCar.stop();
//        Acelerar el coche
        oldCar.accelerate();
//        Acelerar hasta intentar superar la velocidad máxima (y comprobar que no se puede)
        int speed = oldCar.speedometer;
        while(speed < 130){
            oldCar.accelerate();
            System.out.println("A velocidade do coche e: " + oldCar.speedometer);
            speed+= 5;
        }
//        Frenar la velocidad
        oldCar.brake();
//        Frenar hasta un valor negativo (y comprobar que no se puede)
        speed = oldCar.speedometer;
        while(speed >= 0){
            oldCar.brake();
            System.out.println("A velocidade do coche e: " + oldCar.speedometer);
            speed -= 5;
        }
//        Girar el volante 20 grados
        oldCar.turnAngleOfWheels(20);
        System.out.println("WheelsAngle e: " + oldCar.wheelsAngle);
//        Girar el volante más de 45 grados ó -45 grados (y comprobar que no se puede)
        oldCar.turnAngleOfWheels(50);
        System.out.println("WheelsAngle e: " + oldCar.wheelsAngle);
//        Detener el coche y poner marcha atrás
        oldCar.brake();
        oldCar.setReverse(true);
        System.out.println("A marcha do coche e: " + oldCar.gear);
//        Poner marcha atrás mientras el coche está en movimiento marcha adelante (y comprobar que no se puede)
        oldCar.setReverse(false);
        System.out.println("A marcha do coche e: " + oldCar.gear);
        oldCar.accelerate();
        oldCar.setReverse(true);
        System.out.println("A marcha do coche e: " + oldCar.gear);
    }

}