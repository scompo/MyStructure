package it.scompo.MyStructure;

public abstract class TestConstants {
	
	public static final Long TEST_KEY_ONE_1 = 1L;

	public static final Long TEST_KEY_ONE_2 = 2L;

	public static final Long TEST_KEY_ONE_3 = 3L;

	public static final Long TEST_KEY_TWO_1 = 1L;

	public static final Long TEST_KEY_TWO_2 = 2L;

	public static final Long TEST_KEY_TWO_3 = 3L;

	public static final Long TEST_KEY_TWO_4 = 4L;
	
	public static final MyData DATA_NULL_FIRST_KEY = new MyData(){
		{
			setKeyOne(null);
			setKeyTwo(TEST_KEY_TWO_1);
		}
	};
	
	public static final MyData DATA_NULL_SECOND_KEY = new MyData(){
		{
			setKeyOne(TEST_KEY_ONE_1);
			setKeyTwo(null);
		}
	};

	public static final MyData TEST_DATA_1 = new MyData() {
		{
			setKeyOne(TEST_KEY_ONE_1);
			setKeyTwo(TEST_KEY_TWO_1);
		}
	};

	public static final MyData TEST_DATA_2 = new MyData() {
		{
			setKeyOne(TEST_KEY_ONE_1);
			setKeyTwo(TEST_KEY_TWO_2);
		}
	};

	public static final MyData TEST_DATA_3 = new MyData() {
		{
			setKeyOne(TEST_KEY_ONE_2);
			setKeyTwo(TEST_KEY_TWO_3);
		}
	};

	public static final MyData TEST_DATA_4 = new MyData() {

		{
			setKeyOne(TEST_KEY_ONE_3);
			setKeyTwo(TEST_KEY_TWO_4);
		}
	};

}
