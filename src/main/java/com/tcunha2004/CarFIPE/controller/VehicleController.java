package com.tcunha2004.CarFIPE.controller;

import com.tcunha2004.CarFIPE.models.Data;
import com.tcunha2004.CarFIPE.models.FIPEInfo;
import com.tcunha2004.CarFIPE.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class VehicleController {

    @Autowired
    private VehicleService service;

    @GetMapping("/brands")
    public List<Data> obterMarcas(){
        return service.obterMarcas();
    }

    @GetMapping("/brands/{brandsId}/models")
    public List<Data> obterModelosPorMarca(@PathVariable Integer brandsId){
        return service.obterModelosPorMarca(brandsId);
    }

    @GetMapping("/brands/{brandsId}/models/{modelId}/years")
    public List<Data> obterAnosPorModelo(@PathVariable Integer brandsId, @PathVariable Integer modelId){
        return service.obterAnosPorModelo(brandsId, modelId);
    }

    @GetMapping("/brands/{brandsId}/models/{modelId}/years/{yearId}")
    public FIPEInfo obterFIPE(@PathVariable Integer brandsId, @PathVariable Integer modelId, @PathVariable String yearId){
        return service.obterFIPE(brandsId, modelId, yearId);
    }
}
