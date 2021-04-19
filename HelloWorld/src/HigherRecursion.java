import java.util.ArrayList;
public class HigherRecursion {

	public static void main(String[] args) {
   // System.out.println(getKeyboard("1"));
   // System.out.println(getBP(5,10));
   // System.out.println(getMazePaths(0,0,2,2));
		towerOfHanoi(3,'A','B','C');
	}

/*    public static ArrayList<String> getKeyboard(String s)
    {
    	if(s.length()==0)
    	{
    		ArrayList<String> br=new ArrayList<String>();
    		br.add("");
    		return br;
    	}
    	char ch=s.charAt(0);
    	String ros=s.substring(1);
    	ArrayList<String> rr=getKeyboard(ros);
    	ArrayList<String> mr=new ArrayList<String>();
    	
    	String choice=getChoice(ch);
    	for(String rs:rr)
    	{
    		for(int i=0;i<choice.length();i++)
    		{
    			String ms=choice.charAt(i)+rs;
    			mr.add(ms);
    		}
    	}
    		return mr;
    }

	public static String getChoice(char key) {
		if (key == '1') {
			return "abc";
		} else if (key == '2') {
			return "def";
		} else if (key == '3') {
			return "ghi";
		} else if (key == '4') {
			return "jkl";
		} else if (key == '5') {
			return "mno";
		} else if (key == '6') {
			return "pqr";
		} else if (key == '7') {
			return "stu";
		} else if (key == '8') {
			return "vwx";
		} else if (key == '9') {
			return "yz";
		} else if (key == '0') {
			return "abc";
		}

		return "";
	}
	
	
	public static ArrayList<String> getBP(int curr,int end)
	{
		if(curr==end)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
		    return br;
		}
		if(curr>end)
		{
			ArrayList<String> br=new ArrayList<String>();
			return br;
		}
		ArrayList<String> mr=new ArrayList<String>();
		for(int dice=1;dice<=6;dice++)
		{
			ArrayList<String> rrdice=getBP(curr+dice,end);
			for(String rs:rrdice)
			{
				mr.add(dice+rs);
			}
		}
		return mr;
		*/
	
	public static ArrayList<String> getMazePaths(int cr, int cc,int er, int ec) {

		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("\n");
			return br;
		}

		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<String>();
		int move=1;
		while(move<=ec)
		{
		ArrayList<String> rrh = getMazePaths(cr, cc + move, er, ec);
		for (String rs : rrh) {
			mr.add("H"+ move+ rs);
		}
		move++;
		}
		move=1;
		while(move<=ec&&move<=er)
		{
		ArrayList<String> rrd = getMazePaths(cr+move, cc + move, er, ec);
		for (String rs : rrd) {
			mr.add("D"+ move+ rs);
		}
		move++;
		}
		move=1;
	    while(move<=er)
		{
		ArrayList<String> rrv = getMazePaths(cr + move, cc, er, ec);
		for (String rs : rrv) {
			mr.add("V"+ move+ rs);
		}
		move++;
		}

		return mr;
	}
	
	public static void towerOfHanoi(int n,char source,char des,char help) {
		if(n==0) {
			return;
		}
		towerOfHanoi(n-1,source,help,des);
		System.out.println("Move "+n+"th disk from "+source+" to "+help);
		towerOfHanoi(n-1,help,des,source);
	}
}
	
