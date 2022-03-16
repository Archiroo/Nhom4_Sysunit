package com.greentrade.common.domain.order;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrdPosition implements Serializable {
    private Date BuyDate;
    private String SubAccoCd;
    private String SecCd;
    private BigDecimal BuyQty;
    private BigDecimal BuyPrice;
    private BigDecimal BuyAmt;
    private BigDecimal BuyFee;
    private BigDecimal BuyTax;
    private BigDecimal BuyAmtTotal;
    private BigDecimal InterestRate;
    private BigDecimal InterestAmt;
    private String Remarks;
    private String CreatedUserId;
    private Date CreatedTime;
    private String UpdatedUserId;
    private Date UpdatedTime;

    private String SubAccoNo;

    private Date FromDate;
    private Date ToDate;
    private int Type;
    private String CustName;
    private Integer InterestDays;
    private BigDecimal ProfitAmt;

    private BigDecimal BuyPriceTotal;

    public Date getBuyDate() {
        return BuyDate;
    }

    public void setBuyDate(Date buyDate) {
        BuyDate = buyDate;
    }

    public String getSubAccoCd() {
        return SubAccoCd;
    }

    public void setSubAccoCd(String subAccoCd) {
        SubAccoCd = subAccoCd;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public BigDecimal getBuyQty() {
        return BuyQty;
    }

    public void setBuyQty(BigDecimal buyQty) {
        BuyQty = buyQty;
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

    public BigDecimal getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        InterestRate = interestRate;
    }

    public BigDecimal getInterestAmt() {
        return InterestAmt;
    }

    public void setInterestAmt(BigDecimal interestAmt) {
        InterestAmt = interestAmt;
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

    public String getSubAccoNo() {
        return SubAccoNo;
    }

    public void setSubAccoNo(String subAccoNo) {
        SubAccoNo = subAccoNo;
    }

    public Date getFromDate() {
        return FromDate;
    }

    public void setFromDate(Date fromDate) {
        FromDate = fromDate;
    }

    public Date getToDate() {
        return ToDate;
    }

    public void setToDate(Date toDate) {
        ToDate = toDate;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public Integer getInterestDays() {
        return InterestDays;
    }

    public void setInterestDays(Integer interestDays) {
        InterestDays = interestDays;
    }

    public BigDecimal getProfitAmt() {
        return ProfitAmt;
    }

    public void setProfitAmt(BigDecimal profitAmt) {
        ProfitAmt = profitAmt;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public BigDecimal getBuyPriceTotal() {
        return BuyPriceTotal;
    }

    public void setBuyPriceTotal(BigDecimal buyPriceTotal) {
        BuyPriceTotal = buyPriceTotal;
    }
}