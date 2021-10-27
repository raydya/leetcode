# 基础镜像
FROM openjdk:8

# 维护者信息
LABEL maintainer="dya@outlook.com"

# 添加时区环境变量，亚洲，上海
ENV TimeZone=Asia/Shanghai
#使用软连接，并且将时区配置覆盖/etc/timezone
RUN ln -snf /usr/share/zoneinfo/$TimeZone /etc/localtime && echo $TimeZone > /etc/timezone

# java debug 参数
ENV JAVA_TOOL_OPTIONS -Xdebug -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005

COPY target/leetcode-*.jar leetcode.jar
COPY run.sh run.sh

# 暴露端口
EXPOSE 8080

# 执行脚本
ENTRYPOINT ["sh","./run.sh"]
