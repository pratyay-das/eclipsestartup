/**
 * 
 */
package practice.pratyay.gitdemo;

/**
 * @author 375637
 *
 */
public class GitdemoCalculator {

	public int add(int num1, int num2)
	{
		int addedValue= num1+num2;
		return addedValue;
	}
	
	public int sub(int num1, int num2)
	{
		int subbedValue=0;
		if(num1 > num2) {
			subbedValue= num1-num2;
		}else if (num1 < num2){
			subbedValue= num2- num1;
		}
		return subbedValue;
	}
}
