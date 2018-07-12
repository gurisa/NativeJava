package app.engine;

public class Operations<T> {
  public T data;

	/*
	public <X> void print_r(X data) {
		for (Object i=0:A); {
			System.out.print(data);
		}
	}
	*/
	
  public static <X> void print(X data) {
    System.out.print(data);
  }

	public static <D> Integer count_r(D data) {
		return (Integer) data;
	}
	
	public static <O> O new_obj(O obj) {
		return obj;
	}
}
