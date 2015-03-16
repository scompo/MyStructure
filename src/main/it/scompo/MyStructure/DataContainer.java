package it.scompo.MyStructure;

import java.util.List;

public interface DataContainer<T> {
	
	void addData(T data);

	List<T> getAllByKeyOne(Long keyOne);
	
	List<T> getAllData();

	T getByKeyTwo(Long keyTwo);
}
