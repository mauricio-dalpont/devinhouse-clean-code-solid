package com.devinhouse.solid.entity;

import java.util.Map;

import com.devinhouse.solid.abstracts.AbstractContract;
import com.devinhouse.solid.enums.ContractEnum;

public class ContractCLT extends AbstractContract {

    public ContractCLT(Map<ContractEnum, Double> mapContractDiscount) {
        super(mapContractDiscount, ContractEnum.CLT);
    }

    public Integer getVacationDays() {
        return 30;
    }
    
}
