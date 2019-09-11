package com.example.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MST_REQUEST")
public class RequestDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "ACTIVITY")
	private String activity;

	@Column(name = "ACTION")
	private String action;

	@Column(name = "ENTITY_ID")
	private Long entityId;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "SPOC_NAME")
	private String spoc_id;

	@Column(name = "NAME_OF_THE_ESTABLISHMENT")
	private String nameOfTheEstablishment;

	@Column(name = "POSTAL_ADDRESS")
	private String postalAddress;

	@Column(name = "ESTABLISHMENT_SECTOR")
	private String establishmentSector;

	@Column(name = "NAME_OF_THE_EMPLOYER")
	private String nameOfTheEmployer;

	@Column(name = "EMPLOYER_RES_ADDRESS")
	private String employerResAddress;

	@Column(name = "MANGER_NAME")
	private String managerName;

	@Column(name = "RES_ADDRESS")
	private String ResAddress;

	@Column(name = "COMMERCIAL_ESTABLISHMENT")
	private String commerCialEstablishment;

	@Column(name = "NATURE_OF_BUSINESS")
	private String natureOfBusiness;

	@Column(name = "DATE_OF_COMMENCEMENT")
	private String dateOfCommencement;

	@Column(name = "MEMBERS_OF_EMPLOYMENT_FAMILY")
	private String memberOfEmployementFamily;

	@Column(name = "NO_OF_EMPLOYESS")
	private String NoOfmployees;

	@Column(name = "MALES_COUNT")
	private String malesCount;

	@Column(name = "FEMALES_COUNT")
	private String femalesCount;

	@Column(name = "TEL_PHONE_NO")
	private String telPhoneNo;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "FAX_NO")
	private String faxNo;

	@Column(name = "DEC_WEEKLY_HOLIDAY")
	private String declaredWeeklyHolidy;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "REQ_ID")
	private List<RequestDomaindDocUpload> assetMgnt;

	public RequestDomain() {
	}

	@Override
	public String toString() {
		return "RequestDomain [id=" + id + ", activity=" + activity + ", action=" + action + ", entityId=" + entityId
				+ ", state=" + state + ", address=" + address + ", spoc_id=" + spoc_id + ", nameOfTheEstablishment="
				+ nameOfTheEstablishment + ", postalAddress=" + postalAddress + ", establishmentSector="
				+ establishmentSector + ", nameOfTheEmployer=" + nameOfTheEmployer + ", employerResAddress="
				+ employerResAddress + ", managerName=" + managerName + ", ResAddress=" + ResAddress
				+ ", commerCialEstablishment=" + commerCialEstablishment + ", natureOfBusiness=" + natureOfBusiness
				+ ", dateOfCommencement=" + dateOfCommencement + ", memberOfEmployementFamily="
				+ memberOfEmployementFamily + ", NoOfmployees=" + NoOfmployees + ", malesCount=" + malesCount
				+ ", femalesCount=" + femalesCount + ", telPhoneNo=" + telPhoneNo + ", emailId=" + emailId + ", faxNo="
				+ faxNo + ", declaredWeeklyHolidy=" + declaredWeeklyHolidy + ", assetMgnt=" + assetMgnt + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpoc_id() {
		return spoc_id;
	}

	public void setSpoc_id(String spoc_id) {
		this.spoc_id = spoc_id;
	}

	public String getNameOfTheEstablishment() {
		return nameOfTheEstablishment;
	}

	public void setNameOfTheEstablishment(String nameOfTheEstablishment) {
		this.nameOfTheEstablishment = nameOfTheEstablishment;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getEstablishmentSector() {
		return establishmentSector;
	}

	public void setEstablishmentSector(String establishmentSector) {
		this.establishmentSector = establishmentSector;
	}

	public String getNameOfTheEmployer() {
		return nameOfTheEmployer;
	}

	public void setNameOfTheEmployer(String nameOfTheEmployer) {
		this.nameOfTheEmployer = nameOfTheEmployer;
	}

	public String getEmployerResAddress() {
		return employerResAddress;
	}

	public void setEmployerResAddress(String employerResAddress) {
		this.employerResAddress = employerResAddress;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getResAddress() {
		return ResAddress;
	}

	public void setResAddress(String resAddress) {
		ResAddress = resAddress;
	}

	public String getCommerCialEstablishment() {
		return commerCialEstablishment;
	}

	public void setCommerCialEstablishment(String commerCialEstablishment) {
		this.commerCialEstablishment = commerCialEstablishment;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public String getDateOfCommencement() {
		return dateOfCommencement;
	}

	public void setDateOfCommencement(String dateOfCommencement) {
		this.dateOfCommencement = dateOfCommencement;
	}

	public String getMemberOfEmployementFamily() {
		return memberOfEmployementFamily;
	}

	public void setMemberOfEmployementFamily(String memberOfEmployementFamily) {
		this.memberOfEmployementFamily = memberOfEmployementFamily;
	}

	public String getNoOfmployees() {
		return NoOfmployees;
	}

	public void setNoOfmployees(String noOfmployees) {
		NoOfmployees = noOfmployees;
	}

	public String getMalesCount() {
		return malesCount;
	}

	public void setMalesCount(String malesCount) {
		this.malesCount = malesCount;
	}

	public String getFemalesCount() {
		return femalesCount;
	}

	public void setFemalesCount(String femalesCount) {
		this.femalesCount = femalesCount;
	}

	public String getTelPhoneNo() {
		return telPhoneNo;
	}

	public void setTelPhoneNo(String telPhoneNo) {
		this.telPhoneNo = telPhoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getDeclaredWeeklyHolidy() {
		return declaredWeeklyHolidy;
	}

	public void setDeclaredWeeklyHolidy(String declaredWeeklyHolidy) {
		this.declaredWeeklyHolidy = declaredWeeklyHolidy;
	}

	public List<RequestDomaindDocUpload> getAssetMgnt() {
		return assetMgnt;
	}

	public void setAssetMgnt(List<RequestDomaindDocUpload> assetMgnt) {
		this.assetMgnt = assetMgnt;
	}
}
