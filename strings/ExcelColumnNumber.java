package DataStructure.strings;

public class ExcelColumnNumber {

	public static void main(String[] args) {
		String str= "ZY";
		System.out.println(titleToNumber(str));
	}
	public static int titleToNumber(String columnTitle) {
        int sum=0;
        int power=1;//abc
        for(int i=columnTitle.length()-1;i>=0;i--){
            sum=sum+(columnTitle.charAt(i)-64)*power;
            power*=26;
        }
    return sum;
    }
}
