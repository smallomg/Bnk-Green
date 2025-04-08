package Inheritance;

class M<T>{
	T t;
}

public class L {
	public <T> T f(T t) {
		T x = t;
		return x;
	}
}
