package com.pidata.emlakisletmeleri.service;

import com.pidata.emlakisletmeleri.dto.EmlakDto;
import com.pidata.emlakisletmeleri.entity.Emlak;
import com.pidata.emlakisletmeleri.entity.Musteri;
import com.pidata.emlakisletmeleri.repository.EmlakRepository;
import com.pidata.emlakisletmeleri.repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmlakService {
    @Autowired private EmlakRepository emlakRepository;
    @Autowired private MusteriRepository musteriRepository;

    public List<Emlak> getEmlakList(){
        List<Emlak> emlakList= emlakRepository.findAll();
        if(emlakList == null)
            return null;
        return emlakList;
    }

    public boolean ekle(EmlakDto emlakDto) {
        Musteri musteri = musteriRepository.getById(emlakDto.getMusteriId());

        Emlak emlak = new Emlak();
        emlak.setEmlakTuru(emlakDto.getEmlakTuru());
        emlak.setBinaKati(emlakDto.getBinaKati());
        emlak.setIsinmaTuru(emlakDto.getIsinmaTuru());
        emlak.setKat(emlakDto.getKat());
        emlak.setMetrekare(emlakDto.getMetrekare());
        emlak.setOdaSayisi(emlakDto.getOdaSayisi());
        emlak.setMusteri(musteri);
        emlakRepository.save(emlak);

        return true;
    }

    public List<Emlak> emlakAra(EmlakDto emlakDto) {
        List<Emlak> emlakList= emlakRepository.emlakAra(emlakDto);
        if(emlakList == null)
            return null;
        return emlakList;
    }
}
