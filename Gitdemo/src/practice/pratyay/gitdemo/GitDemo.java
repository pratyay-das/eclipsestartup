/**
 * 
 */
package practice.pratyay.gitdemo;

/**
 * @author 375637
 *
 */
public class GitDemo {

	public static void main(String[] args)
	{
		GitdemoCalculator gdc = new GitdemoCalculator();
		int addValue=gdc.add(12, 11);
		System.out.println("The value after addition is "+ addValue);
		int subvalue=gdc.sub(12, 11);
		System.out.println("The value after substraction is "+ subvalue);
	}
}
