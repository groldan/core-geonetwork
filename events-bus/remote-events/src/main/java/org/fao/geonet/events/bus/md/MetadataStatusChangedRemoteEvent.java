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

package org.fao.geonet.events.bus.md;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

/**
 * {@link RemoteApplicationEvent remote event} to broadcast a
 * {@code org.fao.geonet.events.md.MetadataStatusChanged} event to the event
 * bus.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MetadataStatusChangedRemoteEvent extends MetadataRemoteEvent {

    private static final long serialVersionUID = 324534556246220509L;

    private StatusValue status;
    private String message;
    private int userId;

    public MetadataStatusChangedRemoteEvent(Object source, String originService, @NonNull String metadataUUID,
            @NonNull StatusValue status, int userId, String message) {
        super(source, originService, metadataUUID);
        this.userId = userId;
        this.status = status;
        this.message = message;
    }

    /**
     * TODO: implement mapping from {@code org.fao.geonet.domain.StatusValue}
     */
    @Data
    public static final class StatusValue {
        private int id;
        private String name;
        private boolean reserved;
//        private StatusValueType type = StatusValueType.workflow;
//        private StatusValueNotificationLevel notificationLevel;
        private int displayOrder;
    }
}
