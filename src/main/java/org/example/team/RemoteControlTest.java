package org.example.team;

public class RemoteControlTest {
    public static void main(String[] args) {
       RemoteControl remote = new RemoteControl(); // Инициатор = пульт управления

        Light livingRoomLight = new Light("Living room"); // Получатель
        Light kitchenLight = new Light("Kitchen"); // Получатель
        GarageDoor garageDoor = new GarageDoor(); // Получатель

        /*
         * Создание команд для управления
         */
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand  garageDown = new GarageDoorDownCommand(garageDoor);

        /*
         * Готовые команды связываются с ячейками пульта
         */
        remote.setCommand(0,
                livingRoomLight::on,
                livingRoomLight::off); // Свет для гостинной реализован с помощью лямбда-выражений
        remote.setCommand(1,  kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, garageUp, garageDown);

        System.out.println(remote);

        remote.onButtonWasPressed(0);
        remote.onButtonWasPressed(1);
        remote.onButtonWasPressed(2);

        remote.offButtonWasPressed(0);
        remote.offButtonWasPressed(1);
        remote.offButtonWasPressed(2);
    }
}
