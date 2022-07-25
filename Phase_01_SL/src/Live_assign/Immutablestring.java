package Live_assign;

public class Immutablestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String t = "Delhi";
      String o = "Mumbai";
      String k = "delhi";
      String y = new String("Mumbai");
      String l = new String("delhi");
      String p = new String("Hello");
      
      	if(o.equals(l)){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(o==l){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(y.equals(p)){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(y==p){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(t.equals(o)){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(t==o){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(k.equals(y)){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(k==y){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(p.equals(y)){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
      	if(p==y){
      		System.out.println("TRUE.....");
      	}
      	else{
      		System.out.println("FALSE.....");
      	}
	}

}
