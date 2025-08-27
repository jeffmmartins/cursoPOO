package com.jeffmmartins.qrcode.generator.controller;

import com.jeffmmartins.qrcode.generator.dto.QrCodeGenerateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//escuta do meu qrcode, endpoint
@RequestMapping("/qrcode")
public class QrCodeCrontroller {

    @PostMapping
    public ResponseEntity<> generate(@ResponseBody QrCodeGenerateRequest request){

    }
}
