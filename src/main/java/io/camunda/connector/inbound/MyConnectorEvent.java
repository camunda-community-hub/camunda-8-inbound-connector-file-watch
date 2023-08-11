package io.camunda.connector.inbound;

import io.camunda.connector.inbound.subscription.WatchServiceSubscriptionEvent;

import java.util.Objects;

/**
 * Data model of an event produced by the inbound Connector
 */
public class MyConnectorEvent {
  private final WatchServiceSubscriptionEvent event;

  public MyConnectorEvent(WatchServiceSubscriptionEvent event) {
    this.event = event;
  }

  public WatchServiceSubscriptionEvent getEvent() {
    return event;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyConnectorEvent that = (MyConnectorEvent) o;
    return Objects.equals(event, that.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event);
  }

  @Override
  public String toString() {
    return "MyConnectorEvent{" +
        "event=" + event +
        '}';
  }
}
