FROM openjdk:17-alpine
ENTRYPOINT ["/usr/bin/notification-service.sh"]

COPY notification-service.sh /usr/bin/notification-service.sh
COPY target/notification-service.jar /usr/share/notification-service/notification-service.jar
