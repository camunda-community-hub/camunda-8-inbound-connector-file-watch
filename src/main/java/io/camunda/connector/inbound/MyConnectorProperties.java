package io.camunda.connector.inbound;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Configuration properties for inbound Connector
 */
public class MyConnectorProperties {

  private String eventToMonitor;
  private String directory;
  private String pollingInterval;

  public String getEventToMonitor() {
    return eventToMonitor;
  }
  public String getDirectory() {
    return directory;
  }
  public String getPollingInterval() {
    return pollingInterval;
  }

  public void setEventToMonitor(String eventToMonitor) {
    this.eventToMonitor = eventToMonitor;
  }
  public void setDirectory(String directory) {
    this.directory = directory;
  }
  public void setPollingInterval(String pollingInterval) {
    this.pollingInterval = pollingInterval;
  }

  @Override
  public String toString() {
    return "MyConnectorProperties{" +
        "event to monitor='" + eventToMonitor + '\'' +
        "directory='" + directory + '\'' +
        "polling interval='" + pollingInterval + '\'' +
        '}';
  }
}
