package com.tcunha2004.CarFIPE.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Data(@JsonAlias("code") String codigo,
                   @JsonAlias("name") String nome) {
}
