package java8features;
/* Streams : Abstract layer that provides pipeline processing of the data.
 * Java provides a new additional package in Java 8 called java.util.stream. 
 * This package consists of classes, interfaces and enum to allows functional-style operations on the elements. 
 * You can use stream by importing java.util.stream package.
 * 
 * Stream provides following features:
	
	Stream does not store elements. It simply conveys elements from a source such as a data structure, 
	an array, or an I/O channel, through a pipeline of computational operations.
	Stream is functional in nature. Operations performed on a stream does not modify it's source. 
	For example, filtering a Stream obtained from a collection produces a new Stream without the
	 filtered elements, rather than removing elements from the source collection.
	Stream is lazy and evaluates code only when required.
	The elements of a stream are only visited once during the life of a stream.
	 Like an Iterator, a new stream must be generated to revisit the same elements of the source.
 */

/*
 * 
Java Collectors
Collectors is a final class that extends Object class. It provides reduction operations,
 such as accumulating elements into collections, summarizing elements according to various criteria, etc.
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsAPIAndCollectors {

	public static void main(String[] args) {
		
		 List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f)); 
	        
	        List<Float> productPriceList = new ArrayList<Float>();  
	        for(Product product: productsList){  	              
	            // filtering data of list  before java 7
	            if(product.price<30000){  
	                productPriceList.add(product.price);    // adding price to a productPriceList  
	            }  
	        }  
	        System.out.println(productPriceList);   // displaying data  
	        
	        
	        //filtering data after java 8
	        
	        List<Float> prodPricList = productsList.stream().filter(p-> p.price > 30000)
	        		.map(p -> p.price).collect(Collectors.toList());
	        
	        System.out.println(prodPricList);
	        
	        // Converting product List into Set  
	        Set<Float> productPriceSet =   
	            productsList.stream()  
	            .filter(product->product.price < 30000)   // filter product on the base of price  
	            .map(product->product.price)  
	            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
	        System.out.println(productPriceSet);  
	        
	     // Converting Product List into a Map  
	        Map<Integer,String> productPriceMap =   
	            productsList.stream()  
	                        .collect(Collectors.toMap(p->p.id, p->p.name));  
	              
	        System.out.println(productPriceMap);  
	        
	        
	    }  

}
