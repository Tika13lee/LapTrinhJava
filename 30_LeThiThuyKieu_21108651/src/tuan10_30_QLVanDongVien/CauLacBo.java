package tuan10_30_QLVanDongVien;

public class CauLacBo {
	private String maCLB;
	private String tenCLB;

	public CauLacBo(String maCLB, String tenCLB) {
		super();
		this.maCLB = maCLB;
		this.tenCLB = tenCLB;
	}

	public CauLacBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CauLacBo(String maCLB) {
		this.maCLB = maCLB;
	}

	public String getMaCLB() {
		return maCLB;
	}

	public void setMaCLB(String maCLB) {
		this.maCLB = maCLB;
	}

	public String getTenCLB() {
		return tenCLB;
	}

	public void setTenCLB(String tenCLB) {
		this.tenCLB = tenCLB;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maCLB == null) ? 0 : maCLB.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CauLacBo other = (CauLacBo) obj;
		if (maCLB == null) {
			if (other.maCLB != null)
				return false;
		} else if (!maCLB.equals(other.maCLB))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CauLacBo [maCLB=" + maCLB + ", tenCLB=" + tenCLB + "]";
	}

}
