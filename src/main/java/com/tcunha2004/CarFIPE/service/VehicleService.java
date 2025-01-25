package com.tcunha2004.CarFIPE.service;

import com.tcunha2004.CarFIPE.models.Data;
import com.tcunha2004.CarFIPE.models.FIPEInfo;
import com.tcunha2004.CarFIPE.service.ConsumoAPI.ConsumoAPI;
import com.tcunha2004.CarFIPE.service.ConvertData.ConvertData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private final String MAINADDRESS = "https://fipe.parallelum.com.br/api/v2/cars/brands";

    public List<Data> obterMarcas(){
        String json = ConsumoAPI.obterDados(MAINADDRESS);
        return ConvertData.getList(json, Data.class);
    }

    public List<Data> obterModelosPorMarca(Integer brandsId) {
        String json = ConsumoAPI.obterDados(MAINADDRESS + "/" + brandsId + "/models");
        return ConvertData.getList(json, Data.class);
    }

    public List<Data> obterAnosPorModelo(Integer brandsId, Integer modelId) {
        String json = ConsumoAPI.obterDados(MAINADDRESS + "/" + brandsId + "/models/" + modelId
        + "/years");
        return ConvertData.getList(json, Data.class);
    }

    public FIPEInfo obterFIPE(Integer brandsId, Integer modelId, String yearId) {
        String json = ConsumoAPI.obterDados(MAINADDRESS + "/" + brandsId + "/models/" + modelId
                + "/years/" + yearId);
        return ConvertData.getData(json, FIPEInfo.class);
    }
}
