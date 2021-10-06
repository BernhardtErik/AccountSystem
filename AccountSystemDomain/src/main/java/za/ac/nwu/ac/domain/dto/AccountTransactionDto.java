package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.domain.persistence.Members;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class AccountTransactionDto implements Serializable {
    private static final long serialVersionUID = -1059260498154823120L;

    private Long transactionID;
    private AccountType accountTypeId;
    private Members member_ID;
    private Long amount;
    private LocalDate transactionDate;

    public AccountTransactionDto() {

    }

    public AccountTransactionDto(Long transactionID, AccountType accountTypeId, Members member_ID, Long amount, LocalDate transactionDate) {
        this.transactionID = transactionID;
        this.accountTypeId = accountTypeId;
        this.member_ID = member_ID;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public AccountTransactionDto(AccountTransaction accountTransaction){
        this.setMember_ID(accountTransaction.getMember_ID());
        this.setTransactionID(accountTransaction.getTransactionID());
        this.setAccountTypeId(accountTransaction.getAccountTypeId());
        this.setAmount(accountTransaction.getAmount());
        this.setTransactionDate(accountTransaction.getTransactionDate());

    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public AccountType getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(AccountType accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public Members getMember_ID() {
        return member_ID;
    }

    public void setMember_ID(Members member_ID) {
        this.member_ID = member_ID;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

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
        AccountTransactionDto that = (AccountTransactionDto) o;
        return Objects.equals(transactionID, that.transactionID) && Objects.equals(accountTypeId, that.accountTypeId) && Objects.equals(member_ID, that.member_ID) && Objects.equals(amount, that.amount) && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionID, accountTypeId, member_ID, amount, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransactionDto{" +
                "transactionID=" + transactionID +
                ", accountTypeId=" + accountTypeId +
                ", member_ID=" + member_ID +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
