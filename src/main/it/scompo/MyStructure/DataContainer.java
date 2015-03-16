package it.scompo.MyStructure;

import java.util.List;

public interface DataContainer<T, ID1, ID2> {
	
	void addData(T data);

	List<T> getAllByKeyOne(ID1 keyOne);
	
	List<T> getAllData();

	T getByKeyTwo(ID2 keyTwo);
}
