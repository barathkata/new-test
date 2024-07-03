
Class Binarynums{
public void genbin(){
	String[] str=new String[5];
	Queue<String> q=new LinkeList<>();
	q.offer("1");
	for(int i=0;i<5;i++){
		str[i]=q.poll();
		String s1=str[i]+"0";
		String s2=str[i]+"1";
		q.offer(s1);
		q.offer(s2);
	}
	System.out.println(Arrays.toString(str));
}
public static void main(String[] args){
new Binarynums().genbin();
}
} 
