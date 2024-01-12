package com.godeltech.notification.service;

import com.godeltech.grpc.user.UserDto;

public interface Notifier {
  void send(final UserDto userDto, final String message);
}
