# 构建运行时刻镜像内容
FROM eclipse-temurin:21-jre-jammy
WORKDIR /tmp
COPY build/libs/service-1.0.0.jar /tmp
EXPOSE 8080
CMD ["java", "-Dspring.profiles.active=cloud", "-jar", "service-1.0.0.jar"]
