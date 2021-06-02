package com.devinhouse.solid;

import java.util.HashMap;
import java.util.Map;

import com.devinhouse.solid.entity.*;
import com.devinhouse.solid.enums.ContractEnum;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidApplication {

	public static void main(String[] args) {
		Map<ContractEnum, Double> mapContractDiscount = new HashMap<ContractEnum, Double>();
		mapContractDiscount.put(ContractEnum.CLT, 20.0);
		mapContractDiscount.put(ContractEnum.PJ, 0d);

		ContractCLT contractCLT = new ContractCLT(mapContractDiscount);
		ContractPJ contractPJ = new ContractPJ(mapContractDiscount);

		Employee employeeCLT = new Employee("John", 2500.0, contractCLT);
		Employee employeePJ = new Employee("Richard", 3000.0, contractPJ);

		// Deve retornar os salários, independentemente dos contratos
		System.out.println("Salários:");
		System.out.println(employeeCLT.getName() + " " + employeeCLT.getSalary());
		System.out.println(employeePJ.getName() + " " + employeePJ.getSalary());
		System.out.println();

		// Deve retornar os descontos, independentemente dos contratos
		System.out.println("Descontos:");
		System.out.println(employeeCLT.getName() + " " + employeeCLT.getContract().getDiscount());
		System.out.println(employeePJ.getName() + " " + employeePJ.getContract().getDiscount());
		System.out.println();
		
		// Contrato PJ não tem método férias implementado. Ao fazer o cast para CLT,
		// deve gerar uma exceção
		System.out.println("Férias:");
		System.out.println(employeeCLT.getName() + " " + ((ContractCLT) employeeCLT.getContract()).getVacationDays());
		System.out.println(employeePJ.getName() + " " + ((ContractCLT) employeePJ.getContract()).getVacationDays());

	}

}
