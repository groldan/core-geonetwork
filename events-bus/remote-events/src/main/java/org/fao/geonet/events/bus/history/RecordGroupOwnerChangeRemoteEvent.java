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

package org.fao.geonet.events.bus.history;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * {@link RemoteApplicationEvent remote event} to broadcast a
 * {@code org.fao.geonet.events.history.RecordGroupOwnerChangeEvent} event to
 * the event bus.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RecordGroupOwnerChangeRemoteEvent extends AbstractHistoryRemoteEvent {

    public static final String FIELD = "owner";

    private static final long serialVersionUID = -3732476621109415191L;

    private /* JSONObject */ Object oldOwnerObjectJSON, newOwnerObjectJSON;

    // REVISIT: why is JSONObject being used as event payload?
    public RecordGroupOwnerChangeRemoteEvent(Object source, String originService, Integer mdId, Integer userId, //
            /* JSONObject */ Object oldOwnerObjectJSON, //
            /* JSONObject */ Object newOwnerObjectJSON) {
        super(source, originService, mdId, userId);
        this.oldOwnerObjectJSON = oldOwnerObjectJSON;
        this.newOwnerObjectJSON = newOwnerObjectJSON;
    }
}
