package commonUtil;

public class MatcherException extends Exception{
	boolean result;
	public MatcherException(boolean actual) {
		result = actual;
	}
	
	@Override
	public String toString()
	{
		return ("Matched Not found."+result);
	}
	

}
