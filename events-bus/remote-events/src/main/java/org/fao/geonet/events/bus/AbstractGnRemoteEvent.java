/*
 * Copyright (C) 2001-2020 Food and Agriculture Organization of the
 * United Nations (FAO-UN), United Nations World Food Programme (WFP)
 * and United Nations Environment Programme (UNEP)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 *
 * Contact: Jeroen Ticheler - FAO - Viale delle Terme di Caracalla 2,
 * Rome - Italy. email: geonetwork@osgeo.org
 */
package org.fao.geonet.events.bus;

import org.springframework.cloud.bus.BusProperties;
import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * Base class for all GeoNetwork remote application events.
 */
public class AbstractGnRemoteEvent extends RemoteApplicationEvent {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor for de-serialization.
     */
    protected AbstractGnRemoteEvent() {
        super();
    }

    /**
     * Constructor with origin service, destination service is all services.
     * 
     * @param originService {@link BusProperties#getId() origin service identifier}
     */
    protected AbstractGnRemoteEvent(Object source, String originService) {
        super(source, originService);
    }
}
