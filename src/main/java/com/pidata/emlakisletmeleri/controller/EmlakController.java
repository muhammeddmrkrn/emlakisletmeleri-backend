package com.pidata.emlakisletmeleri.controller;

import com.pidata.emlakisletmeleri.dto.EmlakDto;
import com.pidata.emlakisletmeleri.entity.Emlak;
import com.pidata.emlakisletmeleri.service.EmlakService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emlak")
@Log4j2
@CrossOrigin(origins = "http://localhost:3000")
public class EmlakController {

    @Autowired private EmlakService emlakService;

    @GetMapping
    public ResponseEntity<?> list() {
        try {
            List<Emlak> emlakList = emlakService.getEmlakList();
            return new ResponseEntity<>(emlakList, HttpStatus.OK);
        }catch (Throwable t){
            return ResponseEntity.status(204).body("backend hata");
        }
    }

    @PostMapping
    public ResponseEntity<?> ekle(@RequestBody EmlakDto emlakDto) {
        try {
            boolean result = emlakService.ekle(emlakDto);
            return ResponseEntity.status(200).body(result);
        }catch (Throwable t){
            log.error(t);
            return ResponseEntity.status(204).body("backend hata");
        }
    }

    @PostMapping("/ara")
    public ResponseEntity<?> ara(@RequestBody EmlakDto dto) {
        try {
            List<Emlak> emlakList = emlakService.emlakAra(dto);
            return new ResponseEntity<>(emlakList, HttpStatus.OK);
        }catch (Throwable t){
            return ResponseEntity.status(204).body("backend hata");
        }
    }
}
