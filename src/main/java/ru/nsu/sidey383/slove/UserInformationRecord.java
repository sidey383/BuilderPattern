package ru.nsu.sidey383.slove;


/**
 * Пример создания билдера с помощью плагина для record
 * **/
public record UserInformationRecord (
        String name,
        String surname,
        String number,
        String mail) {
}
