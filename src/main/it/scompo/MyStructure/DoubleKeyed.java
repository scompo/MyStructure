package it.scompo.MyStructure;

public interface DoubleKeyed<ID1, ID2> {
	
	ID1 getKeyOne();

	void setKeyOne(ID1 keyOne);

	ID2 getKeyTwo();

	void setKeyTwo(ID2 keyTwo);
}
