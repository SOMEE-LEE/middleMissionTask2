package dto;

public class WifiDTO {
	private int idx;
	private String manageNum;
	private String borough;
	private String wifiName;
	private String roadAddress;
	private String detailAddress;
	private String installLocate;
	private String installtype;
	private String installAgency;
	private String serviceCategory;
	private String netType;
	private int installYear;
	private String inoutDivision;
	private String wifiConnection;
	private double xPosition;
	private double yxPosition;
	private String workDate;

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getManageNum() {
		return manageNum;
	}
	public void setManageNum(String manageNum) {
		this.manageNum = manageNum;
	}
	public String getBorough() {
		return borough;
	}
	public void setBorough(String borough) {
		this.borough = borough;
	}
	public String getWifiName() {
		return wifiName;
	}
	public void setWifiName(String wifiName) {
		this.wifiName = wifiName;
	}
	public String getRoadAddress() {
		return roadAddress;
	}
	public void setRoadAddress(String roadAddress) {
		this.roadAddress = roadAddress;
	}
	public String getDetailAddress() {
		return detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	public String getInstallLocate() {
		return installLocate;
	}
	public void setInstallLocate(String installLocate) {
		this.installLocate = installLocate;
	}
	public String getInstalltype() {
		return installtype;
	}
	public void setInstalltype(String installtype) {
		this.installtype = installtype;
	}
	public String getInstallAgency() {
		return installAgency;
	}
	public void setInstallAgency(String installAgency) {
		this.installAgency = installAgency;
	}
	public String getServiceCategory() {
		return serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}
	public String getNetType() {
		return netType;
	}
	public void setNetType(String netType) {
		this.netType = netType;
	}
	public int getInstallYear() {
		return installYear;
	}
	public void setInstallYear(int installYear) {
		this.installYear = installYear;
	}
	public String getInoutDivision() {
		return inoutDivision;
	}
	public void setInoutDivision(String inoutDivision) {
		this.inoutDivision = inoutDivision;
	}
	public String getWifiConnection() {
		return wifiConnection;
	}
	public void setWifiConnection(String wifiConnection) {
		this.wifiConnection = wifiConnection;
	}
	public double getxPosition() {
		return xPosition;
	}
	public void setxPosition(double xPosition) {
		this.xPosition = xPosition;
	}
	public double getYxPosition() {
		return yxPosition;
	}
	public void setYxPosition(double yxPosition) {
		this.yxPosition = yxPosition;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	
	@Override
	public String toString() {
		return "WifiDTO [idx=" + idx + ", manageNum=" + manageNum + ", borough=" + borough + ", wifiName=" + wifiName
				+ ", roadAddress=" + roadAddress + ", detailAddress=" + detailAddress + ", installLocate="
				+ installLocate + ", installtype=" + installtype + ", installAgency=" + installAgency
				+ ", serviceCategory=" + serviceCategory + ", netType=" + netType + ", installYear=" + installYear
				+ ", inoutDivision=" + inoutDivision + ", wifiConnection=" + wifiConnection + ", xPosition=" + xPosition
				+ ", yxPosition=" + yxPosition + ", workDate=" + workDate + "]";
	}
}
