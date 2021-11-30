package com.pidata.emlakisletmeleri.repository;

import com.pidata.emlakisletmeleri.dto.EmlakDto;
import com.pidata.emlakisletmeleri.entity.Emlak;

import java.util.List;

public interface EmlakRepositoryCustom {

    List<Emlak> emlakAra(EmlakDto emlakDto);

}
