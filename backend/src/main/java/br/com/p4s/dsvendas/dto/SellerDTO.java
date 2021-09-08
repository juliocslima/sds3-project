package br.com.p4s.dsvendas.dto;

import br.com.p4s.dsvendas.entities.Seller;

import java.io.Serializable;
import java.util.Objects;

public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO() {
    }

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SellerDTO sellerDTO = (SellerDTO) o;
        return id.equals(sellerDTO.id) && name.equals(sellerDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "SellerDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
