package generics;

public class GenericStack<T> {
	private int top;
	private Object[] stack;

	public GenericStack(int initialSize) {
		top = 0;
		stack = new Object[initialSize];
	}

	public void push(T elem) {
		if (top == stack.length) {
			Object[] newStack = new Object[2 * stack.length];
			for (int i = 0; i < stack.length; i++) {
				newStack[i] = stack[i];
			}

			stack = newStack;
		}
		stack[top++] = elem;
	}

	public T pop() throws StackEmptyException {
		if (top == 0) {
			throw new StackEmptyException();
		}

		T result = (T) stack[top - 1];
		stack[top - 1] = null; // garbage collection
		top--;
		return result;
	}
	
	public static void main(String[] args) throws StackEmptyException {
		GenericStack<String> stringStack = new GenericStack<String>(10);
		stringStack.push("Welt");
		stringStack.push("Hallo");
		String topWord = stringStack.pop();
		System.out.println(topWord);
		topWord = stringStack.pop();
		System.out.println(topWord);
		
		GenericStack<String>ss = new GenericStack<>(10);
		// <?> alone means <? extends Object>
		GenericStack<?> s = ss;
		GenericStack<? extends Object> s2 = ss;
		//s.push(Integer.valueOf(3));
		GenericStack<A> sa = new GenericStack<>(10);
		sa.push(new BA());
		
		GenericStack<? extends A> saa = sa;
		A a = (A) s.pop();
		
		GenericStack<AT<?>> gs = new GenericStack<AT<?>>(3);
		gs.push(new AT<String>());
		
		AT<?> at = gs.pop();
		
		CA<CA<A>> cca = new CA<CA<A>>();
		CA<? extends CA<A>> caWild = cca;
		
		CA<A> ca = caWild.get();
		
	}
}

class AT <T> {}

class ATT <T1, T2> {
	
}

class CA <T>{
	public T get() { 
		return (T)new Object();
	}
}
class BA extends A {
	
}
