package com.pidata.emlakisletmeleri.controller;

import com.pidata.emlakisletmeleri.entity.Isyeri;
import com.pidata.emlakisletmeleri.entity.Musteri;
import com.pidata.emlakisletmeleri.service.MusteriService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/musteri")
@Log4j2
@CrossOrigin(origins = "http://localhost:3000")
public class MusteriController {

    @Autowired private MusteriService musteriService;

    @GetMapping
    public ResponseEntity<?> list() {
        try {
            List<Musteri> musteriList = musteriService.getMusteriList();
            return new ResponseEntity<>(musteriList, HttpStatus.OK);
        }catch (Throwable t){
            return ResponseEntity.status(204).body("backend hata");
        }
    }

    @PostMapping
    public ResponseEntity<?> ekle(@RequestBody Musteri musteri) {
        try {
            boolean result = musteriService.ekle(musteri);
            return ResponseEntity.status(200).body(result);
        }catch (Throwable t){
            log.error(t);
            return ResponseEntity.status(204).body("backend hata");
        }
    }

}
