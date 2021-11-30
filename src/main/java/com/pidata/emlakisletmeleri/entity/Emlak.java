package com.pidata.emlakisletmeleri.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(schema = "emlakisletmesi")
public class Emlak {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    private String emlakTuru;
    private BigInteger metrekare;
    private BigInteger odaSayisi;
    private BigInteger kat;
    private BigInteger binaKati;
    private String isinmaTuru;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "musteri_id", referencedColumnName = "id")
    })
    private Musteri musteri;

}
