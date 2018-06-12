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
package io.newcom.quoting.v4;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateTimeAdapter extends XmlAdapter<String, Calendar> {

    public Calendar unmarshal(String value) {
    		return parseDateTime(value);
    }

    public String marshal(Calendar value) {
        return printDateTime(value);
    }

    public static String printDateTime(Calendar value) {
    		if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDateTime(value));
    }
    
    public static Calendar parseDateTime(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDateTime(value));
    }
}
