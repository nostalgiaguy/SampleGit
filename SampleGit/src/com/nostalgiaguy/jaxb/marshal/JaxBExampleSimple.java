package com.nostalgiaguy.jaxb.marshal;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.nostalgiaguy.jaxb.business.Country;

/**
 * Simple example of usage of jaxb marshaling functionalities
 * 
 * @author dgutierrez-diez
 */
public class JaxBExampleSimple
{

    public static void main( String[] args )
    {
        try
        {

            /* init very simple data to marshal */
            Country spain = new Country();
            spain.setName( "Spain" );
            spain.setCapital( "Madrid" );
            spain.setContinent( "Europe" );
            spain.setFoundation( new Date() );

            
            spain.setPopulation( 45000000 );

            /* init jaxb marshaler */
            JAXBContext jaxbContext = JAXBContext.newInstance( Country.class );
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            /* set this flag to true to format the output */
            jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

            /* marshaling of java objects in xml (output to file and standard output) */
            jaxbMarshaller.marshal( spain, new File( "country.xml" ) );
            jaxbMarshaller.marshal( spain, System.out );
        }
        catch( JAXBException e )
        {
            e.printStackTrace();
        }

    }
}
