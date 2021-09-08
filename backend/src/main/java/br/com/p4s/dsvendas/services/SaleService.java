package br.com.p4s.dsvendas.services;

import br.com.p4s.dsvendas.dto.SaleDTO;
import br.com.p4s.dsvendas.dto.SaleSuccessDTO;
import br.com.p4s.dsvendas.dto.SaleSumDTO;
import br.com.p4s.dsvendas.entities.Sale;
import br.com.p4s.dsvendas.repositories.SaleRepository;
import br.com.p4s.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    private final SaleRepository repository;
    private final SellerRepository sellerRepository;

    @Autowired
    public SaleService(SaleRepository repository, SellerRepository sellerRepository) {
        this.repository = repository;
        this.sellerRepository = sellerRepository;
    }

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);

        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }
}
