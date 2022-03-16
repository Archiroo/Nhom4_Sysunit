package com.greentrade.common.domain.order;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrdPositionClose implements Serializable {
    private int Id;
    private Date ExecDate;
    private Date BuyDate;
    private int SubAccoCd;
    private String SecCd;
    private BigDecimal Qty;
    private BigDecimal BuyPrice;
    private BigDecimal BuyAmt;
    private BigDecimal BuyFee;
    private BigDecimal BuyTax;
    private BigDecimal BuyAmtTotal;
    private Date SellDate;
    private BigDecimal SellPrice;
    private BigDecimal SellAmt;
    private BigDecimal SellFee;
    private BigDecimal SellTax;
    private BigDecimal SellAmtTotal;
    private BigDecimal LoanAmt;
    private BigDecimal InterestDays;
    private BigDecimal InterestAmt;
    private BigDecimal ProfitAmt;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getExecDate() {
        return ExecDate;
    }

    public void setExecDate(Date execDate) {
        ExecDate = execDate;
    }

    public Date getBuyDate() {
        return BuyDate;
    }

    public void setBuyDate(Date buyDate) {
        BuyDate = buyDate;
    }

    public int getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(int subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public BigDecimal getQty() {
        return Qty;
    }

    public void setQty(BigDecimal qty) {
        Qty = qty;
    }

    public BigDecimal getBuyPrice() {
        return BuyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        BuyPrice = buyPrice;
    }

    public BigDecimal getBuyAmt() {
        return BuyAmt;
    }

    public void setBuyAmt(BigDecimal buyAmt) {
        BuyAmt = buyAmt;
    }

    public BigDecimal getBuyFee() {
        return BuyFee;
    }

    public void setBuyFee(BigDecimal buyFee) {
        BuyFee = buyFee;
    }

    public BigDecimal getBuyTax() {
        return BuyTax;
    }

    public void setBuyTax(BigDecimal buyTax) {
        BuyTax = buyTax;
    }

    public BigDecimal getBuyAmtTotal() {
        return BuyAmtTotal;
    }

    public void setBuyAmtTotal(BigDecimal buyAmtTotal) {
        BuyAmtTotal = buyAmtTotal;
    }

    public Date getSellDate() {
        return SellDate;
    }

    public void setSellDate(Date sellDate) {
        SellDate = sellDate;
    }

    public BigDecimal getSellPrice() {
        return SellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        SellPrice = sellPrice;
    }

    public BigDecimal getSellAmt() {
        return SellAmt;
    }

    public void setSellAmt(BigDecimal sellAmt) {
        SellAmt = sellAmt;
    }

    public BigDecimal getSellFee() {
        return SellFee;
    }

    public void setSellFee(BigDecimal sellFee) {
        SellFee = sellFee;
    }

    public BigDecimal getSellTax() {
        return SellTax;
    }

    public void setSellTax(BigDecimal sellTax) {
        SellTax = sellTax;
    }

    public BigDecimal getSellAmtTotal() {
        return SellAmtTotal;
    }

    public void setSellAmtTotal(BigDecimal sellAmtTotal) {
        SellAmtTotal = sellAmtTotal;
    }

    public BigDecimal getLoanAmt() {
        return LoanAmt;
    }

    public void setLoanAmt(BigDecimal loanAmt) {
        LoanAmt = loanAmt;
    }

    public BigDecimal getInterestDays() {
        return InterestDays;
    }

    public void setInterestDays(BigDecimal interestDays) {
        InterestDays = interestDays;
    }

    public BigDecimal getInterestAmt() {
        return InterestAmt;
    }

    public void setInterestAmt(BigDecimal interestAmt) {
        InterestAmt = interestAmt;
    }

    public BigDecimal getProfitAmt() {
        return ProfitAmt;
    }

    public void setProfitAmt(BigDecimal profitAmt) {
        ProfitAmt = profitAmt;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public String getCreatedUserId() {
        return CreatedUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        CreatedUserId = createdUserId;
    }

    public Date getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(Date createdTime) {
        CreatedTime = createdTime;
    }

    public String getUpdatedUserId() {
        return UpdatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        UpdatedUserId = updatedUserId;
    }

    public Date getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
