package de.codecentric.cxf.diagnostics;

import de.codecentric.cxf.common.BootStarterCxfException;

/**
 * Thrown when the WebServiceClient class isn´t found.
 *
 * @author jonashackt
 */
public class WebServiceClientNotFoundException extends BootStarterCxfException {

    protected static final String MESSAGE = "There was no class found, that´s annotated with javax.xml.ws.WebServiceClient and implements javax.xml.ws.Service";

    public WebServiceClientNotFoundException() {
        super(MESSAGE);
    }
}
