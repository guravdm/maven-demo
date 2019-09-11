package com.example.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_REQUEST_DOC")
public class RequestDomaindDocUpload {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "REQUEST_ID")
	private Long requestId;

	@Column(name = "DIRECOR_PHOTO")
	private String directorPhoto;

	@Column(name = "SELF_DEC_LETTER")
	private String selfDecLetter;

	@Column(name = "ANNEXURE_A")
	private String annexureA;

	@Column(name = "ANNEXURE_B")
	private String annexureB;

	@Column(name = "AADHAR_CARD")
	private String aadharCard;

	@Column(name = "PAN_CARD")
	private String panCard;

	@Column(name = "LNL_AGREEMENT")
	private String lnlAgreement;

	@Column(name = "LATES_PROP_TAX_PAID_RECEIPT")
	private String latestPropTaxPaidReceipt;

	@Column(name = "COMPANY_LETTER")
	private String companyLetter;

	@Column(name = "MOA")
	private String moa;

	@Column(name = "AOA")
	private String aoa;

	RequestDomaindDocUpload() {
	}

	@Override
	public String toString() {
		return "RequestDomaindDocUpload [id=" + id + ", requestId=" + requestId + ", directorPhoto=" + directorPhoto
				+ ", selfDecLetter=" + selfDecLetter + ", annexureA=" + annexureA + ", annexureB=" + annexureB
				+ ", aadharCard=" + aadharCard + ", panCard=" + panCard + ", lnlAgreement=" + lnlAgreement
				+ ", latestPropTaxPaidReceipt=" + latestPropTaxPaidReceipt + ", companyLetter=" + companyLetter
				+ ", moa=" + moa + ", aoa=" + aoa + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public String getDirectorPhoto() {
		return directorPhoto;
	}

	public void setDirectorPhoto(String directorPhoto) {
		this.directorPhoto = directorPhoto;
	}

	public String getSelfDecLetter() {
		return selfDecLetter;
	}

	public void setSelfDecLetter(String selfDecLetter) {
		this.selfDecLetter = selfDecLetter;
	}

	public String getAnnexureA() {
		return annexureA;
	}

	public void setAnnexureA(String annexureA) {
		this.annexureA = annexureA;
	}

	public String getAnnexureB() {
		return annexureB;
	}

	public void setAnnexureB(String annexureB) {
		this.annexureB = annexureB;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getLnlAgreement() {
		return lnlAgreement;
	}

	public void setLnlAgreement(String lnlAgreement) {
		this.lnlAgreement = lnlAgreement;
	}

	public String getLatestPropTaxPaidReceipt() {
		return latestPropTaxPaidReceipt;
	}

	public void setLatestPropTaxPaidReceipt(String latestPropTaxPaidReceipt) {
		this.latestPropTaxPaidReceipt = latestPropTaxPaidReceipt;
	}

	public String getCompanyLetter() {
		return companyLetter;
	}

	public void setCompanyLetter(String companyLetter) {
		this.companyLetter = companyLetter;
	}

	public String getMoa() {
		return moa;
	}

	public void setMoa(String moa) {
		this.moa = moa;
	}

	public String getAoa() {
		return aoa;
	}

	public void setAoa(String aoa) {
		this.aoa = aoa;
	}

	public RequestDomaindDocUpload(Long requestId, String directorPhoto, String selfDecLetter, String annexureA,
			String annexureB, String aadharCard, String panCard, String lnlAgreement, String latestPropTaxPaidReceipt,
			String companyLetter, String moa, String aoa) {
		this.requestId = requestId;
		this.directorPhoto = directorPhoto;
		this.selfDecLetter = selfDecLetter;
		this.annexureA = annexureA;
		this.annexureB = annexureB;
		this.aadharCard = aadharCard;
		this.panCard = panCard;
		this.lnlAgreement = lnlAgreement;
		this.latestPropTaxPaidReceipt = latestPropTaxPaidReceipt;
		this.companyLetter = companyLetter;
		this.moa = moa;
		this.aoa = aoa;
	}

}
