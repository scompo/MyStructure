package it.scompo.MyStructure;

import java.util.List;


public class MyDataStructure extends AbstractDataContainer<MyData, Long, Long> implements DataContainer<MyData, Long, Long> {

	public MyDataStructure() {
		super();

	}

	public MyDataStructure(List<MyData> data) {
		super(data);
	}

	@Override
	public String toString() {
		return "MyDataStructure [getAllData()=" + getAllData() + "]";
	}

}
