/** 
 * Copyright © 2017 - 2018 HYTE Technologies, Inc. All Rights Reserved.
 *  
 * NOTICE:  All information contained herein is, and remains the property of HYTE Technologies, Inc. 
 * and its suppliers, if any.  The intellectual and technical concepts contained herein are 
 * proprietary to HYTE Technologies, Inc. and its suppliers and may be covered by U.S. and Foreign 
 * Patents, patents in process, and are protected by trade secret or copyright law.  Dissemination 
 * of this information or reproduction of this material is strictly forbidden unless prior written 
 * permission is obtained from HYTE Technologies, Inc.
 */
package io.newcom.quoting.api;

import java.util.List;

import io.newcom.quoting.v4.Quote;

public interface QuotingService {

	Quote save(Quote quote) throws QuoteException;
	Quote getQuote(String quoteId) throws QuoteException;
	List<Quote> list() throws QuoteException;
	List<Quote> list(String quoteOwner) throws QuoteException;
}
