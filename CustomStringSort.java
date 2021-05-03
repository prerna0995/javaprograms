
public class CustomStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(customSortString("kqep", "pekeq"));
		//customSortString("kqep", "pekeq");
	}
	    public static String customSortString(String S, String T) {
	        StringBuilder newName = new StringBuilder(T);
	        for(int i=0;i<S.length();i++){
	            int pos=0;
	            for(int j=0;j<T.length();j++){
	                if(S.charAt(i) == (T.charAt(j))){
	                    pos=j;
	                    //System.out.println(pos);
	                    char c = T.charAt(pos);
	    	            //System.out.println(c);
	                    newName.setCharAt(pos, T.charAt(i));
	                    //System.out.println(newName);
	    	            newName.setCharAt(i, c);
	    	            //System.out.println(newName);
	    	            T=newName.toString();
	                    break;	                    
	                }            
	            }
	            
	        }
	        //String newT = newName.toString();
	        return newName.toString();
	    }
}
