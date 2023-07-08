package in.ineuron.pptAssignmentJAVA_04;

interface StringTransformer {
	String transform(String input);
}

class TextProcessor {
	public void processString(String input, StringTransformer transformer) {
		String result = transformer.transform(input);
		System.out.println("Transformed string: " + result);
	}
}

public class LambdaMethodExample_7 {
	public static void main(String[] args) {
		TextProcessor processor = new TextProcessor();

		// Passing lambda expressions as method arguments
		processor.processString("Hello, World!", str -> str.toUpperCase());
		processor.processString("Java is fun!", str -> str.replaceAll("fun", "awesome"));
	}
}
