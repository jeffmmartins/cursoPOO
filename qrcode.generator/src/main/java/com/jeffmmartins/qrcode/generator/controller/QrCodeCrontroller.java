package com.jeffmmartins.qrcode.generator.controller;

import com.jeffmmartins.qrcode.generator.dto.QrCodeGenerateRequest;
import com.jeffmmartins.qrcode.generator.dto.QrCodeGeneratorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//escuta do meu qrcode, endpoint
@RequestMapping("/qrcode")
public class QrCodeCrontroller {

    @PostMapping
    public ResponseEntity<QrCodeGeneratorResponse> generate(@RequestBody QrCodeGenerateRequest request){
        return null;
    }
}
