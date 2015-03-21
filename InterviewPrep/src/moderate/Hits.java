package moderate;

public class Hits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hits h = new Hits();
		Results res = h.estimate("RGBB", "RBYG");
		System.out.println("hits :: "+res.hits);
		System.out.println("pseudo hits :: "+res.pseudoHits);

	}
	
	public int count(char c){
		
		switch(c){
		case 'B':
			return 0;
		case 'G':
			return 1;
		case 'R':
			return 2;
		case 'Y':
			return 3;
		default:
			return -1;
		}
	}
	
	public static int MAX_COLORS = 4;
	
	public Results estimate(String guess, String solution){
		if(guess.length() != solution.length()){
			return null;
		}
		Results res = new Results();
		int[] frequencies = new int[MAX_COLORS];
		for (int i = 0; i < guess.length(); i++) {
			if(guess.charAt(i) == solution.charAt(i)){
				res.hits++;
			}else{
				int count = count(solution.charAt(i));
				frequencies[count]++;
			}
		}
		
		for (int i = 0; i < guess.length(); i++) {
			int code = count(guess.charAt(i));
			if(code >= 0 && frequencies[code] > 0 && guess.charAt(i) != solution.charAt(i)){
				res.pseudoHits++;
				frequencies[code]--;
			}
		}
		return res;
	}

}
