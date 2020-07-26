/**
 * 
 */
package com.sushanth.gift.sweets;

/**
 * @author sushanth
 *
 */
public class MilkChocolate extends Sweet{
	public MilkChocolate() {
		setSweetness(0);
		setWeight(0);
	}
	public MilkChocolate(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}
