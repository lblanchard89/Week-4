import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class week4 {

	public static void main(String[] args) {
	
	// 1)Instance of an ArrayList of String called employeeNames	
		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Sam Davis");
		employeeNames.add("Joe Stevens");
		employeeNames.add("Knarf Artanis");
		employeeNames.add("Lisa Evans");
		employeeNames.add("Denise Samson");
	
		
	// 2)Instance of a HashSet of Integer called ids
		
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(2222234);
		ids.add(2232244);
		ids.add(2323443);
		ids.add(2423233);
		ids.add(2345565);
		
	// 3)Instance of a HashMap of Integer, String called employeeMap	
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
	
	// 4)Add entries to employeeNames and ids
		
	/* 5)Create a variable int i = 0; then iterate over ids using an enhanced for loop.
	 * Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. The 
	 * entry should consist of a key that is the id in the enhanced loop’s current iteration,
	 * and a value that is the employeeName at position i of the employeeNames ArrayList. Increment
	 * i so that each iteration grabs the next element in the ArrayList.
	 */
		
		int i = 0;
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i)); 
			i++;
		}
		
		
	/*  6)Once the employeeMap is fully populated, use another enhanced for loop to iterate over the
	 *  employeeMap.keySet(), and use the key for each current iteration to print to the console both
	 *  the current key and its associated value in the map.
	 */
	
		for (int k : employeeMap.keySet()) {
			System.out.println(k + " = " + employeeMap.get(k));
			}
		
	// 7)Create a StringBuilder called idsBuilder.
		StringBuilder idsBuilder = new StringBuilder();
		
	// 8)Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		for (int id : ids) {
			idsBuilder.append(id + "-");
		}
		
	// 9)Print the result of idsBuilder.toString() to the console.
		System.out.println(idsBuilder.toString());
	
	// 10)Create another StringBuilder called namesBuilder.
		StringBuilder namesBuilder = new StringBuilder();
	
	// 11)Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
	
	// 12)Print the result of namesBuilder.toString() to the console.
		System.out.println(namesBuilder.toString());
	
	}

}
