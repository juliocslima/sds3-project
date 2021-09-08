package br.com.p4s.dsvendas.dto;

import br.com.p4s.dsvendas.entities.Sale;

import java.time.LocalDate;
import java.util.Objects;

public class SaleDTO {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO seller;

    public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
        this.id = id;
        this.visited = visited;
        this.deals = deals;
        this.amount = amount;
        this.date = date;
        this.seller = seller;
    }

    public SaleDTO(Sale entity) {
        this.id = entity.getId();
        this.visited = entity.getVisited();
        this.deals = entity.getDeals();
        this.amount = entity.getAmount();
        this.date = entity.getDate();
        this.seller = new SellerDTO(entity.getSeller());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SellerDTO getSeller() {
        return seller;
    }

    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaleDTO saleDTO = (SaleDTO) o;
        return id.equals(saleDTO.id) && Objects.equals(visited, saleDTO.visited) && Objects.equals(deals, saleDTO.deals) && Objects.equals(amount, saleDTO.amount) && Objects.equals(date, saleDTO.date) && Objects.equals(seller, saleDTO.seller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, visited, deals, amount, date, seller);
    }

    @Override
    public String toString() {
        return "SaleDTO{" +
                "id=" + id +
                ", visited=" + visited +
                ", deals=" + deals +
                ", amount=" + amount +
                ", date=" + date +
                ", seller=" + seller +
                '}';
    }
}
