/**
 * 
 */
package com.manning.sbia.ch08;

import com.manning.sbia.ch02.domain.Product;

/**
 * @author acogoluegnes
 *
 */
public interface ProductDao {

	Product load(String productId);
	
}