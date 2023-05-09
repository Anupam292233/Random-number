

	import java.util.*;
	public class RandomGiftsAllocate {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] gifts = new int[12];
	        for (int i = 0; i < 12; i++) {
	            gifts[i] = i + 1;
	        }
	        List<Integer> availableGifts = new ArrayList<>();
	        for (int i = 0; i < 12; i++) {
	            availableGifts.add(gifts[i]);
	        }
	        Map<String, Integer> allocations = new HashMap<>();
	        for (int i = 1; i <= 12; i++) {
	            System.out.print("Child " + i + ", enter your name: ");
	            String name = sc.next();
	            int giftNumber;
	            int attempts = 0;
	            do {
	                int randomIndex = (int) (Math.random() * availableGifts.size());
	                giftNumber = availableGifts.get(randomIndex);
	                availableGifts.remove(randomIndex);
	                attempts++;
	            } while (allocations.containsValue(giftNumber) && attempts < 3);
	            allocations.put(name, giftNumber);
	            System.out.println(name + ", you get Gift " + giftNumber);
	        }
	    }
	}


