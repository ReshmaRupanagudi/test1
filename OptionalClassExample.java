package java8features;

import java.util.Optional;

/*
 * Wrapper class to check the null values and helps in further processing based on the value.
 */

public class OptionalClassExample {

	public static void main(String[] args) {

		String[] str = new String[20];
		Optional<String> optionalTest = Optional.ofNullable(str[5]);
		if (optionalTest.isPresent()) {
			System.out.println("value :" + str[5]);
		} else {
			System.out.println("value not present");
		}
		str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // Setting value for 5th index
		Optional<String> test = Optional.ofNullable(str[5]);
		System.out.println(test.get());

		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		// It returns a non-empty Optional
		Optional<String> value = Optional.of(str[5]);
		// If value is present, it returns an Optional otherwise returns an empty
		// Optional
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("Abc")));
		System.out.println("Filtered value: " + value.filter((s) -> s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		// It returns value of an Optional. if value is not present, it throws an
		// NoSuchElementException
		System.out.println("Getting value: " + value.get());
		// It returns hashCode of the value
		System.out.println("Getting hashCode: " + value.hashCode());
		// It returns true if value is present, otherwise false
		System.out.println("Is value present: " + value.isPresent());
		// It returns non-empty Optional if value is present, otherwise returns an empty
		// Optional
		System.out.println("Nullable Optional: " + Optional.ofNullable(str[5]));
		// It returns value if available, otherwise returns specified value,
		System.out.println("orElse: " + value.orElse("Value is not present"));
		System.out.println("orElse: " + empty.orElse("Value is not present"));

	}

}
