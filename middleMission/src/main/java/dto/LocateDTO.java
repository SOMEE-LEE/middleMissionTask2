package dto;

public class LocateDTO {
	private int idx;
	private double xPosition;
	private double yPosition;
	private String seleteDate;
	
	// 생성자 
	public LocateDTO(double xPosition, double yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	public LocateDTO(int idx, double xPosition, double yPosition, String selectDate) {
		this.idx = idx;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.seleteDate = selectDate;
	}
	@Override
	public String toString() {
		return "LocateDTO [idx=" + idx + ", xPosition=" + xPosition + ", yPosition=" + yPosition + ", seleteDate="
				+ seleteDate + "]";
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public double getxPosition() {
		return xPosition;
	}
	public void setxPosition(double xPosition) {
		this.xPosition = xPosition;
	}
	public double getyPosition() {
		return yPosition;
	}
	public void setyPosition(double yPosition) {
		this.yPosition = yPosition;
	}
	public String getSeleteDate() {
		return seleteDate;
	}
	public void setSeleteDate(String seleteDate) {
		this.seleteDate = seleteDate;
	}

}
