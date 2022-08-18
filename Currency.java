package java8features;

public class Currency {
	
	private String currencyCode;
	
	

	public Currency(String currencyCode) {
		super();
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@Override
	public String toString() {
		return "Currency [currencyCode=" + currencyCode + "]";
	}

	@Override
	public int hashCode() {

		return 31 * 1 + ((currencyCode == null) ? 0 : currencyCode.hashCode());
	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		if (currencyCode == null) {
			if (other.currencyCode != null)
				return false;
		} else if (!currencyCode.equals(other.currencyCode))
			return false;
		return true;
	}
	
	

}
