package com.godeltech.notification.service.impl;

import com.godeltech.grpc.user.UserDto;
import com.godeltech.notification.service.Notifier;
import org.springframework.stereotype.Service;

@Service
public class EmailNotifier implements Notifier {

  @Override
  public void send(UserDto userDto, String message) {
    // Send via email
    log(userDto, message);
  }
}
