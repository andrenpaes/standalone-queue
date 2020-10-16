/*
 * Copyright 2014-2019 Groupon, Inc
 * Copyright 2014-2019 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.queue.standalone;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.killbill.notificationq.api.NotificationEvent;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class StandaloneNotificationEvent implements NotificationEvent {

    private String envelope;
    private String clientId;

    // Required for jackson
    public StandaloneNotificationEvent() {
    }

    @JsonCreator
    public StandaloneNotificationEvent(@JsonProperty("envelope") final String envelope,
                                       @JsonProperty("clientId") final String clientId) {
        this.envelope = envelope;
        this.clientId = clientId;
    }

    public String getEnvelope() {
        return envelope;
    }

    public String getClientId() {
        return clientId;
    }
}
