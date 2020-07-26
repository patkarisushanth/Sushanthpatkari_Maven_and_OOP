/**
 * 
 */
package com.sushanth.gift.sweets;

/**
 * @author sushanth
 *
 */
public class Jalebi extends Sweet{
	public Jalebi() {
		setSweetness(0);
		setWeight(0);
	}
	public Jalebi(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}
