package com.campusdual.classroom;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;
    public boolean isTachometerGreaterThanZero = false;
    public boolean isTachometerEqualToZero = true;

    public Car() {}
    public Car(String brand, String model, String fuel){
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }
    public void start(){
        if(this.tachometer == 0){
            this.tachometer = 1000;
            isTachometerEqualToZero = false;
            isTachometerGreaterThanZero = true;
            System.out.println("Vehiculo acendido");
        }else{
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop(){
        if(this.speedometer == 0){
            this.tachometer = 0;
            isTachometerEqualToZero = true;
            System.out.println("Vehículo apagado");
        }else{
            System.out.println("Non se pode apagar o vehículo, pimero ten que estar detido");
        }
    }

    public void accelerate(){
        if(this.speedometer < MAX_SPEED) {
            this.speedometer += 5;
        }
    }
    public void brake(){
        if(this.speedometer != 0) {
            this.speedometer -= 5;
        }
    }
    public void turnAngleOfWheels(int angle){
        this.wheelsAngle += angle;
        if(this.wheelsAngle > 45){
            this.wheelsAngle = 45;
            System.out.println("WheelsAngle no puede sobrepasar los 45 grados");
        }else if (this.wheelsAngle < -45){
            this.wheelsAngle = -45;
            System.out.println("WheelsAngle no puede sobrepasar los -45 grados");
        }
    }

    public void setReverse(boolean isReverse){
        if(isReverse && speedometer == 0) {
        this.reverse = true;
            this.gear = "R";
        }else this.gear = "N";
    }

    public boolean isTachometerGreaterThanZero() {
       return this.isTachometerGreaterThanZero;
    }

    public boolean isTachometerEqualToZero() {
        if (isTachometerEqualToZero) {
                System.out.println("El tacómetro está a cero");
        }else{
                System.out.println("El tacómetro NO está a cero");
        }
        return this.isTachometerEqualToZero;
    }
}
