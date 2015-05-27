package com.nostalgiaguy.jaxb.adapter;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.nostalgiaguy.jaxb.business.Country;

/**
 * Simple example of usage of jaxb marshaling functionalities when managing complex classes, in this
 * case java.time.LocalDate
 * 
 * @author dgutierrez-diez
 */
public class JaxBExampleAdapter
{

    public static void main( String[] args )
    {
        try
        {

            /* init very simple data to marshal */
            Country country = new Country();
            country.setName( "Spain" );
            country.setCapital( "Madrid" );
            country.setContinent( "Europe" );


            country.setFoundation( new Date() );

            /* init jaxb marshaler */
            JAXBContext jaxbContext = JAXBContext.newInstance( Country.class );
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            /* set this flag to true to format the output */
            jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

            /* marshaling of java objects in xml (output to file and standard output) */
            jaxbMarshaller.marshal( country, new File( "country_adapter.xml" ) );
            jaxbMarshaller.marshal( country, System.out );

        }
        catch( JAXBException e )
        {
            e.printStackTrace();
        }

    }
}
