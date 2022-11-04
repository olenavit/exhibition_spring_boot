package ua.com.vitkovska.exhibition.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="assortment")
public class Assortment {

    @Id
    @JoinColumn(table = "product", name = "id")
    @Column(name = "product_id")
    private int productId;

    @JoinColumn(table = "organization", name = "id")
    @Column(name = "organization_id")
    private int organizationId;

    @Column(name = "exhibition_id")
    @JoinColumn(table = "exhibition", name = "id")

    private int address;

    @Column(name = "amount")
    private int city;
}
