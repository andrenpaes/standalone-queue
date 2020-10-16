package org.killbill.queue.standalone;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.joda.time.DateTime;
import org.killbill.queue.QueueObjectMapper;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

public class TestStandaloneNotificationEvent {

    private ObjectMapper objectMapper;

    @BeforeClass
    public void beforeClass() {
        this.objectMapper = QueueObjectMapper.get();
    }

    @Test
    public void testSerialization() throws IOException {

        // Create input json from initial TestJson object
        final TestJson inputTest = new TestJson("something", UUID.randomUUID(), new DateTime(), true);
        final String someJson = objectMapper.writeValueAsString(inputTest);

        // Create StandaloneNotificationEvent using string 'someJson'
        final StandaloneNotificationEvent inputEvent = new StandaloneNotificationEvent(someJson, "12345");

        // Serialize StandaloneNotificationEvent (NotificationQ#insert)
        final String envJson = objectMapper.writeValueAsString(inputEvent);

        // Deserialize StandaloneNotificationEvent (NotificationQ#dispatch)
        final StandaloneNotificationEvent outputEvent = objectMapper.readValue(envJson, StandaloneNotificationEvent.class);
        final String envelope = outputEvent.getEnvelope();

        // Deserialize envelope -> TestJson
        final TestJson outputTest = objectMapper.readValue(envelope, TestJson.class);
        Assert.assertEquals(outputTest, inputTest);
    }


    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    private static final class TestJson {
        private String foo;
        private UUID bar;
        private DateTime date;
        private boolean isActive;

        public TestJson() {
        }

        public TestJson(final String foo, final UUID bar, final DateTime date, final boolean isActive) {
            this.foo = foo;
            this.bar = bar;
            this.date = date;
            this.isActive = isActive;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (!(o instanceof TestJson)) return false;
            final TestJson testJson = (TestJson) o;
            return isActive == testJson.isActive &&
                    Objects.equals(foo, testJson.foo) &&
                    Objects.equals(bar, testJson.bar) &&
                    // In real case (not test) we should also check for null values
                    date.compareTo(testJson.date) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(foo, bar, date, isActive);
        }
    }

}