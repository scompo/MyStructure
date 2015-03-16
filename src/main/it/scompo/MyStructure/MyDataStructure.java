package it.scompo.MyStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyDataStructure implements DataContainer<MyData> {

	private Map<Long, List<MyData>> mapByFirstKey = new HashMap<Long, List<MyData>>();

	private Map<Long, MyData> mapBySecondKey = new HashMap<Long, MyData>();

	@Override
	public synchronized void addData(MyData data) {
		
		throwExceptionIfNull(data, "data is null");

		Long firstKey = data.getKeyOne();
		Long secondKey = data.getKeyTwo();
		
		throwExceptionIfNull(firstKey, "firstKey is null");
		throwExceptionIfNull(secondKey, "secondKey is null");

		if (!mapByFirstKey.containsKey(firstKey)) {

			mapByFirstKey.put(firstKey, new ArrayList<MyData>());
		}

		mapByFirstKey.get(firstKey).add(data);

		mapBySecondKey.put(secondKey, data);
	}

	public static <T> void throwExceptionIfNull(T data, String message) {
		
		if(data == null){
			
			throw new IllegalArgumentException(message);
		}
	}

	@Override
	public List<MyData> getAllByKeyOne(Long keyOne) {

		List<MyData> list = new ArrayList<MyData>();
		
		List<MyData> tmp = mapByFirstKey.get(keyOne);

		if (tmp != null && !tmp.isEmpty()) {

			list.addAll(tmp);
		}

		return list;
	}

	@Override
	public MyData getByKeyTwo(Long keyTwo) {

		return mapBySecondKey.get(keyTwo);
	}

	@Override
	public List<MyData> getAllData() {
		
		List<MyData> res = new ArrayList<MyData>();
		
		res.addAll(mapBySecondKey.values());
		
		return res;
	}

}
