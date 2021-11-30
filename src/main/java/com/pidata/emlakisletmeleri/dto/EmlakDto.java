package com.pidata.emlakisletmeleri.dto;

import lombok.*;

import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmlakDto {
    private BigInteger id;
    private String emlakTuru;
    private BigInteger metrekare;
    private BigInteger odaSayisi;
    private BigInteger kat;
    private BigInteger binaKati;
    private String isinmaTuru;
    private Integer musteriId;
}
