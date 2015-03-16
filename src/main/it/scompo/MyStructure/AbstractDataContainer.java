package it.scompo.MyStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractDataContainer<T extends DoubleKeyed<ID1, ID2>, ID1, ID2>
		implements DataContainer<T, ID1, ID2> {

	private Map<ID1, List<T>> mapByFirstKey = new HashMap<ID1, List<T>>();

	private Map<ID2, T> mapBySecondKey = new HashMap<ID2, T>();

	public AbstractDataContainer(List<T> data) {

		if (data != null) {

			for (T t : data) {

				this.addData(t);
			}
		}

	}

	public AbstractDataContainer() {

	}

	@Override
	public synchronized void addData(T data) {

		throwExceptionIfNull(data, "data is null");

		ID1 firstKey = data.getKeyOne();
		ID2 secondKey = data.getKeyTwo();

		throwExceptionIfNull(firstKey, "firstKey is null");
		throwExceptionIfNull(secondKey, "secondKey is null");

		if (!mapByFirstKey.containsKey(firstKey)) {

			mapByFirstKey.put(firstKey, new ArrayList<T>());
		}

		mapByFirstKey.get(firstKey).add(data);

		mapBySecondKey.put(secondKey, data);
	}

	public static <T> void throwExceptionIfNull(T data, String message) {

		if (data == null) {

			throw new IllegalArgumentException(message);
		}
	}

	@Override
	public List<T> getAllByKeyOne(ID1 keyOne) {

		List<T> list = new ArrayList<T>();

		List<T> tmp = mapByFirstKey.get(keyOne);

		if (tmp != null && !tmp.isEmpty()) {

			list.addAll(tmp);
		}

		return list;
	}

	@Override
	public List<T> getAllData() {

		List<T> res = new ArrayList<T>();

		res.addAll(mapBySecondKey.values());

		return res;
	}

	@Override
	public T getByKeyTwo(ID2 keyTwo) {

		return mapBySecondKey.get(keyTwo);
	}

	@Override
	public String toString() {
		return "AbstractDataContainer [mapByFirstKey=" + mapByFirstKey
				+ ", mapBySecondKey=" + mapBySecondKey + "]";
	}

}
