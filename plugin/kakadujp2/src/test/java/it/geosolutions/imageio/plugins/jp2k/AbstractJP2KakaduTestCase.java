/*
 *    ImageI/O-Ext - OpenSource Java Image translation Library
 *    http://www.geo-solutions.it/
 *    https://github.com/geosolutions-it/imageio-ext
 *    (C) 2008, GeoSolutions
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    either version 3 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package it.geosolutions.imageio.plugins.jp2k;

import it.geosolutions.util.KakaduUtilities;
import org.eclipse.imagen.JAI;

public class AbstractJP2KakaduTestCase {
    protected static boolean runTests;

    static {
        runTests = KakaduUtilities.isKakaduAvailable();
    }

    public void setUp() throws Exception {
        // general settings
         JAI.getDefaultInstance().getTileScheduler().setParallelism(2);
         JAI.getDefaultInstance().getTileScheduler().setPriority(6);
         JAI.getDefaultInstance().getTileScheduler().setPrefetchPriority(2);
         JAI.getDefaultInstance().getTileScheduler().setPrefetchParallelism(1);
         JAI.getDefaultInstance().getTileCache().setMemoryCapacity(
         64 * 1024 * 1024);
         JAI.getDefaultInstance().getTileCache().setMemoryThreshold(1.0f);
    }
}
