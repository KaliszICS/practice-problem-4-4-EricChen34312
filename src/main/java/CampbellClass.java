public final class CampbellClass{
	private CampbellClass(){}
	
	public static String convertString(int i){
		return Integer.toString(i);
	}

	public static String convertString(double d){
		return Double.toString(d);
	}

	public static String convertString(char c){
		return ""+c;
	}

	public static String convertString(boolean b){
		return Boolean.toString(b);
	}

	public static String removeNonAlpha(String s){
		String out = "";
		for(char c : s.toCharArray()){
			if(Character.isAlphabetic(c)){
				out += c;
			}
		}

		return out;
	}

	public static String removeNonAlpha(String s, boolean b){
		String out = "";
		for(char c : s.toCharArray()){
			if(Character.isAlphabetic(c)){
				out += c;
			}
		}

		if(b){
			return out.toUpperCase();
		} else {
			return out.toLowerCase();
		}
	}

	public static int convertMetersToCenti(int i){
		return i*100;
	}

	public static double convertMetersToCenti(double d){
		return d*100;
	}
}