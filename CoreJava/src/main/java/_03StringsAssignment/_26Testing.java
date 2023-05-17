package _03StringsAssignment;

public class _26Testing {

	    public String longestPalstring(String s) {
	        if (s == null || s.length() < 1) return "";
	        int start = 0, end = 0;
	        for (int i = 0; i < s.length(); i++) {
	            int len1 = AroundWord(s, i, i);
	            int len2 = AroundWord(s, i, i + 1);
	            int len = Math.max(len1, len2);
	            if (len > end - start) {
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
	        }
	        return s.substring(start, end + 1);
	    }

	    private int AroundWord(String s, int left, int right) {
	        int L = left, R = right;
	        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	            L--;
	            R++;
	        }
	        return R - L - 1;
	    }
	    
	    public static void main(String[] args) {
	    	_26Testing test = new _26Testing();
	    	System.out.println(test.longestPalstring("babad"));
		}

}
