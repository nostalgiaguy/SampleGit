package com.nostalgiaguy.jaxb.adapter;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * This class adapts the LocalDate objects by implementing the XmlAdapter interface in order that
 * JaxB is capable of marshal and unmarshal them
 * 
 * @author dgutierrez-diez
 */
public class DateAdapter extends XmlAdapter<String, Date>
{

    /**
     * Overrides the unmarshal method of the class XmlAdapter in order to parse a date of the type
     * LocalDate
     * 
     * @param date String
     * @return LocalDate
     * @throws Exception
     */
    public Date unmarshal( String date ) throws Exception
    {
       // return Date.parse( date );
    	return new Date();
    }

    /**
     * Overrides the marshal method of the class XmlAdapter in order to convert the passed date to
     * an String
     *
     * @param date LocalDate
     * @return String
     * @throws Exception
     */
    public String marshal( Date date ) throws Exception
    {
        return date.toString();
    }

}
