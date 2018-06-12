/** 
 * HYTE TECHNOLOGIES, INC. CONFIDENTIAL
 * 
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

public class QuoteException extends Exception {
	private static final long serialVersionUID = 8337610952380024707L;
	
	public QuoteException() {
		super();
	}

	public QuoteException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuoteException(String message) {
		super(message);
	}

	public QuoteException(Throwable cause) {
		super(cause);
	}
}
