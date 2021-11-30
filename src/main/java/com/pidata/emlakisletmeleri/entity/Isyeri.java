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
public class Isyeri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String isletmeAdi;
    private String yetkili;
    private String adres;
    private String telefon;
    private String fax;
}
