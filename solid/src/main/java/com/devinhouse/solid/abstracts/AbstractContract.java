package com.devinhouse.solid.abstracts;

import java.util.Map;

import com.devinhouse.solid.enums.ContractEnum;
import com.devinhouse.solid.interfaces.InterfaceContract;

public abstract class AbstractContract implements InterfaceContract {
    private Map<ContractEnum, Double> mapContractDiscount;
    private ContractEnum contractType;

    public AbstractContract(Map<ContractEnum, Double> mapContractDiscount, ContractEnum contractType) {
        this.mapContractDiscount = mapContractDiscount;
        this.contractType = contractType;
    }

    public Map<ContractEnum, Double> getMapContractDiscount() {
        return this.mapContractDiscount;
    }

    public void setMapContractDiscount(Map<ContractEnum, Double> mapContractDiscount) {
        this.mapContractDiscount = mapContractDiscount;
    }

    public ContractEnum getContractType() {
        return this.contractType;
    }

    public void setContractType(ContractEnum contractType) {
        this.contractType = contractType;
    }

    public Double getDiscount() {
        return this.mapContractDiscount.get(this.getContractType());
    }

}
