# 构建运行时刻镜像内容
FROM openjdk:21
COPY build/libs/web-1.0.0.jar /tmp
WORKDIR /tmp
EXPOSE 8080
CMD java -jar web-1.0.0.jar