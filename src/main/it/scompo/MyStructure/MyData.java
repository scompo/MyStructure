package it.scompo.MyStructure;

import java.math.BigDecimal;

public class MyData {

	private Long keyOne;

	private Long keyTwo;

	private BigDecimal data1;

	private BigDecimal data2;

	private BigDecimal data3;

	public Long getKeyOne() {
		return keyOne;
	}

	public void setKeyOne(Long keyOne) {
		this.keyOne = keyOne;
	}

	public Long getKeyTwo() {
		return keyTwo;
	}

	public void setKeyTwo(Long keyTwo) {
		this.keyTwo = keyTwo;
	}

	public BigDecimal getData1() {
		return data1;
	}

	public void setData1(BigDecimal data1) {
		this.data1 = data1;
	}

	public BigDecimal getData2() {
		return data2;
	}

	public void setData2(BigDecimal data2) {
		this.data2 = data2;
	}

	public BigDecimal getData3() {
		return data3;
	}

	public void setData3(BigDecimal data3) {
		this.data3 = data3;
	}

	@Override
	public String toString() {
		return "MyData [keyOne=" + keyOne + ", keyTwo=" + keyTwo + ", data1="
				+ data1 + ", data2=" + data2 + ", data3=" + data3 + "]";
	}
	
}
