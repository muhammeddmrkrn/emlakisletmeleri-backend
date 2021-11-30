package com.pidata.emlakisletmeleri.repository;

import com.pidata.emlakisletmeleri.dto.EmlakDto;
import com.pidata.emlakisletmeleri.entity.Emlak;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmlakRepositoryCustomImpl implements EmlakRepositoryCustom{

    @Autowired
    EntityManager entityManager;


    @Override
    public List<Emlak> emlakAra(EmlakDto emlakDto) {
        String sql = "select * from emlakisletmesi.emlak where 1=1";

        if(emlakDto.getEmlakTuru() != null){
            sql += " and emlak_turu=:emlakTuru";
        }
        if(emlakDto.getBinaKati() != null){
            sql += " and bina_kati=:binaKati";
        }
        if(emlakDto.getIsinmaTuru() != null){
            sql += " and isinma_turu=:isinmaTuru";
        }
        if(emlakDto.getKat() != null){
            sql += " and kat=:kat";
        }
        if(emlakDto.getMusteriId() != null){
            sql += " and musteri_id=:musteriId";
        }
        if(emlakDto.getMetrekare() != null){
            sql += " and metrekare=:metrekare";
        }
        if(emlakDto.getOdaSayisi() != null){
            sql += " and oda_sayisi=:odaSayisi";
        }
        Query query = entityManager.createNativeQuery(sql, Emlak.class);

        return query
                .setParameter("emlakTuru",emlakDto.getEmlakTuru())
                .setParameter("binaKati",emlakDto.getBinaKati())
                .setParameter("isinmaTuru",emlakDto.getIsinmaTuru())
                .setParameter("kat",emlakDto.getKat())
                .setParameter("musteriId",emlakDto.getMusteriId())
                .setParameter("metrekare",emlakDto.getMetrekare())
                .setParameter("odaSayisi",emlakDto.getOdaSayisi())
                .getResultList();
    }
}
