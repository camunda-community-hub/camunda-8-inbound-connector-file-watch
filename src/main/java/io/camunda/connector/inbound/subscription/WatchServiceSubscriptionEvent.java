package io.camunda.connector.inbound.subscription;

import java.util.Objects;

/**
 * Data model of an event consumed by inbound Connector (e.g. originating from an external system)
 */
public class WatchServiceSubscriptionEvent {
  private final String directory;
  private final String fileName;
  private final String monitoredEvent;

  public WatchServiceSubscriptionEvent(String monitoredEvent, String directory, String fileName) {
    this.monitoredEvent = monitoredEvent;
    this.directory = directory;
    this.fileName = fileName;
  }

  public String getMonitoredEvent() {
    return monitoredEvent;
  }
  public String getDirectory() {
    return directory;
  }
  public String getFileName() {
    return fileName;
  }

    @Override
  public boolean equals(Object o) {
    System.out.println("checking...");
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchServiceSubscriptionEvent that = (WatchServiceSubscriptionEvent) o;
    return Objects.equals(fileName, that.fileName);
  }

  @Override
  public String toString() {
    return "WatchServiceSubscriptionEvent{" +
            "monitoredEvent='" + monitoredEvent + '\'' +
            "directory='" + directory + '\'' +
            "fileName='" + fileName + '\'' +
        '}';
  }
}
