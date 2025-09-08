package com.jeffmmartins.qrcode.generator.ports;

//Definindo contrato das interfaces que precisa respeitar
public interface StoragePort {
    String uploadFile(byte[] fileData, String fileName, String contentType);

}
