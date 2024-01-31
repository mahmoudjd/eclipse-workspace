package uebung9.aufgabe2;

import java.util.List;

public interface Splitter1<T, U> {
	List<U> split(T line);
}
