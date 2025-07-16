package com.tecdesoftware.market_app.domain.service;

import com.tecdesoftware.market_app.domain.Purchase;
import com.tecdesoftware.market_app.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getALL(){
        return purchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getByClient(Integer clienteId){
        return purchaseRepository.getByClient(String.valueOf(clienteId));
    }

    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }
}