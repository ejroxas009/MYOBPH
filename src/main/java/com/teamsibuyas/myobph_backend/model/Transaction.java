package com.teamsibuyas.myobph_backend.model;

import java.time.LocalDate;

import com.teamsibuyas.myobph_backend.enumeration.Subscription;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionId;
	private String transactionNo;
	private String modeOfPayment;
	private Subscription subscriptionType;
	private LocalDate subscriptionDate;
	private LocalDate subscriptionExpiration;
	private LocalDate paymentDate;
	private Boolean isPaymentVerified;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionNo() {
		return transactionNo;
	}
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public Subscription getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(Subscription subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public LocalDate getSubscriptionDate() {
		return subscriptionDate;
	}
	public void setSubscriptionDate(LocalDate subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}
	public LocalDate getSubscriptionExpiration() {
		return subscriptionExpiration;
	}
	public void setSubscriptionExpiration(LocalDate subscriptionExpiration) {
		this.subscriptionExpiration = subscriptionExpiration;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Boolean getIsPaymentVerified() {
		return isPaymentVerified;
	}
	public void setIsPaymentVerified(Boolean isPaymentVerified) {
		this.isPaymentVerified = isPaymentVerified;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionNo=" + transactionNo + ", modeOfPayment="
				+ modeOfPayment + ", subscriptionType=" + subscriptionType + ", subscriptionDate=" + subscriptionDate
				+ ", subscriptionExpiration=" + subscriptionExpiration + ", paymentDate=" + paymentDate
				+ ", isPaymentVerified=" + isPaymentVerified + "]";
	}
	
	
	
}
