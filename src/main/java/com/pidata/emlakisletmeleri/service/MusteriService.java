package com.pidata.emlakisletmeleri.service;

import com.pidata.emlakisletmeleri.entity.Isyeri;
import com.pidata.emlakisletmeleri.entity.Musteri;
import com.pidata.emlakisletmeleri.repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MusteriService {
    @Autowired private MusteriRepository musteriRepository;

    public List<Musteri> getMusteriList(){
        List<Musteri> musteriList= musteriRepository.findAll();
        if(musteriList == null)
            return null;
        return musteriList;
    }

    public boolean ekle(Musteri musteri) {
        musteriRepository.save(musteri);
        return true;
    }
}
