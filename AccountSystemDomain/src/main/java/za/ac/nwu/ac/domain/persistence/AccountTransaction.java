package za.ac.nwu.ac.domain.persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name= "ACCOUNT_TRANSACTION",schema = "VITRSA_SANDBOX")
public class AccountTransaction implements Serializable{

    private static final long serialVersionUID = 5320578942102714156L;
    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ",sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "VIT_RSA_GENERIC_SEQ")


    private Long transactionID;
    private Long accountTypeId;
    private Long member_ID;
    private Long amount;
    private LocalDate transactionDate;

    public AccountTransaction(Long transactionID, Long accountTypeId, Long member_ID, Long amount, LocalDate transactionDate) {
        this.transactionID = transactionID;
        this.accountTypeId = accountTypeId;
        this.member_ID = member_ID;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public AccountTransaction() {
    }

    @Column(name = "TX_ID")
    public Long getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    // Indicate the FK
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    @Column(name = "ACCOUNT_TYPE_ID")
    public Long getAccountTypeId() {
        return accountTypeId;
    }
    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @Column(name = "MEMBER_ID")
    public Long getMember_ID() {
        return member_ID;
    }
    public void setMember_ID(Long member_ID) {
        this.member_ID = member_ID;
    }

    @Column(name = "AMOUNT")
    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Column(name = "TX_DATE")
    public LocalDate getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(transactionID, that.transactionID) && Objects.equals(accountTypeId, that.accountTypeId) && Objects.equals(member_ID, that.member_ID) && Objects.equals(amount, that.amount) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionID, accountTypeId, member_ID, amount, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionID=" + transactionID +
                ", accountTypeId=" + accountTypeId +
                ", member_ID=" + member_ID +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
