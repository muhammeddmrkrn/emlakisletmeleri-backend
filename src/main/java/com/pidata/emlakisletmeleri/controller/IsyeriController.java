package com.pidata.emlakisletmeleri.controller;

import com.pidata.emlakisletmeleri.entity.Emlak;
import com.pidata.emlakisletmeleri.entity.Isyeri;
import com.pidata.emlakisletmeleri.service.IsyeriService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/isyeri")
@Log4j2
@CrossOrigin(origins = "http://localhost:3000")
public class IsyeriController {

    @Autowired private IsyeriService isyeriService;

    @GetMapping
    public ResponseEntity<?> list() {
        try {
            List<Isyeri> isyeriList = isyeriService.getIsyeriList();
            return new ResponseEntity<>(isyeriList, HttpStatus.OK);
        }catch (Throwable t){
            return ResponseEntity.status(204).body("backend hata");
        }
    }

    @PostMapping
    public ResponseEntity<?> ekle(@RequestBody Isyeri isyeri) {
        try {
            boolean result = isyeriService.ekle(isyeri);
            return ResponseEntity.status(200).body(result);
        }catch (Throwable t){
            log.error(t);
            return ResponseEntity.status(204).body("backend hata");
        }
    }

}
