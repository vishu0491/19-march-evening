package abstractClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Arrylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String test[] = {"hello", "world", "before", "noon"};
		        System.out.println(third_greatest(test));
		    }

		    public static String third_greatest(String words[]) {
		        HashMap<Integer, ArrayList<String>> words_length = new HashMap<Integer, ArrayList<String>>();
		        for (String word : words) {
		            int length = word.length();
		            if (words_length.containsKey(length)) {
		                words_length.get(length).add(word);
		            } else {
		                ArrayList<String> temp = new ArrayList<String>();
		                temp.add(word);
		                words_length.put(length, temp);
		            }
		        }
		        Object keys[] = words_length.keySet().toArray();
		        Integer sorted[] = new Integer[words_length.size()];
		        for (int x = 0; x < keys.length; x++) {
		            sorted[x] = (Integer)keys[x];
		        }
		        Arrays.sort(sorted);
		        ArrayList<String> results = new ArrayList<String>();
		        for (int x = sorted.length - 1; x >= 0; x--) {
		            ArrayList<String> temp = words_length.get(sorted[x]);
		            for (String word : temp) {
		                results.add(word);
		            }
		        }
		        return results.get(2);
		    }
		
		
	}


