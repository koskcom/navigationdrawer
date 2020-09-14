package co.ke.bsl.pojo;
// Generated Dec 16, 2015 12:26:09 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Fundsallocation generated by hbm2java
 */

public class Fundsallocation  implements java.io.Serializable {


     private Integer id;
     private Customer customer;
     private TransactionType transactionType;
     private Date trxTime;
     private String msisdn;
     private Double amount;
     private Date timeInitiated;
     private Date timeCompleted;
     private String referenceId;
     private Integer transactionId;
     private String transactionDesc;
     private String transactionStatus;

    public Fundsallocation() {
    }

	
    public Fundsallocation(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
    public Fundsallocation(Customer customer, TransactionType transactionType, Date trxTime, String msisdn, Double amount, Date timeInitiated, Date timeCompleted, String referenceId, Integer transactionId, String transactionDesc, String transactionStatus) {
       this.customer = customer;
       this.transactionType = transactionType;
       this.trxTime = trxTime;
       this.msisdn = msisdn;
       this.amount = amount;
       this.timeInitiated = timeInitiated;
       this.timeCompleted = timeCompleted;
       this.referenceId = referenceId;
       this.transactionId = transactionId;
       this.transactionDesc = transactionDesc;
       this.transactionStatus = transactionStatus;
    }


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}


	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	/**
	 * @return the transactionType
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}


	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}


	/**
	 * @return the trxTime
	 */
	public Date getTrxTime() {
		return trxTime;
	}


	/**
	 * @param trxTime the trxTime to set
	 */
	public void setTrxTime(Date trxTime) {
		this.trxTime = trxTime;
	}


	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}


	/**
	 * @param msisdn the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}


	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}


	/**
	 * @return the timeInitiated
	 */
	public Date getTimeInitiated() {
		return timeInitiated;
	}


	/**
	 * @param timeInitiated the timeInitiated to set
	 */
	public void setTimeInitiated(Date timeInitiated) {
		this.timeInitiated = timeInitiated;
	}


	/**
	 * @return the timeCompleted
	 */
	public Date getTimeCompleted() {
		return timeCompleted;
	}


	/**
	 * @param timeCompleted the timeCompleted to set
	 */
	public void setTimeCompleted(Date timeCompleted) {
		this.timeCompleted = timeCompleted;
	}


	/**
	 * @return the referenceId
	 */
	public String getReferenceId() {
		return referenceId;
	}


	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}


	/**
	 * @return the transactionId
	 */
	public Integer getTransactionId() {
		return transactionId;
	}


	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}


	/**
	 * @return the transactionDesc
	 */
	public String getTransactionDesc() {
		return transactionDesc;
	}


	/**
	 * @param transactionDesc the transactionDesc to set
	 */
	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}


	/**
	 * @return the transactionStatus
	 */
	public String getTransactionStatus() {
		return transactionStatus;
	}


	/**
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
   
    



}

