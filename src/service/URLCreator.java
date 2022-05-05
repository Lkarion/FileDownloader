package service;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCreator {

    public static URL createUrlLink (String linkName) throws MalformedURLException {
        return new URL(linkName);
    }
}
