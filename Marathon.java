package mitjava;
public class Marathon {
	
	public static int lowestind(int[] times) {
		int ind = -1;
		int min = Integer.MAX_VALUE;
		
		for(int q = 0; q<times.length; q++) {
			 if (times[q] < min) {
				 min = times[q];
				 ind = q;
			 }
		}
		return ind;
	}
	
	
    public static void main (String[] args) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }
        int lowestind = lowestind(times);

        System.out.println(names[lowestind] + " " + times[lowestind]);
    }
} 