package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "TRANSACTIONS", schema = "hr")
public class Transactions implements Serializable {

    /*@ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Members members;*/

    @Id
    @SequenceGenerator(name= "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT.RSA_GENERIC_SEQ")
    @Column(name = "T_ID")
    private Long T_ID;

    @Column(name = "T_START_DATE")
    private String T_START_DATE;

    @Column(name = "T_AMOUNT")
    private String T_AMOUNT;

    @Column(name = "MEMBER_ID")
    private String MEMBER_ID;

    public Transactions(Long t_ID, String t_START_DATE, String t_AMOUNT, String MEMBER_ID) {
        T_ID = t_ID;
        T_START_DATE = t_START_DATE;
        T_AMOUNT = t_AMOUNT;
        this.MEMBER_ID = MEMBER_ID;
    }

    public Transactions() {
    }

    public Long getT_ID() {
        return T_ID;
    }

    public void setT_ID(Long t_ID) {
        T_ID = t_ID;
    }

    public String getT_START_DATE() {
        return T_START_DATE;
    }

    public void setT_START_DATE(String t_START_DATE) {
        T_START_DATE = t_START_DATE;
    }

    public String getT_AMOUNT() {
        return T_AMOUNT;
    }

    public void setT_AMOUNT(String t_AMOUNT) {
        T_AMOUNT = t_AMOUNT;
    }

    public String getMEMBER_ID() {
        return MEMBER_ID;
    }

    public void setMEMBER_ID(String MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transactions that = (Transactions) o;
        return Objects.equals(T_ID, that.T_ID) && Objects.equals(T_START_DATE, that.T_START_DATE) && Objects.equals(T_AMOUNT, that.T_AMOUNT) && Objects.equals(MEMBER_ID, that.MEMBER_ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(T_ID, T_START_DATE, T_AMOUNT, MEMBER_ID);
    }

    @Override
    public String
    toString() {
        return "Transactions{" +
                "T_ID=" + T_ID +
                ", T_START_DATE='" + T_START_DATE + '\'' +
                ", T_AMOUNT='" + T_AMOUNT + '\'' +
                ", MEMBER_ID='" + MEMBER_ID + '\'' +
                '}';
    }
}
