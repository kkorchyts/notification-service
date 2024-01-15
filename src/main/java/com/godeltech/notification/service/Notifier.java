package com.godeltech.notification.service;

import static java.lang.System.Logger.Level.INFO;

import com.godeltech.grpc.user.UserDto;

public interface Notifier {

  void send(final UserDto userDto, final String message);

  public default void log(final UserDto userDto, final String message) {
    System.Logger logger = System.getLogger(this.getClass().getName());
    logger.log(INFO, "{0}.send({1}, {2})", this.getClass().getName(), "{ " + userDto.getFirstName() + ", " + userDto.getLastName() +" }", message);
  }
}
