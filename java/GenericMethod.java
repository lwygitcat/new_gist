/*
 * 理解generic method 的用法
 * when: 当函数的传入参数之间, 或者是传入参数与返回值之间     有相关关系的时候 ---> 所以只有一个地方用到generic的时候，不需要generic methods
 * vs wildcard "?" ：   http://stackoverflow.com/questions/18176594/when-to-use-generic-methods-and-when-to-use-wild-card
 *
 */

public class GenericMethods {
	//case 1: 
	public static <T extends Number> void copy(List<T> dest, List<T> src) {
		//这里限制了两个传入的参数之间是同一个class, 尽管它们都extend number
	}
       
	public static void copy(List<? extends Number> dest, List<? extends Number> src) {
		//这里用wildcard 没法保证这一点
	}

	//case 2: wildcard 有优势的地方
	public void print(List<? super Integer> list) // 能是super, generic methods 只能是extend 
	



}

