package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "MEMBERS", schema = "hr")
public class Members implements Serializable {

    @OneToMany(targetEntity = Transactions.class, fetch = FetchType.LAZY, mappedBy = "members", cascade = CascadeType.ALL)
    private Set<Members> members;

    @Id
    @SequenceGenerator(name= "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT.RSA_GENERIC_SEQ")

    @Column(name = "MEMBER_ID")
    private Long member_Id;

    @Column(name = "M_NAME")
    private String m_Name;

    @Column(name = "M_LASTNAME")
    private String m_LastName;

    @Column(name = "BALANCE")
    private String balance;

    @ManyToOne
    @JoinColumn(name = "C_ID")
    private Currency currency;


    public Members(Long member_Id, String m_Name, String m_LastName, String balance, Currency currency) {
        this.member_Id = member_Id;
        this.m_Name = m_Name;
        this.m_LastName = m_LastName;
        this.balance = balance;
        this.currency = currency;
    }

    public Members() {
    }

    public Long getMember_Id() {
        return member_Id;
    }

    public void setMember_Id(Long member_Id) {
        this.member_Id = member_Id;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public String getM_LastName() {
        return m_LastName;
    }

    public void setM_LastName(String m_LastName) {
        this.m_LastName = m_LastName;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Currency getC_ID() {
        return currency;
    }

    public void setC_ID(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Members members = (Members) o;
        return Objects.equals(member_Id, members.member_Id) && Objects.equals(m_Name, members.m_Name) && Objects.equals(m_LastName, members.m_LastName) && Objects.equals(balance, members.balance) && Objects.equals(currency, members.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member_Id, m_Name, m_LastName, balance, currency);
    }

    @Override
    public String toString() {
        return "Members{" +
                "member_Id=" + member_Id +
                ", m_Name='" + m_Name + '\'' +
                ", m_LastName='" + m_LastName + '\'' +
                ", balance='" + balance + '\'' +
                ", c_ID='" + currency + '\'' +
                '}';
    }
}
