import java.util.*;
public class main{
public static void main(String[] args){

String a = "pragateesh";
String b = "ana";
int c = 0;
for(int i = 0 ; i <= a.length() - b.length() + 1  ; i++){
	String x = a.substring(i , i + b.length());
	if(x.equals(b)){
		c = c+1;
}

}
System.out.println(c);

}}