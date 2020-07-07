package com.codegym.casestudymodule2javaweb.Entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "contract_detail")
public class ContractDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract_detail")
    private Long idContractDetail;

    @ManyToOne
    @JoinColumn(name = "id_contract")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_accompanied_service")
    private AccompaniedService accompaniedService;

    @Column(name = "amount_contract_detail")
    private long amountContractDetail;

    public ContractDetail() {
    }

    public Long getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(Long idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AccompaniedService getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(AccompaniedService accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    public long getAmountContractDetail() {
        return amountContractDetail;
    }

    public void setAmountContractDetail(long amountContractDetail) {
        this.amountContractDetail = amountContractDetail;
    }
}
