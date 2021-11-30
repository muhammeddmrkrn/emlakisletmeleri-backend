package com.pidata.emlakisletmeleri.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(schema = "emlakisletmesi")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String adi;
    private String soyadi;
    private String evTelefonu;
    private String cepTelefonu;
    private String email;
}
