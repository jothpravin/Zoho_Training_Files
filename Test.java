public class Test {
	public void main(String[] args) {
		Test test = new Test();
		test.methodA(args);
	}

	public void methodA(String []args) throws NumberFormatException {
		System.out.println(args[0]);
	}

	public long methodA() throws Exception {
		long currentMillis = System.currentTimeMillis() * 22;
		System.out.println("In methodAAA :: CurrentTime * 22 is :: " + currentMillis);
		return currentMillis;
	}
}
