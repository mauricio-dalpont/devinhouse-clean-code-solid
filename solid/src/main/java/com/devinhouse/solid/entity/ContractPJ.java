package com.devinhouse.solid.entity;

import java.util.Map;

import com.devinhouse.solid.abstracts.AbstractContract;
import com.devinhouse.solid.enums.ContractEnum;

public class ContractPJ extends AbstractContract {

    public ContractPJ(Map<ContractEnum, Double> mapContractDiscount) {
        super(mapContractDiscount, ContractEnum.PJ);
    }
}
