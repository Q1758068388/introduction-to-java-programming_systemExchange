import java.util.Scanner;


public class exchange { 
	private  int  temp1  ;
	private int  system_temp ;
	 Mystack mystack = new Mystack ();
	 //类的声明部分
	 public exchange (int a ,int b ){
		 temp1 = a ;
		 system_temp= b;
	 }
	 
//进制显示方法
public String    display (){	
	
    while (system_temp!=0){
    	
	if ( system_temp%temp1>9&& system_temp%temp1<16){
	mystack.push((char)((system_temp%temp1)-10+'A'));
   }
else {
	mystack.push((char)((system_temp%temp1)+'0'));
	}
   system_temp  =system_temp /temp1 ;
   }    
       String str  = " ";
	    	while (!mystack.isEmpty()){
                   str += mystack.pop(); 
                  }
	return  str ;
}
	
	

}
