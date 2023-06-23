package com.nabsystem33.streaming.service;

import com.nabsystem33.streaming.entity.GeneralEntity;
import com.nabsystem33.streaming.repository.GeneralRepo;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneralServImpl implements GeneralService {

    private final GeneralRepo generalRepo;

    public GeneralServImpl(GeneralRepo generalRepo) {
        this.generalRepo = generalRepo;
    }

    @Override
    public List<GeneralEntity> getGeneralData() {
        return generalRepo.getGeneralData().stream()
                .map(this::mapToGeneralEntity)
                .collect(Collectors.toList());
    }

    private GeneralEntity mapToGeneralEntity(Object[] result) {
        GeneralEntity entity = new GeneralEntity();
        entity.setPrimer_nombre((String) result[0]);
        entity.setPrimer_apellido((String) result[1]);
        entity.setNombre_streaming((String) result[2]);
        
        if (result[3] instanceof Double) {
            entity.setValor_servicio(((Double) result[3]).doubleValue());
        } else if (result[3] instanceof BigDecimal) {
            entity.setValor_servicio(((BigDecimal) result[3]).doubleValue());
        }
        
        if (result[4] instanceof Double) {
            entity.setValor_perfil(((Double) result[4]).doubleValue());
        } else if (result[4] instanceof BigDecimal) {
            entity.setValor_perfil(((BigDecimal) result[4]).doubleValue());
        }
        
        if (result[5] instanceof Boolean) {
            entity.setPerfiles_contratados(((Boolean) result[5]) ? 1 : 0);
        } else {
            entity.setPerfiles_contratados((int) result[5]);
        }
        
        if (result[6] instanceof Boolean) {
            entity.setCuenta_completa(((Boolean) result[6]) ? 1 : 0);
        } else {
            entity.setCuenta_completa((int) result[6]);
        }
        
        entity.setMes((int) result[7]);
        entity.setAnio((int) result[8]);
        
        if (result[9] instanceof Double) {
            entity.setTotal_pagar(((Double) result[9]).doubleValue());
        } else if (result[9] instanceof BigDecimal) {
            entity.setTotal_pagar(((BigDecimal) result[9]).doubleValue());
        }
        
        if (result[10] instanceof Double) {
            entity.setTotal_pago(((Double) result[10]).doubleValue());
        } else if (result[10] instanceof BigDecimal) {
            entity.setTotal_pago(((BigDecimal) result[10]).doubleValue());
        }
        
        return entity;
    }
}