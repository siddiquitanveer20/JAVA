package assignment7_reccursion;

import java.util.*;

public class dictionary_large {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int idx = 0;
		ArrayList<String> al = new ArrayList();

		boolean[] Visited = new boolean[str.length()];

		solve(str, str.length(), "", Visited, al);

		al.sort(null);

		for (int i = 0; i < al.size(); i++){
				if(al.get(i).equals(str)) {
				//System.out.println(al.get(i));
				idx = i;
				break;
			}
			
		}
		for (int j = idx + 1; j < al.size(); j++) {
			System.out.println(al.get(j));
		}

	}

	public static void solve(String n, int r, String path, boolean[] Visited, ArrayList<String> al) {
		if (r == 0) {
			al.add(path);
			return;
		}
		for (int i = 0; i < n.length(); i++) {
//			i the seat!!
			if (Visited[i] == false) {
				Visited[i] = true;
				solve(n, r - 1, path + n.charAt(i), Visited, al);
				Visited[i] = false; // backtracking because another arrangments possible
			}
		}

	}
}
