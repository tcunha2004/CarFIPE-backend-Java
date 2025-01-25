package com.tcunha2004.CarFIPE.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FIPEInfo(@JsonAlias("vehicleType") String tipo,
                       @JsonAlias("price") String preco,
                       @JsonAlias("brand") String marca,
                       @JsonAlias("model") String modelo,
                       @JsonAlias("modelYear") String anoModelo,
                       @JsonAlias("fuel") String combustivel,
                       @JsonAlias("codeFipe") String codigoFIPE,
                       @JsonAlias("referenceMonth") String mesDeReferencia) {
}
