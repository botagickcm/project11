import java.util.Scanner;
class Task8_11{
	public static void main(String[] args) {
		//agai class name ayistiruga koriktim
		//osynda barlik esepterim boladi
		//Bonus: 9.116 – 9.153 – 9.157 – 9.169 – 9.184

		//9.116
	
		// Scanner in=new Scanner(System.in);
		// String berilgeni=in.nextLine();//аргентинаманитнегра кылу керек
		// String soz=berilgeni.replace(" ","");
		
		
		// int arr[]=new int [soz.length()];

		// String sol="";
		// String on="";


		// for (int i=0;i<soz.length();i++) {
		// 	char charik1=soz.charAt(i);
		// 	sol=sol+charik1;
			
		// }
		// System.out.println(sol);

		// for (int j=soz.length()-1;j<=soz.length()&&j!=-1;j--) {
		// 	char charik2=soz.charAt(j);
		// 	on=on + charik2;
			
		// }
		// System.out.println(on);


		// boolean res=on.equals(sol);
		// System.out.println(res);	





		//153

		// Scanner in = new Scanner(System.in);
		// int count=0;
		// String berilgeni=in.nextLine();
		// String soz = berilgeni.replace(" ","");
		// char arr[]=new char [soz.length()];
		// int array[]=new int [soz.length()];



		// for (int i=0;i<soz.length()-1;i++ ) {
		// 	arr[i]=soz.charAt(i);
		// 	arr[i+1]=soz.charAt(i+1);
		// 	System.out.println(arr[i]+" and "+arr[i+1]);
			
		// 	if (arr[i+1]==arr[i]) {//a a
		// 		count++;//1
		// 		array[i]=count;//1
		// 		// System.out.println(array[i]);

		// 	}else{
		// 	count=0;
		// 	array[i]=count;
		// 	// System.out.println(count);
		// 	}
		// 	// System.out.println(count);
		// }
		// // System.out.println(count);
		// 	int max=0;
		// 	int maxindex=0;

		// for (int j=0;j<soz.length() ;j++) {
		// 	for (int t=j+1;t<soz.length() ;t++ ) {
		// 		System.out.println(array[j]+" and "+array[t]);

		// 		if (max<array[j]) {
		// 			max=array[j];
		// 			maxindex=j;
		// 			System.out.println(max);
		// 			System.out.println(maxindex);
		// 		}
		// 	}
		// }
		// System.out.println((max+1)+" times "+arr[maxindex]);





		//9.157



		// Scanner in = new Scanner(System.in);
		// String soz1="процессор";
		// char arr1[]=new char [soz1.length()];

		// String soz2="информация";
		// char arr2[]=new char[soz2.length()];


		// boolean f=false;
		// for (int i=0;i<soz1.length();i++ ) {
		// 	arr1[i]=soz1.charAt(i);
			
		// }
		// for (int j=0;j<soz2.length();j++ ) {
		// 	arr2[j]=soz2.charAt(j);	
		// }


		// for (int i=0;i<soz1.length() ;i++ ) {
		// 	for (int j=0;j<soz2.length() ;j++ ) {
		// 		f=false;
		// 		// System.out.println(f);
				
		// 		// System.out.println(arr1[i]+" and "+arr2[j] );
		// 		if (arr1[i]==arr2[j]) {
		// 			f=true;
		// 			break;
		// 			// System.out.println(f);
		// 		}
		// 	}

		// 	if (f==false) {
		// 		System.out.println("jok eken");
				
		// 	}else 
		// 		System.out.println("bar ekeen uraaaaaaaa");
		// 	}




		// 9.169. Дано предложение. Вывести на экран:
		// // а) его слова, начинающиеся и оканчивающиеся на одну и ту же букву;
		// // б) его слова, которые содержат ровно три буквы е;
		// // в) его слова, которые содержат хотя бы одну букву о.


		//только вариант а

		// String word="men ese shaygaramyn ba ili net";
		// String newword[]=word.split(" ");


		// for (int i=0;i<newword.length;i++) {
		// 	// System.out.println(newword[i]);
		// 	int length=newword[i].length();
		// 	System.out.println(length);
		// 	char arr[]=new char[length];

		// 	for (int j=0;length>j;j++ ) {
		// 		arr[j]=newword[i].charAt(j);
		// 	}
		// 	System.out.println(arr[0]);
		// 	System.out.println(arr[length-1]);
		// 	if (arr[length-1]==arr[0]) {
		// 		System.out.println("wow");
				
		// 	}else
		// 	System.out.println("not wow");
		// }
		



		// только вариант b
		// String word="men esepe shaygaramynba ili net";
		// String newword[]=word.split(" ");
		// int count=0;

		// for (int i=0;i<newword.length;i++) {
		// 	count=0;
		// 	// System.out.println(newword[i]);
		// 	char arr[]=new char[newword[i].length()];
		// 	for (int j=0;j<newword[i].length() ;j++ ) {
		// 		arr[j]=newword[i].charAt(j);
		// 		// System.out.println(arr[j]);
		// 		if (arr[j]=='e') {
		// 				count++;
		// 				// System.out.println(newword[i]+" "+count);
		// 		}if (count>=3) {
		// 			System.out.println(newword[i]);
					
		// 		}	
		// 	}
		// }	



		// //только вариант в
		// String word="men esepo oshaygaramyn ba ili net";
		// String newword[]=word.split(" ");
		// char y='_';//epmpty
		// int count=0;

		// for (int i=0;i<newword.length;i++) {
		// 	count=0;
		// 	// System.out.println(newword[i]);
		// 	char arr[]=new char[newword[i].length()];
		// 	for (int j=0;j<newword[i].length() ;j++ ) {
		// 		arr[j]=newword[i].charAt(j);
		// 		// System.out.println(arr[j]);
		// 		y=arr[j];
		// 		if (y=='o') {
		// 			System.out.println(newword[i]);
		// 		}	
		// 	}
		// }




		//9.184

		// String soz=in.nextLine(); 
	 	// char arr[]=new char[soz.length()]; 
		// boolean res=soz.startsWith(")"); 
		// boolean boo=false; 

		//  int count=0,count1=0; 
	 	//  // int count1 =0;

		// for(int i=0;i<soz.length();i++){
		// 	if(res==true){
		// 		boo=true;
		// 	}else{
		// 		boo=false;
		// 		}
		// 	}

		// for(int j=0;j<soz.length();j++){
		// 	if(boo==true){
		// 		System.out.println("byrys");
		// 		break;
		// 	}else if (boo==false){
		// 		for(int i=0;i<soz.length();i++){
		// 			if(soz.charAt(i)=='('){
		// 				count++;
		// 			}
		// 			else if(soz.charAt(i)==')'){
		// 			count1++; 
		// 			    } 
		// 		    } 
		// 		} 
  		// 	 }
 		// if (boo==false) { 
		//	if(count1==count){ 
	 	// 	 	System.out.println("dyrys"); 
	  	// 	}else{ 
	 	// 		System.out.println("byrys"); 
	 	// 	} 
  		// } 

	





		
	}

}