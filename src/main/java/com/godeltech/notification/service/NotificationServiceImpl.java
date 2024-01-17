package com.godeltech.notification.service;

import com.godeltech.grpc.notification.NotificationServiceGrpc;
import com.godeltech.grpc.notification.SendNotificationDto;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
@RequiredArgsConstructor
public class NotificationServiceImpl extends NotificationServiceGrpc.NotificationServiceImplBase {
  private final List<Notifier> notifiers;

  @Override
  public void sendNotification(
      SendNotificationDto request, StreamObserver<Empty> responseObserver) {
    notifiers.forEach(notifier -> notifier.send(request.getUserDto(), request.getMessage()));
    responseObserver.onNext(Empty.getDefaultInstance());
    responseObserver.onCompleted();
  }
}
