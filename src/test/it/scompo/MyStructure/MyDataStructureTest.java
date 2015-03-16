package it.scompo.MyStructure;

import static it.scompo.MyStructure.TestConstants.DATA_NULL_FIRST_KEY;
import static it.scompo.MyStructure.TestConstants.DATA_NULL_SECOND_KEY;
import static it.scompo.MyStructure.TestConstants.TEST_DATA_1;
import static it.scompo.MyStructure.TestConstants.TEST_DATA_2;
import static it.scompo.MyStructure.TestConstants.TEST_DATA_3;
import static it.scompo.MyStructure.TestConstants.TEST_DATA_4;
import static it.scompo.MyStructure.TestConstants.TEST_KEY_ONE_1;
import static it.scompo.MyStructure.TestConstants.TEST_KEY_ONE_2;
import static it.scompo.MyStructure.TestConstants.TEST_KEY_ONE_3;
import static it.scompo.MyStructure.TestConstants.TEST_KEY_TWO_1;
import static it.scompo.MyStructure.TestConstants.TEST_KEY_TWO_2;
import static it.scompo.MyStructure.TestConstants.TEST_KEY_TWO_3;
import static it.scompo.MyStructure.TestConstants.TEST_KEY_TWO_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDataStructureTest {

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testEmpty() {

		MyDataStructure myDataStructure = new MyDataStructure();

		List<MyData> res = myDataStructure.getAllByKeyOne(TEST_KEY_ONE_1);

		assertNotNull(res);
		assertTrue(res.isEmpty());

		assertNull(myDataStructure.getByKeyTwo(TEST_KEY_TWO_1));
	}

	@Test
	public void testWithDataKeyOne() {
		MyDataStructure myDataStructure = createData();

		List<MyData> resByKeyOne = myDataStructure
				.getAllByKeyOne(TEST_KEY_ONE_1);

		assertNotNull(resByKeyOne);
		assertEquals(2, resByKeyOne.size());
		assertTrue(resByKeyOne.contains(TEST_DATA_1));
		assertTrue(resByKeyOne.contains(TEST_DATA_2));

		List<MyData> resByKeyTwo = myDataStructure
				.getAllByKeyOne(TEST_KEY_ONE_2);

		assertNotNull(resByKeyTwo);
		assertEquals(1, resByKeyTwo.size());
		assertTrue(resByKeyTwo.contains(TEST_DATA_3));

		List<MyData> resByKeyThree = myDataStructure
				.getAllByKeyOne(TEST_KEY_ONE_3);

		assertNotNull(resByKeyThree);
		assertEquals(1, resByKeyThree.size());
		assertTrue(resByKeyThree.contains(TEST_DATA_4));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testInsertNull() {

		MyDataStructure myDataStructure = new MyDataStructure();

		myDataStructure.addData(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInsertNullFirstKey() {

		MyDataStructure myDataStructure = new MyDataStructure();

		myDataStructure.addData(DATA_NULL_FIRST_KEY);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInsertNullSecondKey() {

		MyDataStructure myDataStructure = new MyDataStructure();

		myDataStructure.addData(DATA_NULL_SECOND_KEY);
	}

	@Test
	public void testWithDataKeyTwo() {

		MyDataStructure myDataStructure = createData();

		assertEquals(TEST_DATA_1, myDataStructure.getByKeyTwo(TEST_KEY_TWO_1));
		assertEquals(TEST_DATA_2, myDataStructure.getByKeyTwo(TEST_KEY_TWO_2));
		assertEquals(TEST_DATA_3, myDataStructure.getByKeyTwo(TEST_KEY_TWO_3));
		assertEquals(TEST_DATA_4, myDataStructure.getByKeyTwo(TEST_KEY_TWO_4));
	}

	@Test
	public void testGetAll() {

		MyDataStructure myDataStructure = createData();

		List<MyData> res = myDataStructure.getAllData();

		assertNotNull(res);
		assertEquals(4, res.size());

		assertTrue(res.contains(TEST_DATA_1));
		assertTrue(res.contains(TEST_DATA_2));
		assertTrue(res.contains(TEST_DATA_3));
		assertTrue(res.contains(TEST_DATA_4));
	}

	@Test
	public void testGetAllEmpty() {

		MyDataStructure myDataStructure = new MyDataStructure();

		List<MyData> res = myDataStructure.getAllData();

		assertNotNull(res);
		assertTrue(res.isEmpty());
	}

	private static MyDataStructure createData() {

		MyDataStructure myDataStructure = new MyDataStructure();

		myDataStructure.addData(TEST_DATA_1);
		myDataStructure.addData(TEST_DATA_2);
		myDataStructure.addData(TEST_DATA_3);
		myDataStructure.addData(TEST_DATA_4);

		return myDataStructure;
	}
}
