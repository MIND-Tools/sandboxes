package org.ow2.mindEd.adl.util;

import org.eclipse.emf.common.util.URI;

public class FractalUtil {

	public static String getFQNFromURI(String srcFolder, String extension, URI uri){

		// we try to catch the keywords from which package directories are beginning		
				
		int i = 0;
		String fQN = "";
		for (String segment : uri.segments()){
			i++;
			if (segment.equals(srcFolder))
				break;
		}
				
		for (int j = i; j <= (uri.segmentCount()-1); j++){			
			if (j != (uri.segmentCount()-1)){
				fQN += uri.segment(j) + ".";
			} else {
				fQN += uri.segment(j).substring(0, uri.segment(j).length() - extension.length());
			}
		}		
		// --
		
		return fQN;
	}
	
}
