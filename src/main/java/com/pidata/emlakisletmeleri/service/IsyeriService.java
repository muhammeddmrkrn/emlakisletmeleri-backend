package com.pidata.emlakisletmeleri.service;

import com.pidata.emlakisletmeleri.entity.Emlak;
import com.pidata.emlakisletmeleri.entity.Isyeri;
import com.pidata.emlakisletmeleri.repository.IsyeriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IsyeriService {
    @Autowired private IsyeriRepository isyeriRepository;

    public List<Isyeri> getIsyeriList(){
        List<Isyeri> isyeriList= isyeriRepository.findAll();
        if(isyeriList == null)
            return null;
        return isyeriList;
    }

    public boolean ekle(Isyeri isyeri) {
        isyeriRepository.save(isyeri);
        return true;
    }
}
