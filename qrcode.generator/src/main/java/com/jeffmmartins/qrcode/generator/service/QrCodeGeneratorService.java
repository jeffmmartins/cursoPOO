package com.jeffmmartins.qrcode.generator.service;

import com.jeffmmartins.qrcode.generator.ports.StoragePort;
import org.springframework.stereotype.Service;

@Service
public class QrCodeGeneratorService {
    private final StoragePort storagePort;

    public QrCodeGeneratorService(StoragePort storagePort) {
        this.storagePort = storagePort;
    }
}
