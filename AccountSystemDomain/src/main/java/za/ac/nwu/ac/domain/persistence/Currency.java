package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "CURRENCY", schema = "hr")
public class Currency implements Serializable {

    @OneToMany(targetEntity = Members.class, fetch = FetchType.LAZY, mappedBy = "currency", cascade = CascadeType.ALL)
    private Set<Members> members;

//    EAGER

    @Id
    @SequenceGenerator(name= "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT.RSA_GENERIC_SEQ")


    @Column(name = "C_ID")
    private Long c_ID;

    @Column(name = "CURRENCY_TYPE")
    private String currency_Type;

    @Column(name = "MIlES_CONV")
    private String miles_Conv;

    public Currency(Long c_ID, String currency_Type, String miles_Conv) {
        this.c_ID = c_ID;
        this.currency_Type = currency_Type;
        this.miles_Conv = miles_Conv;
    }

    public Currency() {
    }

    public Long getC_ID() {
        return c_ID;
    }

    public void setC_ID(Long c_ID) {
        this.c_ID = c_ID;
    }

    public String getCurrency_Type() {
        return currency_Type;
    }

    public void setCurrency_Type(String currency_Type) {
        this.currency_Type = currency_Type;
    }

    public String getMiles_Conv() {
        return miles_Conv;
    }

    public void setMiles_Conv(String miles_Conv) {
        this.miles_Conv = miles_Conv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(c_ID, currency.c_ID) && Objects.equals(currency_Type, currency.currency_Type) && Objects.equals(miles_Conv, currency.miles_Conv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(c_ID, currency_Type, miles_Conv);
    }

    @Override
    public String
    toString() {
        return "Currency{" +
                "c_ID=" + c_ID +
                ", currency_Type='" + currency_Type + '\'' +
                ", miles_Conv='" + miles_Conv + '\'' +
                '}';
    }
}
