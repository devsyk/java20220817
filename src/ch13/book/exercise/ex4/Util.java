package ch13.book.exercise.ex4;

public class Util {
	public static <K, V> V getValue(Pair<K, V> pair, K key) {
		
		return (pair.getKey().equals(key)) ? pair.getValue() : null;
	}
}
