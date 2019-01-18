import java.util.*;
public class Main {
		static ArrayList <Doc> arr = new ArrayList<Doc>();
		
		public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			
			String delim = "."+" "+":"+"!"+"?"+";"+"["+"]"+"'"+","+"{"+"}"+"?"+"-"+"+"+"\""+"#"+"@"+"("+")"+"$"+"%"+"&"+"*"+"/"+"//"+"“"+"‘"+"”"+"—";
			String path = "";
			for(int i = 1;i<=100;i++){
				try {
				path = "";
				path = "D:\\"+i+".txt";
				StringTokenizer s = new StringTokenizer(Readfile.readfile(path),delim);
				setAndDelete(s,i+"");
					
				}catch(Exception e) {
					
				}
			}
			
			
			sortArray(arr);
			deleteSame();
			System.out.println("Plase input word: ");
			String key = kb.next();
			print(key);
			
			
		}
		public static void print(String key) {
			int index=Collections.binarySearch(arr,new Doc(key,null),Comparator.comparing(Doc :: getDoc));
		    if(index >= 0) {
		    	System.out.println("word : "+arr.get(index).getDoc()+" : is in Document : "+arr.get(index).getID());
		    }else {
		    	System.out.println("No word in document.");
		    }
		}
		
		public static void deleteSame() {
			for(int i=0;i<arr.size();i++) {
				for(int j=i+1;j<arr.size();j++) {
					if(arr.get(i).getDoc().equals(arr.get(j).getDoc())) {
						arr.get(i).setID(arr.get(i).getID()+","+arr.get(j).getID());
						arr.remove(j);
					}
				}
			}
		}
		
		public static String setIDdoc(String id) {
			String iddoc = "";
			
			return iddoc;
		}
		
		public static void sortArray(ArrayList<Doc> array) {
			array.sort(Comparator.comparing(Doc :: getDoc));
		}
		
		public static void setAndDelete(StringTokenizer doc,String id) {
			Hashtable ht = new Hashtable();
			while(doc.hasMoreTokens()) {
				ht.put(doc.nextToken(),"abc");
			}
			
			Vector v = new Vector(ht.keySet());
		    for (Enumeration e = v.elements(); e.hasMoreElements(); ) {
		        String key = (String)e.nextElement();
		        String val = (String)ht.get(key);
		        arr.add(new Doc(key,id));
		    }
		}
}
