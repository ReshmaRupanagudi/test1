package java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsTestClass {

	public static void main(String[] args) throws IOException {
		
		Map<String, String> mp = new HashMap<>();
		System.out.println(mp.put("RED", "PRESENT")==null);
		System.out.println(mp.put("RED", "PRESENT")==null);
		
		List<Transaction> transactions = Utils.getTransactions();
		// transactions.stream().filter(p ->
		// p.getType().equalsIgnoreCase(Transaction.GROCERY)).sorted(comparing(Tra));

		List<Integer> transactionsIdsByGroceryInSortedOrder = transactions.stream()
				.filter(t -> t.getType() == Transaction.GROCERY).sorted((p1, p2) -> p1.getId().compareTo(p2.getId()))
				.map(Transaction::getId).collect(Collectors.toList());
		System.out.println(transactionsIdsByGroceryInSortedOrder);
		// pass in limit()

		transactions.stream().sorted((p1, p2) -> p2.getId().compareTo(p1.getId())).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(1, 4, 12, 6, 7, 8);

		List<Integer> nthHighestRecord =  numbers.stream().sorted((p1, p2) -> p2.compareTo(p1))/*.forEach(System.out::println);*/
			.filter(x -> x == numbers.size()).collect(Collectors.toList());
		System.out.println("nthHighestRecord:" + nthHighestRecord);

		List<Integer> nthdHighestSal = IntStream.range(0, numbers.size()).filter(i -> i == numbers.size() -2 )
				.mapToObj(i -> numbers.get(i)).collect(Collectors.toList());

		System.out.println(nthdHighestSal);

		List<Employee> employees = Utils.getEmployess();

		Comparator<Employee> salComparator = Comparator.comparing(Employee::getSalary, (s1, s2) -> {
			return s2.compareTo(s1);
		});

		Collections.sort(employees, salComparator);

		employees.stream().sorted(salComparator).forEach(System.out::println);
		
		Integer[] data = {1,3,5,67,8,3};
		
		
		System.out.println("Duplicate Element:");
		 Set<Integer> items = new HashSet<>();
	         Arrays.stream(data).filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
	                .collect(Collectors.toSet()).forEach(System.out::println);
	        
	         Arrays.stream(data)
            .collect(Collectors.groupingBy(Function.identity()
                    , Collectors.counting()))    // create a map {1=1, 2=1, 3=2, 4=2, 5=1, 7=1, 9=2}
            .entrySet().stream()                 // Map -> Stream
            .filter(m -> m.getValue() > 1)       // if map value > 1, duplicate element
            .map(m-> m.getKey())
            .collect(Collectors.toSet());
		
		// even Squares
		List<Integer> evenSquares = numbers.stream().filter(i -> i % 2 == 0).map(n -> n * n)
				.collect(Collectors.toList());

		/*
		 * List<Integer> twoEvenSquares = numbers.stream() .filter(n -> {
		 * System.out.println("filtering " + n); return n % 2 == 0; }) .map(n -> {
		 * System.out.println("mapping " + n); return n * n; }).limit(2)
		 * .collect(Collectors.toList());
		 * System.out.println("Even Squares:"+evenSquares);
		 */

		boolean expensive = transactions.stream().allMatch(p -> p.getValue() > 100);
		System.out.println(expensive);

		transactions.stream().filter(t -> t.getType() == Transaction.GROCERY).findAny().ifPresent(System.out::println);

		String s = "abccddeef";

		s = s.chars().mapToObj(x -> (char) x).distinct()
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		System.out.println("Remove duplicates:" + s);
		List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
		List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Word Length:" + wordLengths);

		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum:" + sum);
		int sum2 = numbers.stream().reduce(0, Integer::sum);

		System.out.println("Sum2:" + sum2);

		int sum3 = numbers.stream().mapToInt(n -> n).sum();

		System.out.println("Sum3:" + sum3);

		int max = numbers.stream().mapToInt(n -> n).max().getAsInt();

		System.out.println("max:" + max);

		int max2 = numbers.stream().reduce(0, Integer::max);

		System.out.println("max2:" + max2);

		int statement = transactions.stream().mapToInt(Transaction::getId).sum();

		double statement2 = transactions.stream().mapToDouble(Transaction::getValue).sum();

		Stream<String> word = Stream.of("Java", "Magazine", "is", "the", "best");

		double sumExpensive = transactions.stream().filter(t -> t.getValue() > 1000).map(Transaction::getValue)
				.reduce(0.0, Double::sum);

		/*
		 * Map<String, Long> letterToCount = words.map(w -> w.split(""))
		 * .flatMap(Arrays::stream) .collect(Collectors.groupingBy(identity(),
		 * Collectors.counting()));
		 */

		List<List<String>> list = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));

		System.out.println(list.stream().flatMap(Collection::stream).collect(Collectors.toList()));
		long numberOfLines = Files.lines(Paths.get("Reshma.txt")).count();

		System.out.println("numberOfLines:" + numberOfLines);

		Files.lines(Paths.get("Reshma.txt")).map(line -> line.split("\\s")) // Stream<String[]>
		        .flatMap(Arrays::stream)	 // Stream<Stream<String>> 
		                                   //  .distinct() // Stream<Stream<String>>
				.forEach(System.out::println);

		

		// List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers.stream().reduce(0, (a, b) -> a + b);
		// or result = numbers.stream().reduce(0, Integer::sum);

		System.out.println("Result: " + result);

		List<String> IntegersAsStrings = Arrays.asList("3", "2", "12", "1", "11");

		IntegersAsStrings.stream().map(String::valueOf).mapToInt(Integer::parseInt).filter(x -> x % 2 == 0)
				.forEach(System.out::println);
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		
		// System.out.println("StringsAsIntegers:"+ StringsAsIntegers);
		String result1 = letters.stream().reduce("", String::concat).toUpperCase();
		// or

		String result2 = letters.stream().reduce("",
				(partialString, element) -> (partialString + element).toUpperCase());

		System.out.println("Result1: " + result1);

		System.out.println("Result2: " + result2);

		long howManyTransactions = transactions.stream().collect(Collectors.counting());
		System.out.println("" + howManyTransactions);

		Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
		for (Transaction transaction : transactions) {
			Currency currency = transaction.getCurrency();
			List<Transaction> transactionsForCurrency = transactionsByCurrencies.get(currency);
			if (transactionsForCurrency == null) {
				transactionsForCurrency = new ArrayList<>();
				transactionsByCurrencies.put(currency, transactionsForCurrency);
			}
			transactionsForCurrency.add(transaction);
		}
		// System.out.println(transactionsByCurrencies);

		transactionsByCurrencies = transactions.stream().collect(Collectors.groupingBy(Transaction::getCurrency));
		System.out.println(transactionsByCurrencies);

	}

}
