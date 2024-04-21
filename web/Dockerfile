# 构建运行时刻镜像内容
FROM eclipse-temurin:21-jre-jammy
COPY build/libs/web-1.0.0.jar /tmp
WORKDIR /tmp
EXPOSE 8080
CMD ["java", "-Dspring.profiles.active=cloud", "-jar", "web-1.0.0.jar"]
