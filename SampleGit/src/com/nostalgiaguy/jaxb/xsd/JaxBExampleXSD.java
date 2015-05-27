package com.nostalgiaguy.jaxb.xsd;

import java.io.File;
import java.util.Date;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.nostalgiaguy.jaxb.business.Country;


/**
 * Example of XSD usage without validation
 * 
 * @author dgutierrez-diez
 */
public class JaxBExampleXSD
{

    public static void main( String[] args ) throws Exception
    {
        Country spain = new Country();
        spain.setName( "Spain" );
        spain.setCapital( "Madrid" );
        spain.setContinent( "Europe" );
        spain.setFoundation( new Date() );
        spain.setPopulation( 45000000 );



        SchemaFactory sf = SchemaFactory.newInstance( XMLConstants.W3C_XML_SCHEMA_NS_URI );
        Schema schema = sf.newSchema( new File( "countries.xsd" ) );

        JAXBContext jaxbContext = JAXBContext.newInstance( Country.class );

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
        marshaller.setSchema( schema );
        marshaller.marshal( spain, System.out );

    }

}

/*
 * http://www.w3schools.com/schema/schema_example.asp
 * 
 * http://blog.bdoughan.com/2010/12/jaxb-and-marshalunmarshal-schema.html
 */
