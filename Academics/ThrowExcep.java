// Java program that demonstrates the use of throw
class ThrowExcep {
	static void help()
	{
		try {
			throw new NullPointerException("error_unknown");
		}
		catch (NullPointerException e) {
			System.out.println("Caught inside help().");
			// rethrowing the exception
			throw e;
		}
	}

	public static void main(String args[])
	{
		try {
			help();
		}
		catch (NullPointerException e) {
			System.out.println(
				"Caught in main error name given below:");
			System.out.println(e);
		}
	}
}
